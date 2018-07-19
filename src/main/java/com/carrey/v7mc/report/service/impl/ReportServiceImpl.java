package com.carrey.v7mc.report.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carrey.v7mc.mapperInterface.V7RollDayAccountsMapper;
import com.carrey.v7mc.mapperInterface.V7RollMonthAccountsMapper;
import com.carrey.v7mc.mapperInterface.V7StoreInMapper;
import com.carrey.v7mc.mapperInterface.V7StoreOutMapper;
import com.carrey.v7mc.po.V7RollDayAccounts;
import com.carrey.v7mc.po.V7RollMonthAccounts;
import com.carrey.v7mc.po.V7StoreIn;
import com.carrey.v7mc.po.V7StoreOut;
import com.carrey.v7mc.report.service.ReportService;
import com.carrey.v7mc.util.DateUtil;
import com.carrey.v7mc.util.POtoArrays;

@Service
public class ReportServiceImpl implements ReportService {
	
	@Autowired
	private V7RollDayAccountsMapper dayMapper;
	@Autowired
	private V7RollMonthAccountsMapper monthMapper;
	@Autowired
	private V7StoreOutMapper outMapper;
	@Autowired
	private V7StoreInMapper inMapper;


	SimpleDateFormat format =  new SimpleDateFormat("yyyy-MM-dd");
	
	@Override
	public List<Object> businessReport() throws IllegalArgumentException, IllegalAccessException {
		V7RollDayAccounts dayAccounts = dayMapper.businessReport();
		List<Object> result = new ArrayList<Object>();
		Object[] arrays = null;
		if(null != dayAccounts){
			arrays = POtoArrays.poToArrays4Day(dayAccounts);
			result.add(arrays);
			result.add(DateUtil.dateParseStr(dayAccounts.getV7RRollingDate()));
		}

		return result;
	}

	@Override
	public List<Object> searchBussReport(String reportType, String dayReport, String monthReport) throws ParseException, IllegalArgumentException, IllegalAccessException {
		List<Object> result = new ArrayList<Object>();
		if("1".equals(reportType)){
			//日报
			Date charDate =  format.parse(dayReport);
			V7RollDayAccounts queryChart = dayMapper.queryChart(charDate);
			Object[] arrays = null;
			if(null != queryChart){
				arrays = POtoArrays.poToArrays4Day(queryChart);
				result.add(arrays);
				result.add(DateUtil.dateParseStr(queryChart.getV7RRollingDate()));
			}
			return result;
		}else if("2".equals(reportType)){
			//月报
			V7RollMonthAccounts queryChart = monthMapper.queryChart(monthReport);
			Object[] arrays = null;
			if(null != queryChart){
				arrays = POtoArrays.poToArrays4Month(queryChart);
				result.add(arrays);
				result.add(queryChart.getV7MRollingDate());
			}
			return result;
		}else {
			return result;
		}
	}

	@Override
	public Map<String, Object[]> productReport(String startTime, String endTime) throws IllegalArgumentException, IllegalAccessException {
		Map<String, Object[]> map = new HashMap<String, Object[]>();
		List<V7StoreOut> outProduct = outMapper.productReport(startTime,endTime);
		
		Object[] count = {0,0,0,0};  //出库数量  data: ['洗护类 ', '烫发类', '染发类', '其它']
		Object[] price = {0,0,0,0}; //总出库价格
		if(null != outProduct){
			for (V7StoreOut storeOut : outProduct) {
				Map<String, Object> arrays4Pro = POtoArrays.poToArrays4Pro(storeOut);
				String sType = storeOut.getV7SType();
				switch (sType) {
					case "洗护类":
						count[0]= arrays4Pro.get("v7SCount");
						price[0] = arrays4Pro.get("v7SPriceCount");
						break;
					case "烫发类":
						count[1]= arrays4Pro.get("v7SCount");
						price[1] = arrays4Pro.get("v7SPriceCount");
						break;
					case "染发类":
						count[2]= arrays4Pro.get("v7SCount");
						price[2] = arrays4Pro.get("v7SPriceCount");
						break;
					case "其它类":
						count[3]= arrays4Pro.get("v7SCount");
						price[3] = arrays4Pro.get("v7SPriceCount");
						break;
				}
				
			}
		}
		map.put("count", count);
		map.put("price", price);
		return map;
	}

	@Override
	public Map<String, Object[]> searchReport(String reportType,String startTime, String endTime) throws IllegalArgumentException, IllegalAccessException {
		if("出库".equals(reportType)){
			Map<String, Object[]> productReport = productReport(startTime, endTime);
			return productReport;
		}else {
			Map<String, Object[]> map = new HashMap<String, Object[]>();
			List<V7StoreIn> storeIn = inMapper.productReport(startTime,endTime);
			
			Object[] count = {0,0,0,0};  //出库数量  data: ['洗护类 ', '烫发类', '染发类', '其它']
			Object[] price = {0,0,0,0}; //总出库价格
			if(null != storeIn){
				for (V7StoreIn in : storeIn) {
					Map<String, Object> arrays4Pro = POtoArrays.poToArrays4Pro(in);
					String sType = in.getV7SType();
					switch (sType) {
						case "洗护类":
							count[0]= arrays4Pro.get("v7SCount");
							price[0] = arrays4Pro.get("v7SPriceCount");
							break;
						case "烫发类":
							count[1]= arrays4Pro.get("v7SCount");
							price[1] = arrays4Pro.get("v7SPriceCount");
							break;
						case "染发类":
							count[2]= arrays4Pro.get("v7SCount");
							price[2] = arrays4Pro.get("v7SPriceCount");
							break;
						case "其它类":
							count[3]= arrays4Pro.get("v7SCount");
							price[3] = arrays4Pro.get("v7SPriceCount");
							break;
					}
					
				}
			}
			map.put("count", count);
			map.put("price", price);
			return map;
		}
	}

	
}
