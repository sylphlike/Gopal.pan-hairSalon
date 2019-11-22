package com.horse.v7mc.product.service;

import java.util.List;

import com.horse.v7mc.po.V7Brand;
import com.horse.v7mc.po.V7Product;
import com.horse.v7mc.queryVo.ProductQVo;

public interface ProductService {

	int getTotalAmount(ProductQVo queryVo);

	List<V7Product> getPageData(ProductQVo queryVo);

	void addProduct(V7Product product);

	V7Product selectByKey(String id);

	void updateProductStatus(V7Product product);

	void updateProduct(V7Product product);

	/**
	 * 缓存使用
	 * @return
	 */
	List<V7Brand> search4Ehcache();

	/**
	 * 重复名称校验
	 * @param inName
	 * @return
	 */
	V7Product checkUniqueness(String inName);
}
