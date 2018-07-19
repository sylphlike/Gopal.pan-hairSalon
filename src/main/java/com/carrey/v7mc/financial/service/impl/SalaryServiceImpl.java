package com.carrey.v7mc.financial.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carrey.v7mc.common.Constant;
import com.carrey.v7mc.financial.service.SalaryService;
import com.carrey.v7mc.mapperInterface.V7ChargeMapper;
import com.carrey.v7mc.mapperInterface.V7ResultsMapper;
import com.carrey.v7mc.mapperInterface.V7SalaryMapper;
import com.carrey.v7mc.po.V7Results;
import com.carrey.v7mc.po.V7Salary;
import com.carrey.v7mc.queryVo.SalaryQvo;
import com.carrey.v7mc.util.DateUtil;
import com.carrey.v7mc.util.UUIDUtils;
import com.carrey.v7mc.util.XMLUtil;

@Service
public class SalaryServiceImpl implements SalaryService {

	@Autowired
	private V7SalaryMapper salaryMapper;
	
	@Autowired
	private V7ResultsMapper resmapper;
	@Autowired
	private V7ChargeMapper chargeMapper;

	@Override
	public int getTotalAmount(SalaryQvo queryVo) {
		return salaryMapper.getTotalAmount(queryVo);
	}

	@Override
	public List<V7Salary> getPageData(SalaryQvo queryVo) {
		return salaryMapper.getPageData(queryVo); 
	}

	@Override
	public void monthSalary() {
		String lastDay = DateUtil.beforeMonthLastDay();
		String lastMonth = lastDay.substring(0,lastDay.lastIndexOf("-")); 
		List<V7Results> res = resmapper.monthSalary(lastMonth);
		List<V7Salary> salaryList = new ArrayList<V7Salary>();
		Map<String, String> salaryPerentage = XMLUtil.readsalaryPerentage();
		for (V7Results v7Results : res) {
			V7Salary salary = new V7Salary();
			salary.setId(UUIDUtils.getUUID());
			salary.setV7SMonth(v7Results.getV7RMonth());
			salary.setV7SMnum(v7Results.getV7RMnum());
			salary.setV7SName(v7Results.getV7RName());
			salary.setV7SPosition(v7Results.getV7RPosition());
			String position = v7Results.getV7RPosition();
		
			// 基本薪资 绩效薪资  员工职位(1 经理，2股东，3技术总监，4首席发型师，5高级发型师 6发型师，7技师，8助理，9 前台，10 其它)
			if(position.contains("技术总监")){
				salary.setV7SBaseSalary(0.0);
				salary.setV7SPreSalary(v7Results.getV7RBusResults() * Double.valueOf(salaryPerentage.get("technicaldirector")));
			}else if(position.contains("首席发型师")){
				salary.setV7SBaseSalary(0.0);
				salary.setV7SPreSalary(v7Results.getV7RBusResults() * Double.valueOf(salaryPerentage.get("chiefHairstyList")));
				
			}else if(position.contains("高级发型师")){
				salary.setV7SBaseSalary(0.0);
				salary.setV7SPreSalary(v7Results.getV7RBusResults() * Double.valueOf(salaryPerentage.get("highHairstyList")));
				
			}else if(position.contains("发型师")){
				salary.setV7SBaseSalary(0.0);
				salary.setV7SPreSalary(v7Results.getV7RBusResults() * Double.valueOf(salaryPerentage.get("hairstylist")));
			}else if(position.contains("技师")){
				salary.setV7SBaseSalary(Double.valueOf(salaryPerentage.get("baseSalary")));
				salary.setV7SPreSalary(v7Results.getV7RBusResults() * Double.valueOf(salaryPerentage.get("technician")));
				
			}else if(position.contains("助理")){
				salary.setV7SBaseSalary(Double.valueOf(salaryPerentage.get("baseSalary")));
				salary.setV7SPreSalary(v7Results.getV7RBusResults() * Double.valueOf(salaryPerentage.get("assistant")));
			}
			
			//外卖薪资
			salary.setV7SOutSalary(v7Results.getV7ROutResults() * Double.valueOf(salaryPerentage.get("takeOut")));
			//办卡薪资
			salary.setV7STransSalary(v7Results.getV7RTransResults()* Double.valueOf(salaryPerentage.get("cardPoints")));
			//扣款金额
			salary.setV7SChargeSalary(getChargeMoney(v7Results.getV7RName(),DateUtil.beforeMonthStartDay(),lastDay));
			
			salary.setV7SStatus(Constant.GENERAL_OPER_TYPE_INTEGER_ONE);
			
			if(null == salary.getV7SBaseSalary()){
				salary.setV7SBaseSalary(0.0);
			}if(null == salary.getV7SPreSalary() ){
				salary.setV7SPreSalary(0.0);
			}if(null == salary.getV7SOutSalary()){
				salary.setV7SOutSalary(0.0);
			}if(null == salary.getV7STransSalary()){
				salary.setV7STransSalary(0.0);
			}if(null == salary.getV7SChargeSalary()){
				salary.setV7SChargeSalary(0.0);
			}
			
			salary.setV7SRealitySalary(salary.getV7SBaseSalary() + salary.getV7SPreSalary() +salary.getV7SOutSalary()
					+ salary.getV7STransSalary() - salary.getV7SChargeSalary());
		
			salaryList.add(salary);
		}
		salaryMapper.addData(salaryList);
	}

	/**
	 * 统计薪水生成月份下员工的扣款金额
	 * @param v7EName
	 * @param startDay
	 * @param lastDay
	 * @return
	 */
	private Double getChargeMoney(String v7EName, String startDay,String lastDay) {
		Double chargeMoney = chargeMapper.getChargeMoney(v7EName,startDay,lastDay);
		return chargeMoney;
	}


}
