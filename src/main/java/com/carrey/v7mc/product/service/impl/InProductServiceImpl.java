package com.carrey.v7mc.product.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carrey.v7mc.common.Constant;
import com.carrey.v7mc.mapperInterface.V7ProductMapper;
import com.carrey.v7mc.mapperInterface.V7StoreInMapper;
import com.carrey.v7mc.mapperInterface.V7StoreQuantityMapper;
import com.carrey.v7mc.po.V7Product;
import com.carrey.v7mc.po.V7StoreIn;
import com.carrey.v7mc.po.V7StoreQuantity;
import com.carrey.v7mc.product.service.InProductService;
import com.carrey.v7mc.queryVo.StoreQVo;
import com.carrey.v7mc.util.UUIDUtils;

@Service
public class InProductServiceImpl implements InProductService {
	
	@Autowired
	private V7StoreInMapper storeInMapper;
	@Autowired
	private V7ProductMapper productMapper;
	@Autowired
	private V7StoreQuantityMapper quantityMapper;

	@Override
	public int getTotalAmount(StoreQVo queryVo) {
		return storeInMapper.getTotalAmount(queryVo);
	}

	@Override
	public List<V7StoreIn> getPageData(StoreQVo queryVo) {
		return storeInMapper.getPageData(queryVo);
	}

	@Override
	public void addInProduct(V7StoreIn storeIn) {
		//获取产品表中的数据
		String v7PkProduct = storeIn.getV7PkProduct();
		V7Product v7Product = productMapper.selectByPrimaryKey(v7PkProduct);
		
		//新增或修改库存表
		V7StoreQuantity temp =  quantityMapper.selectExistQuantity(v7Product);
		V7StoreQuantity quantity = new V7StoreQuantity();
		if(null == temp){
			quantity.setId(UUIDUtils.getUUID());
			quantity.setV7SBrand(v7Product.getV7PBrand());
			quantity.setV7SType(v7Product.getV7PType());
			quantity.setV7SName(v7Product.getV7PName());
			quantity.setV7SStandard(v7Product.getV7PStandard());
			quantity.setV7SUnit(v7Product.getV7PUnit());
			quantity.setV7PkProduct(v7Product.getId());
			quantity.setV7SCount(storeIn.getV7SCount());
			quantity.setV7SLatelyTime(new Date());
			
			quantityMapper.insertSelective(quantity);
		}else {
			temp.setV7SBrand(v7Product.getV7PBrand());
			temp.setV7SType(v7Product.getV7PType());
			temp.setV7SName(v7Product.getV7PName());
			temp.setV7SStandard(v7Product.getV7PStandard());
			temp.setV7SUnit(v7Product.getV7PUnit());
			temp.setV7PkProduct(v7Product.getId());
			temp.setV7SCount(storeIn.getV7SCount()+ temp.getV7SCount());
			temp.setV7SLatelyTime(new Date());
			quantityMapper.updateByPrimaryKeySelective(temp);
		}
		
		//新增入库表
		storeIn.setId(UUIDUtils.getUUID());
		storeIn.setV7SBrand(v7Product.getV7PBrand());
		storeIn.setV7SType(v7Product.getV7PType());
		storeIn.setV7SOperTime(new Date());
		storeIn.setV7SUnit(v7Product.getV7PUnit());
		storeIn.setV7SStandard(v7Product.getV7PStandard());
		storeIn.setV7SStatus(Constant.GENERAL_TYPE_ENABLE);
		storeIn.setV7SPriceCount(storeIn.getV7SPrice() * storeIn.getV7SCount());
		storeIn.setV7PkProduct(v7PkProduct);
		storeIn.setV7PkStoreQuantity(temp ==null?quantity.getId():temp.getId());
		storeInMapper.insertSelective(storeIn);
	
		
	}

	@Override
	public void updateInProduct(V7StoreIn storeIn) {
		//获取产品表中的数据
		String v7PkProduct = storeIn.getV7PkProduct();
		V7Product v7Product = productMapper.selectByPrimaryKey(v7PkProduct);
		
		//修改入库表
		V7StoreIn v7StoreIn = storeInMapper.selectByPrimaryKey(storeIn.getId());
		v7StoreIn.setV7SBrand(v7Product.getV7PBrand());
		v7StoreIn.setV7SType(v7Product.getV7PType());
		v7StoreIn.setV7SOperTime(new Date());
		v7StoreIn.setV7SUnit(v7Product.getV7PUnit());
		v7StoreIn.setV7SStandard(v7Product.getV7PStandard());
		v7StoreIn.setV7SStatus(Constant.GENERAL_TYPE_ENABLE);
		v7StoreIn.setV7SRemarks(storeIn.getV7SRemarks());
		v7StoreIn.setV7SPrice(storeIn.getV7SPrice());
		v7StoreIn.setV7SPriceCount(storeIn.getV7SPrice() * storeIn.getV7SCount());
		
		int tempCount = storeIn.getV7SCount() - v7StoreIn.getV7SCount(); 
		v7StoreIn.setV7SCount(v7StoreIn.getV7SCount() + tempCount);
		
		storeInMapper.updateByPrimaryKeySelective(v7StoreIn);
		
		//修改库存表
		V7StoreQuantity quantity = quantityMapper.selectByPrimaryKey(v7StoreIn.getV7PkStoreQuantity());

		quantity.setV7SCount(quantity.getV7SCount() + tempCount);
		quantity.setV7SLatelyTime(new Date());
		
		quantityMapper.updateByPrimaryKeySelective(quantity);
		

	}

	@Override
	public V7StoreIn searchById(String id) {
		return storeInMapper.selectByPrimaryKey(id);
	}

}
