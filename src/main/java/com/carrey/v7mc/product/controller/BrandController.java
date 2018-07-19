package com.carrey.v7mc.product.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import net.sf.ehcache.Cache;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.carrey.v7mc.common.Constant;
import com.carrey.v7mc.common.base.BaseAction;
import com.carrey.v7mc.common.exception.SysException;
import com.carrey.v7mc.common.pageBean.PageUtils;
import com.carrey.v7mc.po.V7Brand;
import com.carrey.v7mc.product.service.BrandService;
import com.carrey.v7mc.queryVo.BrandQVo;
import com.carrey.v7mc.system.ehcache.BaseEhcacheManager;

@Controller
@RequestMapping("/brand")
public class BrandController  extends BaseAction{
	
	@Autowired
	private BrandService brandService;
	/**
	 * 添加品牌,修改品牌
	 * @return
	 */
	@RequestMapping("/addBrand")
	public String addBard(Model model,V7Brand brand)throws SysException{
		brand.setV7BCreateUser(getLoginUser().getV7EName());
		
		if(StringUtils.isEmpty(brand.getId())){
			brandService.insert(brand);
			model.addAttribute("operMsG","添加成功");
		}else {
			brandService.updateBrand(brand);
			model.addAttribute("operMsG","修改成功");
		}
		model.addAttribute("nextOperExplain","请返回列表页面");
		//刷新缓存
		refresEhcache4Brand();
		return "prompt/messages";
	}

	/**
	 * 品牌列表
	 * @param model
	 * @param bardVo
	 * @return
	 */
	@RequestMapping("/brandList")
	public String bardList(Model model,BrandQVo brandQVo){
		 int totalAmount = brandService.getTotalAmount(brandQVo);
		 brandQVo= (BrandQVo)PageUtils.getPageInfo(totalAmount, brandQVo);
		 List<V7Brand> pageData = brandService.getPageData(brandQVo);
		 brandQVo.setRecoredList(pageData);
		 model.addAttribute(Constant.CONTROlLER_RETURN_ATTRNAME, brandQVo);
		return "product/brand-list";
	}
	
	/**
	 * 更改品牌状态
	 * @param id
	 * @param oper
	 * @throws SysException
	 */
	@RequestMapping("/updateBrandState")
	public 	void updateStatu(String id,String oper) throws SysException{
		if((!"".equals(id)|| null != id) && (!"".equals(oper) || null != oper)){
			 V7Brand brand = brandService.selectByKey(id);
			switch (oper){
				case "1": brand.setV7BStatus(Constant.GENERAL_TYPE_ENABLE);break;
				case "2": brand.setV7BStatus(Constant.GENERAL_TYPE_INVALID);break;
				case "3": brand.setV7BStatus(Constant.GENERAL_TYPE_DELETE);break;
			}
			brandService.updateBrandStatus(brand);
		}

		//刷新缓存
		refresEhcache4Brand();
		
	}
	
	/**
	 * 跳转到新增品牌页面
	 * @return
	 */
	@RequestMapping("/gotoNewBrand")
	public String gotoNewBrand(){
		return "product/brand-add";
	}
	
	/**
	 * 跳转到编辑页面
	 * @return
	 */
	@RequestMapping("/brandEditPage")
	public String brandEditPage(Model model,String id){
		V7Brand brand = brandService.selectByKey(id);
		model.addAttribute("brand",brand);
		return "product/brand-add";
	}
	
	
	/**
	 * 刷新缓存
	 */
	private void refresEhcache4Brand() {
		
		Cache cache = BaseEhcacheManager.getCache(Constant.EHC_GLOBAL_BRAND);
		List cacheKey = cache.getKeys();
		// 删除指定缓存名称下的内容
		for (Object key : cacheKey) { cache.remove(key); }
		
		List<V7Brand> brandList = brandService.search4Ehcache();
		BaseEhcacheManager.put(Constant.EHC_GLOBAL_BRAND, Constant.EHC_BRAND, brandList);
		
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
		V7Brand barnd = brandService.checkUniqueness(inName);
		if(barnd != null){
			return barnd.getV7BName();
		}else{
			return null;
		}
		
	}

}

