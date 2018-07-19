package com.carrey.v7mc.product.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.carrey.v7mc.common.Constant;
import com.carrey.v7mc.common.base.BaseAction;
import com.carrey.v7mc.common.pageBean.PageUtils;
import com.carrey.v7mc.po.V7Product;
import com.carrey.v7mc.po.V7StoreIn;
import com.carrey.v7mc.po.V7StoreOut;
import com.carrey.v7mc.po.V7StoreQuantity;
import com.carrey.v7mc.product.service.OutProductService;
import com.carrey.v7mc.queryVo.StoreQVo;
import com.carrey.v7mc.system.ehcache.BaseEhcacheManager;

@Controller
@RequestMapping("outProduct")
@SuppressWarnings("all")
public class OutProductController extends BaseAction {
	
	@Autowired
	private OutProductService outProductService;
	
	
	/**
	 * 出库列表页面
	 * @return
	 */
	@RequestMapping("/outProductList")
	public String outProductList(StoreQVo queryVo, Model model){
		
		int recordCount = outProductService.getTotalAmount(queryVo);
		queryVo = (StoreQVo) PageUtils.getPageInfo(recordCount,queryVo);
		List<V7StoreOut> pageData = outProductService.getPageData(queryVo);
		queryVo.setRecoredList(pageData);
		
		model.addAttribute(Constant.CONTROlLER_RETURN_ATTRNAME, queryVo);
		
		return "product/outProduct-list";
	}

	/**
	 * 获取库存表中数据
	 * @param term  模糊商品名称
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping("/selectStoreProduct")
	public  @ResponseBody Map<String, List<V7StoreQuantity>> selectStoreProduct(@RequestBody String term) throws UnsupportedEncodingException{
		term = java.net.URLDecoder.decode(term,"utf-8");
		term = term.substring(term.indexOf("=")+1, term.length());
		Map<String, List<V7StoreQuantity>> map = new HashMap<String, List<V7StoreQuantity>>();
		List<V7StoreQuantity> list = (List<V7StoreQuantity>) outProductService.selectStoreProduct(term);
		
		map.put("source", list);
		return map;
	}

	
	/**
	 * 获取产品剩余库存量和历史入库最高价格
	 * @param term 产品名称
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping("/showStoreInfo")
	public @ResponseBody Map<String, String> showStoreInfo(@RequestBody String term) throws UnsupportedEncodingException{
		term = java.net.URLDecoder.decode(term,"utf-8");
		term = term.substring(term.indexOf("=")+1, term.length());
		Map<String, String> result = new HashMap<String, String>();
		//获取库存数量
		V7StoreQuantity quantity = (V7StoreQuantity)outProductService.selectStoreProductCount(term);
		
		if(null != quantity){
			//获取历史最高入库价格
			double maxInPrice = outProductService.selectMaxInPrice(quantity.getId());
			if(quantity.getV7SCount() != null || !"".equals(quantity.getV7SCount())){
				result.put("count", quantity.getV7SCount().toString());
			}
			if(!"".equals(maxInPrice)){
				result.put("maxPrice", String.valueOf(maxInPrice));
			}
		}else {
			result.put("isNull", "isNull");
		}
		
		return result;
	}
	
	
	/**
	 * 跳转到出库页面
	 * @return
	 */
	@RequestMapping("/gotoOutProduct")
	public String gotoOutProduct(){
		return "product/outProduct-subtract";
	}
	
	/**
	 * 跳转出库修改页面
	 * @param model
	 * @param storeOut
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping("/gotoOutProductEditView")
	public String gotoOutProductEditView(Model model,V7StoreOut storeOut) throws UnsupportedEncodingException{
		
		storeOut = outProductService.selectById(storeOut.getId());
		model.addAttribute("storeOut", storeOut);
		Map<String, String> showStoreInfo = showStoreInfo(storeOut.getV7SName());
		model.addAttribute("count", showStoreInfo.get("count"));
		model.addAttribute("maxPrice", showStoreInfo.get("maxPrice"));
		return "product/outProduct-subtract";
	}
	
	/**
	 * 出库产品
	 * @param model
	 * @param storeOut
	 * @return
	 */
	@RequestMapping("/addOutProduct")
	public String addOutProduct(Model model,V7StoreOut storeOut){
		if(StringUtils.isEmpty(storeOut.getId())){
			storeOut.setV7SOperUser(getLoginUser().getV7EName());
			outProductService.addOutProduct(storeOut);
			model.addAttribute("operMsG","添加成功");
			model.addAttribute("nextOperExplain","请返回列表页面");
		}else {
			storeOut.setV7SUpdateUser(getLoginUser().getV7EName());
			boolean updateOutProduct = outProductService.updateOutProduct(storeOut);
			if(updateOutProduct){
				model.addAttribute("operMsG","修改成功！");
				model.addAttribute("nextOperExplain","请返回列表页面");
			}else{
				model.addAttribute("operResult","操作失败！");
				model.addAttribute("operMsG","库存数量不足！");
				model.addAttribute("nextOperExplain","请查看库存列表也出库列表对比！");
			}
		}
		return "prompt/messages";
		
	}
	
}
