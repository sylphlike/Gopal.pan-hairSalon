package com.horse.v7mc.queryVo;

import com.horse.v7mc.common.pageBean.PageBean;

public class BrandQVo extends PageBean{
	
	//定义查询参数
	private String v7BName;
	  
	private String v7BType;

	public String getV7BName() {
		return v7BName;
	}

	public void setV7BName(String v7bName) {
		v7BName = v7bName;
	}

	public String getV7BType() {
		return v7BType;
	}

	public void setV7BType(String v7bType) {
		v7BType = v7bType;
	}
	  
}
