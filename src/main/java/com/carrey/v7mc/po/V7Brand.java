package com.carrey.v7mc.po;

import java.util.Date;

public class V7Brand {
    private String id;

    private String v7BName;
    
    private String v7BType; 

    private String v7BBrandDeclare;

    private Integer v7BStatus;

    private String v7BCreateUser;

    private Date v7BCrateTime;

    private String v7BUpdateUser;

    private Date v7BUpdateTime;

    private String v7BRemarks;

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

    public String getV7BName() {
        return v7BName;
    }

    public void setV7BName(String v7BName) {
        this.v7BName = v7BName == null ? null : v7BName.trim();
    }

    public String getV7BType() {
        return v7BType;
    }

    public void setV7BType(String v7BType) {
        this.v7BType = v7BType == null ? null : v7BType.trim();
    }

    public String getV7BBrandDeclare() {
        return v7BBrandDeclare;
    }

    public void setV7BBrandDeclare(String v7BBrandDeclare) {
        this.v7BBrandDeclare = v7BBrandDeclare == null ? null : v7BBrandDeclare.trim();
    }

    public Integer getV7BStatus() {
        return v7BStatus;
    }

    public void setV7BStatus(Integer v7BStatus) {
        this.v7BStatus = v7BStatus;
    }

    public String getV7BCreateUser() {
        return v7BCreateUser;
    }

    public void setV7BCreateUser(String v7BCreateUser) {
        this.v7BCreateUser = v7BCreateUser == null ? null : v7BCreateUser.trim();
    }

    public Date getV7BCrateTime() {
        return v7BCrateTime;
    }

    public void setV7BCrateTime(Date v7BCrateTime) {
        this.v7BCrateTime = v7BCrateTime;
    }

    public String getV7BUpdateUser() {
        return v7BUpdateUser;
    }

    public void setV7BUpdateUser(String v7BUpdateUser) {
        this.v7BUpdateUser = v7BUpdateUser == null ? null : v7BUpdateUser.trim();
    }

    public Date getV7BUpdateTime() {
        return v7BUpdateTime;
    }

    public void setV7BUpdateTime(Date v7BUpdateTime) {
        this.v7BUpdateTime = v7BUpdateTime;
    }

    public String getV7BRemarks() {
        return v7BRemarks;
    }

    public void setV7BRemarks(String v7BRemarks) {
        this.v7BRemarks = v7BRemarks == null ? null : v7BRemarks.trim();
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