package com.horse.v7mc.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class V7HandleCardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public V7HandleCardExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andV7HCardNumIsNull() {
            addCriterion("v7_h_card_num is null");
            return (Criteria) this;
        }

        public Criteria andV7HCardNumIsNotNull() {
            addCriterion("v7_h_card_num is not null");
            return (Criteria) this;
        }

        public Criteria andV7HCardNumEqualTo(String value) {
            addCriterion("v7_h_card_num =", value, "v7HCardNum");
            return (Criteria) this;
        }

        public Criteria andV7HCardNumNotEqualTo(String value) {
            addCriterion("v7_h_card_num <>", value, "v7HCardNum");
            return (Criteria) this;
        }

        public Criteria andV7HCardNumGreaterThan(String value) {
            addCriterion("v7_h_card_num >", value, "v7HCardNum");
            return (Criteria) this;
        }

        public Criteria andV7HCardNumGreaterThanOrEqualTo(String value) {
            addCriterion("v7_h_card_num >=", value, "v7HCardNum");
            return (Criteria) this;
        }

        public Criteria andV7HCardNumLessThan(String value) {
            addCriterion("v7_h_card_num <", value, "v7HCardNum");
            return (Criteria) this;
        }

        public Criteria andV7HCardNumLessThanOrEqualTo(String value) {
            addCriterion("v7_h_card_num <=", value, "v7HCardNum");
            return (Criteria) this;
        }

        public Criteria andV7HCardNumLike(String value) {
            addCriterion("v7_h_card_num like", value, "v7HCardNum");
            return (Criteria) this;
        }

        public Criteria andV7HCardNumNotLike(String value) {
            addCriterion("v7_h_card_num not like", value, "v7HCardNum");
            return (Criteria) this;
        }

        public Criteria andV7HCardNumIn(List<String> values) {
            addCriterion("v7_h_card_num in", values, "v7HCardNum");
            return (Criteria) this;
        }

        public Criteria andV7HCardNumNotIn(List<String> values) {
            addCriterion("v7_h_card_num not in", values, "v7HCardNum");
            return (Criteria) this;
        }

        public Criteria andV7HCardNumBetween(String value1, String value2) {
            addCriterion("v7_h_card_num between", value1, value2, "v7HCardNum");
            return (Criteria) this;
        }

        public Criteria andV7HCardNumNotBetween(String value1, String value2) {
            addCriterion("v7_h_card_num not between", value1, value2, "v7HCardNum");
            return (Criteria) this;
        }

        public Criteria andV7HHandleTypeIsNull() {
            addCriterion("v7_h_handle_type is null");
            return (Criteria) this;
        }

        public Criteria andV7HHandleTypeIsNotNull() {
            addCriterion("v7_h_handle_type is not null");
            return (Criteria) this;
        }

        public Criteria andV7HHandleTypeEqualTo(Integer value) {
            addCriterion("v7_h_handle_type =", value, "v7HHandleType");
            return (Criteria) this;
        }

        public Criteria andV7HHandleTypeNotEqualTo(Integer value) {
            addCriterion("v7_h_handle_type <>", value, "v7HHandleType");
            return (Criteria) this;
        }

        public Criteria andV7HHandleTypeGreaterThan(Integer value) {
            addCriterion("v7_h_handle_type >", value, "v7HHandleType");
            return (Criteria) this;
        }

        public Criteria andV7HHandleTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("v7_h_handle_type >=", value, "v7HHandleType");
            return (Criteria) this;
        }

        public Criteria andV7HHandleTypeLessThan(Integer value) {
            addCriterion("v7_h_handle_type <", value, "v7HHandleType");
            return (Criteria) this;
        }

        public Criteria andV7HHandleTypeLessThanOrEqualTo(Integer value) {
            addCriterion("v7_h_handle_type <=", value, "v7HHandleType");
            return (Criteria) this;
        }

        public Criteria andV7HHandleTypeIn(List<Integer> values) {
            addCriterion("v7_h_handle_type in", values, "v7HHandleType");
            return (Criteria) this;
        }

        public Criteria andV7HHandleTypeNotIn(List<Integer> values) {
            addCriterion("v7_h_handle_type not in", values, "v7HHandleType");
            return (Criteria) this;
        }

        public Criteria andV7HHandleTypeBetween(Integer value1, Integer value2) {
            addCriterion("v7_h_handle_type between", value1, value2, "v7HHandleType");
            return (Criteria) this;
        }

        public Criteria andV7HHandleTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("v7_h_handle_type not between", value1, value2, "v7HHandleType");
            return (Criteria) this;
        }

        public Criteria andV7HCardTypeIsNull() {
            addCriterion("v7_h_card_type is null");
            return (Criteria) this;
        }

        public Criteria andV7HCardTypeIsNotNull() {
            addCriterion("v7_h_card_type is not null");
            return (Criteria) this;
        }

        public Criteria andV7HCardTypeEqualTo(Integer value) {
            addCriterion("v7_h_card_type =", value, "v7HCardType");
            return (Criteria) this;
        }

        public Criteria andV7HCardTypeNotEqualTo(Integer value) {
            addCriterion("v7_h_card_type <>", value, "v7HCardType");
            return (Criteria) this;
        }

        public Criteria andV7HCardTypeGreaterThan(Integer value) {
            addCriterion("v7_h_card_type >", value, "v7HCardType");
            return (Criteria) this;
        }

        public Criteria andV7HCardTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("v7_h_card_type >=", value, "v7HCardType");
            return (Criteria) this;
        }

        public Criteria andV7HCardTypeLessThan(Integer value) {
            addCriterion("v7_h_card_type <", value, "v7HCardType");
            return (Criteria) this;
        }

        public Criteria andV7HCardTypeLessThanOrEqualTo(Integer value) {
            addCriterion("v7_h_card_type <=", value, "v7HCardType");
            return (Criteria) this;
        }

        public Criteria andV7HCardTypeIn(List<Integer> values) {
            addCriterion("v7_h_card_type in", values, "v7HCardType");
            return (Criteria) this;
        }

        public Criteria andV7HCardTypeNotIn(List<Integer> values) {
            addCriterion("v7_h_card_type not in", values, "v7HCardType");
            return (Criteria) this;
        }

        public Criteria andV7HCardTypeBetween(Integer value1, Integer value2) {
            addCriterion("v7_h_card_type between", value1, value2, "v7HCardType");
            return (Criteria) this;
        }

        public Criteria andV7HCardTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("v7_h_card_type not between", value1, value2, "v7HCardType");
            return (Criteria) this;
        }

        public Criteria andV7HMoneyIsNull() {
            addCriterion("v7_h_money is null");
            return (Criteria) this;
        }

        public Criteria andV7HMoneyIsNotNull() {
            addCriterion("v7_h_money is not null");
            return (Criteria) this;
        }

        public Criteria andV7HMoneyEqualTo(Double value) {
            addCriterion("v7_h_money =", value, "v7HMoney");
            return (Criteria) this;
        }

        public Criteria andV7HMoneyNotEqualTo(Double value) {
            addCriterion("v7_h_money <>", value, "v7HMoney");
            return (Criteria) this;
        }

        public Criteria andV7HMoneyGreaterThan(Double value) {
            addCriterion("v7_h_money >", value, "v7HMoney");
            return (Criteria) this;
        }

        public Criteria andV7HMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("v7_h_money >=", value, "v7HMoney");
            return (Criteria) this;
        }

        public Criteria andV7HMoneyLessThan(Double value) {
            addCriterion("v7_h_money <", value, "v7HMoney");
            return (Criteria) this;
        }

        public Criteria andV7HMoneyLessThanOrEqualTo(Double value) {
            addCriterion("v7_h_money <=", value, "v7HMoney");
            return (Criteria) this;
        }

        public Criteria andV7HMoneyIn(List<Double> values) {
            addCriterion("v7_h_money in", values, "v7HMoney");
            return (Criteria) this;
        }

        public Criteria andV7HMoneyNotIn(List<Double> values) {
            addCriterion("v7_h_money not in", values, "v7HMoney");
            return (Criteria) this;
        }

        public Criteria andV7HMoneyBetween(Double value1, Double value2) {
            addCriterion("v7_h_money between", value1, value2, "v7HMoney");
            return (Criteria) this;
        }

        public Criteria andV7HMoneyNotBetween(Double value1, Double value2) {
            addCriterion("v7_h_money not between", value1, value2, "v7HMoney");
            return (Criteria) this;
        }

        public Criteria andV7HHandleUserIsNull() {
            addCriterion("v7_h_handle_user is null");
            return (Criteria) this;
        }

        public Criteria andV7HHandleUserIsNotNull() {
            addCriterion("v7_h_handle_user is not null");
            return (Criteria) this;
        }

        public Criteria andV7HHandleUserEqualTo(String value) {
            addCriterion("v7_h_handle_user =", value, "v7HHandleUser");
            return (Criteria) this;
        }

        public Criteria andV7HHandleUserNotEqualTo(String value) {
            addCriterion("v7_h_handle_user <>", value, "v7HHandleUser");
            return (Criteria) this;
        }

        public Criteria andV7HHandleUserGreaterThan(String value) {
            addCriterion("v7_h_handle_user >", value, "v7HHandleUser");
            return (Criteria) this;
        }

        public Criteria andV7HHandleUserGreaterThanOrEqualTo(String value) {
            addCriterion("v7_h_handle_user >=", value, "v7HHandleUser");
            return (Criteria) this;
        }

        public Criteria andV7HHandleUserLessThan(String value) {
            addCriterion("v7_h_handle_user <", value, "v7HHandleUser");
            return (Criteria) this;
        }

        public Criteria andV7HHandleUserLessThanOrEqualTo(String value) {
            addCriterion("v7_h_handle_user <=", value, "v7HHandleUser");
            return (Criteria) this;
        }

        public Criteria andV7HHandleUserLike(String value) {
            addCriterion("v7_h_handle_user like", value, "v7HHandleUser");
            return (Criteria) this;
        }

        public Criteria andV7HHandleUserNotLike(String value) {
            addCriterion("v7_h_handle_user not like", value, "v7HHandleUser");
            return (Criteria) this;
        }

        public Criteria andV7HHandleUserIn(List<String> values) {
            addCriterion("v7_h_handle_user in", values, "v7HHandleUser");
            return (Criteria) this;
        }

        public Criteria andV7HHandleUserNotIn(List<String> values) {
            addCriterion("v7_h_handle_user not in", values, "v7HHandleUser");
            return (Criteria) this;
        }

        public Criteria andV7HHandleUserBetween(String value1, String value2) {
            addCriterion("v7_h_handle_user between", value1, value2, "v7HHandleUser");
            return (Criteria) this;
        }

        public Criteria andV7HHandleUserNotBetween(String value1, String value2) {
            addCriterion("v7_h_handle_user not between", value1, value2, "v7HHandleUser");
            return (Criteria) this;
        }

        public Criteria andV7HOperUserIsNull() {
            addCriterion("v7_h_oper_user is null");
            return (Criteria) this;
        }

        public Criteria andV7HOperUserIsNotNull() {
            addCriterion("v7_h_oper_user is not null");
            return (Criteria) this;
        }

        public Criteria andV7HOperUserEqualTo(String value) {
            addCriterion("v7_h_oper_user =", value, "v7HOperUser");
            return (Criteria) this;
        }

        public Criteria andV7HOperUserNotEqualTo(String value) {
            addCriterion("v7_h_oper_user <>", value, "v7HOperUser");
            return (Criteria) this;
        }

        public Criteria andV7HOperUserGreaterThan(String value) {
            addCriterion("v7_h_oper_user >", value, "v7HOperUser");
            return (Criteria) this;
        }

        public Criteria andV7HOperUserGreaterThanOrEqualTo(String value) {
            addCriterion("v7_h_oper_user >=", value, "v7HOperUser");
            return (Criteria) this;
        }

        public Criteria andV7HOperUserLessThan(String value) {
            addCriterion("v7_h_oper_user <", value, "v7HOperUser");
            return (Criteria) this;
        }

        public Criteria andV7HOperUserLessThanOrEqualTo(String value) {
            addCriterion("v7_h_oper_user <=", value, "v7HOperUser");
            return (Criteria) this;
        }

        public Criteria andV7HOperUserLike(String value) {
            addCriterion("v7_h_oper_user like", value, "v7HOperUser");
            return (Criteria) this;
        }

        public Criteria andV7HOperUserNotLike(String value) {
            addCriterion("v7_h_oper_user not like", value, "v7HOperUser");
            return (Criteria) this;
        }

        public Criteria andV7HOperUserIn(List<String> values) {
            addCriterion("v7_h_oper_user in", values, "v7HOperUser");
            return (Criteria) this;
        }

        public Criteria andV7HOperUserNotIn(List<String> values) {
            addCriterion("v7_h_oper_user not in", values, "v7HOperUser");
            return (Criteria) this;
        }

        public Criteria andV7HOperUserBetween(String value1, String value2) {
            addCriterion("v7_h_oper_user between", value1, value2, "v7HOperUser");
            return (Criteria) this;
        }

        public Criteria andV7HOperUserNotBetween(String value1, String value2) {
            addCriterion("v7_h_oper_user not between", value1, value2, "v7HOperUser");
            return (Criteria) this;
        }

        public Criteria andV7HOperTimeIsNull() {
            addCriterion("v7_h_oper_time is null");
            return (Criteria) this;
        }

        public Criteria andV7HOperTimeIsNotNull() {
            addCriterion("v7_h_oper_time is not null");
            return (Criteria) this;
        }

        public Criteria andV7HOperTimeEqualTo(Date value) {
            addCriterion("v7_h_oper_time =", value, "v7HOperTime");
            return (Criteria) this;
        }

        public Criteria andV7HOperTimeNotEqualTo(Date value) {
            addCriterion("v7_h_oper_time <>", value, "v7HOperTime");
            return (Criteria) this;
        }

        public Criteria andV7HOperTimeGreaterThan(Date value) {
            addCriterion("v7_h_oper_time >", value, "v7HOperTime");
            return (Criteria) this;
        }

        public Criteria andV7HOperTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("v7_h_oper_time >=", value, "v7HOperTime");
            return (Criteria) this;
        }

        public Criteria andV7HOperTimeLessThan(Date value) {
            addCriterion("v7_h_oper_time <", value, "v7HOperTime");
            return (Criteria) this;
        }

        public Criteria andV7HOperTimeLessThanOrEqualTo(Date value) {
            addCriterion("v7_h_oper_time <=", value, "v7HOperTime");
            return (Criteria) this;
        }

        public Criteria andV7HOperTimeIn(List<Date> values) {
            addCriterion("v7_h_oper_time in", values, "v7HOperTime");
            return (Criteria) this;
        }

        public Criteria andV7HOperTimeNotIn(List<Date> values) {
            addCriterion("v7_h_oper_time not in", values, "v7HOperTime");
            return (Criteria) this;
        }

        public Criteria andV7HOperTimeBetween(Date value1, Date value2) {
            addCriterion("v7_h_oper_time between", value1, value2, "v7HOperTime");
            return (Criteria) this;
        }

        public Criteria andV7HOperTimeNotBetween(Date value1, Date value2) {
            addCriterion("v7_h_oper_time not between", value1, value2, "v7HOperTime");
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