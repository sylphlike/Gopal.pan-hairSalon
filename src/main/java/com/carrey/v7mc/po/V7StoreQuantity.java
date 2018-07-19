package com.carrey.v7mc.po;

import java.util.Date;

public class V7StoreQuantity {
    private String id;

    private String v7SBrand;

    private String v7SType;

    private String v7SName;

    private Integer v7SCount;

    private String v7SUnit;

    private String v7SStandard;

    private Date v7SLatelyTime;

    private String v7PkProduct;

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

    public String getV7SBrand() {
        return v7SBrand;
    }

    public void setV7SBrand(String v7SBrand) {
        this.v7SBrand = v7SBrand == null ? null : v7SBrand.trim();
    }

    public String getV7SType() {
        return v7SType;
    }

    public void setV7SType(String v7SType) {
        this.v7SType = v7SType == null ? null : v7SType.trim();
    }

    public String getV7SName() {
        return v7SName;
    }

    public void setV7SName(String v7SName) {
        this.v7SName = v7SName == null ? null : v7SName.trim();
    }

    public Integer getV7SCount() {
        return v7SCount;
    }

    public void setV7SCount(Integer v7SCount) {
        this.v7SCount = v7SCount;
    }

    public String getV7SUnit() {
        return v7SUnit;
    }

    public void setV7SUnit(String v7SUnit) {
        this.v7SUnit = v7SUnit == null ? null : v7SUnit.trim();
    }

    public String getV7SStandard() {
        return v7SStandard;
    }

    public void setV7SStandard(String v7SStandard) {
        this.v7SStandard = v7SStandard == null ? null : v7SStandard.trim();
    }

    public Date getV7SLatelyTime() {
        return v7SLatelyTime;
    }

    public void setV7SLatelyTime(Date v7SLatelyTime) {
        this.v7SLatelyTime = v7SLatelyTime;
    }

    public String getV7PkProduct() {
        return v7PkProduct;
    }

    public void setV7PkProduct(String v7PkProduct) {
        this.v7PkProduct = v7PkProduct == null ? null : v7PkProduct.trim();
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