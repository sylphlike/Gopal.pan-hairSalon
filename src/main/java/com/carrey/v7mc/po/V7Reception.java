package com.carrey.v7mc.po;

import java.util.Date;

public class V7Reception {
    private String id;

    /**收银流水号*/
    private String v7RNum;
    /**消费方式1 vip卡，2 对冲卡，3 洗吹卡，4 洗剪吹卡，5现金*/
    private Integer v7RConsumption;
    /**消费类型 1洗吹,2 洗剪吹,3烫发，4染发,5烫染发,6烫染护,7护发*/
    private Integer v7RConsumetype;
    /**会员id*/
    private String v7RMemberid;
    /**使用会员卡id*/
    private String v7RCardid;
    /**使用会员卡类型(1 金卡，2银卡，3普卡，4对冲卡，5 洗吹卡,6 洗剪吹卡)*/
    private Integer v7RUsecardtype;
    /**洗吹原价*/
    private Double v7RBlowwash;
    /**洗剪吹原价*/
    private Double v7RBlowcutwash;
    /**烫发项目-原价*/
    private String v7RPermcostprice;
    /**染发项目-原价*/
    private String v7RDyehaircostprice;
    /**护发项目-原价*/
    private String v7RConditionercostprice;
    /**总原价*/
    private Double v7RSumcostprice;
    /**折后价*/
    private Double v7RDiscountprice;
    /**折扣率*/
    private Double v7RDiscountrate;
    /**对冲卡应付现金*/
    private Double v7RPaycash4hedging;
    /**现金支付金额*/
    private Double v7RPaycash;
    /**记次卡划卡次数*/
    private Integer v7RRecordnum;
    /**加价产品金额*/
    private Double v7RRaiseamount;
    /**发型师ID*/
    private String v7RHairstylist;
    /**技师ID*/
    private String v7RTechnician;
    /**助理ID*/
    private String v7RAssistant;
    /**外卖产品ID*/
    private String v7RProductid;
    /**销售人ID*/
    private String v7RSaleUser;
    /**销售金额*/
    private Double v7RSaleProammount;
    /**销售数量*/
    private Integer v7RSaleCount;
    /**销售总金额*/
    private Double v7RSaleTotalprice;
    /**结单人*/
    private String v7RStatementUser;
    /**结单时间*/
    private Date v7RStatementDate;
    /**备注*/
    private String v7RRemarks;

    private String extends1;

    private String extends2;

    private String extends3;

    private String extends4;

    private String extends5;
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getV7RNum() {
        return v7RNum;
    }

    public void setV7RNum(String v7RNum) {
        this.v7RNum = v7RNum == null ? null : v7RNum.trim();
    }

    public Integer getV7RConsumption() {
        return v7RConsumption;
    }

    public void setV7RConsumption(Integer v7RConsumption) {
        this.v7RConsumption = v7RConsumption;
    }

    
    public Integer getV7RSaleCount() {
		return v7RSaleCount;
	}

	public void setV7RSaleCount(Integer v7rSaleCount) {
		v7RSaleCount = v7rSaleCount;
	}

	public Integer getV7RConsumetype() {
        return v7RConsumetype;
    }

    public void setV7RConsumetype(Integer v7RConsumetype) {
        this.v7RConsumetype = v7RConsumetype;
    }

    public String getV7RMemberid() {
        return v7RMemberid;
    }

    public void setV7RMemberid(String v7RMemberid) {
        this.v7RMemberid = v7RMemberid == null ? null : v7RMemberid.trim();
    }

    public Double getV7RSaleTotalprice() {
		return v7RSaleTotalprice;
	}

	public void setV7RSaleTotalprice(Double v7rSaleTotalprice) {
		v7RSaleTotalprice = v7rSaleTotalprice;
	}

	public String getV7RCardid() {
        return v7RCardid;
    }

    public void setV7RCardid(String v7RCardid) {
        this.v7RCardid = v7RCardid == null ? null : v7RCardid.trim();
    }

    public Integer getV7RUsecardtype() {
        return v7RUsecardtype;
    }

    public void setV7RUsecardtype(Integer v7RUsecardtype) {
        this.v7RUsecardtype = v7RUsecardtype;
    }

    public Double getV7RBlowwash() {
        return v7RBlowwash;
    }

    public void setV7RBlowwash(Double v7RBlowwash) {
        this.v7RBlowwash = v7RBlowwash;
    }

    public Double getV7RBlowcutwash() {
        return v7RBlowcutwash;
    }

    public void setV7RBlowcutwash(Double v7RBlowcutwash) {
        this.v7RBlowcutwash = v7RBlowcutwash;
    }

    public String getV7RPermcostprice() {
        return v7RPermcostprice;
    }

    public void setV7RPermcostprice(String v7RPermcostprice) {
        this.v7RPermcostprice = v7RPermcostprice == null ? null : v7RPermcostprice.trim();
    }

    public String getV7RDyehaircostprice() {
        return v7RDyehaircostprice;
    }

