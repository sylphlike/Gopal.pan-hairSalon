package com.carrey.v7mc.member.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carrey.v7mc.common.Constant;
import com.carrey.v7mc.mapperInterface.V7CardMapper;
import com.carrey.v7mc.mapperInterface.V7CrecardMapper;
import com.carrey.v7mc.mapperInterface.V7HandleCardMapper;
import com.carrey.v7mc.member.service.V7CardService;
import com.carrey.v7mc.po.V7Card;
import com.carrey.v7mc.po.V7Crecard;
import com.carrey.v7mc.po.V7Employee;
import com.carrey.v7mc.po.V7HandleCard;
import com.carrey.v7mc.queryVo.MemberQVo;
import com.carrey.v7mc.system.ehcache.BaseEhcacheManager;
import com.carrey.v7mc.util.UUIDUtils;

@Service
public class V7CardServiceImpl implements V7CardService {
	
	@Autowired
	private V7CardMapper cardMapper;
	@Autowired
	private V7CrecardMapper crecardMapper;
	@Autowired
	private V7HandleCardMapper handleMapper;
	

	@Override
	public void addCardRecharge(V7Card card, String operUser,String handleEmployee) {
		
		//更新会员卡表
		V7Card v7Card = cardMapper.selectByPrimaryKey(card.getId());
		v7Card.setV7CRechargeAmount(v7Card.getV7CRechargeAmount()+card.getV7CRechargeAmount());
		v7Card.setV7CSurplusAmount(v7Card.getV7CSurplusAmount() + card.getV7CRechargeAmount());
		v7Card.setV7CRemarks(card.getV7CRemarks());
		cardMapper.updateByPrimaryKeySelective(v7Card);
		
		//会员卡操作记录表添加数据
		
		/*id	varchar (32)	主键ID
		v7_r_otype	varchar(2)	操作类型(充值/消费)
		v7_r_omoney	double (8,2)	操作金额
		v7_r_oper_user	varchar(32)	操作人
		v7_r_oper_time	datetime	操作时间
		v7_r_remarks	varchar(100)	备注*/
		
		
		V7Crecard v7Crecard = new V7Crecard();
		v7Crecard.setId(UUIDUtils.getUUID());
		v7Crecard.setV7ROtype(Constant.GENERAL_OPER_TYPE_STRING_ONE);
		v7Crecard.setV7RCardtype(v7Card.getV7CType());
		v7Crecard.setV7ROmoney(card.getV7CRechargeAmount());
		v7Crecard.setV7ROperUser(operUser);
		v7Crecard.setV7ROperTime(new Date());
		v7Crecard.setV7RRemarks(card.getV7CRemarks());
		v7Crecard.setV7PkCard(v7Card.getId());
		
		crecardMapper.insertSelective(v7Crecard);
		
		
		//处理 办卡，充值记录表
		List<V7Employee> employee = (List<V7Employee>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CASHIER_EMPLOYEE, Constant.EHC_EMPLOYEE_ALL);
		for (V7Employee v7Employee : employee) {
			if(handleEmployee.equals(v7Employee.getV7EName())){
				handleEmployee = v7Employee.getId();
			}
		}
		V7HandleCard handle = new V7HandleCard();
		handle.setId(UUIDUtils.getUUID());
		handle.setV7HHandleType(Constant.GENERAL_OPER_TYPE_INTEGER_TWO);
		handle.setV7HCardNum(v7Card.getId());
		handle.setV7HCardType(card.getV7CType());
		handle.setV7HMoney(card.getV7CRechargeAmount());
		handle.setV7HHandleUser(handleEmployee);
		handle.setV7HOperUser(operUser);
		handle.setV7HOperTime(new Date());
		
		handleMapper.insertSelective(handle);

		
	}


	@Override
	public int getTotalAmount(MemberQVo queryVo) {
		return crecardMapper.getTotalAmount(queryVo);
	}


	@Override
	public List<V7Crecard> getPageData(MemberQVo queryVo) {
		return crecardMapper.getPageData(queryVo);
	}

}
