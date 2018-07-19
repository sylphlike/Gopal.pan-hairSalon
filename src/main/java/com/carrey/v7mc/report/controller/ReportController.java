package com.carrey.v7mc.report.controller;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.carrey.v7mc.report.service.ReportService;
import com.carrey.v7mc.util.DateUtil;
import com.google.gson.Gson;

@Controller
@RequestMapping("/report")
public class ReportController {
	
	@Autowired
	private ReportService reportService;
	
	
	/*******************************运营报表*****************************************/
	/**
	 * 初始化报表页面，默认显示最近一天的日报数据
	 * @return
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 */
	@RequestMapping("/businessReport")
	public String businessReport(Model model) throws IllegalArgumentException, IllegalAccessException{
		List<Object> charData = reportService.businessReport();
		
		Gson gson = new Gson();
		if(!charData.isEmpty()){
			String json = gson.toJson(charData.get(0));
			model.addAttribute("values", json);
			model.addAttribute("charTitleDate", "V7MC日报表数据 "+charData.get(1));
		}else {
			model.addAttribute("values", null);
			model.addAttribute("charTitleDate", "V7MC日报表数据 ");
		}


		return "/report/businessReport";
	}
  
	@RequestMapping("/searchBussReport")
	public String searchBussReport(String reportType,String dayReport,String monthReport,Model model) throws ParseException, IllegalArgumentException, IllegalAccessException{
		List<Object> charData = reportService.searchBussReport(reportType,dayReport,monthReport);
		if(charData.size() == 0){
			model.addAttribute("values", "nullData");
			return "/report/businessReport";
		}
		Gson gson = new Gson();
		String json = gson.toJson(charData.get(0));
		
		model.addAttribute("values", json);
		if("1".equals(reportType)){
			model.addAttribute("charTitleDate", "V7MC运营日报表数据 "+charData.get(1));			
		}else{
			model.addAttribute("charTitleDate", "V7MC运营月报表数据 "+charData.get(1));			
		}
		return "/report/businessReport";
	}
	
	
	/*******************************产品报表*****************************************/
	
	/**
	 * 初始化报表页面，默认显示当前月份的出库产品数据
	 * @param model
	 * @param startTime
	 * @param endTime
	 * @return
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 */
	@RequestMapping("productReport")
	public String productReport(Model model,String startTime,String endTime) throws IllegalArgumentException, IllegalAccessException{
		
		startTime = DateUtil.monthStartDay()+" 00:00:00";
		endTime = DateUtil.monthLastDay()+" 23:59:59";
		
		Map<String, Object[]> charData = reportService.productReport(startTime,endTime);
		startTime = startTime.substring(0, startTime.lastIndexOf(" "));
		endTime = endTime.substring(0, endTime.lastIndexOf(" "));
		
		String title = startTime+" 至 "+endTime;
		
		Gson gson = new Gson();
		String count = gson.toJson(charData.get("count"));
		String price = gson.toJson(charData.get("price"));
		
		model.addAttribute("count", count);
		model.addAttribute("price", price);
		model.addAttribute("charTitleDate", "V7MC产品月出库报表数据 "+title);
		return "report/productReport";
		
	}
	
	
	/**
	 * 产品报表自定义查询
	 * @param model
	 * @param reportType
	 * @param startTime
	 * @param endTime
	 * @return
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 */
	@RequestMapping("searchReport")
	public String searchReport(Model model,String reportType,String startTime,String endTime) throws IllegalArgumentException, IllegalAccessException{
		
		
		startTime = startTime+" 00:00:00";
		endTime = endTime+" 23:59:59";
		
		Map<String, Object[]> charData = reportService.searchReport(reportType,startTime,endTime);
		startTime = startTime.substring(0, startTime.lastIndexOf(" "));
		endTime = endTime.substring(0, endTime.lastIndexOf(" "));
		
		String title = "V7MC产品"+reportType +"报表数据"+ startTime+" 至 "+endTime;
		
		Gson gson = new Gson();
		String count = gson.toJson(charData.get("count"));
		String price = gson.toJson(charData.get("price"));
		
		model.addAttribute("count", count);
		model.addAttribute("price", price);
		model.addAttribute("charTitleDate", title);
		
		
		return "report/productReport";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*******************************薪水报表*****************************************/
	
	/**
	 * 薪水报表
	 * @param model
	 * @return
	 */
	@RequestMapping("salaryReport")
	public String salaryReport(Model model){
		
		return "/report/salaryReport";
	}
}
