package com.carrey.v7mc.cashier.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carrey.v7mc.cashier.service.ResultsService;
import com.carrey.v7mc.mapperInterface.V7HandleCardMapper;
import com.carrey.v7mc.mapperInterface.V7ReceptionMapper;
import com.carrey.v7mc.mapperInterface.V7ResultsMapper;
import com.carrey.v7mc.po.V7Employee;
import com.carrey.v7mc.po.V7Results;
import com.carrey.v7mc.queryVo.ResultsQVo;
import com.carrey.v7mc.util.UUIDUtils;

@Service
public class ResultsServiceImpl implements ResultsService {
	@Autowired
	private V7ResultsMapper resultsMapper;
	
	@Autowired
	private V7ReceptionMapper receptionMapper;
	
	@Autowired
	private V7HandleCardMapper handleCardMapper;
	

	@Override
	public int getTotalAmount(ResultsQVo queryVo) {
		return resultsMapper.getTotalAmount(queryVo);
	}

	@Override
	public List<V7Results> getPageData(ResultsQVo queryVo) {
		return resultsMapper.getPageData(queryVo);
	}

	SimpleDateFormat format =  new SimpleDateFormat("yyyy-MM-dd");
	

	@Override
	public void addResultsData(List<V7Employee> employeeList, String currentDate) {
		String strartStr  = currentDate+" 00:00:00";
		String endStr = currentDate+" 23:59:59";
		List<V7Results> reslist = resultsMapper.searchCurrentMonth(currentDate.substring(0, currentDate.lastIndexOf("-")));
		
		//如果业绩表中没有数据那么说明本业的第一天没进行轧账，
		if(null == reslist || reslist.size() == 0){
			addfirstData(employeeList, currentDate);
			return;
		}
		
		//处理业绩集合中同员工集合中员工ID相同的业绩数据，累加
		for (V7Results v7Results : reslist) {
			for (V7Employee employee : employeeList) {
				if(employee.getId().equals(v7Results.getV7REid())){ //d9ca6f5e87be4477b2ccd0a019823b01  8 10
					int positionNum = getPositionNum(employee.getV7EPosition());
					//项目业绩
					if(4 != positionNum){
						v7Results.setV7RBusResults(v7Results.getV7RBusResults() + busResults(v7Results.getV7REid(),positionNum,strartStr,endStr));
					}else{
						v7Results.setV7RBusResults(0.0);
					}
					//加价产品绩效
					if(4 != positionNum && 1 != positionNum){
						v7Results.setV7RRaiseResults(v7Results.getV7RRaiseResults() +  raiseResults(v7Results.getV7REid(),positionNum,strartStr,endStr));
					}else{
						v7Results.setV7RRaiseResults(0.0);
					}
					//外卖绩效
					v7Results.setV7ROutResults(v7Results.getV7ROutResults() + outResults(v7Results.getV7REid(),strartStr,endStr));
					//办卡绩效
					v7Results.setV7RTransResults(v7Results.getV7RTransResults() + tTransResults(v7Results.getV7REid(),strartStr,endStr));
					//洗吹卡次数
					if(4 != positionNum){
						v7Results.setV7RBlowwash(v7Results.getV7RBlowwash() + blowwash(v7Results.getV7REid(),positionNum,strartStr,endStr));
					}else{
						v7Results.setV7RBlowwash(0);
					}
					//洗剪吹卡次数
					if(4 != positionNum){
						v7Results.setV7RBlowcutwash(v7Results.getV7RBlowcutwash() + blowcutwash(v7Results.getV7REid(),positionNum,strartStr,endStr));
					}else{
						v7Results.setV7RBlowcutwash(0);
					}
				}
				
			}
		}
		resultsMapper.addResultsData(reslist);
		
		//处理业绩集合中没有员工集合中员工ID相同的业绩数据，新增
		for (int i = 0; i < reslist.size(); i++) {
			for (int x = 0; x < employeeList.size(); x++) {
				if(reslist.get(i).getV7REid().equals(employeeList.get(x).getId())){
					employeeList.remove(x);
					x--;
				}
			}
		}
		List<V7Results> results = new ArrayList<V7Results>();
		for (int x = 0; x < employeeList.size(); x++) {
			int positionNum = getPositionNum(employeeList.get(x).getV7EPosition());
			V7Results newResults = new V7Results();
			newResults.setId(UUIDUtils.getUUID());
			newResults.setV7RMonth(currentDate.substring(0, currentDate.lastIndexOf("-")));
			newResults.setV7REid(employeeList.get(x).getId());
			newResults.setV7RMnum(employeeList.get(x).getV7ENum());
			newResults.setV7RName(employeeList.get(x).getV7EName());
			newResults.setV7RPosition(viewPosition(employeeList.get(x).getV7EPosition()));
			//项目业绩
			if(4 != positionNum){
				newResults.setV7RBusResults(busResults(employeeList.get(x).getId(),positionNum,strartStr,endStr));
			}else{
				newResults.setV7RBusResults(0.0);
			}
			//加价产品绩效
			if(4 != positionNum && 1 != positionNum){
				newResults.setV7RRaiseResults(raiseResults(employeeList.get(x).getId(),positionNum,strartStr,endStr));
			}else{
				newResults.setV7RRaiseResults(0.0);
			}
			//外卖绩效
			newResults.setV7ROutResults(outResults(employeeList.get(x).getId(),strartStr,endStr));
			//办卡绩效
			newResults.setV7RTransResults(tTransResults(employeeList.get(x).getId(),strartStr,endStr));
			//洗吹卡次数
			if(4 != positionNum){
				newResults.setV7RBlowwash(blowwash(employeeList.get(x).getId(),positionNum,strartStr,endStr));
			}else{
				newResults.setV7RBlowwash(0);
			}
			//洗剪吹卡次数
			if(4 != positionNum){
				newResults.setV7RBlowcutwash(blowcutwash(employeeList.get(x).getId(),positionNum,strartStr,endStr));
			}else{
				newResults.setV7RBlowcutwash(0);
				
			}
			
			results.add(newResults);
		}
		if(results.size() > 0){
			resultsMapper.addfirstData(results);
		}
	}
	
	
	@Override
	public void addfirstData(List<V7Employee> employeeList, String currentDate) {
		List<V7Results> results = new ArrayList<V7Results>();
		for (V7Employee v7Employee : employeeList) {
			//员工职位(1 经理，2股东，3技术总监，4首席发型师，5高级发型师 6发型师，7技师，8助理，9 前台，10 其它)
			int positionNum = getPositionNum(v7Employee.getV7EPosition());
		
			String strartStr  = currentDate+" 00:00:00";
			String endStr = currentDate+" 23:59:59";
			
			V7Results res = new V7Results();
			res.setId(UUIDUtils.getUUID());
			res.setV7RMonth(currentDate.substring(0, currentDate.lastIndexOf("-")));
			res.setV7REid(v7Employee.getId());
			res.setV7RMnum(v7Employee.getV7ENum());
			res.setV7RName(v7Employee.getV7EName());
			res.setV7RPosition(viewPosition(v7Employee.getV7EPosition()));
		
			//项目业绩
			if(4 != positionNum){
				res.setV7RBusResults(busResults(v7Employee.getId(),positionNum,strartStr,endStr));
			}else {
				res.setV7RBusResults(0.0);
			}
			//加价产品绩效
			if(4 != positionNum && 1 != positionNum){
				res.setV7RRaiseResults(raiseResults(v7Employee.getId(),positionNum,strartStr,endStr));
			}else{
				res.setV7RRaiseResults(0.0);
			}
			//外卖绩效
			res.setV7ROutResults(outResults(v7Employee.getId(),strartStr,endStr));
			//办卡绩效
			res.setV7RTransResults(tTransResults(v7Employee.getId(),strartStr,endStr));
			//洗吹卡次数
			if(4 != positionNum){
				res.setV7RBlowwash(blowwash(v7Employee.getId(),positionNum,strartStr,endStr));
			}else{
				res.setV7RBlowwash(0);
			}
			//洗剪吹卡次数
			if(4 != positionNum){
				res.setV7RBlowcutwash(blowcutwash(v7Employee.getId(),positionNum,strartStr,endStr));
			}else{
				res.setV7RBlowcutwash(0);
			}
			results.add(res);
		}
		
		resultsMapper.addfirstData(results);
	}
	
