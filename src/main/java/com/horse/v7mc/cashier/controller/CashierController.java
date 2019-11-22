package com.horse.v7mc.cashier.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.horse.v7mc.po.V7Employee;
import com.horse.v7mc.po.V7Reception;
import com.horse.v7mc.queryVo.CashierQVo;
import com.horse.v7mc.queryVo.MemberQVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.horse.v7mc.cashier.service.CashierService;
import com.horse.v7mc.common.Constant;
import com.horse.v7mc.common.base.BaseAction;
import com.horse.v7mc.common.exception.SysException;
import com.horse.v7mc.common.pageBean.PageUtils;
import com.horse.v7mc.member.service.V7MemberService;
import com.horse.v7mc.po.V7Member;
import com.horse.v7mc.po.V7Product;
import com.horse.v7mc.product.service.OutProductService;
import com.horse.v7mc.system.ehcache.BaseEhcacheManager;

/**
 * 
 * @author 		carrey(潘冰)
 * @Email  		15923508369@163.com
 * @Date   		2016年5月22日下午8:35:58
 * @description 前台收银管理
 */
@Controller
@RequestMapping("/cashier")
@SuppressWarnings("all")
public class CashierController extends BaseAction {
	
	@Autowired
	private V7MemberService memberService;
	
	@Autowired
	private CashierService cashierService;
	
	@Autowired
	private OutProductService outProductService;
	
	/**
	 * 跳转到前台收银页面
	 * @return
	 */
	@RequestMapping("/gotoNewCashier")
	public String gotoCashier(Model model){
		// 0 获取价格配置
		Map<String, String> haircutter = (Map<String, String>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_HAIRCUTTRT_PRICE, "haircut");
		
		// 1 获取所有员工信息
		List<V7Employee> employee = (List<V7Employee>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CASHIER_EMPLOYEE, Constant.EHC_EMPLOYEE_ALL);
		List<V7Employee> hairstylist = (List<V7Employee>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CASHIER_EMPLOYEE, Constant.EHC_EMPLOYEE_HAIRSTYLIST);
		List<V7Employee> technician = (List<V7Employee>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CASHIER_EMPLOYEE, Constant.EHC_EMPLOYEE_TECHNICIAN);
		List<V7Employee> assistant = (List<V7Employee>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CASHIER_EMPLOYEE, Constant.EHC_EMPLOYEE_ASSISTANT);
		model.addAttribute("employee", employee);
		model.addAttribute("technician", technician);
		model.addAttribute("assistant", assistant);
	
		//处理页面显示发型师名称是同时显示剪发价位
		List<V7Employee> hairstyListTemp = new ArrayList<V7Employee>();
		for (int x = 0; x < hairstylist.size(); x ++) {
			V7Employee temp = new V7Employee();
			temp.setId(hairstylist.get(x).getId());
			temp.setV7EPosition(hairstylist.get(x).getV7EPosition());
			//员工职位(1 经理，2股东，3技术总监，4首席发型师，5高级发型师 6发型师，7技师，8助理，9 前台，10 其它)
			if(temp.getV7EPosition().contains("3")){
				temp.setV7EName(hairstylist.get(x).getV7EName()+"-"+ haircutter.get("technicaldirector"));
			}
			if(temp.getV7EPosition().contains("4")){
				temp.setV7EName(hairstylist.get(x).getV7EName()+"-"+ haircutter.get("chiefHairstyList"));
			}
			if(temp.getV7EPosition().contains("5")){
				temp.setV7EName(hairstylist.get(x).getV7EName()+"-"+ haircutter.get("highHairstyList"));
			}
			if(temp.getV7EPosition().contains("6")){
				temp.setV7EName(hairstylist.get(x).getV7EName()+"-"+ haircutter.get("hairstylist"));
			}
			hairstyListTemp.add(temp);
		}
		
		model.addAttribute("hairstylist", hairstyListTemp);
		// 2获取商品信息
		List<V7Product> product = (List<V7Product>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_PRODUCT, Constant.EHC_PRODUCT);
		model.addAttribute("product", product);
		
		// 3 获取消费配置项
		List<String>  perm = (List<String>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CONSUMPTION_PROJECT, "perm");
		List<String>  dyeHair = (List<String>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CONSUMPTION_PROJECT, "dyeHair");
		List<String>  conditioner = (List<String>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CONSUMPTION_PROJECT, "conditioner");
		
		// 4 会员卡折扣数据
		Map<String, Double>  goldCard = (Map<String, Double>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CARD_DISCOUNT, "goldCard");
		Map<String, Double>  silverCard = (Map<String, Double>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CARD_DISCOUNT, "silverCard");
		Map<String, Double>  classicCard = (Map<String, Double>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CARD_DISCOUNT, "classicCard");
		Map<String, Double>  hedgingCard = (Map<String, Double>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CARD_DISCOUNT, "hedgingCard");
		
		model.addAttribute("perm", perm);
		model.addAttribute("dyeHair", dyeHair);
		model.addAttribute("conditioner", conditioner);
		
		model.addAttribute("goldCard", goldCard);
		model.addAttribute("silverCard", silverCard);
		model.addAttribute("classicCard", classicCard);
		model.addAttribute("hedgingCard", hedgingCard);
		
		//5 加价产品数据
		Map<String, String> map = new LinkedHashMap<String, String>();
		ArrayList<String> raiseAmount = (ArrayList<String>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_RAISE, Constant.EHC_GLOBAL_RAISE_KEY);
		for (String raise : raiseAmount) {
			map.put(raise.substring(raise.lastIndexOf("-")+1, raise.length()), raise);
		}
		model.addAttribute("raiseAmount", map);
		return "memberOrfront/front-bill";
	}
	
