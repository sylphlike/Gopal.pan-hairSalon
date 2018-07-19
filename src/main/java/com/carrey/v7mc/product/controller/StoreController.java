package com.carrey.v7mc.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.carrey.v7mc.common.Constant;
import com.carrey.v7mc.common.pageBean.PageUtils;
import com.carrey.v7mc.po.V7StoreQuantity;
import com.carrey.v7mc.product.service.StoreService;
import com.carrey.v7mc.queryVo.StoreQVo;

@Controller
@RequestMapping("/store")
public class StoreController {
	
	@Autowired
	private StoreService storeService;

	/**
	 * 库存列表
	 * @return
	 */
	@RequestMapping("/storeList")
	public String storeList(Model model,StoreQVo queryVo){
		
		int recordCount = storeService.getTotalAmount(queryVo);
		queryVo = (StoreQVo) PageUtils.getPageInfo(recordCount,queryVo);
		List<V7StoreQuantity> pageData = storeService.getPageData(queryVo);
		queryVo.setRecoredList(pageData);
		
		model.addAttribute(Constant.CONTROlLER_RETURN_ATTRNAME, queryVo);
		return "product/store-list";
	}
}