	/**
	 * 根据员工职位获取对应的职位类型
	 * @param position
	 * @return 1 代表发型师  2 技师  3 助理  4 其它
	 */
	private int getPositionNum(String position) {
		int positionNum = 0; 
		if(position.contains("3")||position.contains("4")||position.contains("5")||position.contains("6")){
			positionNum = 1;
		}else if(position.contains("7")){
			positionNum = 2;
		}else if(position.contains("8")){
			positionNum = 3;
		}else {
			positionNum = 4;
		}
		return positionNum;
	}

	/**
	 * 项目业绩
	 * @param id
	 * @param positionNum
	 * @param strartStr
	 * @param endStr
	 * @return
	 */
	private Double busResults(String id,int positionNum, String strartStr, String endStr) {
		Double busResults = receptionMapper.busResults(id,positionNum,strartStr,endStr);
		return busResults;
	}

	

	/**
	 * 洗剪吹卡次数
	 * @param id
	 * @param currentDate
	 * @return
	 */
	private Integer blowcutwash(String id,int positionNum, String strartStr, String endStr) {
		return receptionMapper.blowcutwash(id,positionNum,strartStr,endStr);
	}

	/**
	 * 洗吹卡次数
	 * @param id
	 * @param currentDate
	 * @return
	 */
	private Integer blowwash(String id,int positionNum, String strartStr, String endStr) {
		return receptionMapper.blowwash(id,positionNum,strartStr,endStr);
	}

	
	
