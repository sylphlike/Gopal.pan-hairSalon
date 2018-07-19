package com.carrey.v7mc.product.service;

import java.util.List;

import com.carrey.v7mc.po.V7StoreQuantity;
import com.carrey.v7mc.queryVo.StoreQVo;

public interface StoreService {

	int getTotalAmount(StoreQVo queryVo);

	List<V7StoreQuantity> getPageData(StoreQVo queryVo);

}
