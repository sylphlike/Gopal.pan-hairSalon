package com.carrey.v7mc.financial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.carrey.v7mc.common.Constant;
import com.carrey.v7mc.common.pageBean.PageUtils;
import com.carrey.v7mc.financial.service.SalaryService;
import com.carrey.v7mc.po.V7Salary;
import com.carrey.v7mc.queryVo.SalaryQvo;

@Controller
@RequestMapping("/salary")
public class financialController {
	
	@Autowired
	private SalaryService salaryService;
	
	/**
	 * 薪水列表
	 * @return
	 */
	@RequestMapping("/salaryList")
	public String salaryList(Model model,SalaryQvo queryVo){
		
		
		int recordCount = salaryService.getTotalAmount(queryVo);
		queryVo = (SalaryQvo) PageUtils.getPageInfo(recordCount,queryVo);
		List<V7Salary> pageData = salaryService.getPageData(queryVo);
		queryVo.setRecoredList(pageData);
		model.addAttribute(Constant.CONTROlLER_RETURN_ATTRNAME, queryVo);
		return "financial/salary-list";
	}

}