	/**
	 * 办卡业绩
	 * @param id
	 * @return
	 */
	private Double tTransResults(String id,String strartStr, String endStr) {
		return handleCardMapper.tTransResults(id,strartStr,endStr);
	}

	/**
	 * 外卖业绩
	 * @param id
	 * @return
	 */
	private Double outResults(String id,String strartStr, String endStr) {
		return receptionMapper.outResults(id,strartStr,endStr);
	}

	/**
	 * 加价产品业绩
	 * @param id
	 * @return
	 */
	private Double raiseResults(String id,int positionNum, String strartStr, String endStr) {
		if(positionNum == 2 || positionNum == 3){
			return receptionMapper.raiseResults(id,positionNum,strartStr,endStr);
		}else{
			return 0.0;
		}
	}


	
	
	private String viewPosition(String v7ePosition) {
		String[] temp = v7ePosition.split(",");
		String tempPosition  = "";
		for (String string : temp) {
			/*1 经理，2股东，3技术总监，4首席发型师，5高级发型师 6发型师，7技师，8助理，9 前台，10 其它*/
			switch (string) {
				case "1":
					tempPosition +="经理,";
					break;
				case "2":
					tempPosition +="股东,";			
					break;
				case "3":
					tempPosition +="技术总监,";
					break;
				case "4":
					tempPosition +="首席发型师,";
					break;
				case "5":
					tempPosition +="高级发型师,";
					break;
				case "6":
					tempPosition +="发型师,";
					break;
				case "7":
					tempPosition +="技师,";
					break;
				case "8":
					tempPosition +="助理,";
					break;
				case "9":
					tempPosition +="前台,";
					break;
				case "10":
					tempPosition +="其它,";
					break;
			}
		}
		
		return tempPosition.substring(0, tempPosition.length() -1);
	}
}
