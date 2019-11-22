package com.horse.v7mc.member.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.horse.v7mc.po.V7Card;
import com.horse.v7mc.po.V7Employee;
import com.horse.v7mc.queryVo.MemberQVo;
import com.horse.v7mc.system.ehcache.BaseEhcacheManager;
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
import com.horse.v7mc.member.service.V7MemberService;
import com.horse.v7mc.po.V7Member;
import com.horse.v7mc.util.DateUtil;
import com.horse.v7mc.util.MD5Utils;

@Controller
@RequestMapping("/member")
public class V7MemberController extends BaseAction  {
	
	@Autowired
	private V7MemberService memberService;
	
	

	/**
	 * 跳转新增会员页面
	 * @return
	 */
	@RequestMapping("/gotoNewMember")
	public String gotoNewMember(){
		return "memberOrfront/member-add";
	}
	
	
	/**
	 * 新增会员
	 * @param model
	 * @param card
	 * @param member
	 * @return
	 */
	@RequestMapping("/addMember")
	public  String addMemberInfo(Model model, V7Card card, V7Member member, String handleEmployee) throws SysException{
		
		member.setV7MCreateUser(getLoginUser().getV7EName());
		memberService.insert(member, card,handleEmployee);
		
		model.addAttribute("operMsG","添加成功");
		model.addAttribute("nextOperExplain","请返回会员列表页面");
		
		return "prompt/messages";
	}
	
	/**
	 * 会员列表
	 * @param model
	 * @param queryVo
	 * @return
	 * @throws SysException
	 */
	@RequestMapping("/memberList")
	public String memberList(Model model, MemberQVo queryVo) throws SysException{
		
		int recordCount = memberService.getTotalAmount(queryVo);
		queryVo = (MemberQVo) PageUtils.getPageInfo(recordCount,queryVo);
		List<V7Member> pageData = memberService.getPageData(queryVo);
		queryVo.setRecoredList(pageData);
		
		model.addAttribute(Constant.CONTROlLER_RETURN_ATTRNAME, queryVo);
		return "memberOrfront/member-list";
	}
	
	/**
	 * 修改会员基本信息回显会员修改数据
	 * @param model
	 * @param id
	 * @return
	 */
	@RequestMapping("/memberDetail4Handler")
	public String memberDetail4Handler(Model model,String id){
		V7Member member = memberService.selectMemberBackDisplay(id);
		model.addAttribute("member",member);
		String[] parseStr = DateUtil.dateMemberParseStr(member.getV7MBirthday());
		model.addAttribute("YearData",parseStr[0]);
		model.addAttribute("MonthData",parseStr[1]);
		model.addAttribute("DayData",parseStr[2]);
		
		return "memberOrfront/member-edit";
	}
	
	
	/**
	 * 修改会员密码页面
	 * @param model
	 * @param id
	 * @return
	 */
	@RequestMapping("/memberDetail4PWD")
	public String memberDetail4PWD(Model model,String id){
		V7Member member = memberService.selectMemberBackDisplay(id);
		model.addAttribute("member",member);
		return "memberOrfront/member-changePwd";
	}
	
	
	/**
	 * 更改会员信息,密码和基本信息公用类
	 * @return
	 * @throws SysException 
	 */
	@RequestMapping("/updateMember")
	public String updateMember(Model model,V7Member member,String newMemberPassword) throws SysException{
		if(!"".equals(newMemberPassword) && null != newMemberPassword){
			member = memberService.selectByKey(member.getId());
			member.setV7MPassowrd(MD5Utils.md5(newMemberPassword));
			memberService.updatePwd(member);
		}else{
			memberService.updateMember(member);
		}
		 model.addAttribute("operMsG","修改成功");
		 model.addAttribute("nextOperExplain","请返回会员列表页面");
		 return "prompt/messages";
	}
	
	

	/**
	 * 更改会员状态
	 * @param id
	 * @param oper
	 * @throws SysException
	 */
	@RequestMapping("/updateMemberState")
	public 	void updateMemberState(String id,String oper) throws SysException{
		if((!"".equals(id)|| null != id) && (!"".equals(oper) || null != oper)){
			V7Member member  = memberService.selectByKey(id);
			switch (oper){
				case "1": member.setV7MStatus(Constant.GENERAL_TYPE_ENABLE);break;
				case "2": member.setV7MStatus(Constant.GENERAL_TYPE_INVALID);break;
				case "3": member.setV7MStatus(Constant.GENERAL_TYPE_DELETE);break;
			}
			memberService.updateMemberStatus(member);
			
		}
	}
	
	
	/**
	 * 查询会员和会员下的所有会员卡的详细信息
	 * @return
	 * @throws SysException 
	 */
	@RequestMapping("/memberDetail")
    public String memberDetail(Model model,String id) throws SysException{
		List<V7Member> memberCard = memberService.selectByKeyMemberCard(id);
		model.addAttribute("memberCardList",memberCard);
    	return "memberOrfront/member-detail";
    }
	
	
	/**
	 * 跳转新增会员卡页面
	 * @param model
	 * @param member
	 * @return
	 */
	@RequestMapping("/memberDetail4Card")
	public String memberDetail4Card(Model model, V7Member member){
		V7Member v7Member = memberService.selectByKey(member.getId());
		model.addAttribute("member", v7Member);
		return "memberOrfront/card-add";
		
	}
	
	/**
	 * 添加会员卡
	 * @param model
	 * @param card
	 * @param id
	 * @return
	 * @throws SysException
	 */
	@RequestMapping("/addMemberCard")
	public 	String insertCard(Model model,V7Card card,String memberId,String handleEmployee ) throws SysException{
		String operUser = getLoginUser().getV7EName();
		memberService.insertCard(card, memberId, operUser,handleEmployee);
		model.addAttribute("operMsG","添加成功");
		model.addAttribute("nextOperExplain","请返回会员列表页面");
		 return "prompt/messages";
	}
	
	/**
	 * 模糊匹配员工名
	 * @param term
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping("/getCacheEmployee")
	public @ResponseBody  Map<String, List<String>> getCacheEmployee(@RequestBody String term) throws UnsupportedEncodingException{
		term = java.net.URLDecoder.decode(term,"utf-8");
		term = term.substring(term.indexOf("=")+1, term.length());
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		List<String> employeeName = new ArrayList<String>();
		List<V7Employee> employee = (List<V7Employee>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CASHIER_EMPLOYEE, Constant.EHC_EMPLOYEE_ALL);
		for (V7Employee v7Employee : employee) {
			if(v7Employee.getV7EName().contains(term)){
				employeeName.add(v7Employee.getV7EName());
			}
		}
		map.put("source", employeeName);
		return map;
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
		V7Member member = memberService.checkUniqueness(inName);
		if(member != null){
			return member.getV7MName();
		}else{
			return null;
		}
		
	}
	
	/**
	 * 校验会员电话号码是否重复
	 * @param inName
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping("/checkUniquenessPhone")
	public @ResponseBody String checkUniquenessPhone(@RequestBody String inName) throws UnsupportedEncodingException{
		inName= java.net.URLDecoder.decode(inName,"utf-8");
		inName = inName.substring(inName.indexOf("=")+1, inName.length());
		V7Member member = memberService.checkUniquenessPhone(inName);
		if(member != null){
			return member.getV7MName();
		}else{
			return null;
		}
		
	}
}