    public void setV7RDyehaircostprice(String v7RDyehaircostprice) {
        this.v7RDyehaircostprice = v7RDyehaircostprice == null ? null : v7RDyehaircostprice.trim();
    }

    public String getV7RConditionercostprice() {
        return v7RConditionercostprice;
    }

    public void setV7RConditionercostprice(String v7RConditionercostprice) {
        this.v7RConditionercostprice = v7RConditionercostprice == null ? null : v7RConditionercostprice.trim();
    }

    public Double getV7RSumcostprice() {
        return v7RSumcostprice;
    }

    public void setV7RSumcostprice(Double v7RSumcostprice) {
        this.v7RSumcostprice = v7RSumcostprice;
    }

    public Double getV7RDiscountprice() {
        return v7RDiscountprice;
    }

    public void setV7RDiscountprice(Double v7RDiscountprice) {
        this.v7RDiscountprice = v7RDiscountprice;
    }

    public Double getV7RDiscountrate() {
        return v7RDiscountrate;
    }

    public void setV7RDiscountrate(Double v7RDiscountrate) {
        this.v7RDiscountrate = v7RDiscountrate;
    }

    public Double getV7RPaycash4hedging() {
        return v7RPaycash4hedging;
    }

    public void setV7RPaycash4hedging(Double v7RPaycash4hedging) {
        this.v7RPaycash4hedging = v7RPaycash4hedging;
    }

    public Double getV7RPaycash() {
        return v7RPaycash;
    }

    public void setV7RPaycash(Double v7RPaycash) {
        this.v7RPaycash = v7RPaycash;
    }

    public Integer getV7RRecordnum() {
        return v7RRecordnum;
    }

    public void setV7RRecordnum(Integer v7RRecordnum) {
        this.v7RRecordnum = v7RRecordnum;
    }

    public Double getV7RRaiseamount() {
        return v7RRaiseamount;
    }

    public void setV7RRaiseamount(Double v7RRaiseamount) {
        this.v7RRaiseamount = v7RRaiseamount;
    }

    public String getV7RHairstylist() {
        return v7RHairstylist;
    }

    public void setV7RHairstylist(String v7RHairstylist) {
        this.v7RHairstylist = v7RHairstylist == null ? null : v7RHairstylist.trim();
    }

    public String getV7RTechnician() {
        return v7RTechnician;
    }

    public void setV7RTechnician(String v7RTechnician) {
        this.v7RTechnician = v7RTechnician == null ? null : v7RTechnician.trim();
    }

    public String getV7RAssistant() {
        return v7RAssistant;
    }

    public void setV7RAssistant(String v7RAssistant) {
        this.v7RAssistant = v7RAssistant == null ? null : v7RAssistant.trim();
    }

    public String getV7RProductid() {
        return v7RProductid;
    }

    public void setV7RProductid(String v7RProductid) {
        this.v7RProductid = v7RProductid == null ? null : v7RProductid.trim();
    }

    public String getV7RSaleUser() {
        return v7RSaleUser;
    }

    public void setV7RSaleUser(String v7RSaleUser) {
        this.v7RSaleUser = v7RSaleUser == null ? null : v7RSaleUser.trim();
    }

    public Double getV7RSaleProammount() {
        return v7RSaleProammount;
    }

    public void setV7RSaleProammount(Double v7RSaleProammount) {
        this.v7RSaleProammount = v7RSaleProammount;
    }

    public String getV7RStatementUser() {
        return v7RStatementUser;
    }

    public void setV7RStatementUser(String v7RStatementUser) {
        this.v7RStatementUser = v7RStatementUser == null ? null : v7RStatementUser.trim();
    }

    public Date getV7RStatementDate() {
        return v7RStatementDate;
    }

    public void setV7RStatementDate(Date v7RStatementDate) {
        this.v7RStatementDate = v7RStatementDate;
    }

    public String getV7RRemarks() {
        return v7RRemarks;
    }

    public void setV7RRemarks(String v7RRemarks) {
        this.v7RRemarks = v7RRemarks == null ? null : v7RRemarks.trim();
    }

    public String getExtends1() {
        return extends1;
    }

    public void setExtends1(String extends1) {
        this.extends1 = extends1 == null ? null : extends1.trim();
    }

    public String getExtends2() {
        return extends2;
    }

    public void setExtends2(String extends2) {
        this.extends2 = extends2 == null ? null : extends2.trim();
    }

    public String getExtends3() {
        return extends3;
    }

    public void setExtends3(String extends3) {
        this.extends3 = extends3 == null ? null : extends3.trim();
    }

    public String getExtends4() {
        return extends4;
    }

    public void setExtends4(String extends4) {
        this.extends4 = extends4 == null ? null : extends4.trim();
    }

    public String getExtends5() {
        return extends5;
    }

    public void setExtends5(String extends5) {
        this.extends5 = extends5 == null ? null : extends5.trim();
    }
}