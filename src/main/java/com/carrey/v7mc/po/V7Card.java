package com.carrey.v7mc.po;

public class V7Card {
    private String id;

    private Integer v7CType;

    private Double v7CSurplusAmount;

    private Double v7CRechargeAmount;

    private Integer v7CTintegral;

    private Integer v7CStatus;

    private String v7PkMember;

    private String v7CRemarks;

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

    public Integer getV7CType() {
        return v7CType;
    }

    public void setV7CType(Integer v7CType) {
        this.v7CType = v7CType;
    }

    public Double getV7CSurplusAmount() {
        return v7CSurplusAmount;
    }

    public void setV7CSurplusAmount(Double v7CSurplusAmount) {
        this.v7CSurplusAmount = v7CSurplusAmount;
    }

    public Double getV7CRechargeAmount() {
        return v7CRechargeAmount;
    }

    public void setV7CRechargeAmount(Double v7CRechargeAmount) {
        this.v7CRechargeAmount = v7CRechargeAmount;
    }

    public Integer getV7CTintegral() {
        return v7CTintegral;
    }

    public void setV7CTintegral(Integer v7CTintegral) {
        this.v7CTintegral = v7CTintegral;
    }

    public Integer getV7CStatus() {
        return v7CStatus;
    }

    public void setV7CStatus(Integer v7CStatus) {
        this.v7CStatus = v7CStatus;
    }

    public String getV7PkMember() {
        return v7PkMember;
    }

    public void setV7PkMember(String v7PkMember) {
        this.v7PkMember = v7PkMember == null ? null : v7PkMember.trim();
    }

    public String getV7CRemarks() {
        return v7CRemarks;
    }

    public void setV7CRemarks(String v7CRemarks) {
        this.v7CRemarks = v7CRemarks == null ? null : v7CRemarks.trim();
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