	/**
	 *  前台收银搜索
	 * @param model
	 * @param queryVo  员工查询通用VO
	 * @return
	 * @throws SysException
	 */
	@RequestMapping("/searchCashire")
	public String searchCashire(Model model, MemberQVo queryVo) throws SysException{
		// 0 获取价格配置
		Map<String, String> haircutter = (Map<String, String>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_HAIRCUTTRT_PRICE, "haircut");
		
		// 1 获取所有员工信息
		List<V7Employee> employee = (List<V7Employee>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CASHIER_EMPLOYEE, Constant.EHC_EMPLOYEE_ALL);
		List<V7Employee> hairstylist = (List<V7Employee>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CASHIER_EMPLOYEE, Constant.EHC_EMPLOYEE_HAIRSTYLIST);
		List<V7Employee> technician = (List<V7Employee>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CASHIER_EMPLOYEE, Constant.EHC_EMPLOYEE_TECHNICIAN);
		List<V7Employee> assistant = (List<V7Employee>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CASHIER_EMPLOYEE, Constant.EHC_EMPLOYEE_ASSISTANT);
		model.addAttribute("employee", employee);
		model.addAttribute("technician", technician);
		model.addAttribute("assistant", assistant);
	
		//处理页面显示发型师名称是同时显示剪发价位
		List<V7Employee> hairstyListTemp = new ArrayList<V7Employee>();
		for (int x = 0; x < hairstylist.size(); x ++) {
			V7Employee temp = new V7Employee();
			temp.setId(hairstylist.get(x).getId());
			temp.setV7EPosition(hairstylist.get(x).getV7EPosition());
			//员工职位(1 经理，2股东，3技术总监，4首席发型师，5高级发型师 6发型师，7技师，8助理，9 前台，10 其它)
			if(temp.getV7EPosition().contains("3")){
				temp.setV7EName(hairstylist.get(x).getV7EName()+"-"+ haircutter.get("technicaldirector"));
			}
			if(temp.getV7EPosition().contains("4")){
				temp.setV7EName(hairstylist.get(x).getV7EName()+"-"+ haircutter.get("chiefHairstyList"));
			}
			if(temp.getV7EPosition().contains("5")){
				temp.setV7EName(hairstylist.get(x).getV7EName()+"-"+ haircutter.get("highHairstyList"));
			}
			if(temp.getV7EPosition().contains("6")){
				temp.setV7EName(hairstylist.get(x).getV7EName()+"-"+ haircutter.get("hairstylist"));
			}
			hairstyListTemp.add(temp);
		}
		
		model.addAttribute("hairstylist", hairstyListTemp);
		// 2获取商品信息
		List<V7Product> product = (List<V7Product>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_PRODUCT, Constant.EHC_PRODUCT);
		model.addAttribute("product", product);
		
		// 3 获取消费配置项
		List<String>  perm = (List<String>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CONSUMPTION_PROJECT, "perm");
		List<String>  dyeHair = (List<String>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CONSUMPTION_PROJECT, "dyeHair");
		List<String>  conditioner = (List<String>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CONSUMPTION_PROJECT, "conditioner");
		
		// 4 会员卡折扣数据
		Map<String, Double>  goldCard = (Map<String, Double>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CARD_DISCOUNT, "goldCard");
		Map<String, Double>  silverCard = (Map<String, Double>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CARD_DISCOUNT, "silverCard");
		Map<String, Double>  classicCard = (Map<String, Double>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CARD_DISCOUNT, "classicCard");
		Map<String, Double>  hedgingCard = (Map<String, Double>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CARD_DISCOUNT, "hedgingCard");
		
		model.addAttribute("perm", perm);
		model.addAttribute("dyeHair", dyeHair);
		model.addAttribute("conditioner", conditioner);
		
		model.addAttribute("goldCard", goldCard);
		model.addAttribute("silverCard", silverCard);
		model.addAttribute("classicCard", classicCard);
		model.addAttribute("hedgingCard", hedgingCard);

		//5 加价产品数据
		Map<String, String> map = new LinkedHashMap<String, String>();
		ArrayList<String> raiseAmount = (ArrayList<String>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_RAISE, Constant.EHC_GLOBAL_RAISE_KEY);
		for (String raise : raiseAmount) {
			map.put(raise.substring(raise.lastIndexOf("-")+1, raise.length()), raise);
		}
		model.addAttribute("raiseAmount", map);

		//6根据收索条件检索会员关联信息
		List<V7Member> searchByCondition = memberService.searchByCondition(queryVo);
		model.addAttribute("memberInfo", searchByCondition.size()>0?searchByCondition.get(0):null);
		if(searchByCondition.size() <= 0){
			model.addAttribute("nullData", "nullData");
		}
		return "memberOrfront/front-bill";
	}

