package com.carrey.v7mc.po;

import java.util.Date;

public class V7Employee {
    private String id;

    private Integer v7ENum;

    private String v7EName;

    private String v7ERealName;

    private Integer v7ESex;

    private Date v7EBirthday;

    private String v7EPhone;

    private String v7EPosition;

    private Date v7EJoinDate;

    private String v7EPassword;

    private Integer v7EStatus;

    private Date v7ELastLogin;

    private String v7ELastIp;

    private Integer v7ESumLogin;

    private Date v7EOnlineTime;

    private String v7ERemarks;

    private String v7ECreateUser;

    private Date v7ECreateDate;

    private String v7EUpdateUser;

    private Date v7EUpdateTime;

    private String extends1;

    private String extends2;

    private String extends3;

    private String extends4;

    private String extends5;
    
    
    /**接收 页面生日的字符串数组*/
    private String birthday;
    
    /**入职时间字符串形式*/
    private String v7EJoinDateStr;
    

    public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getV7EJoinDateStr() {
		return v7EJoinDateStr;
	}

	public void setV7EJoinDateStr(String v7eJoinDateStr) {
		v7EJoinDateStr = v7eJoinDateStr;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getV7ENum() {
        return v7ENum;
    }

    public void setV7ENum(Integer v7ENum) {
        this.v7ENum = v7ENum;
    }

    public String getV7EName() {
        return v7EName;
    }

    public void setV7EName(String v7EName) {
        this.v7EName = v7EName == null ? null : v7EName.trim();
    }

    public String getV7ERealName() {
        return v7ERealName;
    }

    public void setV7ERealName(String v7ERealName) {
        this.v7ERealName = v7ERealName == null ? null : v7ERealName.trim();
    }

    public Integer getV7ESex() {
        return v7ESex;
    }

    public void setV7ESex(Integer v7ESex) {
        this.v7ESex = v7ESex;
    }

    public Date getV7EBirthday() {
        return v7EBirthday;
    }

    public void setV7EBirthday(Date v7EBirthday) {
        this.v7EBirthday = v7EBirthday;
    }

    public String getV7EPhone() {
        return v7EPhone;
    }

    public void setV7EPhone(String v7EPhone) {
        this.v7EPhone = v7EPhone == null ? null : v7EPhone.trim();
    }

    public String getV7EPosition() {
        return v7EPosition;
    }

    public void setV7EPosition(String v7EPosition) {
        this.v7EPosition = v7EPosition == null ? null : v7EPosition.trim();
    }

    public Date getV7EJoinDate() {
        return v7EJoinDate;
    }

    public void setV7EJoinDate(Date v7EJoinDate) {
        this.v7EJoinDate = v7EJoinDate;
    }

    public String getV7EPassword() {
        return v7EPassword;
    }

    public void setV7EPassword(String v7EPassword) {
        this.v7EPassword = v7EPassword == null ? null : v7EPassword.trim();
    }

    public Integer getV7EStatus() {
        return v7EStatus;
    }

    public void setV7EStatus(Integer v7EStatus) {
        this.v7EStatus = v7EStatus;
    }

    public Date getV7ELastLogin() {
        return v7ELastLogin;
    }

    public void setV7ELastLogin(Date v7ELastLogin) {
        this.v7ELastLogin = v7ELastLogin;
    }

    public String getV7ELastIp() {
        return v7ELastIp;
    }

    public void setV7ELastIp(String v7ELastIp) {
        this.v7ELastIp = v7ELastIp == null ? null : v7ELastIp.trim();
    }

    public Integer getV7ESumLogin() {
        return v7ESumLogin;
    }

    public void setV7ESumLogin(Integer v7ESumLogin) {
        this.v7ESumLogin = v7ESumLogin;
    }

    public Date getV7EOnlineTime() {
        return v7EOnlineTime;
    }

    public void setV7EOnlineTime(Date v7EOnlineTime) {
        this.v7EOnlineTime = v7EOnlineTime;
    }

    public String getV7ERemarks() {
        return v7ERemarks;
    }

    public void setV7ERemarks(String v7ERemarks) {
        this.v7ERemarks = v7ERemarks == null ? null : v7ERemarks.trim();
    }

    public String getV7ECreateUser() {
        return v7ECreateUser;
    }

    public void setV7ECreateUser(String v7ECreateUser) {
        this.v7ECreateUser = v7ECreateUser == null ? null : v7ECreateUser.trim();
    }

    public Date getV7ECreateDate() {
        return v7ECreateDate;
    }

    public void setV7ECreateDate(Date v7ECreateDate) {
        this.v7ECreateDate = v7ECreateDate;
    }

    public String getV7EUpdateUser() {
        return v7EUpdateUser;
    }

    public void setV7EUpdateUser(String v7EUpdateUser) {
        this.v7EUpdateUser = v7EUpdateUser == null ? null : v7EUpdateUser.trim();
    }

    public Date getV7EUpdateTime() {
        return v7EUpdateTime;
    }

    public void setV7EUpdateTime(Date v7EUpdateTime) {
        this.v7EUpdateTime = v7EUpdateTime;
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