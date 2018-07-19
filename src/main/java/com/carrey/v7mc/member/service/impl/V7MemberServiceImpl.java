package com.carrey.v7mc.member.service.impl;


import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carrey.v7mc.common.Constant;
import com.carrey.v7mc.common.base.BaseService;
import com.carrey.v7mc.common.exception.SysException;
import com.carrey.v7mc.mapperInterface.V7CardMapper;
import com.carrey.v7mc.mapperInterface.V7CrecardMapper;
import com.carrey.v7mc.mapperInterface.V7HandleCardMapper;
import com.carrey.v7mc.mapperInterface.V7MemberMapper;
import com.carrey.v7mc.member.service.V7MemberService;
import com.carrey.v7mc.po.V7Card;
import com.carrey.v7mc.po.V7Crecard;
import com.carrey.v7mc.po.V7Employee;
import com.carrey.v7mc.po.V7HandleCard;
import com.carrey.v7mc.po.V7Member;
import com.carrey.v7mc.queryVo.MemberQVo;
import com.carrey.v7mc.system.ehcache.BaseEhcacheManager;
import com.carrey.v7mc.util.DateUtil;
import com.carrey.v7mc.util.MD5Utils;
import com.carrey.v7mc.util.UUIDUtils;
import com.carrey.v7mc.util.XMLUtil;

@Service
public class V7MemberServiceImpl extends BaseService implements V7MemberService {
	
	@Autowired
	private V7MemberMapper memberMapper;
	@Autowired
	private V7CardMapper cardMapper;
	@Autowired
	private V7CrecardMapper crecardMapper;
	@Autowired
	private V7HandleCardMapper handleMapper;

