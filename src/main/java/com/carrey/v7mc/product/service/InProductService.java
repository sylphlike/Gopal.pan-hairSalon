package com.carrey.v7mc.product.service;

import java.util.List;

import com.carrey.v7mc.po.V7StoreIn;
import com.carrey.v7mc.queryVo.StoreQVo;

public interface InProductService {

	int getTotalAmount(StoreQVo queryVo);

	List<V7StoreIn> getPageData(StoreQVo queryVo);

	/**
	 * 产品入库
	 * @param storeIn
	 */
	void addInProduct(V7StoreIn storeIn);

	/**
	 * 修改入库产品信息
	 * @param storeIn
	 */
	void updateInProduct(V7StoreIn storeIn);

	/**
	 * 根据ID查询数据
	 * @param id
	 * @return
	 */
	V7StoreIn searchById(String id);

}
