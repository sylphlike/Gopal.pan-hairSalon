package com.carrey.v7mc.member.controller;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.carrey.v7mc.common.Constant;
import com.carrey.v7mc.common.base.BaseAction;
import com.carrey.v7mc.common.exception.SysException;
import com.carrey.v7mc.common.pageBean.PageUtils;
import com.carrey.v7mc.member.service.V7CardService;
import com.carrey.v7mc.member.service.V7MemberService;
import com.carrey.v7mc.po.V7Card;
import com.carrey.v7mc.po.V7Crecard;
import com.carrey.v7mc.po.V7Member;
import com.carrey.v7mc.queryVo.MemberQVo;


@Controller
@RequestMapping("/card")
public class V7CardController extends BaseAction {
	@Autowired
	private V7MemberService memberService;
	
	@Autowired
	private V7CardService cardService;
	
	/**
	 *主菜单跳转到 会员充值页面
	 * @return
	 */
	@RequestMapping("/cardNullList")
	public String cardRecharge(){
		return "memberOrfront/card-nullList";
	}
	
	/**
	 * 根据会员电话号码，会员编号 获取该会员下的所有卡信息
	 * @param model
	 * @param queryVo
	 * @return
	 * @throws SysException
	 */
	@RequestMapping("/searchCardRecharge")
	public String searchCardRecharge(Model model,MemberQVo queryVo) throws SysException{
		if(!StringUtils.isEmpty(queryVo.getSearchType()) && !StringUtils.isEmpty(queryVo.getSearchNum())){
			List<V7Member> memberCard = memberService.searchByCondition(queryVo);
			if(memberCard.size() == 0){
				model.addAttribute("nullData","nullData");
			}
			model.addAttribute("memberCardList",memberCard);
		}
		return "memberOrfront/card-nullList";
	}
	
	/**
	 * 获取会员明细的会员卡操作明细(操作历史)
	 * @param model
	 * @param queryVo
	 * @return
	 * @throws SysException
	 */
	@RequestMapping("/operHistoryList")
	public String operHistoryList(Model model,MemberQVo queryVo) throws SysException{
		if(!StringUtils.isEmpty(queryVo.getSearchType()) && !StringUtils.isEmpty(queryVo.getSearchNum())){
			List<V7Member> memberCard = memberService.searchByCondition(queryVo);
			if(memberCard.size() == 0 ){
				model.addAttribute("nullData","nullData");
				return "memberOrfront/card-history";
			}
			if(StringUtils.isEmpty(queryVo.getCardId()) && StringUtils.isEmpty(queryVo.getCardId())){
				if(memberCard.get(0).getMemberCard()!= null && memberCard.get(0).getMemberCard().size() == 1){
					//该会员名下只有一张会员卡
					String cardId = memberCard.get(0).getMemberCard().get(0).getId();
					queryVo.setCardId(cardId);
					
					int recordCount = cardService.getTotalAmount(queryVo);
					queryVo = (MemberQVo) PageUtils.getPageInfo(recordCount,queryVo);
					List<V7Crecard> pageData = cardService.getPageData(queryVo);
					queryVo.setRecoredList(pageData);
					queryVo.setOneCard(true);
					model.addAttribute(Constant.CONTROlLER_RETURN_ATTRNAME, queryVo);
				}else {
					//该会员名下有多张会员卡
					queryVo.setOneCard(false);
					String cardId = memberCard.get(0).getMemberCard().get(0).getId();
					Integer cardType = memberCard.get(0).getMemberCard().get(0).getV7CType();
					queryVo.setCardId(cardId);
					
					int recordCount = cardService.getTotalAmount(queryVo);
					queryVo = (MemberQVo) PageUtils.getPageInfo(recordCount,queryVo);
					List<V7Crecard> pageData = cardService.getPageData(queryVo);
					queryVo.setRecoredList(pageData);
					queryVo.setOneCard(false);
					queryVo.setCheckCardType(cardType);
					model.addAttribute(Constant.CONTROlLER_RETURN_ATTRNAME, queryVo);
				}
			}else {
				//分页或者是改变了会员卡类型
				if(memberCard.get(0).getMemberCard()!= null && memberCard.get(0).getMemberCard().size() == 1){
					//该会员名下只有一张会员卡
					queryVo.setOneCard(true);
				}else {
					//该会员名下有多张会员卡
					queryVo.setOneCard(false);
				}
				int recordCount = cardService.getTotalAmount(queryVo);
				queryVo = (MemberQVo) PageUtils.getPageInfo(recordCount,queryVo);
				List<V7Crecard> pageData = cardService.getPageData(queryVo);
				queryVo.setRecoredList(pageData);
				model.addAttribute(Constant.CONTROlLER_RETURN_ATTRNAME, queryVo);
			}
			model.addAttribute("memberCardList",memberCard);
			
		}
		return "memberOrfront/card-history";
	}
	
	
	
	
	/**
	 * 跳转到充值页面
	 * @param card
	 * @param model
	 * @return
	 */
	@RequestMapping("/cardRechargeView")
	public String  cardRechargeView(V7Card card,Model model){
		model.addAttribute("card",card);
		return "memberOrfront/card-recharge";
	}

	/**
	 * 会员充值
	 * @param model
	 * @param card
	 * @return
	 */
	@RequestMapping("/addCardRecharge") 
	public String addCardRecharge(Model model, V7Card card,String handleEmployee){
		String operUser = getLoginUser().getV7EName();
		cardService.addCardRecharge(card,operUser,handleEmployee);
		
		model.addAttribute("operMsG","添加成功");
		model.addAttribute("nextOperExplain","请返回会员列表页面");
		
		return "prompt/messages";
	}
}
