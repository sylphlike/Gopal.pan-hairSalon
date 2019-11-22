package com.horse.v7mc.product.service.impl;

import java.util.Date;
import java.util.List;

import com.horse.v7mc.mapperInterface.V7ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.horse.v7mc.common.Constant;
import com.horse.v7mc.po.V7Brand;
import com.horse.v7mc.po.V7Product;
import com.horse.v7mc.product.service.ProductService;
import com.horse.v7mc.queryVo.ProductQVo;
import com.horse.v7mc.util.UUIDUtils;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private V7ProductMapper productMapper;
	
	@Override
	public int getTotalAmount(ProductQVo queryVo) {
		return productMapper.getTotalAmount(queryVo);
		
	}

	@Override
	public List<V7Product> getPageData(ProductQVo queryVo) {
		return productMapper.getPageData(queryVo);
	}

	@Override
	public void addProduct(V7Product product) {
		product.setId(UUIDUtils.getUUID());
		product.setV7PCrateTime(new Date());
		product.setV7PStatus(Constant.GENERAL_TYPE_ENABLE);
		productMapper.insertSelective(product);
		
	}

	@Override
	public V7Product selectByKey(String id) {
		return  productMapper.selectByPrimaryKey(id);
	}

	@Override
	public void updateProductStatus(V7Product product) {
		productMapper.updateByPrimaryKeySelective(product);
		
	}

	@Override
	public void updateProduct(V7Product product) {
		productMapper.updateByPrimaryKeySelective(product);
		
	}

	@Override
	public List<V7Brand> search4Ehcache() {
		return productMapper.search4Ehcache();
		 
	}

	@Override
	public V7Product checkUniqueness(String inName) {
		return  productMapper.checkUniqueness(inName);
	}



}
