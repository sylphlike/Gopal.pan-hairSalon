package com.horse.v7mc.queryVo;

import com.horse.v7mc.common.pageBean.PageBean;

public class UniversalQVo  extends PageBean{
	
	/**模块名*/
	private String moduleName;
	/**功能名*/
	private String featureName;
	/**请求结果*/
	private String requestResult;
	/**请求开始时间*/
	private String startTime;
	/**请求结束时间*/
	private String endTime;
	
	
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public String getFeatureName() {
		return featureName;
	}
	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}
	public String getRequestResult() {
		return requestResult;
	}
	public void setRequestResult(String requestResult) {
		this.requestResult = requestResult;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	

	
	
}
