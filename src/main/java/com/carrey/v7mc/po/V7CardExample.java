package com.carrey.v7mc.po;

import java.util.ArrayList;
import java.util.List;

public class V7CardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public V7CardExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andV7CTypeIsNull() {
            addCriterion("v7_c_type is null");
            return (Criteria) this;
        }

        public Criteria andV7CTypeIsNotNull() {
            addCriterion("v7_c_type is not null");
            return (Criteria) this;
        }

        public Criteria andV7CTypeEqualTo(Integer value) {
            addCriterion("v7_c_type =", value, "v7CType");
            return (Criteria) this;
        }

        public Criteria andV7CTypeNotEqualTo(Integer value) {
            addCriterion("v7_c_type <>", value, "v7CType");
            return (Criteria) this;
        }

        public Criteria andV7CTypeGreaterThan(Integer value) {
            addCriterion("v7_c_type >", value, "v7CType");
            return (Criteria) this;
        }

        public Criteria andV7CTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("v7_c_type >=", value, "v7CType");
            return (Criteria) this;
        }

        public Criteria andV7CTypeLessThan(Integer value) {
            addCriterion("v7_c_type <", value, "v7CType");
            return (Criteria) this;
        }

        public Criteria andV7CTypeLessThanOrEqualTo(Integer value) {
            addCriterion("v7_c_type <=", value, "v7CType");
            return (Criteria) this;
        }

        public Criteria andV7CTypeIn(List<Integer> values) {
            addCriterion("v7_c_type in", values, "v7CType");
            return (Criteria) this;
        }

        public Criteria andV7CTypeNotIn(List<Integer> values) {
            addCriterion("v7_c_type not in", values, "v7CType");
            return (Criteria) this;
        }

        public Criteria andV7CTypeBetween(Integer value1, Integer value2) {
            addCriterion("v7_c_type between", value1, value2, "v7CType");
            return (Criteria) this;
        }

        public Criteria andV7CTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("v7_c_type not between", value1, value2, "v7CType");
            return (Criteria) this;
        }

        public Criteria andV7CSurplusAmountIsNull() {
            addCriterion("v7_c_surplus_amount is null");
            return (Criteria) this;
        }

        public Criteria andV7CSurplusAmountIsNotNull() {
            addCriterion("v7_c_surplus_amount is not null");
            return (Criteria) this;
        }

        public Criteria andV7CSurplusAmountEqualTo(Double value) {
            addCriterion("v7_c_surplus_amount =", value, "v7CSurplusAmount");
            return (Criteria) this;
        }

        public Criteria andV7CSurplusAmountNotEqualTo(Double value) {
            addCriterion("v7_c_surplus_amount <>", value, "v7CSurplusAmount");
            return (Criteria) this;
        }

        public Criteria andV7CSurplusAmountGreaterThan(Double value) {
            addCriterion("v7_c_surplus_amount >", value, "v7CSurplusAmount");
            return (Criteria) this;
        }

        public Criteria andV7CSurplusAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("v7_c_surplus_amount >=", value, "v7CSurplusAmount");
            return (Criteria) this;
        }

        public Criteria andV7CSurplusAmountLessThan(Double value) {
            addCriterion("v7_c_surplus_amount <", value, "v7CSurplusAmount");
            return (Criteria) this;
        }

        public Criteria andV7CSurplusAmountLessThanOrEqualTo(Double value) {
            addCriterion("v7_c_surplus_amount <=", value, "v7CSurplusAmount");
            return (Criteria) this;
        }

        public Criteria andV7CSurplusAmountIn(List<Double> values) {
            addCriterion("v7_c_surplus_amount in", values, "v7CSurplusAmount");
            return (Criteria) this;
        }

        public Criteria andV7CSurplusAmountNotIn(List<Double> values) {
            addCriterion("v7_c_surplus_amount not in", values, "v7CSurplusAmount");
            return (Criteria) this;
        }

        public Criteria andV7CSurplusAmountBetween(Double value1, Double value2) {
            addCriterion("v7_c_surplus_amount between", value1, value2, "v7CSurplusAmount");
            return (Criteria) this;
        }

        public Criteria andV7CSurplusAmountNotBetween(Double value1, Double value2) {
            addCriterion("v7_c_surplus_amount not between", value1, value2, "v7CSurplusAmount");
            return (Criteria) this;
        }

        public Criteria andV7CRechargeAmountIsNull() {
            addCriterion("v7_c_recharge_amount is null");
            return (Criteria) this;
        }

        public Criteria andV7CRechargeAmountIsNotNull() {
            addCriterion("v7_c_recharge_amount is not null");
            return (Criteria) this;
        }

        public Criteria andV7CRechargeAmountEqualTo(Double value) {
            addCriterion("v7_c_recharge_amount =", value, "v7CRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andV7CRechargeAmountNotEqualTo(Double value) {
            addCriterion("v7_c_recharge_amount <>", value, "v7CRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andV7CRechargeAmountGreaterThan(Double value) {
            addCriterion("v7_c_recharge_amount >", value, "v7CRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andV7CRechargeAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("v7_c_recharge_amount >=", value, "v7CRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andV7CRechargeAmountLessThan(Double value) {
            addCriterion("v7_c_recharge_amount <", value, "v7CRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andV7CRechargeAmountLessThanOrEqualTo(Double value) {
            addCriterion("v7_c_recharge_amount <=", value, "v7CRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andV7CRechargeAmountIn(List<Double> values) {
            addCriterion("v7_c_recharge_amount in", values, "v7CRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andV7CRechargeAmountNotIn(List<Double> values) {
            addCriterion("v7_c_recharge_amount not in", values, "v7CRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andV7CRechargeAmountBetween(Double value1, Double value2) {
            addCriterion("v7_c_recharge_amount between", value1, value2, "v7CRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andV7CRechargeAmountNotBetween(Double value1, Double value2) {
            addCriterion("v7_c_recharge_amount not between", value1, value2, "v7CRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andV7CTintegralIsNull() {
            addCriterion("v7_c_tintegral is null");
            return (Criteria) this;
        }

        public Criteria andV7CTintegralIsNotNull() {
            addCriterion("v7_c_tintegral is not null");
            return (Criteria) this;
        }

        public Criteria andV7CTintegralEqualTo(Integer value) {
            addCriterion("v7_c_tintegral =", value, "v7CTintegral");
            return (Criteria) this;
        }

        public Criteria andV7CTintegralNotEqualTo(Integer value) {
            addCriterion("v7_c_tintegral <>", value, "v7CTintegral");
            return (Criteria) this;
        }

        public Criteria andV7CTintegralGreaterThan(Integer value) {
            addCriterion("v7_c_tintegral >", value, "v7CTintegral");
            return (Criteria) this;
        }

        public Criteria andV7CTintegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("v7_c_tintegral >=", value, "v7CTintegral");
            return (Criteria) this;
        }

        public Criteria andV7CTintegralLessThan(Integer value) {
            addCriterion("v7_c_tintegral <", value, "v7CTintegral");
            return (Criteria) this;
        }

        public Criteria andV7CTintegralLessThanOrEqualTo(Integer value) {
            addCriterion("v7_c_tintegral <=", value, "v7CTintegral");
            return (Criteria) this;
        }

        public Criteria andV7CTintegralIn(List<Integer> values) {
            addCriterion("v7_c_tintegral in", values, "v7CTintegral");
            return (Criteria) this;
        }

        public Criteria andV7CTintegralNotIn(List<Integer> values) {
            addCriterion("v7_c_tintegral not in", values, "v7CTintegral");
            return (Criteria) this;
        }

        public Criteria andV7CTintegralBetween(Integer value1, Integer value2) {
            addCriterion("v7_c_tintegral between", value1, value2, "v7CTintegral");
            return (Criteria) this;
        }

        public Criteria andV7CTintegralNotBetween(Integer value1, Integer value2) {
            addCriterion("v7_c_tintegral not between", value1, value2, "v7CTintegral");
            return (Criteria) this;
        }

        public Criteria andV7CStatusIsNull() {
            addCriterion("v7_c_status is null");
            return (Criteria) this;
        }

        public Criteria andV7CStatusIsNotNull() {
            addCriterion("v7_c_status is not null");
            return (Criteria) this;
        }

        public Criteria andV7CStatusEqualTo(Integer value) {
            addCriterion("v7_c_status =", value, "v7CStatus");
            return (Criteria) this;
        }

        public Criteria andV7CStatusNotEqualTo(Integer value) {
            addCriterion("v7_c_status <>", value, "v7CStatus");
            return (Criteria) this;
        }

        public Criteria andV7CStatusGreaterThan(Integer value) {
            addCriterion("v7_c_status >", value, "v7CStatus");
            return (Criteria) this;
        }

        public Criteria andV7CStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("v7_c_status >=", value, "v7CStatus");
            return (Criteria) this;
        }

        public Criteria andV7CStatusLessThan(Integer value) {
            addCriterion("v7_c_status <", value, "v7CStatus");
            return (Criteria) this;
        }

        public Criteria andV7CStatusLessThanOrEqualTo(Integer value) {
            addCriterion("v7_c_status <=", value, "v7CStatus");
            return (Criteria) this;
        }

        public Criteria andV7CStatusIn(List<Integer> values) {
            addCriterion("v7_c_status in", values, "v7CStatus");
            return (Criteria) this;
        }

        public Criteria andV7CStatusNotIn(List<Integer> values) {
            addCriterion("v7_c_status not in", values, "v7CStatus");
            return (Criteria) this;
        }

        public Criteria andV7CStatusBetween(Integer value1, Integer value2) {
            addCriterion("v7_c_status between", value1, value2, "v7CStatus");
            return (Criteria) this;
        }

        public Criteria andV7CStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("v7_c_status not between", value1, value2, "v7CStatus");
            return (Criteria) this;
        }

        public Criteria andV7PkMemberIsNull() {
            addCriterion("v7_pk_member is null");
            return (Criteria) this;
        }

        public Criteria andV7PkMemberIsNotNull() {
            addCriterion("v7_pk_member is not null");
            return (Criteria) this;
        }

        public Criteria andV7PkMemberEqualTo(String value) {
            addCriterion("v7_pk_member =", value, "v7PkMember");
            return (Criteria) this;
        }

        public Criteria andV7PkMemberNotEqualTo(String value) {
            addCriterion("v7_pk_member <>", value, "v7PkMember");
            return (Criteria) this;
        }

        public Criteria andV7PkMemberGreaterThan(String value) {
            addCriterion("v7_pk_member >", value, "v7PkMember");
            return (Criteria) this;
        }

        public Criteria andV7PkMemberGreaterThanOrEqualTo(String value) {
            addCriterion("v7_pk_member >=", value, "v7PkMember");
            return (Criteria) this;
        }

        public Criteria andV7PkMemberLessThan(String value) {
            addCriterion("v7_pk_member <", value, "v7PkMember");
            return (Criteria) this;
        }

        public Criteria andV7PkMemberLessThanOrEqualTo(String value) {
            addCriterion("v7_pk_member <=", value, "v7PkMember");
            return (Criteria) this;
        }

        public Criteria andV7PkMemberLike(String value) {
            addCriterion("v7_pk_member like", value, "v7PkMember");
            return (Criteria) this;
        }

        public Criteria andV7PkMemberNotLike(String value) {
            addCriterion("v7_pk_member not like", value, "v7PkMember");
            return (Criteria) this;
        }

        public Criteria andV7PkMemberIn(List<String> values) {
            addCriterion("v7_pk_member in", values, "v7PkMember");
            return (Criteria) this;
        }

        public Criteria andV7PkMemberNotIn(List<String> values) {
            addCriterion("v7_pk_member not in", values, "v7PkMember");
            return (Criteria) this;
        }

        public Criteria andV7PkMemberBetween(String value1, String value2) {
            addCriterion("v7_pk_member between", value1, value2, "v7PkMember");
            return (Criteria) this;
        }

        public Criteria andV7PkMemberNotBetween(String value1, String value2) {
            addCriterion("v7_pk_member not between", value1, value2, "v7PkMember");
            return (Criteria) this;
        }

        public Criteria andV7CRemarksIsNull() {
            addCriterion("v7_c_remarks is null");
            return (Criteria) this;
        }

        public Criteria andV7CRemarksIsNotNull() {
            addCriterion("v7_c_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andV7CRemarksEqualTo(String value) {
            addCriterion("v7_c_remarks =", value, "v7CRemarks");
            return (Criteria) this;
        }

        public Criteria andV7CRemarksNotEqualTo(String value) {
            addCriterion("v7_c_remarks <>", value, "v7CRemarks");
            return (Criteria) this;
        }

        public Criteria andV7CRemarksGreaterThan(String value) {
            addCriterion("v7_c_remarks >", value, "v7CRemarks");
            return (Criteria) this;
        }

        public Criteria andV7CRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("v7_c_remarks >=", value, "v7CRemarks");
            return (Criteria) this;
        }

        public Criteria andV7CRemarksLessThan(String value) {
            addCriterion("v7_c_remarks <", value, "v7CRemarks");
            return (Criteria) this;
        }

        public Criteria andV7CRemarksLessThanOrEqualTo(String value) {
            addCriterion("v7_c_remarks <=", value, "v7CRemarks");
            return (Criteria) this;
        }

        public Criteria andV7CRemarksLike(String value) {
            addCriterion("v7_c_remarks like", value, "v7CRemarks");
            return (Criteria) this;
        }

        public Criteria andV7CRemarksNotLike(String value) {
            addCriterion("v7_c_remarks not like", value, "v7CRemarks");
            return (Criteria) this;
        }

        public Criteria andV7CRemarksIn(List<String> values) {
            addCriterion("v7_c_remarks in", values, "v7CRemarks");
            return (Criteria) this;
        }

        public Criteria andV7CRemarksNotIn(List<String> values) {
            addCriterion("v7_c_remarks not in", values, "v7CRemarks");
            return (Criteria) this;
        }

        public Criteria andV7CRemarksBetween(String value1, String value2) {
            addCriterion("v7_c_remarks between", value1, value2, "v7CRemarks");
            return (Criteria) this;
        }

        public Criteria andV7CRemarksNotBetween(String value1, String value2) {
            addCriterion("v7_c_remarks not between", value1, value2, "v7CRemarks");
            return (Criteria) this;
        }

        public Criteria andExtends1IsNull() {
            addCriterion("extends1 is null");
            return (Criteria) this;
        }

        public Criteria andExtends1IsNotNull() {
            addCriterion("extends1 is not null");
            return (Criteria) this;
        }

        public Criteria andExtends1EqualTo(String value) {
            addCriterion("extends1 =", value, "extends1");
            return (Criteria) this;
        }

        public Criteria andExtends1NotEqualTo(String value) {
            addCriterion("extends1 <>", value, "extends1");
            return (Criteria) this;
        }

        public Criteria andExtends1GreaterThan(String value) {
            addCriterion("extends1 >", value, "extends1");
            return (Criteria) this;
        }

        public Criteria andExtends1GreaterThanOrEqualTo(String value) {
            addCriterion("extends1 >=", value, "extends1");
            return (Criteria) this;
        }

        public Criteria andExtends1LessThan(String value) {
            addCriterion("extends1 <", value, "extends1");
            return (Criteria) this;
        }

        public Criteria andExtends1LessThanOrEqualTo(String value) {
            addCriterion("extends1 <=", value, "extends1");
            return (Criteria) this;
        }

        public Criteria andExtends1Like(String value) {
            addCriterion("extends1 like", value, "extends1");
            return (Criteria) this;
        }

        public Criteria andExtends1NotLike(String value) {
            addCriterion("extends1 not like", value, "extends1");
            return (Criteria) this;
        }

        public Criteria andExtends1In(List<String> values) {
            addCriterion("extends1 in", values, "extends1");
            return (Criteria) this;
        }

        public Criteria andExtends1NotIn(List<String> values) {
            addCriterion("extends1 not in", values, "extends1");
            return (Criteria) this;
        }

        public Criteria andExtends1Between(String value1, String value2) {
            addCriterion("extends1 between", value1, value2, "extends1");
            return (Criteria) this;
        }

        public Criteria andExtends1NotBetween(String value1, String value2) {
            addCriterion("extends1 not between", value1, value2, "extends1");
            return (Criteria) this;
        }

        public Criteria andExtends2IsNull() {
            addCriterion("extends2 is null");
            return (Criteria) this;
        }

        public Criteria andExtends2IsNotNull() {
            addCriterion("extends2 is not null");
            return (Criteria) this;
        }

        public Criteria andExtends2EqualTo(String value) {
            addCriterion("extends2 =", value, "extends2");
            return (Criteria) this;
        }

        public Criteria andExtends2NotEqualTo(String value) {
            addCriterion("extends2 <>", value, "extends2");
            return (Criteria) this;
        }

        public Criteria andExtends2GreaterThan(String value) {
            addCriterion("extends2 >", value, "extends2");
            return (Criteria) this;
        }

        public Criteria andExtends2GreaterThanOrEqualTo(String value) {
            addCriterion("extends2 >=", value, "extends2");
            return (Criteria) this;
        }

        public Criteria andExtends2LessThan(String value) {
            addCriterion("extends2 <", value, "extends2");
            return (Criteria) this;
        }

        public Criteria andExtends2LessThanOrEqualTo(String value) {
            addCriterion("extends2 <=", value, "extends2");
            return (Criteria) this;
        }

        public Criteria andExtends2Like(String value) {
            addCriterion("extends2 like", value, "extends2");
            return (Criteria) this;
        }

        public Criteria andExtends2NotLike(String value) {
            addCriterion("extends2 not like", value, "extends2");
            return (Criteria) this;
        }

        public Criteria andExtends2In(List<String> values) {
            addCriterion("extends2 in", values, "extends2");
            return (Criteria) this;
        }

        public Criteria andExtends2NotIn(List<String> values) {
            addCriterion("extends2 not in", values, "extends2");
            return (Criteria) this;
        }

        public Criteria andExtends2Between(String value1, String value2) {
            addCriterion("extends2 between", value1, value2, "extends2");
            return (Criteria) this;
        }

        public Criteria andExtends2NotBetween(String value1, String value2) {
            addCriterion("extends2 not between", value1, value2, "extends2");
            return (Criteria) this;
        }

        public Criteria andExtends3IsNull() {
            addCriterion("extends3 is null");
            return (Criteria) this;
        }

        public Criteria andExtends3IsNotNull() {
            addCriterion("extends3 is not null");
            return (Criteria) this;
        }

        public Criteria andExtends3EqualTo(String value) {
            addCriterion("extends3 =", value, "extends3");
            return (Criteria) this;
        }

        public Criteria andExtends3NotEqualTo(String value) {
            addCriterion("extends3 <>", value, "extends3");
            return (Criteria) this;
        }

        public Criteria andExtends3GreaterThan(String value) {
            addCriterion("extends3 >", value, "extends3");
            return (Criteria) this;
        }

        public Criteria andExtends3GreaterThanOrEqualTo(String value) {
            addCriterion("extends3 >=", value, "extends3");
            return (Criteria) this;
        }

        public Criteria andExtends3LessThan(String value) {
            addCriterion("extends3 <", value, "extends3");
            return (Criteria) this;
        }

        public Criteria andExtends3LessThanOrEqualTo(String value) {
            addCriterion("extends3 <=", value, "extends3");
            return (Criteria) this;
        }

        public Criteria andExtends3Like(String value) {
            addCriterion("extends3 like", value, "extends3");
            return (Criteria) this;
        }

        public Criteria andExtends3NotLike(String value) {
            addCriterion("extends3 not like", value, "extends3");
            return (Criteria) this;
        }

        public Criteria andExtends3In(List<String> values) {
            addCriterion("extends3 in", values, "extends3");
            return (Criteria) this;
        }

        public Criteria andExtends3NotIn(List<String> values) {
            addCriterion("extends3 not in", values, "extends3");
            return (Criteria) this;
        }

        public Criteria andExtends3Between(String value1, String value2) {
            addCriterion("extends3 between", value1, value2, "extends3");
            return (Criteria) this;
        }

        public Criteria andExtends3NotBetween(String value1, String value2) {
            addCriterion("extends3 not between", value1, value2, "extends3");
            return (Criteria) this;
        }

        public Criteria andExtends4IsNull() {
            addCriterion("extends4 is null");
            return (Criteria) this;
        }

        public Criteria andExtends4IsNotNull() {
            addCriterion("extends4 is not null");
            return (Criteria) this;
        }

        public Criteria andExtends4EqualTo(String value) {
            addCriterion("extends4 =", value, "extends4");
            return (Criteria) this;
        }

        public Criteria andExtends4NotEqualTo(String value) {
            addCriterion("extends4 <>", value, "extends4");
            return (Criteria) this;
        }

        public Criteria andExtends4GreaterThan(String value) {
            addCriterion("extends4 >", value, "extends4");
            return (Criteria) this;
        }

        public Criteria andExtends4GreaterThanOrEqualTo(String value) {
            addCriterion("extends4 >=", value, "extends4");
            return (Criteria) this;
        }

        public Criteria andExtends4LessThan(String value) {
            addCriterion("extends4 <", value, "extends4");
            return (Criteria) this;
        }

        public Criteria andExtends4LessThanOrEqualTo(String value) {
            addCriterion("extends4 <=", value, "extends4");
            return (Criteria) this;
        }

        public Criteria andExtends4Like(String value) {
            addCriterion("extends4 like", value, "extends4");
            return (Criteria) this;
        }

        public Criteria andExtends4NotLike(String value) {
            addCriterion("extends4 not like", value, "extends4");
            return (Criteria) this;
        }

        public Criteria andExtends4In(List<String> values) {
            addCriterion("extends4 in", values, "extends4");
            return (Criteria) this;
        }

        public Criteria andExtends4NotIn(List<String> values) {
            addCriterion("extends4 not in", values, "extends4");
            return (Criteria) this;
        }

        public Criteria andExtends4Between(String value1, String value2) {
            addCriterion("extends4 between", value1, value2, "extends4");
            return (Criteria) this;
        }

        public Criteria andExtends4NotBetween(String value1, String value2) {
            addCriterion("extends4 not between", value1, value2, "extends4");
            return (Criteria) this;
        }

        public Criteria andExtends5IsNull() {
            addCriterion("extends5 is null");
            return (Criteria) this;
        }

        public Criteria andExtends5IsNotNull() {
            addCriterion("extends5 is not null");
            return (Criteria) this;
        }

        public Criteria andExtends5EqualTo(String value) {
            addCriterion("extends5 =", value, "extends5");
            return (Criteria) this;
        }

        public Criteria andExtends5NotEqualTo(String value) {
            addCriterion("extends5 <>", value, "extends5");
            return (Criteria) this;
        }

        public Criteria andExtends5GreaterThan(String value) {
            addCriterion("extends5 >", value, "extends5");
            return (Criteria) this;
        }

        public Criteria andExtends5GreaterThanOrEqualTo(String value) {
            addCriterion("extends5 >=", value, "extends5");
            return (Criteria) this;
        }

        public Criteria andExtends5LessThan(String value) {
            addCriterion("extends5 <", value, "extends5");
            return (Criteria) this;
        }

        public Criteria andExtends5LessThanOrEqualTo(String value) {
            addCriterion("extends5 <=", value, "extends5");
            return (Criteria) this;
        }

        public Criteria andExtends5Like(String value) {
            addCriterion("extends5 like", value, "extends5");
            return (Criteria) this;
        }

        public Criteria andExtends5NotLike(String value) {
            addCriterion("extends5 not like", value, "extends5");
            return (Criteria) this;
        }

        public Criteria andExtends5In(List<String> values) {
            addCriterion("extends5 in", values, "extends5");
            return (Criteria) this;
        }

        public Criteria andExtends5NotIn(List<String> values) {
            addCriterion("extends5 not in", values, "extends5");
            return (Criteria) this;
        }

        public Criteria andExtends5Between(String value1, String value2) {
            addCriterion("extends5 between", value1, value2, "extends5");
            return (Criteria) this;
        }

        public Criteria andExtends5NotBetween(String value1, String value2) {
            addCriterion("extends5 not between", value1, value2, "extends5");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}