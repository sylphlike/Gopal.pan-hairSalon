package com.carrey.v7mc.cashier.controller;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.carrey.v7mc.cashier.service.CashierReportService;
import com.carrey.v7mc.cashier.service.ResultsService;
import com.carrey.v7mc.common.Constant;
import com.carrey.v7mc.common.base.BaseAction;
import com.carrey.v7mc.common.exception.SysException;
import com.carrey.v7mc.common.pageBean.PageUtils;
import com.carrey.v7mc.employee.service.EmployeeService;
import com.carrey.v7mc.po.V7Employee;
import com.carrey.v7mc.po.V7RollDayAccounts;
import com.carrey.v7mc.queryVo.RollDayAccountsQVo;

/**
 * 
 * @author carrey(潘冰)
 * @email  15923508369@163.com
 * @date   2016年6月13日上午10:21:42
 * @desc   前台相关报表控制层
 */
@Controller
@RequestMapping("/cashierReport")
public class CashierReportController extends BaseAction {
	
	@Autowired
	private CashierReportService cashierReportService;
	@Autowired
	private ResultsService resultsService;
	@Autowired
	private EmployeeService employeeService;
	
	

	SimpleDateFormat format =  new SimpleDateFormat("yyyy-MM-dd");
	/**
	 * 日轧账列表数据
	 * @return
	 */
	@RequestMapping("/rollAccountsDayList")
	public String rollAccountsDayList(Model model, RollDayAccountsQVo queryVo){
	
		// 1 校验今天是否轧账
		String isRoll = format.format(new Date());
		Integer flag=  cashierReportService.queryIsRoll(isRoll);
		if(flag >=1){
			//今天已经轧账，那么显示图表
			return "memberOrfront/rollingAccounts4Chart";
		}else {
			int recordCount = cashierReportService.getTotalAmount(queryVo);
			queryVo = (RollDayAccountsQVo) PageUtils.getPageInfo(recordCount,queryVo);
			List<V7RollDayAccounts> pageData = cashierReportService.getPageData(queryVo);
			queryVo.setRecoredList(pageData);
			
			model.addAttribute(Constant.CONTROlLER_RETURN_ATTRNAME, queryVo);
			model.addAttribute("flag", 1);
			return "memberOrfront/rollingAccounts";
		}
		
	}
	
	/**
	 * 日轧账历史数据
	 * @param model
	 * @param queryVo
	 * @return
	 */
	@RequestMapping("/rollAccountsDayListHistory")
	public String rollAccountsDayListHistory(Model model, RollDayAccountsQVo queryVo){
		
		// 1 校验今天是否轧账
		String isRoll = format.format(new Date());
		Integer flag=  cashierReportService.queryIsRoll(isRoll);
		if(flag >=1){
			//今天已经轧账，影藏轧账按钮
			model.addAttribute("flag", 2);
		}else {
			model.addAttribute("flag", 1);
		}
		int recordCount = cashierReportService.getTotalAmount(queryVo);
		queryVo = (RollDayAccountsQVo) PageUtils.getPageInfo(recordCount,queryVo);
		List<V7RollDayAccounts> pageData = cashierReportService.getPageData(queryVo);
		queryVo.setRecoredList(pageData);
		model.addAttribute(Constant.CONTROlLER_RETURN_ATTRNAME, queryVo);
		return "memberOrfront/rollingAccounts";
	}
	
	/**
	 * 日轧账，同时处理业绩数据
	 * @throws ParseException 
	 * @throws SysException 
	 */
	@RequestMapping("/rollingAccounts")
	public String rollingAccounts(Model model) throws ParseException, SysException{
		String currentDate = format.format(new Date());
		String strartStr  = currentDate+" 00:00:00";
		String endStr = currentDate+" 23:59:59";
		String logUser = getLoginUser().getV7EName();
		cashierReportService.insertRollDay(strartStr,endStr,currentDate,logUser);
		
		//处理业绩
		if(currentDate.endsWith("-01")){
			//当月的第一天
			List<V7Employee> employeeList = employeeService.search4Results();
			resultsService.addfirstData(employeeList,currentDate);
		}else{
			List<V7Employee> employeeList = employeeService.search4Results();
			//累加业绩数据
			resultsService.addResultsData(employeeList,currentDate);
		}
		//轧账完成显示图表
		return "memberOrfront/rollingAccounts4Chart";
	}
	
	
	
	//获取日扎账数据
	@RequestMapping("/getEchartsData")
	public @ResponseBody Object[]  getCacheBrand() throws SysException, UnsupportedEncodingException, IllegalArgumentException, IllegalAccessException, ParseException{
		String charVal = format.format(new Date());
		Date charDate =  format.parse(charVal);
		
		Object[] charData = cashierReportService.queryChart(charDate);
		return charData;
	}
	
}
