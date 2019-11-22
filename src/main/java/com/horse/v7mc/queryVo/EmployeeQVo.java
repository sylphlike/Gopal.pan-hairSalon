package com.horse.v7mc.queryVo;

import java.util.Date;

import com.horse.v7mc.common.pageBean.PageBean;


/**
 * 
 * @author 		carrey(潘冰)
 * @Email  		15923508369@163.com
 * @Date   		2016年5月8日下午12:54:59
 * @version		v 1.0.1
 * @description 员工查询条件封装
 */
public class EmployeeQVo extends PageBean {
	
	private String v7EName;
	private Long v7ENum;
	private String v7EPhone;
	private Date v7EBeginTime;
	private Date v7EEndTime;
	
	
	public String getV7EName() {
		return v7EName;
	}
	public void setV7EName(String v7eName) {
		v7EName = v7eName;
	}
	public Long getV7ENum() {
		return v7ENum;
	}
	public void setV7ENum(Long v7eNum) {
		v7ENum = v7eNum;
	}
	public String getV7EPhone() {
		return v7EPhone;
	}
	public void setV7EPhone(String v7ePhone) {
		v7EPhone = v7ePhone;
	}
	public Date getV7EBeginTime() {
		return v7EBeginTime;
	}
	public void setV7EBeginTime(Date v7eBeginTime) {
		v7EBeginTime = v7eBeginTime;
	}
	public Date getV7EEndTime() {
		return v7EEndTime;
	}
	public void setV7EEndTime(Date v7eEndTime) {
		v7EEndTime = v7eEndTime;
	}
	
	

}
