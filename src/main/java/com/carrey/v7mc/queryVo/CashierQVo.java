package com.carrey.v7mc.queryVo;

import com.carrey.v7mc.common.pageBean.PageBean;

/**
 * 
 * @author carrey(潘冰)
 * @email  15923508369@163.com
 * @date   2016年5月27日下午1:20:04
 * @desc   前台买单，后台接收数据封装
 */
public class CashierQVo extends PageBean {
	
	
	
	private String v7CBeginTime;
	private String v7CEndTime;
	
	
	/**消费方式  1 VIP卡，2 对冲卡，3 记次卡，4 现金*/
	private Integer consumption;
	
	/**消费类型 1洗吹,2 洗剪吹,3烫发，4染发,5烫染发,6烫染护,7护发 */
	private Integer consumeType;
	
	
	
	/**会员ID*/
	private String memberId;
	/**使用会员卡ID*/
	private String cardId;
	/**使用会员卡类型  会员卡类型(1 金卡，2银卡，3普卡，4对冲卡，5 记次卡)*/
	private Integer useCardType;

	
	/**烫发项目-原价*/
	private String permCostPrice;
	/**染发项目-原价原价*/
	private String dyeHairCostPrice;
	/**护发项目-原价原件*/
	private String conditionerCostPrice;
	
	
	/**总原价*/
	private Double sumCostPrice;
	/**折后价*/
	private Double discountPrice;
	/**折扣率*/
	private Double customDiscountRate;
	/**对冲卡 应付现金*/
	private Double payCash4Hedging;
	
	/**现金支付金额*/
	private Double payCash;
	
	/**加价产品金额*/
	private Double raiseAmount;
	
	/**发型师ID*/
	private String hairstylist;
	/**技师ID*/
	private String technician;
	/**助理ID*/
	private String assistant;
	
	
	
	/**产品ID*/
	private String product;
	/**销售人ID*/
	private String salePeoplel;
	/**销售金额*/
	private Double saleAmount;
	public Integer getConsumption() {
		return consumption;
	}
	public void setConsumption(Integer consumption) {
		this.consumption = consumption;
	}
	public Integer getConsumeType() {
		return consumeType;
	}
	public void setConsumeType(Integer consumeType) {
		this.consumeType = consumeType;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public Integer getUseCardType() {
		return useCardType;
	}
	public void setUseCardType(Integer useCardType) {
		this.useCardType = useCardType;
	}
	public String getPermCostPrice() {
		return permCostPrice;
	}
	public void setPermCostPrice(String permCostPrice) {
		this.permCostPrice = permCostPrice;
	}
	public String getDyeHairCostPrice() {
		return dyeHairCostPrice;
	}
	public void setDyeHairCostPrice(String dyeHairCostPrice) {
		this.dyeHairCostPrice = dyeHairCostPrice;
	}
	public String getConditionerCostPrice() {
		return conditionerCostPrice;
	}
	public void setConditionerCostPrice(String conditionerCostPrice) {
		this.conditionerCostPrice = conditionerCostPrice;
	}
	public Double getSumCostPrice() {
		return sumCostPrice;
	}
	public void setSumCostPrice(Double sumCostPrice) {
		this.sumCostPrice = sumCostPrice;
	}
	public Double getDiscountPrice() {
		return discountPrice;
	}
	public void setDiscountPrice(Double discountPrice) {
		this.discountPrice = discountPrice;
	}
	public Double getCustomDiscountRate() {
		return customDiscountRate;
	}
	public void setCustomDiscountRate(Double customDiscountRate) {
		this.customDiscountRate = customDiscountRate;
	}
	public Double getPayCash4Hedging() {
		return payCash4Hedging;
	}
	public void setPayCash4Hedging(Double payCash4Hedging) {
		this.payCash4Hedging = payCash4Hedging;
	}
	public Double getPayCash() {
		return payCash;
	}
	public void setPayCash(Double payCash) {
		this.payCash = payCash;
	}
	public Double getRaiseAmount() {
		return raiseAmount;
	}
	public void setRaiseAmount(Double raiseAmount) {
		this.raiseAmount = raiseAmount;
	}
	public String getHairstylist() {
		return hairstylist;
	}
	public void setHairstylist(String hairstylist) {
		this.hairstylist = hairstylist;
	}
	public String getTechnician() {
		return technician;
	}
	public void setTechnician(String technician) {
		this.technician = technician;
	}
	public String getAssistant() {
		return assistant;
	}
	public void setAssistant(String assistant) {
		this.assistant = assistant;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getSalePeoplel() {
		return salePeoplel;
	}
	public void setSalePeoplel(String salePeoplel) {
		this.salePeoplel = salePeoplel;
	}
	public Double getSaleAmount() {
		return saleAmount;
	}
	public void setSaleAmount(Double saleAmount) {
		this.saleAmount = saleAmount;
	}
	public String getV7CBeginTime() {
		return v7CBeginTime;
	}
	public void setV7CBeginTime(String v7cBeginTime) {
		v7CBeginTime = v7cBeginTime;
	}
	public String getV7CEndTime() {
		return v7CEndTime;
	}
	public void setV7CEndTime(String v7cEndTime) {
		v7CEndTime = v7cEndTime;
	}
	

	
	
	
}
