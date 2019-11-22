package com.horse.v7mc.report.service;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

public interface ReportService {

	/**
	 * 初始化运营报表页面是显示日报中最新的报表数据
	 * @return
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 */
	List<Object> businessReport() throws IllegalArgumentException, IllegalAccessException;

	/**
	 * 运营报表查询，包括日报月报
	 * @param reportType
	 * @param dayReport
	 * @param monthReport
	 * @return
	 * @throws ParseException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	List<Object> searchBussReport(String reportType, String dayReport, String monthReport) throws ParseException, IllegalArgumentException, IllegalAccessException;

	/**
	 * 初始化页面是显示的产品出库报表数据
	 * @param endTime 
	 * @param startTime 
	 * @return
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 */
	Map<String, Object[]> productReport(String startTime, String endTime) throws IllegalArgumentException, IllegalAccessException;

	/**
	 * 产品报表自定义查询 包括出库入库
	 * @param reportType
	 * @param startTime
	 * @param endTime
	 * @return
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 */
	Map<String, Object[]> searchReport(String reportType, String startTime,
			String endTime) throws IllegalArgumentException, IllegalAccessException;

}
