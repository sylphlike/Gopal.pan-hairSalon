package com.carrey.v7mc.financial.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.carrey.v7mc.cashier.controller.MonthAccountsSchedule;
import com.carrey.v7mc.financial.service.SalaryService;

/**
 * 
 * @author carrey(潘冰)
 * @email  15923508369@163.com
 * @date   2016年6月30日上午9:49:07
 * @desc   月薪水计算调度
 */
public class MonthSalary {
	
private static Logger log = Logger.getLogger(MonthAccountsSchedule.class);
	
	@Autowired
	private SalaryService salaryService;
	
	public void monthSalary(){
		log.info("月薪水计算调度开始。。。");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = sdf.format(new Date());
		log.info("开始时间："+ date);
		salaryService.monthSalary();
	}

}
