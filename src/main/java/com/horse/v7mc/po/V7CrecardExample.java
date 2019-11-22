package com.horse.v7mc.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class V7CrecardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public V7CrecardExample() {
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

        public Criteria andV7ROtypeIsNull() {
            addCriterion("v7_r_otype is null");
            return (Criteria) this;
        }

        public Criteria andV7ROtypeIsNotNull() {
            addCriterion("v7_r_otype is not null");
            return (Criteria) this;
        }

        public Criteria andV7ROtypeEqualTo(String value) {
            addCriterion("v7_r_otype =", value, "v7ROtype");
            return (Criteria) this;
        }

        public Criteria andV7ROtypeNotEqualTo(String value) {
            addCriterion("v7_r_otype <>", value, "v7ROtype");
            return (Criteria) this;
        }

        public Criteria andV7ROtypeGreaterThan(String value) {
            addCriterion("v7_r_otype >", value, "v7ROtype");
            return (Criteria) this;
        }

        public Criteria andV7ROtypeGreaterThanOrEqualTo(String value) {
            addCriterion("v7_r_otype >=", value, "v7ROtype");
            return (Criteria) this;
        }

        public Criteria andV7ROtypeLessThan(String value) {
            addCriterion("v7_r_otype <", value, "v7ROtype");
            return (Criteria) this;
        }

        public Criteria andV7ROtypeLessThanOrEqualTo(String value) {
            addCriterion("v7_r_otype <=", value, "v7ROtype");
            return (Criteria) this;
        }

        public Criteria andV7ROtypeLike(String value) {
            addCriterion("v7_r_otype like", value, "v7ROtype");
            return (Criteria) this;
        }

        public Criteria andV7ROtypeNotLike(String value) {
            addCriterion("v7_r_otype not like", value, "v7ROtype");
            return (Criteria) this;
        }

        public Criteria andV7ROtypeIn(List<String> values) {
            addCriterion("v7_r_otype in", values, "v7ROtype");
            return (Criteria) this;
        }

        public Criteria andV7ROtypeNotIn(List<String> values) {
            addCriterion("v7_r_otype not in", values, "v7ROtype");
            return (Criteria) this;
        }

        public Criteria andV7ROtypeBetween(String value1, String value2) {
            addCriterion("v7_r_otype between", value1, value2, "v7ROtype");
            return (Criteria) this;
        }

        public Criteria andV7ROtypeNotBetween(String value1, String value2) {
            addCriterion("v7_r_otype not between", value1, value2, "v7ROtype");
            return (Criteria) this;
        }

        public Criteria andV7RCardtypeIsNull() {
            addCriterion("v7_r_cardtype is null");
            return (Criteria) this;
        }

        public Criteria andV7RCardtypeIsNotNull() {
            addCriterion("v7_r_cardtype is not null");
            return (Criteria) this;
        }

        public Criteria andV7RCardtypeEqualTo(Integer value) {
            addCriterion("v7_r_cardtype =", value, "v7RCardtype");
            return (Criteria) this;
        }

        public Criteria andV7RCardtypeNotEqualTo(Integer value) {
            addCriterion("v7_r_cardtype <>", value, "v7RCardtype");
            return (Criteria) this;
        }

        public Criteria andV7RCardtypeGreaterThan(Integer value) {
            addCriterion("v7_r_cardtype >", value, "v7RCardtype");
            return (Criteria) this;
        }

        public Criteria andV7RCardtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("v7_r_cardtype >=", value, "v7RCardtype");
            return (Criteria) this;
        }

        public Criteria andV7RCardtypeLessThan(Integer value) {
            addCriterion("v7_r_cardtype <", value, "v7RCardtype");
            return (Criteria) this;
        }

        public Criteria andV7RCardtypeLessThanOrEqualTo(Integer value) {
            addCriterion("v7_r_cardtype <=", value, "v7RCardtype");
            return (Criteria) this;
        }

        public Criteria andV7RCardtypeIn(List<Integer> values) {
            addCriterion("v7_r_cardtype in", values, "v7RCardtype");
            return (Criteria) this;
        }

        public Criteria andV7RCardtypeNotIn(List<Integer> values) {
            addCriterion("v7_r_cardtype not in", values, "v7RCardtype");
            return (Criteria) this;
        }

        public Criteria andV7RCardtypeBetween(Integer value1, Integer value2) {
            addCriterion("v7_r_cardtype between", value1, value2, "v7RCardtype");
            return (Criteria) this;
        }

        public Criteria andV7RCardtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("v7_r_cardtype not between", value1, value2, "v7RCardtype");
            return (Criteria) this;
        }

        public Criteria andV7ROmoneyIsNull() {
            addCriterion("v7_r_omoney is null");
            return (Criteria) this;
        }

        public Criteria andV7ROmoneyIsNotNull() {
            addCriterion("v7_r_omoney is not null");
            return (Criteria) this;
        }

        public Criteria andV7ROmoneyEqualTo(Double value) {
            addCriterion("v7_r_omoney =", value, "v7ROmoney");
            return (Criteria) this;
        }

        public Criteria andV7ROmoneyNotEqualTo(Double value) {
            addCriterion("v7_r_omoney <>", value, "v7ROmoney");
            return (Criteria) this;
        }

        public Criteria andV7ROmoneyGreaterThan(Double value) {
            addCriterion("v7_r_omoney >", value, "v7ROmoney");
            return (Criteria) this;
        }

        public Criteria andV7ROmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("v7_r_omoney >=", value, "v7ROmoney");
            return (Criteria) this;
        }

        public Criteria andV7ROmoneyLessThan(Double value) {
            addCriterion("v7_r_omoney <", value, "v7ROmoney");
            return (Criteria) this;
        }

        public Criteria andV7ROmoneyLessThanOrEqualTo(Double value) {
            addCriterion("v7_r_omoney <=", value, "v7ROmoney");
            return (Criteria) this;
        }

        public Criteria andV7ROmoneyIn(List<Double> values) {
            addCriterion("v7_r_omoney in", values, "v7ROmoney");
            return (Criteria) this;
        }

        public Criteria andV7ROmoneyNotIn(List<Double> values) {
            addCriterion("v7_r_omoney not in", values, "v7ROmoney");
            return (Criteria) this;
        }

        public Criteria andV7ROmoneyBetween(Double value1, Double value2) {
            addCriterion("v7_r_omoney between", value1, value2, "v7ROmoney");
            return (Criteria) this;
        }

        public Criteria andV7ROmoneyNotBetween(Double value1, Double value2) {
            addCriterion("v7_r_omoney not between", value1, value2, "v7ROmoney");
            return (Criteria) this;
        }

        public Criteria andV7ROperUserIsNull() {
            addCriterion("v7_r_oper_user is null");
            return (Criteria) this;
        }

        public Criteria andV7ROperUserIsNotNull() {
            addCriterion("v7_r_oper_user is not null");
            return (Criteria) this;
        }

        public Criteria andV7ROperUserEqualTo(String value) {
            addCriterion("v7_r_oper_user =", value, "v7ROperUser");
            return (Criteria) this;
        }

        public Criteria andV7ROperUserNotEqualTo(String value) {
            addCriterion("v7_r_oper_user <>", value, "v7ROperUser");
            return (Criteria) this;
        }

        public Criteria andV7ROperUserGreaterThan(String value) {
            addCriterion("v7_r_oper_user >", value, "v7ROperUser");
            return (Criteria) this;
        }

        public Criteria andV7ROperUserGreaterThanOrEqualTo(String value) {
            addCriterion("v7_r_oper_user >=", value, "v7ROperUser");
            return (Criteria) this;
        }

        public Criteria andV7ROperUserLessThan(String value) {
            addCriterion("v7_r_oper_user <", value, "v7ROperUser");
            return (Criteria) this;
        }

        public Criteria andV7ROperUserLessThanOrEqualTo(String value) {
            addCriterion("v7_r_oper_user <=", value, "v7ROperUser");
            return (Criteria) this;
        }

        public Criteria andV7ROperUserLike(String value) {
            addCriterion("v7_r_oper_user like", value, "v7ROperUser");
            return (Criteria) this;
        }

        public Criteria andV7ROperUserNotLike(String value) {
            addCriterion("v7_r_oper_user not like", value, "v7ROperUser");
            return (Criteria) this;
        }

        public Criteria andV7ROperUserIn(List<String> values) {
            addCriterion("v7_r_oper_user in", values, "v7ROperUser");
            return (Criteria) this;
        }

        public Criteria andV7ROperUserNotIn(List<String> values) {
            addCriterion("v7_r_oper_user not in", values, "v7ROperUser");
            return (Criteria) this;
        }

        public Criteria andV7ROperUserBetween(String value1, String value2) {
            addCriterion("v7_r_oper_user between", value1, value2, "v7ROperUser");
            return (Criteria) this;
        }

        public Criteria andV7ROperUserNotBetween(String value1, String value2) {
            addCriterion("v7_r_oper_user not between", value1, value2, "v7ROperUser");
            return (Criteria) this;
        }

        public Criteria andV7ROperTimeIsNull() {
            addCriterion("v7_r_oper_time is null");
            return (Criteria) this;
        }

        public Criteria andV7ROperTimeIsNotNull() {
            addCriterion("v7_r_oper_time is not null");
            return (Criteria) this;
        }

        public Criteria andV7ROperTimeEqualTo(Date value) {
            addCriterion("v7_r_oper_time =", value, "v7ROperTime");
            return (Criteria) this;
        }

        public Criteria andV7ROperTimeNotEqualTo(Date value) {
            addCriterion("v7_r_oper_time <>", value, "v7ROperTime");
            return (Criteria) this;
        }

        public Criteria andV7ROperTimeGreaterThan(Date value) {
            addCriterion("v7_r_oper_time >", value, "v7ROperTime");
            return (Criteria) this;
        }

        public Criteria andV7ROperTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("v7_r_oper_time >=", value, "v7ROperTime");
            return (Criteria) this;
        }

        public Criteria andV7ROperTimeLessThan(Date value) {
            addCriterion("v7_r_oper_time <", value, "v7ROperTime");
            return (Criteria) this;
        }

        public Criteria andV7ROperTimeLessThanOrEqualTo(Date value) {
            addCriterion("v7_r_oper_time <=", value, "v7ROperTime");
            return (Criteria) this;
        }

        public Criteria andV7ROperTimeIn(List<Date> values) {
            addCriterion("v7_r_oper_time in", values, "v7ROperTime");
            return (Criteria) this;
        }

        public Criteria andV7ROperTimeNotIn(List<Date> values) {
            addCriterion("v7_r_oper_time not in", values, "v7ROperTime");
            return (Criteria) this;
        }

        public Criteria andV7ROperTimeBetween(Date value1, Date value2) {
            addCriterion("v7_r_oper_time between", value1, value2, "v7ROperTime");
            return (Criteria) this;
        }

        public Criteria andV7ROperTimeNotBetween(Date value1, Date value2) {
            addCriterion("v7_r_oper_time not between", value1, value2, "v7ROperTime");
            return (Criteria) this;
        }

        public Criteria andV7RRemarksIsNull() {
            addCriterion("v7_r_remarks is null");
            return (Criteria) this;
        }

        public Criteria andV7RRemarksIsNotNull() {
            addCriterion("v7_r_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andV7RRemarksEqualTo(String value) {
            addCriterion("v7_r_remarks =", value, "v7RRemarks");
            return (Criteria) this;
        }

        public Criteria andV7RRemarksNotEqualTo(String value) {
            addCriterion("v7_r_remarks <>", value, "v7RRemarks");
            return (Criteria) this;
        }

        public Criteria andV7RRemarksGreaterThan(String value) {
            addCriterion("v7_r_remarks >", value, "v7RRemarks");
            return (Criteria) this;
        }

        public Criteria andV7RRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("v7_r_remarks >=", value, "v7RRemarks");
            return (Criteria) this;
        }

        public Criteria andV7RRemarksLessThan(String value) {
            addCriterion("v7_r_remarks <", value, "v7RRemarks");
            return (Criteria) this;
        }

        public Criteria andV7RRemarksLessThanOrEqualTo(String value) {
            addCriterion("v7_r_remarks <=", value, "v7RRemarks");
            return (Criteria) this;
        }

        public Criteria andV7RRemarksLike(String value) {
            addCriterion("v7_r_remarks like", value, "v7RRemarks");
            return (Criteria) this;
        }

        public Criteria andV7RRemarksNotLike(String value) {
            addCriterion("v7_r_remarks not like", value, "v7RRemarks");
            return (Criteria) this;
        }

        public Criteria andV7RRemarksIn(List<String> values) {
            addCriterion("v7_r_remarks in", values, "v7RRemarks");
            return (Criteria) this;
        }

        public Criteria andV7RRemarksNotIn(List<String> values) {
            addCriterion("v7_r_remarks not in", values, "v7RRemarks");
            return (Criteria) this;
        }

        public Criteria andV7RRemarksBetween(String value1, String value2) {
            addCriterion("v7_r_remarks between", value1, value2, "v7RRemarks");
            return (Criteria) this;
        }

        public Criteria andV7RRemarksNotBetween(String value1, String value2) {
            addCriterion("v7_r_remarks not between", value1, value2, "v7RRemarks");
            return (Criteria) this;
        }

        public Criteria andV7PkCardIsNull() {
            addCriterion("v7_pk_card is null");
            return (Criteria) this;
        }

        public Criteria andV7PkCardIsNotNull() {
            addCriterion("v7_pk_card is not null");
            return (Criteria) this;
        }

        public Criteria andV7PkCardEqualTo(String value) {
            addCriterion("v7_pk_card =", value, "v7PkCard");
            return (Criteria) this;
        }

        public Criteria andV7PkCardNotEqualTo(String value) {
            addCriterion("v7_pk_card <>", value, "v7PkCard");
            return (Criteria) this;
        }

        public Criteria andV7PkCardGreaterThan(String value) {
            addCriterion("v7_pk_card >", value, "v7PkCard");
            return (Criteria) this;
        }

        public Criteria andV7PkCardGreaterThanOrEqualTo(String value) {
            addCriterion("v7_pk_card >=", value, "v7PkCard");
            return (Criteria) this;
        }

        public Criteria andV7PkCardLessThan(String value) {
            addCriterion("v7_pk_card <", value, "v7PkCard");
            return (Criteria) this;
        }

        public Criteria andV7PkCardLessThanOrEqualTo(String value) {
            addCriterion("v7_pk_card <=", value, "v7PkCard");
            return (Criteria) this;
        }

        public Criteria andV7PkCardLike(String value) {
            addCriterion("v7_pk_card like", value, "v7PkCard");
            return (Criteria) this;
        }

        public Criteria andV7PkCardNotLike(String value) {
            addCriterion("v7_pk_card not like", value, "v7PkCard");
            return (Criteria) this;
        }

        public Criteria andV7PkCardIn(List<String> values) {
            addCriterion("v7_pk_card in", values, "v7PkCard");
            return (Criteria) this;
        }

        public Criteria andV7PkCardNotIn(List<String> values) {
            addCriterion("v7_pk_card not in", values, "v7PkCard");
            return (Criteria) this;
        }

        public Criteria andV7PkCardBetween(String value1, String value2) {
            addCriterion("v7_pk_card between", value1, value2, "v7PkCard");
            return (Criteria) this;
        }

        public Criteria andV7PkCardNotBetween(String value1, String value2) {
            addCriterion("v7_pk_card not between", value1, value2, "v7PkCard");
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