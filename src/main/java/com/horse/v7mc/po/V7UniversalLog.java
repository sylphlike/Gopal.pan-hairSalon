package com.horse.v7mc.po;

import java.util.Date;

public class V7UniversalLog {
    private String id;

    private String v7UModuleName;

    private String v7UFeatureName;

    private String v7UFeaturePath;

    private String v7URequestResult;

    private String v7URequestUser;

    private Date v7URequestTime;

    private String v7URequestPcname;

    private String v7URequestIp;

    private String extends1;

    private String extends2;

    private String extends3;

    private String extends4;

    private String extends5;

    private String v7URequestParam;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getV7UModuleName() {
        return v7UModuleName;
    }

    public void setV7UModuleName(String v7UModuleName) {
        this.v7UModuleName = v7UModuleName == null ? null : v7UModuleName.trim();
    }

    public String getV7UFeatureName() {
        return v7UFeatureName;
    }

    public void setV7UFeatureName(String v7UFeatureName) {
        this.v7UFeatureName = v7UFeatureName == null ? null : v7UFeatureName.trim();
    }

    public String getV7UFeaturePath() {
        return v7UFeaturePath;
    }

    public void setV7UFeaturePath(String v7UFeaturePath) {
        this.v7UFeaturePath = v7UFeaturePath == null ? null : v7UFeaturePath.trim();
    }

    public String getV7URequestResult() {
        return v7URequestResult;
    }

    public void setV7URequestResult(String v7URequestResult) {
        this.v7URequestResult = v7URequestResult == null ? null : v7URequestResult.trim();
    }

    public String getV7URequestUser() {
        return v7URequestUser;
    }

    public void setV7URequestUser(String v7URequestUser) {
        this.v7URequestUser = v7URequestUser == null ? null : v7URequestUser.trim();
    }

    public Date getV7URequestTime() {
        return v7URequestTime;
    }

    public void setV7URequestTime(Date v7URequestTime) {
        this.v7URequestTime = v7URequestTime;
    }

    public String getV7URequestPcname() {
        return v7URequestPcname;
    }

    public void setV7URequestPcname(String v7URequestPcname) {
        this.v7URequestPcname = v7URequestPcname == null ? null : v7URequestPcname.trim();
    }

    public String getV7URequestIp() {
        return v7URequestIp;
    }

    public void setV7URequestIp(String v7URequestIp) {
        this.v7URequestIp = v7URequestIp == null ? null : v7URequestIp.trim();
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

    public String getV7URequestParam() {
        return v7URequestParam;
    }

    public void setV7URequestParam(String v7URequestParam) {
        this.v7URequestParam = v7URequestParam == null ? null : v7URequestParam.trim();
    }
}