package com.horse.v7mc.queryVo;

import com.horse.v7mc.common.pageBean.PageBean;

/**
 * 
 * @author carrey(潘冰)
 * @email  15923508369@163.com
 * @date   2016年5月25日下午4:44:35
 * @desc   库存相关公用查询VO
 */
public class StoreQVo extends PageBean {
	
	/**产品品牌*/
	private String brandName;
	
	/**产品类别*/
	private String brandType;
	
	/**产品名称*/
	private String productName;
	
	private String startTime;
	
	private String endTime;
	

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBrandType() {
		return brandType;
	}

	public void setBrandType(String brandType) {
		this.brandType = brandType;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
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
