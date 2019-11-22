package com.horse.v7mc.product.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.horse.v7mc.queryVo.ProductQVo;
import net.sf.ehcache.Cache;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
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
import com.horse.v7mc.po.V7Brand;
import com.horse.v7mc.po.V7Product;
import com.horse.v7mc.product.service.ProductService;
import com.horse.v7mc.system.ehcache.BaseEhcacheManager;

@Controller
@RequestMapping("/product")
@SuppressWarnings("all")
public class ProductController extends BaseAction {
	private Logger log = Logger.getLogger(ProductController.class);

	@Autowired
	private ProductService productService;
	
    /**
     * 产品列表页面	
     * @param model
     * @return
     */
	@RequestMapping("/productList")
	public String productList(Model model, ProductQVo queryVo){
		
		int recordCount = productService.getTotalAmount(queryVo);
		queryVo = (ProductQVo) PageUtils.getPageInfo(recordCount,queryVo);
		List<V7Product> pageData = productService.getPageData(queryVo);
		queryVo.setRecoredList(pageData);
		
		model.addAttribute(Constant.CONTROlLER_RETURN_ATTRNAME, queryVo);
		return "product/product-list";
	}
	
	
	
	/**
	 * 仿百度搜索框 获取品牌名称
	 * @param term
	 * @return
	 * @throws SysException 
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping("/getCacheBrand")
	public @ResponseBody Map<String, List<V7Brand>> getCacheBrand(@RequestBody String term) throws SysException, UnsupportedEncodingException{
		term = java.net.URLDecoder.decode(term,"utf-8");
		term = term.substring(term.indexOf("=")+1, term.length());
		Map<String, List<V7Brand>> map = new HashMap<String, List<V7Brand>>();
		//从缓存中获取
		List<V7Brand> list = (List<V7Brand>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_BRAND, Constant.EHC_BRAND);
		List<V7Brand> result = new ArrayList<V7Brand>();
		for (V7Brand v7Brand : list) {
			String brandName = v7Brand.getV7BName();
			if(brandName.contains(term)){
				result.add(v7Brand);
			}
		}
		map.put("source", result);
		return map;
	}
	
	/**
	 * 根据品牌名称获取品牌ID
	 * @param term
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping("/getCacheBrandId")
	public @ResponseBody List<String> getCacheBrandId(@RequestBody String term) throws UnsupportedEncodingException{
		term = java.net.URLDecoder.decode(term,"utf-8");
		term = term.substring(term.indexOf("=")+1, term.length());
		//从缓存中获取
		String brandId = "";
		List<V7Brand> list = (List<V7Brand>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_BRAND, Constant.EHC_BRAND);
		for (V7Brand v7Brand : list) {
			String brandName = v7Brand.getV7BName();
			if(brandName.equals(term)){
				brandId = v7Brand.getId();
			}
		}
		List<String> result = new ArrayList<String>();
		result.add(brandId);
		return result;
	}
	
	/**
	 * 根据品牌ID获取该品牌下的所有可有品牌类型
	 * @param term
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping("/getCacheBrandType")
	public @ResponseBody List<String> getCacheBrandType(@RequestBody String term) throws UnsupportedEncodingException{
		term = java.net.URLDecoder.decode(term,"utf-8");
		term = term.substring(term.indexOf("=")+1, term.length());
		List<String> result = new ArrayList<String>();
		List<V7Brand> list = (List<V7Brand>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_BRAND, Constant.EHC_BRAND);
		for (V7Brand v7Brand : list) {
			if(v7Brand.getId().equals(term)){
				String[] typeStrings = v7Brand.getV7BType().split(",");
				for (int i = 0; i < typeStrings.length; i++) {
					result.add(typeStrings[i]);
				}
			}
		}
		return result;
	}

	/**
	 * 跳转到新增产品页面
	 * @return
	 */
	@RequestMapping("/gotoNewProduct")
	public String gotoNewProduct(){
		return "product/product-add";
	}
	
	/**
	 * 新增产品
	 * @param model
	 * @param product
	 * @return
	 */
	@RequestMapping("addProduct")
	public String addProduct(Model model,V7Product product){
		if(StringUtils.isEmpty(product.getId())){
			product.setV7PCreateUser(getLoginUser().getV7EName());
			productService.addProduct(product);
			model.addAttribute("operMsG","添加成功");
		}else {
			product.setV7PUpdateUser(getLoginUser().getV7EName());
			productService.updateProduct(product);
			model.addAttribute("operMsG","修改成功");
		}
		model.addAttribute("nextOperExplain","请返回列表页面");
		//刷新缓存
		refresEhcache4Product();
		
		return "prompt/messages";
		
	} 
	

	/**
	 * 跳转修改产品页面
	 * @param model
	 * @param product
	 * @return
	 */
	@RequestMapping("gotoProductEditView")
	public String gotoProductEditView(Model model, V7Product product){
		
		V7Product v7Product = productService.selectByKey(product.getId());
		model.addAttribute("product", v7Product);
		return "product/product-add";
		
	}
	/**
	 * 修改产品状态
	 * @param id
	 * @param oper
	 */
	@RequestMapping("/updateProductStatus")
	public  void updateProductStatus(String id,String oper){
		if((!"".equals(id)|| null != id) && (!"".equals(oper) || null != oper)){
			 V7Product product = productService.selectByKey(id);
			switch (oper){
				case "1": product.setV7PStatus(Constant.GENERAL_TYPE_ENABLE);break;
				case "2": product.setV7PStatus(Constant.GENERAL_TYPE_INVALID);break;
				case "3": product.setV7PStatus(Constant.GENERAL_TYPE_DELETE);break;
			}
			productService.updateProductStatus(product);
		}
		refresEhcache4Product();
	}
	
	
	/**
	 * 刷新缓存
	 */
	private void refresEhcache4Product() {
		
		Cache cache = BaseEhcacheManager.getCache(Constant.EHC_GLOBAL_PRODUCT);
		List cacheKey = cache.getKeys();
		// 删除指定缓存名称下的内容
		for (Object key : cacheKey) { cache.remove(key); }
		List<V7Brand> brandList = productService.search4Ehcache();
		BaseEhcacheManager.put(Constant.EHC_GLOBAL_PRODUCT, Constant.EHC_PRODUCT, brandList);
		
	}
	
	
	

	/**
	 * 重复名称校验
	 * @param inName
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping("/checkUniqueness")
	public @ResponseBody String checkUniqueness(@RequestBody String inName) throws UnsupportedEncodingException{
		inName= java.net.URLDecoder.decode(inName,"utf-8");
		inName = inName.substring(inName.indexOf("=")+1, inName.length());
		V7Product product = productService.checkUniqueness(inName);
		if(product != null){
			return product.getV7PName();
		}else{
			return null;
		}
		
	}

}
