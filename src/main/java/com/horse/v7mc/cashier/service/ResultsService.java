package com.horse.v7mc.cashier.service;

import java.util.List;

import com.horse.v7mc.po.V7Employee;
import com.horse.v7mc.po.V7Results;
import com.horse.v7mc.queryVo.ResultsQVo;

public interface ResultsService {

	int getTotalAmount(ResultsQVo queryVo);

	List<V7Results> getPageData(ResultsQVo queryVo);

	/**
	 * 每月的第一天业绩数据
	 * @param employeeList
	 * @param currentDate 
	 */
	void addfirstData(List<V7Employee> employeeList, String currentDate);

	/**
	 * 每月的业绩数据累加
	 * @param employeeList
	 * @param currentDate
	 */
	void addResultsData(List<V7Employee> employeeList, String currentDate);

}
