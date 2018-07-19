package com.carrey.v7mc.financial.controller;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.carrey.v7mc.common.Constant;
import com.carrey.v7mc.common.base.BaseAction;
import com.carrey.v7mc.common.pageBean.PageUtils;
import com.carrey.v7mc.financial.service.ChargeService;
import com.carrey.v7mc.po.V7Charge;
import com.carrey.v7mc.po.V7Employee;
import com.carrey.v7mc.queryVo.ChargeQVo;
import com.carrey.v7mc.system.ehcache.BaseEhcacheManager;

@Controller
@RequestMapping("/charge")
public class ChargeController extends BaseAction {
	
	@Autowired
	private ChargeService chargeService;
	
	/**
	 * 扣款列表
	 * @return
	 */
	@RequestMapping("/chargeList")
	public String chargeList(Model model,ChargeQVo queryVo){
		int recordCount = chargeService.getTotalAmount(queryVo);
		queryVo = (ChargeQVo) PageUtils.getPageInfo(recordCount,queryVo);
		List<V7Charge> pageData = chargeService.getPageData(queryVo);
		queryVo.setRecoredList(pageData);
		
		model.addAttribute(Constant.CONTROlLER_RETURN_ATTRNAME, queryVo);
		
		
		return "/financial/charge-list";
	}
	
	/**
	 * 跳转添加扣款页面
	 * @return
	 */
	@RequestMapping("/gotoNewCharge")
	public String gotoNewCharge(){
		return "/financial/charge-add";
	}
	
	@RequestMapping("addCharge")
	public String addCharge(Model model, V7Charge charge){
		
		if(StringUtils.isEmpty(charge.getId())){
			charge.setV7COperUser(getLoginUser().getV7EName());
			charge.setV7COperTime(new Date());
			
			List<V7Employee> list = (List<V7Employee>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CASHIER_EMPLOYEE, Constant.EHC_EMPLOYEE_ALL);
			V7Employee emp = null;
			for (V7Employee employee : list) {
				String eName = employee.getV7EName();
				if(eName.equals(charge.getV7CName())){
					emp = employee;
					break;
				}
			}
			
			chargeService.addCharge(charge,emp);
			model.addAttribute("operMsG","添加成功");
		}else{
			
			chargeService.updateCharge(charge);
			model.addAttribute("operMsG","修改成功");
		}

		model.addAttribute("nextOperExplain","请返回员工列表页面");
		
		
		return "prompt/messages";
	}

	@RequestMapping("/editCharge")
	public String editCharge(String id,Model model){
		V7Charge charge = chargeService.searchCharge(id);
		model.addAttribute("charge", charge);
		return "/financial/charge-add";
	}
	
	@RequestMapping("/delCharge")
	public String delCharge(String id){
		
		chargeService.delCharge(id);
		return "redirect:chargeList.action";
		
	}
}
