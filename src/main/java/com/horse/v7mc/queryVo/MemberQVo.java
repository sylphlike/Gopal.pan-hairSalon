package com.horse.v7mc.queryVo;


import com.horse.v7mc.common.pageBean.PageBean;

/**
 * 
 * @author 		carrey(潘冰)
 * @Email  		15923508369@163.com
 * @Date   		2016年5月2日上午10:50:23
 * @version		v 1.0.1
 * @description 查询条件封装(会员，会员卡操作记录共用)
 */
public class MemberQVo extends PageBean {
	
	//定义查询参数
	private String v7MName;
	private Long v7MNum;
	private String v7MPhone;
	
	private String v7MBeginTime;
	private String v7MEndTime;
	
	/**会员卡充值功能中的收索条件   1 会员编号， 2 会员电话号 ，3会员名 */
	private String searchType;
	
	/**收索编号*/
	private String searchNum;
	
	/**会员卡ID*/
	private String cardId;
	
	/**会员名下是否只有一张会员卡*/
	private boolean oneCard;
	
	/**多张会员卡时选择的会员卡类型*/
	private Integer checkCardType;
	
	
	public String getSearchNum() {
		return searchNum;
	}
	public void setSearchNum(String searchNum) {
		this.searchNum = searchNum;
	}
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public String getV7MName() {
		return v7MName;
	}
	public void setV7MName(String v7mName) {
		v7MName = v7mName;
	}
	public Long getV7MNum() {
		return v7MNum;
	}
	public void setV7MNum(Long v7mNum) {
		v7MNum = v7mNum;
	}
	public String getV7MPhone() {
		return v7MPhone;
	}
	public void setV7MPhone(String v7mPhone) {
		v7MPhone = v7mPhone;
	}
	public String getV7MBeginTime() {
		return v7MBeginTime;
	}
	public void setV7MBeginTime(String v7mBeginTime) {
		v7MBeginTime = v7mBeginTime;
	}
	public String getV7MEndTime() {
		return v7MEndTime;
	}
	public void setV7MEndTime(String v7mEndTime) {
		v7MEndTime = v7mEndTime;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public boolean isOneCard() {
		return oneCard;
	}
	public void setOneCard(boolean oneCard) {
		this.oneCard = oneCard;
	}
	public Integer getCheckCardType() {
		return checkCardType;
	}
	public void setCheckCardType(Integer checkCardType) {
		this.checkCardType = checkCardType;
	}
	
	
	
	
	

	
	
}