	/**
	 * 前台买单
	 * @param model
	 * @param queryVo
	 * @return
	 * @throws SysException 
	 */
	@RequestMapping("/addCashier")
	public String addCashier(Model model, V7Reception reception, String v7RRaiseamount) throws SysException{
		String operuser  = getLoginUser().getV7EName();
		cashierService.addCashier(reception,operuser,v7RRaiseamount);
		model.addAttribute("sashierSuccess", "success");
		
		// 0 获取价格配置
		Map<String, String> haircutter = (Map<String, String>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_HAIRCUTTRT_PRICE, "haircut");
		
		// 1 获取所有员工信息
		List<V7Employee> employee = (List<V7Employee>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CASHIER_EMPLOYEE, Constant.EHC_EMPLOYEE_ALL);
		List<V7Employee> hairstylist = (List<V7Employee>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CASHIER_EMPLOYEE, Constant.EHC_EMPLOYEE_HAIRSTYLIST);
		List<V7Employee> technician = (List<V7Employee>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CASHIER_EMPLOYEE, Constant.EHC_EMPLOYEE_TECHNICIAN);
		List<V7Employee> assistant = (List<V7Employee>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CASHIER_EMPLOYEE, Constant.EHC_EMPLOYEE_ASSISTANT);
		model.addAttribute("employee", employee);
		model.addAttribute("technician", technician);
		model.addAttribute("assistant", assistant);
	
		//处理页面显示发型师名称是同时显示剪发价位
		List<V7Employee> hairstyListTemp = new ArrayList<V7Employee>();
		for (int x = 0; x < hairstylist.size(); x ++) {
			V7Employee temp = new V7Employee();
			temp.setId(hairstylist.get(x).getId());
			temp.setV7EPosition(hairstylist.get(x).getV7EPosition());
			//员工职位(1 经理，2股东，3技术总监，4首席发型师，5高级发型师 6发型师，7技师，8助理，9 前台，10 其它)
			if(temp.getV7EPosition().contains("3")){
				temp.setV7EName(hairstylist.get(x).getV7EName()+"-"+ haircutter.get("technicaldirector"));
			}
			if(temp.getV7EPosition().contains("4")){
				temp.setV7EName(hairstylist.get(x).getV7EName()+"-"+ haircutter.get("chiefHairstyList"));
			}
			if(temp.getV7EPosition().contains("5")){
				temp.setV7EName(hairstylist.get(x).getV7EName()+"-"+ haircutter.get("highHairstyList"));
			}
			if(temp.getV7EPosition().contains("6")){
				temp.setV7EName(hairstylist.get(x).getV7EName()+"-"+ haircutter.get("hairstylist"));
			}
			hairstyListTemp.add(temp);
		}
		
		model.addAttribute("hairstylist", hairstyListTemp);
		// 2获取商品信息
		List<V7Product> product = (List<V7Product>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_PRODUCT, Constant.EHC_PRODUCT);
		model.addAttribute("product", product);
		
		// 3 获取消费配置项
		List<String>  perm = (List<String>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CONSUMPTION_PROJECT, "perm");
		List<String>  dyeHair = (List<String>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CONSUMPTION_PROJECT, "dyeHair");
		List<String>  conditioner = (List<String>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CONSUMPTION_PROJECT, "conditioner");
		
		// 4 会员卡折扣数据
		Map<String, String>  goldCard = (Map<String, String>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CARD_DISCOUNT, "goldCard");
		Map<String, String>  silverCard = (Map<String, String>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CARD_DISCOUNT, "silverCard");
		Map<String, String>  classicCard = (Map<String, String>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CARD_DISCOUNT, "classicCard");
		Map<String, String>  hedgingCard = (Map<String, String>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CARD_DISCOUNT, "hedgingCard");
		
		model.addAttribute("perm", perm);
		model.addAttribute("dyeHair", dyeHair);
		model.addAttribute("conditioner", conditioner);
		
		model.addAttribute("goldCard", goldCard);
		model.addAttribute("silverCard", silverCard);
		model.addAttribute("classicCard", classicCard);
		model.addAttribute("hedgingCard", hedgingCard);
		
		//5 加价产品数据
		Map<String, String> map = new LinkedHashMap<String, String>();
		ArrayList<String> raiseAmount = (ArrayList<String>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_RAISE, Constant.EHC_GLOBAL_RAISE_KEY);
		for (String raise : raiseAmount) {
			map.put(raise.substring(raise.lastIndexOf("-")+1, raise.length()), raise);
		}
		model.addAttribute("raiseAmount", map);
		
		return "memberOrfront/front-bill";
	}
	
	/**
	 * 前台收银历史数据列表
	 * @return
	 */
	@RequestMapping("/cashierList")
	public String cashierList(CashierQVo queryVo, Model model){
		
		int recordCount = cashierService.getTotalAmount(queryVo);
		queryVo = (CashierQVo) PageUtils.getPageInfo(recordCount,queryVo);
		List<V7Reception> pageData = cashierService.getPageData(queryVo);
		queryVo.setRecoredList(pageData);
		
		model.addAttribute(Constant.CONTROlLER_RETURN_ATTRNAME, queryVo);
		return "memberOrfront/cashier-list";
	}
	
}
