package com.horse.v7mc.employee.service.impl;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import com.horse.v7mc.mapperInterface.V7EmployeeMapper;
import com.horse.v7mc.po.V7Employee;
import com.horse.v7mc.queryVo.EmployeeQVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.horse.v7mc.common.Constant;
import com.horse.v7mc.common.exception.SysException;
import com.horse.v7mc.employee.service.EmployeeService;
import com.horse.v7mc.util.DateUtil;
import com.horse.v7mc.util.MD5Utils;
import com.horse.v7mc.util.UUIDUtils;
import com.horse.v7mc.util.XMLUtil;

@Service
public class EmployeeServiceImpl implements EmployeeService  {
	
	@Autowired
    V7EmployeeMapper employeeMapper;


	@Override
	public int getTotalAmount(EmployeeQVo queryVo) {
		return employeeMapper.getTotalAmount(queryVo);
	}

	@Override
	public List<V7Employee> getPageData(EmployeeQVo queryVo) {
		List<V7Employee> pageData = employeeMapper.getPageData(queryVo);
		for (V7Employee v7Employee : pageData) {
			String position = v7Employee.getV7EPosition();
			String[] temp = position.split(",");
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
			v7Employee.setV7EPosition(tempPosition.substring(0,tempPosition.length() - 1));
		}
		return pageData;
	}

	@Override
	public void addEmployee(V7Employee employee) throws SysException {
		//员工职位(1 经理，2股东，3技术总监，4首席发型师，5高级发型师 6发型师，7技师，8助理，9 前台，10 其它)
		String v7ePosition = employee.getV7EPosition();
		
		boolean flag = posUni(v7ePosition);
		if(flag){
			throw new SysException("data_员工职位存在同组下的重复职位等级!");
		}
		
		String sequence = XMLUtil.getSequence("employeeSequence");
		employee.setV7ENum(Integer.valueOf(sequence));
		employee.setId(UUIDUtils.getUUID());
		employee.setV7EStatus(Constant.GENERAL_TYPE_ENABLE);
		try {
			employee.setV7EBirthday(DateUtil.sdf.parse(employee.getBirthday()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		employee.setV7EPassword(MD5Utils.md5("123456"));
		employee.setV7ECreateDate(new Date());
		employeeMapper.insertSelective(employee);
	
		XMLUtil.updateconfig(Long.valueOf(sequence) + 1,"employeeSequence");
	}
	
	
	
	@Override
	public void updateEmployee(V7Employee employee) throws SysException {
		
		String v7ePosition = employee.getV7EPosition();
		
		if(!"".equals(v7ePosition) && null != v7ePosition){
			boolean flag = posUni(v7ePosition);
			if(flag){
				throw new SysException("data_员工职位存在同组下的重复职位等级!");
			}
		}
		if(!"".equals(employee.getV7EPassword()) && null != employee.getV7EPassword()){
			employee.setV7EPassword(MD5Utils.md5(employee.getV7EPassword()));
			
		}
		employeeMapper.updateByPrimaryKeySelective(employee);
		
	}
	

	/**
	 * 发型师职位只能出现一次
	 * @param v7ePosition
	 * @return
	 */
	private boolean posUni(String v7ePosition) {
		String[] posArr = v7ePosition.split(",");
		String[] comparisonArr = {"3","4","5","6"};
		
		int tempNum = 0;
		for (String comparison : comparisonArr) {
			for (String position : posArr) {
				if(comparison.equals(position)){
					tempNum++;
				}
			}
		}
		if(tempNum > 1){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public V7Employee employeeDetail(String id) {
		V7Employee employee = employeeMapper.selectByPrimaryKey(id);
		String[] position = employee.getV7EPosition().split(",");
		String tempPosition = "";
		for (String string : position) {
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
		employee.setV7EPosition(tempPosition.substring(0,tempPosition.length() - 1));
		return employee;
	
		 
	}

	@Override
	public void updateEmployeeStatus(V7Employee employee) {
		employeeMapper.updateByPrimaryKeySelective(employee);
	}

	@Override
	public V7Employee searchByKey(String id) {
		return employeeMapper.selectByPrimaryKey(id);
		
	}

	

	@Override
	public List<V7Employee> search4Ehcache() {
		return employeeMapper.search4Ehcache();
		 
	}

	@Override
	public V7Employee checkUniqueness(String inName) {
		return employeeMapper.checkUniqueness(inName);
	}

	@Override
	public List<V7Employee> search4Results() {
		return employeeMapper.search4Results();
	}

	@Override
	public V7Employee checkUniquenessPhone(String inName) {
		return employeeMapper.checkUniquenessPhone(inName);
	}

}
