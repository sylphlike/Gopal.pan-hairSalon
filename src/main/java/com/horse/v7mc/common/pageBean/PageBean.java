package com.horse.v7mc.common.pageBean;

import java.util.List;

/**
 * 
 * @author 		carrey(潘林森)
 * @Email  		15923508369@163.com / panlinsen@ultrapower.com.cn
 * @Date   		2015年10月28日上午10:10:10
 * @version		v 1.0.1
 * @description 分页查询基础Bean
 */
@SuppressWarnings("all")
public class PageBean {
	
	//当前页码
	public Integer currentPage = 1;
	//每页显示记录数
	public Integer pageSize = 7;
	
	/***** 查询数据库获取  ****/
	//页码结果数据集合
	public List recoredList;
	//总记录数
	public Integer recordCount;
	
	/****** 由上面四项计算所得*********/
	//页面开始索引
	public Integer beginPageIndex;
	//页面结束索引
	public Integer endPageIndex;
	//总页数
	public Integer pageCount;
	
	/**当前页码的getter方法*/	
	public Integer getCurrentPage() {
		return currentPage;
	}
	
	/**当前页码的setter方法*/
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	
	/**每页显示记录数的getter方法*/
	public Integer getPageSize() {
		return pageSize;
	}
	
	/**每页显示记录数的setter方法*/
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	
	/**页码结果数据集合的getter方法*/
	public List getRecoredList() {
		return recoredList;
	}
	
	/**页码结果数据集合的setter方法*/
	public void setRecoredList(List recoredList) {
		this.recoredList = recoredList;
	}
	
	/**总记录数的getter方法*/
	public Integer getRecordCount() {
		return recordCount;
	}
	
	/**总记录数的setter方法*/
	public void setRecordCount(Integer recordCount) {
		this.recordCount = recordCount;
	}
	
	/**页面开始索引的getter方法*/
	public Integer getBeginPageIndex() {
		return beginPageIndex;
	}
	
	/**页面开始索引的setter方法*/
	public void setBeginPageIndex(Integer beginPageIndex) {
		this.beginPageIndex = beginPageIndex;
	}
	
	/**页面结束索引的getter方法*/
	public Integer getEndPageIndex() {
		return endPageIndex;
	}
	
	/**页面结束索引的setter方法*/
	public void setEndPageIndex(Integer endPageIndex) {
		this.endPageIndex = endPageIndex;
	}
	
	/**总页数的getter方法*/
	public Integer getPageCount() {
		return pageCount;
	}
	
	/**总页数的setter方法*/
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	
	
	
	
	/*public Integer getBeginPageIndex() {
		return beginPageIndex;
	}
	public void setBeginPageIndex(Integer beginPageIndex) {
		this.beginPageIndex  = (currentPage -1)* pageSize;
	}
	public Integer getEndPageIndex() {
		return endPageIndex;
	}
	public void setEndPageIndex(Integer endPageIndex) {
		this.endPageIndex = currentPage * pageSize;
	}
	public Integer getPageCount() {
		return pageCount;
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = (recordCount + pageSize -1) / pageSize;
	}
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
