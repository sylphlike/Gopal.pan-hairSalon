package com.carrey.v7mc.po;

import java.util.Date;

public class V7Crecard {
    private String id;

    private String v7ROtype;

    private Integer v7RCardtype;

    private Double v7ROmoney;

    private String v7ROperUser;

    private Date v7ROperTime;

    private String v7RRemarks;

    private String v7PkCard;

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

    public String getV7ROtype() {
        return v7ROtype;
    }

    public void setV7ROtype(String v7ROtype) {
        this.v7ROtype = v7ROtype == null ? null : v7ROtype.trim();
    }

    public Integer getV7RCardtype() {
        return v7RCardtype;
    }

    public void setV7RCardtype(Integer v7RCardtype) {
        this.v7RCardtype = v7RCardtype;
    }

    public Double getV7ROmoney() {
        return v7ROmoney;
    }

    public void setV7ROmoney(Double v7ROmoney) {
        this.v7ROmoney = v7ROmoney;
    }

    public String getV7ROperUser() {
        return v7ROperUser;
    }

    public void setV7ROperUser(String v7ROperUser) {
        this.v7ROperUser = v7ROperUser == null ? null : v7ROperUser.trim();
    }

    public Date getV7ROperTime() {
        return v7ROperTime;
    }

    public void setV7ROperTime(Date v7ROperTime) {
        this.v7ROperTime = v7ROperTime;
    }

    public String getV7RRemarks() {
        return v7RRemarks;
    }

    public void setV7RRemarks(String v7RRemarks) {
        this.v7RRemarks = v7RRemarks == null ? null : v7RRemarks.trim();
    }

    public String getV7PkCard() {
        return v7PkCard;
    }

    public void setV7PkCard(String v7PkCard) {
        this.v7PkCard = v7PkCard == null ? null : v7PkCard.trim();
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