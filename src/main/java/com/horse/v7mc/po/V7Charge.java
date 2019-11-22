package com.horse.v7mc.po;

import java.util.Date;

public class V7Charge {
    private String id;

    private Date v7CMonth;

    private Integer v7CMnum;

    private String v7CName;

    private String v7CPosition;

    private Double v7CChargeMoney;

    private String v7CChargeExplain;

    private String v7COperUser;

    private Date v7COperTime;

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

    public Date getV7CMonth() {
        return v7CMonth;
    }

    public void setV7CMonth(Date v7CMonth) {
        this.v7CMonth = v7CMonth;
    }

    public Integer getV7CMnum() {
        return v7CMnum;
    }

    public void setV7CMnum(Integer v7CMnum) {
        this.v7CMnum = v7CMnum;
    }

    public String getV7CName() {
        return v7CName;
    }

    public void setV7CName(String v7CName) {
        this.v7CName = v7CName == null ? null : v7CName.trim();
    }

    public String getv7CPosition() {
        return v7CPosition;
    }

    public void setv7CPosition(String v7CPosition) {
        this.v7CPosition = v7CPosition == null ? null : v7CPosition.trim();
    }

    public Double getV7CChargeMoney() {
        return v7CChargeMoney;
    }

    public void setV7CChargeMoney(Double v7CChargeMoney) {
        this.v7CChargeMoney = v7CChargeMoney;
    }

    public String getV7CChargeExplain() {
        return v7CChargeExplain;
    }

    public void setV7CChargeExplain(String v7CChargeExplain) {
        this.v7CChargeExplain = v7CChargeExplain == null ? null : v7CChargeExplain.trim();
    }

    public String getV7COperUser() {
        return v7COperUser;
    }

    public void setV7COperUser(String v7COperUser) {
        this.v7COperUser = v7COperUser == null ? null : v7COperUser.trim();
    }

    public Date getV7COperTime() {
        return v7COperTime;
    }

    public void setV7COperTime(Date v7COperTime) {
        this.v7COperTime = v7COperTime;
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