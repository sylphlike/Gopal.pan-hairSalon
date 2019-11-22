package com.horse.v7mc.financial.service;

import java.util.List;

import com.horse.v7mc.po.V7Salary;
import com.horse.v7mc.queryVo.SalaryQvo;

public interface SalaryService {

	int getTotalAmount(SalaryQvo queryVo);

	List<V7Salary> getPageData(SalaryQvo queryVo);

	/**
	 *  月薪水计算调度
	 */
	void monthSalary();

}
