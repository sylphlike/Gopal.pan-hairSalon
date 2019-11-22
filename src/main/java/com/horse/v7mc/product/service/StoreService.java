package com.horse.v7mc.product.service;

import java.util.List;

import com.horse.v7mc.po.V7StoreQuantity;
import com.horse.v7mc.queryVo.StoreQVo;

public interface StoreService {

	int getTotalAmount(StoreQVo queryVo);

	List<V7StoreQuantity> getPageData(StoreQVo queryVo);

}
