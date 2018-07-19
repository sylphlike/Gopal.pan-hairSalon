package com.carrey.v7mc.queryVo;

import com.carrey.v7mc.common.pageBean.PageBean;

public class ProductQVo extends PageBean {
	
	/**产品品牌*/
	private String v7PBrand;
	
	/**产品类别*/
	private String v7PType;
	
	/**产品名称*/
	private String v7PName;

	public String getV7PBrand() {
		return v7PBrand;
	}

	public void setV7PBrand(String v7pBrand) {
		v7PBrand = v7pBrand;
	}

	public String getV7PType() {
		return v7PType;
	}

	public void setV7PType(String v7pType) {
		v7PType = v7pType;
	}

	public String getV7PName() {
		return v7PName;
	}

	public void setV7PName(String v7pName) {
		v7PName = v7pName;
	}
	

	
}
