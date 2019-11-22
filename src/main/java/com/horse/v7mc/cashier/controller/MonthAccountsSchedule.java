package com.horse.v7mc.cashier.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.horse.v7mc.cashier.service.CashierReportService;

/**
 * 
 * @author carrey(潘冰)
 * @email  15923508369@163.com
 * @date   2016年6月28日上午11:26:33
 * @desc   月运营数据统计调度
 */
public class MonthAccountsSchedule {
	private static Logger log = Logger.getLogger(MonthAccountsSchedule.class);
	
	@Autowired
	private CashierReportService cashierReportService;
	
	public void monthAccountsSchedule(){
		log.info("月运营数据统计调度开始。。。");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = sdf.format(new Date());
		log.info("开始时间："+ date);
		
		cashierReportService.monthAccountsSchedule();
	}

}
