package com.horse.v7mc.product.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.horse.v7mc.queryVo.StoreQVo;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.horse.v7mc.common.Constant;
import com.horse.v7mc.common.base.BaseAction;
import com.horse.v7mc.common.exception.SysException;
import com.horse.v7mc.common.pageBean.PageUtils;
import com.horse.v7mc.po.V7Product;
import com.horse.v7mc.po.V7StoreIn;
import com.horse.v7mc.product.service.InProductService;
import com.horse.v7mc.system.ehcache.BaseEhcacheManager;

@Controller
@RequestMapping("/inProduct")
@SuppressWarnings("all")
public class InProductController extends BaseAction{
	
	@Autowired
	private InProductService inProductService;
	
	/**
	 * 入库列表页面
	 * @return
	 */
	@RequestMapping("/inPriductList")
	public String inProductList(Model model, StoreQVo queryVo){
		int recordCount = inProductService.getTotalAmount(queryVo);
		queryVo = (StoreQVo) PageUtils.getPageInfo(recordCount,queryVo);
		List<V7StoreIn> pageData = inProductService.getPageData(queryVo);
		queryVo.setRecoredList(pageData);
		
		model.addAttribute(Constant.CONTROlLER_RETURN_ATTRNAME, queryVo);
		
		return "product/inProduct-list";
	}

	/**
	 * 跳转到入库产品页面
	 * @return
	 */
	@RequestMapping("/gotoInProduct")
	public String gotoInProduct(){
		return "product/inProduct-add";
	}
	
	/**
	 * 仿百度搜索框 获取产品信息
	 * @param term
	 * @return
	 * @throws SysException 
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping("/selectCacheProduct")
	public  @ResponseBody Map<String, List<V7Product>> selectCacheProduct(@RequestBody String term) throws UnsupportedEncodingException{
		term = java.net.URLDecoder.decode(term,"utf-8");
		term = term.substring(term.indexOf("=")+1, term.length());
		Map<String, List<V7Product>> map = new HashMap<String, List<V7Product>>();
		//从缓存中获取
		List<V7Product> list = (List<V7Product>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_PRODUCT, Constant.EHC_PRODUCT);
		List<V7Product> result = new ArrayList<V7Product>();
		for (V7Product product : list) {
			String brandName = product.getV7PName();
			if(brandName.contains(term)){
				result.add(product);
			}
		}
		map.put("source", result);
		return map;
	}
	
	/**
	 * 获取产品ID
	 * @param term
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping("/selectCacheProductId")
	public @ResponseBody List<String> selectCacheProductId(@RequestBody String term) throws UnsupportedEncodingException{
		term = java.net.URLDecoder.decode(term,"utf-8");
		term = term.substring(term.indexOf("=")+1, term.length());
		List<String> result = new ArrayList<String>();
		
		//从缓存中获取
		List<V7Product> list = (List<V7Product>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_PRODUCT, Constant.EHC_PRODUCT);
		for (V7Product v7Product : list) {
			if(v7Product.getV7PName().equals(term)){
				result.add(v7Product.getId());
			}
		}
		return result;
	}
	
	/**
	 * 产品入库
	 * @param model
	 * @param storeIn
	 * @return
	 */
	@RequestMapping("/addInProduct")
	public String addInProduct(Model model, V7StoreIn storeIn){
		if(StringUtils.isEmpty(storeIn.getId())){
			storeIn.setV7SOperUser(getLoginUser().getV7EName());
			inProductService.addInProduct(storeIn);
			model.addAttribute("operMsG","添加成功");
		}else {
			storeIn.setV7SUpdateUser(getLoginUser().getV7EName());
			inProductService.updateInProduct(storeIn);
			model.addAttribute("operMsG","修改成功");
		}
		model.addAttribute("nextOperExplain","请返回列表页面");
		return "prompt/messages";
	}
	
	/**
	 * 跳转编辑页面
	 * @param model
	 * @param storeIn
	 * @return
	 */
	@RequestMapping("/gotoInProductEditView")
	public String gotoInProductEditView(Model model,V7StoreIn storeIn){
		storeIn = inProductService.searchById(storeIn.getId());
		model.addAttribute("storeIn", storeIn);
		return "product/inProduct-add";
	}
}
