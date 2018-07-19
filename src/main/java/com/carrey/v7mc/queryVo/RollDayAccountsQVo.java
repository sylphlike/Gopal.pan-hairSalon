package com.carrey.v7mc.queryVo;

import com.carrey.v7mc.common.pageBean.PageBean;


/**
 * 日轧账多条件封装
 * @author carrey(潘冰)
 * @email  15923508369@163.com
 * @date   2016年6月8日下午4:36:03
 * @desc
 */
public class RollDayAccountsQVo extends PageBean {
	
	/*****收索条件属性****/
	String v7RBeginTime;
	String v7REndTime;
	
	public String getV7RBeginTime() {
		return v7RBeginTime;
	}
	public void setV7RBeginTime(String v7rBeginTime) {
		v7RBeginTime = v7rBeginTime;
	}
	public String getV7REndTime() {
		return v7REndTime;
	}
	public void setV7REndTime(String v7rEndTime) {
		v7REndTime = v7rEndTime;
	}
	
	
}
