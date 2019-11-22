package com.horse.v7mc.product.service.impl;

import java.util.Date;
import java.util.List;

import com.horse.v7mc.mapperInterface.V7StoreInMapper;
import com.horse.v7mc.mapperInterface.V7StoreOutMapper;
import com.horse.v7mc.mapperInterface.V7StoreQuantityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.horse.v7mc.common.Constant;
import com.horse.v7mc.po.V7StoreOut;
import com.horse.v7mc.po.V7StoreQuantity;
import com.horse.v7mc.product.service.OutProductService;
import com.horse.v7mc.queryVo.StoreQVo;
import com.horse.v7mc.util.UUIDUtils;

@Service
public class OutProductServiceImpl implements OutProductService {
	
	@Autowired
	private V7StoreOutMapper outMapper;
	@Autowired
	private V7StoreInMapper inMapper;
	@Autowired
	private V7StoreQuantityMapper quantityMapper;

	@Override
	public int getTotalAmount(StoreQVo queryVo) {
		return outMapper.getTotalAmount(queryVo);
	}

	@Override
 	public List<V7StoreOut> getPageData(StoreQVo queryVo) {
		return outMapper.getPageData(queryVo);
	}

	@Override
	public List<V7StoreQuantity> selectStoreProduct(String term) {
		return quantityMapper.selectStoreProduct(term);
	}

	@Override
	public V7StoreQuantity selectStoreProductCount(String term) {
		return quantityMapper.selectStoreProductCount(term);
	}

	@Override
	public void addOutProduct(V7StoreOut storeOut) {
		// 1获取库存表数据
		V7StoreQuantity storeQuantity = quantityMapper.selectEqualsStoreProduct(storeOut.getV7SName());
		// 2修改库存表
		storeQuantity.setV7SCount(storeQuantity.getV7SCount() - storeOut.getV7SCount());
		quantityMapper.updateByPrimaryKeySelective(storeQuantity);
		
		// 3新增出库表
		storeOut.setId(UUIDUtils.getUUID());
		storeOut.setV7PkProduct(storeQuantity.getV7PkProduct());
		storeOut.setV7PkStoreQuantity(storeQuantity.getId());
		storeOut.setV7SOutType(Constant.GENERAL_OPER_TYPE_INTEGER_TWO);
		storeOut.setV7SBrand(storeQuantity.getV7SBrand());
		storeOut.setV7SType(storeQuantity.getV7SType());
		storeOut.setV7SUnit(storeQuantity.getV7SUnit());
		storeOut.setV7SStandard(storeQuantity.getV7SStandard());
		storeOut.setV7SPriceCount(storeOut.getV7SPrice() * storeOut.getV7SCount());
		storeOut.setV7SOperTime(new Date());
		
		outMapper.insertSelective(storeOut);
	}

	@Override
	public boolean updateOutProduct(V7StoreOut storeOut) {
		// 1在内存中回滚到未进行此条出库前的数据
		V7StoreOut v7StoreOut = outMapper.selectByPrimaryKey(storeOut.getId());
		V7StoreQuantity quantity =  quantityMapper.selectByPrimaryKey(v7StoreOut.getV7PkStoreQuantity());
		// 2校验库存是否够
		Integer temp = (quantity.getV7SCount()+ v7StoreOut.getV7SCount()) - storeOut.getV7SCount();
		if(temp >= 0 ){
			// 3修改库存表
			quantity.setV7SCount(temp);
			quantityMapper.updateByPrimaryKeySelective(quantity);
			/**
				v7_s_price	double(8,2)	出库价格	
				v7_s_count	int	出库数量	否
				v7_s_price_count	double (8,2)	合计价格	否
				v7_s_update_user	varchar(32)	修改人	是
				v7_s_update_time	datetime	修改时间	是
				v7_s_remarks	varchar(100)	备注	否

			 */
			// 4 修改出库表
			v7StoreOut.setV7SPrice(storeOut.getV7SPrice());
			v7StoreOut.setV7SCount(storeOut.getV7SCount());
			v7StoreOut.setV7SPriceCount(storeOut.getV7SPrice() * storeOut.getV7SCount());
			v7StoreOut.setV7SUpdateUser(storeOut.getV7SUpdateUser());
			v7StoreOut.setV7SUpdateTime(new Date());
			v7StoreOut.setV7SRemarks(storeOut.getV7SRemarks());
			outMapper.updateByPrimaryKeySelective(v7StoreOut);
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public double selectMaxInPrice(String id) {
		return inMapper.selectMaxInPrice(id);
	}

	@Override
	public V7StoreOut selectById(String id) {
		return outMapper.selectByPrimaryKey(id);
	}

}
