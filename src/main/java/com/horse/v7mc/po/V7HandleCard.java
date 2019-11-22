package com.horse.v7mc.po;

import java.util.Date;

public class V7HandleCard {
    private String id;

    private String v7HCardNum;

    private Integer v7HHandleType;

    private Integer v7HCardType;

    private Double v7HMoney;

    private String v7HHandleUser;

    private String v7HOperUser;

    private Date v7HOperTime;

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

    public String getV7HCardNum() {
        return v7HCardNum;
    }

    public void setV7HCardNum(String v7HCardNum) {
        this.v7HCardNum = v7HCardNum == null ? null : v7HCardNum.trim();
    }

    public Integer getV7HHandleType() {
        return v7HHandleType;
    }

    public void setV7HHandleType(Integer v7HHandleType) {
        this.v7HHandleType = v7HHandleType;
    }

    public Integer getV7HCardType() {
        return v7HCardType;
    }

    public void setV7HCardType(Integer v7HCardType) {
        this.v7HCardType = v7HCardType;
    }

    public Double getV7HMoney() {
        return v7HMoney;
    }

    public void setV7HMoney(Double v7HMoney) {
        this.v7HMoney = v7HMoney;
    }

    public String getV7HHandleUser() {
        return v7HHandleUser;
    }

    public void setV7HHandleUser(String v7HHandleUser) {
        this.v7HHandleUser = v7HHandleUser == null ? null : v7HHandleUser.trim();
    }

    public String getV7HOperUser() {
        return v7HOperUser;
    }

    public void setV7HOperUser(String v7HOperUser) {
        this.v7HOperUser = v7HOperUser == null ? null : v7HOperUser.trim();
    }

    public Date getV7HOperTime() {
        return v7HOperTime;
    }

    public void setV7HOperTime(Date v7HOperTime) {
        this.v7HOperTime = v7HOperTime;
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