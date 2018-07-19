package com.carrey.v7mc.member.service;

import java.util.List;

import com.carrey.v7mc.common.exception.SysException;
import com.carrey.v7mc.po.V7Card;
import com.carrey.v7mc.po.V7Member;
import com.carrey.v7mc.queryVo.MemberQVo;

/**
 * 会员信息
 * @author wangfucheng
 */
public interface V7MemberService {

	/**
	 * 添加会员信息
	 * @param member
	 * @param card
	 * @param handleEmployee 
	 */
	public void insert(V7Member member, V7Card card, String handleEmployee) throws SysException;
	
	public int getTotalAmount(MemberQVo queryVo);
	
	/**
	 * 分页
	 * @param queryVo
	 * @return
	 */
	public List<V7Member> getPageData(MemberQVo queryVo);
	
	
	/**
	 *  会员回显
	 * @param id
	 * @return
	 */
	public V7Member selectMemberBackDisplay(String id);
	
	/**
	 * 修改会员信息
	 * @param member
	 * @throws SysException 
	 */
	public void updateMember(V7Member member) throws SysException;

	public void updatePwd(V7Member member);
	
	
	/***
	 * 添加会员卡信息
	 * @param card 
	 * @param memberId 
	 * @param operUser 
	 * @param handleEmployee 
	 * @throws SysException
	 */
	void insertCard( V7Card card, String memberId, String operUser, String handleEmployee) throws SysException;

	
	/**
	 * 根据会员id查询当前会员的所有信息（包括会员卡）
	 * @param id
	 * @return
	 * @throws SysException
	 */
	public List<V7Member>selectByKeyMemberCard(String id)throws SysException;
	
	

	public V7Member selectByKey(String id);

	public void updateMemberStatus(V7Member member);

	/**
	 *  根据会员电话号码，会员编号，会员名  获取该会员下的所有卡信息和会员信息
	 * @param queryVo
	 * @return
	 */
	public List<V7Member> searchByCondition(MemberQVo queryVo);

	/**
	 * 校验会员名是否重复
	 * @param inName
	 * @return
	 */
	public V7Member checkUniqueness(String inName);

	public V7Member checkUniquenessPhone(String inName);

	
}
