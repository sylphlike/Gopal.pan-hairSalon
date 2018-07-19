package com.carrey.v7mc.product.service;

import java.util.List;

import com.carrey.v7mc.po.V7StoreOut;
import com.carrey.v7mc.po.V7StoreQuantity;
import com.carrey.v7mc.queryVo.StoreQVo;

public interface OutProductService {

	int getTotalAmount(StoreQVo queryVo);

	List<V7StoreOut> getPageData(StoreQVo queryVo);

	/**
	 * 根据商品名称模糊匹配
	 * @param term
	 * @return
	 */
	List<V7StoreQuantity> selectStoreProduct(String term);

	/**
	 * 获取单一产品的库存数量
	 * @param term
	 * @return
	 */
	V7StoreQuantity selectStoreProductCount(String term);

	/**
	 * 出库产品
	 * @param storeOut
	 */
	void addOutProduct(V7StoreOut storeOut);

	/**
	 * 修改出库产品
	 * @param storeOut
	 */
	boolean updateOutProduct(V7StoreOut storeOut);

	/**
	 * 获取历史入库最高价格
	 * @param id
	 * @return
	 */
	double selectMaxInPrice(String id);

	V7StoreOut selectById(String id);

}
