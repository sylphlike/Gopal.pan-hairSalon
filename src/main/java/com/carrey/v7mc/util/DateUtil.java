package com.carrey.v7mc.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	
	public static final String FORMAT1 = "yyyy-MM-dd HH:mm:ss";
	
	public static final String FORMAT3 = "MM/dd/yyyy HH:mm:ss";
	
	public static final String FORMAT2 = "yyyy-MM-dd";
	
	public static final String FORMAT4 = "MM/dd/yyyy";
	
	public static final String FORMAT5 = "HH:mm:ss";
	
	/**
	 * 年
	 */
	public static final String DATATYPE_YEAR = "Y";
	
	/**
	 * 月
	 */
	public static final String DATATYPE_MONTH = "M";
	
	/**
	 * 日
	 */
	public static final String DATATYPE_DAY = "D";
	
	/**
	 * 小时
	 */
	public static final String DATATYPE_HOUR = "H";
	
	/**
	 * 分钟
	 */
	public static final String DATATYPE_MINUTE = "m";
	
	/**
	 * 秒
	 */
	public static final String DATATYPE_SECOND = "S";
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy,MM,dd");

	private static final SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
	
	private static final SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	/**
	 * 将字符串转为日期（yyyy-MM-dd HH:mm:ss）
	 * @param str	字符串
	 * @return 转换成功返回日期，否则返回null
	 */
	public static Date strParseDateTime(String str){
		try {
			return sdf2.parse(str);
		} catch (ParseException e) {
			return null;
		}
	}
	
	/**
	 * 将字符串转为日期（yyyy,MM,dd），会员生日专项
	 * @param str	字符串
	 * @return 转换成功返回日期，否则返回null
	 */
	public static Date strParseBirthdayTime(String str){
		try {
			return sdf.parse(str);
		} catch (ParseException e) {
			return null;
		}
	}
	/**
	 * 专供会员生日
	 * 将日期转为字符串（yyyy-MM-dd）
	 * @param date
	 * @return
	 */
	public static String[] dateMemberParseStr(Date date){
		try{
			String format = sdf1.format(date);
			return format.split("-");
		}catch(Exception e){
			return null;
		}
	}
	
	/**
	 * 将字符串转为日期（yyyy-MM-dd）
	 * @param str	字符串
	 * @return 转换成功返回日期，否则返回null
	 */
	public static Date strParseDate(String str){
		try {
			return sdf1.parse(str);
		} catch (ParseException e) {
			return null;
		}
	}
	
	/**
	 * 将日期转为字符串（yyyy-MM-dd）
	 * @param date
	 * @return
	 */
	public static String dateParseStr(Date date){
		try{
			return sdf1.format(date);
		}catch(Exception e){
			return "";
		}
	}
	
	/**
	 * 将日期转为字符串（yyyy-MM-dd HH:mm:ss）
	 * @param date
	 * @return
	 */
	public static String dateTimeParseStr(Date date){
		try{
			return sdf2.format(date);
		}catch(Exception e){
			return "";
		}
	}
	
	/**
	 * 获取日期格式
	 * 支持的格式有：
	 * yyyy-MM-dd HH:mm:ss
	 * yyyy-MM-dd HH:mm:ss.SSS（归到yyyy-MM-dd HH:mm:ss中）
	 * yyyy-MM-dd
	 * MM/dd/yyyy HH:mm:ss
	 * MM/dd/yyyy HH:mm:ss.SSS（归到MM/dd/yyyy HH:mm:ss中）
	 * MM/dd/yyyy
	 * @param date	日期
	 * @return		格式
	 */
	public static String getFormat(String date) throws Exception {
		String reg1 = "\\d{4}-\\d{1,2}-\\d{1,2} \\d{1,2}:\\d{1,2}:\\d{1,2}(.\\d{1,3}){0,1}";
		String reg2 = "\\d{4}-\\d{1,2}-\\d{1,2}";
		String reg3 = "\\d{1,2}/\\d{1,2}/\\d{4} \\d{1,2}:\\d{1,2}:\\d{1,2}(.\\d{1,3}){0,1}";
		String reg4 = "\\d{1,2}/\\d{1,2}/\\d{4}";
		if(date.matches(reg1)) {
			return FORMAT1;
		} else if(date.matches(reg2)) {
			return FORMAT2;
		} else if(date.matches(reg3)) {
			return FORMAT3;
		} else if(date.matches(reg4)) {
			return FORMAT4;
		} else {
			throw new Exception("不支持的日期格式：" + date);
		}
	}
	
	/**
	 * 获取当前日期（固定格式：yyyy-MM-dd）
	 * @return	当前日期
	 */
	public static String getCurrentDate() {
		return getCurrentDateTime(FORMAT2);
	}
	
	/**
	 * 获取当前时间（固定格式：HH:mm:ss）
	 * @return	当前时间
	 */
	public static String getCurrentTime() {
		return getCurrentDateTime(FORMAT5);
	}
	
	/**
	 * 获取当前日期和时间（固定格式：yyyy-MM-dd HH:mm:ss）
	 * @return	当前日期和时间
	 */
	public static String getCurrentDateTime() {
		return getCurrentDateTime(FORMAT1);
	}
	
	/**
	 * 获取当前日期和时间（自定义格式）
	 * 参考格式：yyyy年MM月dd日HH时（hh时）mm分ss秒ms毫秒E本月第F个星期
	 * 对应的值：2009年07月22日15时（03时）05分30秒530毫秒星期三本月第4个星期
	 * @param format	日期时间的格式
	 * @return			当前日期和时间
	 */
	public static String getCurrentDateTime(String format) {
		SimpleDateFormat df = new SimpleDateFormat(format);
		return df.format(new Date());
	}
	
	/**
	 * 获取昨天的日期（固定格式：yyyy-MM-dd）
	 * @return	日期
	 */
	public static String getYesterday() {
		SimpleDateFormat df = new SimpleDateFormat(FORMAT2);
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DATE, -1);
		return df.format(c.getTime());
	}
	
	/**
	 * 获取明天的日期（固定格式：yyyy-MM-dd）
	 * @return	日期
	 */
	public static String getTomorrow() {
		SimpleDateFormat df = new SimpleDateFormat(FORMAT2);
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DATE, 1);
		return df.format(c.getTime());
	}
	
	/**
	 * 把String转换成日期
	 * @param date		String型日期
	 * @return			Date型日期
	 */
	public static Date convertStringToDate(String date) throws Exception {
		SimpleDateFormat df = new SimpleDateFormat(getFormat(date));
		return df.parse(date);
	}
	
	/**
	 * 把日期类型转换成String
	 * @param date		Date型日期
	 * @param format	转换成String型日期后的格式
	 * @return			String型日期
	 */
	public static String convertDateToString(Date date, String format) {
		SimpleDateFormat df = new SimpleDateFormat(format);
		return df.format(date);
	}
	
	/**
	 * 日期时间格式转换
	 * @param value			转换前的值
	 * @param format		转换后的格式
	 * @return				转换后的值
	 */
	public static String dateFormat(String value, String format) {
		try {
			Date date = convertStringToDate(value);
			return convertDateToString(date, format);
		} catch (Exception e) {
			return "";
		}
	}
	
	/**
	 * 计算两个日期的间隔（yyyy MM dd HH mm ss）
	 * @param type		间隔的单位：1-年，2-月，3-日，4-小时，5-分钟，6-秒，不填默认为日
	 * @param date1	
	 * @param date2	
	 * @return			间隔的数量。如果日期sdate2在日期sdate1之后，则结果为正数；如果日期sdate2在日期sdate1之前，则结果为负数
	 */
	public static int dateDiff(String type, Date date1, Date date2) throws Exception {
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal1.setTime(date1);
		cal2.setTime(date2);
		int yearDiff = cal2.get(Calendar.YEAR) - cal1.get(Calendar.YEAR);
		if(type.equals(DATATYPE_YEAR)){//年
			return yearDiff;
		}else if(type.equals(DATATYPE_MONTH)){//月
			int monthDiff = yearDiff * 12 + cal2.get(Calendar.MONTH) - cal1.get(Calendar.MONTH);
			return monthDiff;
		}else {
			long ldate1 = date1.getTime() + cal1.get(Calendar.ZONE_OFFSET) + cal1.get(Calendar.DST_OFFSET);
			long ldate2 = date2.getTime() + cal2.get(Calendar.ZONE_OFFSET) + cal2.get(Calendar.DST_OFFSET);
			if(type.equals(DATATYPE_HOUR)) {//小时
				return (int)((ldate2 - ldate1) / (3600000));
			}else if(type.equals(DATATYPE_MINUTE)) {//分钟
				return (int)((ldate2 - ldate1) / (60000));
			}else if(type.equals(DATATYPE_SECOND)) {//秒
				return (int)((ldate2 - ldate1) / (1000));
			}else {//日
				return (int)((ldate2 - ldate1) / (3600000 * 24));
			}
		}
	}
	
	/**
	 * 计算日期加上一段间隔之后的新日期
	 * @param type		间隔的单位：Y-年，M-月，D-日，H-小时，m-分钟，S-秒，不填默认为日
	 * @param date		
	 * @param num		间隔数量
	 * @return			返回新日期
	 */
	public static Date dateAdd(String type, Date date, int num) throws Exception{
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		if(type.equals(DATATYPE_YEAR)){
			cal.add(Calendar.YEAR, num);
		}else if(type.equals(DATATYPE_MONTH)){
			cal.add(Calendar.MONTH, num);
		}else if(type.equals(DATATYPE_HOUR)){
			cal.add(Calendar.HOUR, num);
		}else if(type.equals(DATATYPE_MINUTE)){
			cal.add(Calendar.MINUTE, num);
		}else if(type.equals(DATATYPE_SECOND)){
			cal.add(Calendar.SECOND, num);
		}else {
			cal.add(Calendar.DATE, num);
		}
		return cal.getTime();
	}

	/**
	 * 获取当月的前一月的最后一天
	 * @return
	 */
	public static String beforeMonthLastDay(){
		Calendar beforeC = Calendar.getInstance();
		beforeC.add(Calendar.MONTH, -1);
		beforeC.set(Calendar.DAY_OF_MONTH,beforeC.getActualMaximum(Calendar.DAY_OF_MONTH));  
		Date strDateTo = beforeC.getTime();  
		return sdf1.format(strDateTo);
	}
	
	/**
	 * 获取当月的前一月的第一天
	 * @return
	 */
	public static String beforeMonthStartDay(){
		Calendar beforeC = Calendar.getInstance();
		beforeC.add(Calendar.MONTH, -1);
		beforeC.set(Calendar.DAY_OF_MONTH,beforeC.getActualMinimum(Calendar.DAY_OF_MONTH));  
		Date strDateTo = beforeC.getTime();  
		return sdf1.format(strDateTo);
	}
	/**
	 * 获取当前月的最后一天
	 * @return
	 */
	public static String monthLastDay(){
		Calendar calendar = Calendar.getInstance();
		int MaxDay=calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		//按你的要求设置时间
		calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), MaxDay, 23, 59, 59);
		String month4lastDay = sdf1.format(calendar.getTime());
		return month4lastDay;
	}
	
	
	/**
	 * 获取当月的第一天
	 * @return
	 */
	public static String monthStartDay(){
		Calendar calendar = Calendar.getInstance();
		int mainDay=calendar.getActualMinimum(Calendar.DAY_OF_MONTH);
		//按你的要求设置时间
		calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), mainDay, 23, 59, 59);
		String monthStartDay = sdf1.format(calendar.getTime());
		return monthStartDay;
	}
	/**
	 * 获取今天是星期几
	 * @return
	 */
	public static String dayOfMonth(){
		Calendar calendar = Calendar.getInstance();
		int temp = calendar.get(Calendar.DAY_OF_WEEK)-1;
		return String.valueOf(temp);
	}
	
	/**
	 * 获取本月第一天是星期几,数字形式
	 * @return
	 */
	public static Integer monthStartWeek(){
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		int DayOfWeek = calendar.get(Calendar.DAY_OF_WEEK)-1; 
		return DayOfWeek;
	}
}