	@Override
	public void insert(V7Member member, V7Card card,String handleEmployee) throws SysException{
		String sequence = XMLUtil.getSequence("memberSequence");
		member.setId(UUIDUtils.getUUID());
		member.setV7MNum(Integer.valueOf(sequence));
		member.setV7ReCType(String.valueOf(card.getV7CType()));
		member.setV7MPassowrd(MD5Utils.md5("123456"));
		member.setV7MCrateTime(new Date());
		
		try {
			member.setV7MBirthday(DateUtil.sdf.parse(member.getBirthday()));
			member.setV7MStatus(Constant.GENERAL_TYPE_ENABLE);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		memberMapper.insertSelective(member);
		
		card.setId(UUIDUtils.getUUID());
		card.setV7CStatus(Constant.GENERAL_TYPE_ENABLE);
		card.setV7PkMember(member.getId());
		
		
		Integer v7CType = card.getV7CType();
		if(5 == v7CType){ //处理是否是洗吹卡
			Double amount = card.getV7CRechargeAmount();
			String amountStr = String.valueOf(amount);
			Map<String, List<String>> readRecordCard = XMLUtil.readRecordCard();
			Set<String> keySet = readRecordCard.keySet();
			boolean flag = false;
			for (String key : keySet) {
				if("blowWashs".equals(key)){
					List<String> list = readRecordCard.get(key);
					for (String string : list) {
						if(string.startsWith(amountStr.substring(0, amountStr.lastIndexOf(".")))){
							card.setV7CSurplusAmount(Double.valueOf(string.substring(string.lastIndexOf("-")+1, string.length())));
							flag = true;
							break;
						}
					}
				}
			}
			if(!flag){
				//TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
				throw new SysException("data_洗吹卡的充值金额没在系统定义枚举值内！");
			}
		}else if(6 == v7CType){ //处理是否是洗剪吹卡
			Double amount = card.getV7CRechargeAmount();
			String amountStr = String.valueOf(amount);
			Map<String, List<String>> readRecordCard = XMLUtil.readRecordCard();
			Set<String> keySet = readRecordCard.keySet();
			boolean flag = false;
			for (String key : keySet) {
				if("blowCutWashs".equals(key)){
					List<String> list = readRecordCard.get(key);
					for (String string : list) {
						if(string.startsWith(amountStr.substring(0, amountStr.lastIndexOf(".")))){
							card.setV7CSurplusAmount(Double.valueOf(string.substring(string.lastIndexOf("-")+1, string.length())));
							flag = true;
							break;
						}
					}
				}
			}
			if(!flag){
				//TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
				throw new SysException("data_洗剪吹卡的充值金额没在系统定义枚举值内！");
			}
		}else {
			card.setV7CSurplusAmount(card.getV7CRechargeAmount());
		}
		card.setV7CTintegral(0);
		cardMapper.insertSelective(card);
		
		//处理操作记录表
		V7Crecard crecard = new V7Crecard();
		crecard.setId(UUIDUtils.getUUID());
		crecard.setV7ROtype(Constant.GENERAL_OPER_TYPE_STRING_ONE);
		crecard.setV7RCardtype(card.getV7CType());
		crecard.setV7ROmoney(card.getV7CRechargeAmount());
		crecard.setV7PkCard(card.getId());
		crecard.setV7ROperUser(member.getV7MCreateUser());
		crecard.setV7ROperTime(new Date());
		crecardMapper.insertSelective(crecard);

		//处理 办卡，充值记录表
		List<V7Employee> employee = (List<V7Employee>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CASHIER_EMPLOYEE, Constant.EHC_EMPLOYEE_ALL);
		for (V7Employee v7Employee : employee) {
			if(handleEmployee.equals(v7Employee.getV7EName())){
				handleEmployee = v7Employee.getId();
			}
		}
		V7HandleCard handle = new V7HandleCard();
		handle.setId(UUIDUtils.getUUID());
		handle.setV7HHandleType(Constant.GENERAL_OPER_TYPE_INTEGER_ONE);
		handle.setV7HCardNum(card.getId());
		handle.setV7HCardType(card.getV7CType());
		handle.setV7HMoney(card.getV7CRechargeAmount());
		handle.setV7HHandleUser(handleEmployee);
		handle.setV7HOperUser(member.getV7MCreateUser());
		handle.setV7HOperTime(new Date());
		
		handleMapper.insertSelective(handle);
		XMLUtil.updateconfig(Long.valueOf(sequence) + 1,"memberSequence");
	}
	@Override
	public int getTotalAmount(MemberQVo queryVo) {
		return memberMapper.getTotalAmount(queryVo);
	}

	@Override
	public List<V7Member> getPageData(MemberQVo queryVo) {
		return memberMapper.getPageData(queryVo);
	}
	@Override
	public V7Member selectMemberBackDisplay(String id) {
		return memberMapper.selectByPrimaryKey(id);
	}
	
	
	/**
	 * 修改会员信息
	 */
	@Override
	public void updateMember(V7Member member) throws SysException{
		try {
			member.setV7MBirthday(DateUtil.sdf.parse(member.getBirthday()));
			memberMapper.updateByPrimaryKeySelective(member);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
	}
	@Override
	public void updatePwd(V7Member member) {
		memberMapper.updateByPrimaryKeySelective(member);
		
	}
	
	
	/**
	 * 会员添加会员卡
	 */
	@Override
	public void insertCard(V7Card card,String memberId,String operUser,String handleEmployee) throws SysException {
		card.setId(UUIDUtils.getUUID());
		card.setV7CStatus(Constant.GENERAL_TYPE_ENABLE);
		card.setV7CRechargeAmount(card.getV7CRechargeAmount());
		
		
		
		Integer v7CType = card.getV7CType();
		if(5 == v7CType){ //处理是否是洗吹卡
			Double amount = card.getV7CRechargeAmount();
			String amountStr = String.valueOf(amount);
			Map<String, List<String>> readRecordCard = XMLUtil.readRecordCard();
			Set<String> keySet = readRecordCard.keySet();
			boolean flag = false;
			for (String key : keySet) {
				if("blowWashs".equals(key)){
					List<String> list = readRecordCard.get(key);
					for (String string : list) {
						if(string.startsWith(amountStr.substring(0, amountStr.lastIndexOf(".")))){
							card.setV7CSurplusAmount(Double.valueOf(string.substring(string.lastIndexOf("-")+1, string.length())));
							flag = true;
							break;
						}
					}
				}
			}
			if(!flag){
				//TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
				throw new SysException("data_洗吹卡的充值金额没在系统定义枚举值内！");
			}
		}else if(6 == v7CType){ //处理是否是洗剪吹卡
			Double amount = card.getV7CRechargeAmount();
			String amountStr = String.valueOf(amount);
			Map<String, List<String>> readRecordCard = XMLUtil.readRecordCard();
			Set<String> keySet = readRecordCard.keySet();
			boolean flag = false;
			for (String key : keySet) {
				if("blowCutWashs".equals(key)){
					List<String> list = readRecordCard.get(key);
					for (String string : list) {
						if(string.startsWith(amountStr.substring(0, amountStr.lastIndexOf(".")))){
							card.setV7CSurplusAmount(Double.valueOf(string.substring(string.lastIndexOf("-")+1, string.length())));
							flag = true;
							break;
						}
					}
				}
			}
			if(!flag){
				//TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
				throw new SysException("data_洗剪吹卡的充值金额没在系统定义枚举值内！");
			}
		}else {
			card.setV7CSurplusAmount(card.getV7CRechargeAmount());
		}
		
		card.setV7CTintegral(0);
		card.setV7PkMember(memberId);
		cardMapper.insertSelective(card);
		
		//修改会员表中的冗余字段值
		V7Member member= memberMapper.selectByPrimaryKey(memberId);
		member.setV7ReCType(member.getV7ReCType()+","+ card.getV7CType());
		member.setV7MUpdateUser(operUser);
		member.setV7MUpdateTime(new Date());
		memberMapper.updateByPrimaryKeySelective(member);
		
		//处理操作记录表
		V7Crecard crecard = new V7Crecard();
		crecard.setId(UUIDUtils.getUUID());
		crecard.setV7ROtype(Constant.GENERAL_OPER_TYPE_STRING_ONE);
		crecard.setV7RCardtype(card.getV7CType());
		crecard.setV7ROmoney(card.getV7CRechargeAmount());
		crecard.setV7PkCard(card.getId());
		crecard.setV7ROperUser(operUser);
		crecard.setV7ROperTime(new Date());
		crecardMapper.insertSelective(crecard);
		
		
		//处理 办卡，充值记录表
		List<V7Employee> employee = (List<V7Employee>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CASHIER_EMPLOYEE, Constant.EHC_EMPLOYEE_ALL);
		for (V7Employee v7Employee : employee) {
			if(handleEmployee.equals(v7Employee.getV7EName())){
				handleEmployee = v7Employee.getId();
			}
		}
		V7HandleCard handle = new V7HandleCard();
		handle.setId(UUIDUtils.getUUID());
		handle.setV7HHandleType(Constant.GENERAL_OPER_TYPE_INTEGER_ONE);
		handle.setV7HCardNum(card.getId());
		handle.setV7HCardType(card.getV7CType());
		handle.setV7HMoney(card.getV7CRechargeAmount());
		handle.setV7HHandleUser(handleEmployee);
		handle.setV7HOperUser(member.getV7MCreateUser());
		handle.setV7HOperTime(new Date());
		
		handleMapper.insertSelective(handle);
		
		
	}
	
	@Override
	public List<V7Member> selectByKeyMemberCard(String id) throws SysException {
	 
		return memberMapper.selectByKeyMemberCard(id);
	}
	
	@Override
	public V7Member selectByKey(String id) {
		return memberMapper.selectByPrimaryKey(id);
		 
	}
	@Override
	public void updateMemberStatus(V7Member member) {
		memberMapper.updateMemberStatus(member);
	}
	
	@Override
	public List<V7Member> searchByCondition(MemberQVo queryVo) {
		return memberMapper.searchByCondition(queryVo);
		
	}
	@Override
	public V7Member checkUniqueness(String inName) {
		return memberMapper.checkUniqueness(inName);
	}
	@Override
	public V7Member checkUniquenessPhone(String inName) {
		return memberMapper.checkUniquenessPhone(inName);
	}
 

}
