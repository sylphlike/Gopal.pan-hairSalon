package com.horse.v7mc.po;

import java.util.Date;
import java.util.List;

public class V7Member {
    private String id;

    private Integer v7MNum;

    private String v7MName;

    private String v7MRealName;

    private Integer v7MSex;

    private Date v7MBirthday;

    private String v7MPassowrd;

    private Integer v7MStatus;

    private String v7MPhone;

    private String v7ReCType;

    private String v7MCreateUser;

    private Date v7MCrateTime;

    private String v7MUpdateUser;

    private Date v7MUpdateTime;

    private String v7MRemarks;

    private String extends1;

    private String extends2;

    private String extends3;

    private String extends4;

    private String extends5;
    
    
    /**接收 页面生日的字符串数组*/
    private String birthday;
    
    private List<V7Card> memberCard;
    

    public List<V7Card> getMemberCard() {
		return memberCard;
	}

	public void setMemberCard(List<V7Card> memberCard) {
		this.memberCard = memberCard;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getV7MNum() {
        return v7MNum;
    }

    public void setV7MNum(Integer v7MNum) {
        this.v7MNum = v7MNum;
    }

    public String getV7MName() {
        return v7MName;
    }

    public void setV7MName(String v7MName) {
        this.v7MName = v7MName == null ? null : v7MName.trim();
    }

    public String getV7MRealName() {
        return v7MRealName;
    }

    public void setV7MRealName(String v7MRealName) {
        this.v7MRealName = v7MRealName == null ? null : v7MRealName.trim();
    }

    public Integer getV7MSex() {
        return v7MSex;
    }

    public void setV7MSex(Integer v7MSex) {
        this.v7MSex = v7MSex;
    }

    public Date getV7MBirthday() {
        return v7MBirthday;
    }

    public void setV7MBirthday(Date v7MBirthday) {
        this.v7MBirthday = v7MBirthday;
    }

    public String getV7MPassowrd() {
        return v7MPassowrd;
    }

    public void setV7MPassowrd(String v7MPassowrd) {
        this.v7MPassowrd = v7MPassowrd == null ? null : v7MPassowrd.trim();
    }

    public Integer getV7MStatus() {
        return v7MStatus;
    }

    public void setV7MStatus(Integer v7MStatus) {
        this.v7MStatus = v7MStatus;
    }

    public String getV7MPhone() {
        return v7MPhone;
    }

    public void setV7MPhone(String v7MPhone) {
        this.v7MPhone = v7MPhone == null ? null : v7MPhone.trim();
    }

    public String getV7ReCType() {
        return v7ReCType;
    }

    public void setV7ReCType(String v7ReCType) {
        this.v7ReCType = v7ReCType == null ? null : v7ReCType.trim();
    }

    public String getV7MCreateUser() {
        return v7MCreateUser;
    }

    public void setV7MCreateUser(String v7MCreateUser) {
        this.v7MCreateUser = v7MCreateUser == null ? null : v7MCreateUser.trim();
    }

    public Date getV7MCrateTime() {
        return v7MCrateTime;
    }

    public void setV7MCrateTime(Date v7MCrateTime) {
        this.v7MCrateTime = v7MCrateTime;
    }

    public String getV7MUpdateUser() {
        return v7MUpdateUser;
    }

    public void setV7MUpdateUser(String v7MUpdateUser) {
        this.v7MUpdateUser = v7MUpdateUser == null ? null : v7MUpdateUser.trim();
    }

    public Date getV7MUpdateTime() {
        return v7MUpdateTime;
    }

    public void setV7MUpdateTime(Date v7MUpdateTime) {
        this.v7MUpdateTime = v7MUpdateTime;
    }

    public String getV7MRemarks() {
        return v7MRemarks;
    }

    public void setV7MRemarks(String v7MRemarks) {
        this.v7MRemarks = v7MRemarks == null ? null : v7MRemarks.trim();
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