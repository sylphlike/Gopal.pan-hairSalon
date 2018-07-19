package com.carrey.v7mc.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class V7ChargeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public V7ChargeExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andV7CMonthIsNull() {
            addCriterion("v7_c_month is null");
            return (Criteria) this;
        }

        public Criteria andV7CMonthIsNotNull() {
            addCriterion("v7_c_month is not null");
            return (Criteria) this;
        }

        public Criteria andV7CMonthEqualTo(Date value) {
            addCriterionForJDBCDate("v7_c_month =", value, "v7CMonth");
            return (Criteria) this;
        }

        public Criteria andV7CMonthNotEqualTo(Date value) {
            addCriterionForJDBCDate("v7_c_month <>", value, "v7CMonth");
            return (Criteria) this;
        }

        public Criteria andV7CMonthGreaterThan(Date value) {
            addCriterionForJDBCDate("v7_c_month >", value, "v7CMonth");
            return (Criteria) this;
        }

        public Criteria andV7CMonthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("v7_c_month >=", value, "v7CMonth");
            return (Criteria) this;
        }

        public Criteria andV7CMonthLessThan(Date value) {
            addCriterionForJDBCDate("v7_c_month <", value, "v7CMonth");
            return (Criteria) this;
        }

        public Criteria andV7CMonthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("v7_c_month <=", value, "v7CMonth");
            return (Criteria) this;
        }

        public Criteria andV7CMonthIn(List<Date> values) {
            addCriterionForJDBCDate("v7_c_month in", values, "v7CMonth");
            return (Criteria) this;
        }

        public Criteria andV7CMonthNotIn(List<Date> values) {
            addCriterionForJDBCDate("v7_c_month not in", values, "v7CMonth");
            return (Criteria) this;
        }

        public Criteria andV7CMonthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("v7_c_month between", value1, value2, "v7CMonth");
            return (Criteria) this;
        }

        public Criteria andV7CMonthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("v7_c_month not between", value1, value2, "v7CMonth");
            return (Criteria) this;
        }

        public Criteria andV7CMnumIsNull() {
            addCriterion("v7_c_mnum is null");
            return (Criteria) this;
        }

        public Criteria andV7CMnumIsNotNull() {
            addCriterion("v7_c_mnum is not null");
            return (Criteria) this;
        }

        public Criteria andV7CMnumEqualTo(Integer value) {
            addCriterion("v7_c_mnum =", value, "v7CMnum");
            return (Criteria) this;
        }

        public Criteria andV7CMnumNotEqualTo(Integer value) {
            addCriterion("v7_c_mnum <>", value, "v7CMnum");
            return (Criteria) this;
        }

        public Criteria andV7CMnumGreaterThan(Integer value) {
            addCriterion("v7_c_mnum >", value, "v7CMnum");
            return (Criteria) this;
        }

        public Criteria andV7CMnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("v7_c_mnum >=", value, "v7CMnum");
            return (Criteria) this;
        }

        public Criteria andV7CMnumLessThan(Integer value) {
            addCriterion("v7_c_mnum <", value, "v7CMnum");
            return (Criteria) this;
        }

        public Criteria andV7CMnumLessThanOrEqualTo(Integer value) {
            addCriterion("v7_c_mnum <=", value, "v7CMnum");
            return (Criteria) this;
        }

        public Criteria andV7CMnumIn(List<Integer> values) {
            addCriterion("v7_c_mnum in", values, "v7CMnum");
            return (Criteria) this;
        }

        public Criteria andV7CMnumNotIn(List<Integer> values) {
            addCriterion("v7_c_mnum not in", values, "v7CMnum");
            return (Criteria) this;
        }

        public Criteria andV7CMnumBetween(Integer value1, Integer value2) {
            addCriterion("v7_c_mnum between", value1, value2, "v7CMnum");
            return (Criteria) this;
        }

        public Criteria andV7CMnumNotBetween(Integer value1, Integer value2) {
            addCriterion("v7_c_mnum not between", value1, value2, "v7CMnum");
            return (Criteria) this;
        }

        public Criteria andV7CNameIsNull() {
            addCriterion("v7_c_name is null");
            return (Criteria) this;
        }

        public Criteria andV7CNameIsNotNull() {
            addCriterion("v7_c_name is not null");
            return (Criteria) this;
        }

        public Criteria andV7CNameEqualTo(String value) {
            addCriterion("v7_c_name =", value, "v7CName");
            return (Criteria) this;
        }

        public Criteria andV7CNameNotEqualTo(String value) {
            addCriterion("v7_c_name <>", value, "v7CName");
            return (Criteria) this;
        }

        public Criteria andV7CNameGreaterThan(String value) {
            addCriterion("v7_c_name >", value, "v7CName");
            return (Criteria) this;
        }

        public Criteria andV7CNameGreaterThanOrEqualTo(String value) {
            addCriterion("v7_c_name >=", value, "v7CName");
            return (Criteria) this;
        }

        public Criteria andV7CNameLessThan(String value) {
            addCriterion("v7_c_name <", value, "v7CName");
            return (Criteria) this;
        }

        public Criteria andV7CNameLessThanOrEqualTo(String value) {
            addCriterion("v7_c_name <=", value, "v7CName");
            return (Criteria) this;
        }

        public Criteria andV7CNameLike(String value) {
            addCriterion("v7_c_name like", value, "v7CName");
            return (Criteria) this;
        }

        public Criteria andV7CNameNotLike(String value) {
            addCriterion("v7_c_name not like", value, "v7CName");
            return (Criteria) this;
        }

        public Criteria andV7CNameIn(List<String> values) {
            addCriterion("v7_c_name in", values, "v7CName");
            return (Criteria) this;
        }

        public Criteria andV7CNameNotIn(List<String> values) {
            addCriterion("v7_c_name not in", values, "v7CName");
            return (Criteria) this;
        }

        public Criteria andV7CNameBetween(String value1, String value2) {
            addCriterion("v7_c_name between", value1, value2, "v7CName");
            return (Criteria) this;
        }

        public Criteria andV7CNameNotBetween(String value1, String value2) {
            addCriterion("v7_c_name not between", value1, value2, "v7CName");
            return (Criteria) this;
        }

        public Criteria andV7CPositionfIsNull() {
            addCriterion("v7_c_positionf is null");
            return (Criteria) this;
        }

        public Criteria andV7CPositionfIsNotNull() {
            addCriterion("v7_c_positionf is not null");
            return (Criteria) this;
        }

        public Criteria andV7CPositionfEqualTo(String value) {
            addCriterion("v7_c_positionf =", value, "v7CPositionf");
            return (Criteria) this;
        }

        public Criteria andV7CPositionfNotEqualTo(String value) {
            addCriterion("v7_c_positionf <>", value, "v7CPositionf");
            return (Criteria) this;
        }

        public Criteria andV7CPositionfGreaterThan(String value) {
            addCriterion("v7_c_positionf >", value, "v7CPositionf");
            return (Criteria) this;
        }

        public Criteria andV7CPositionfGreaterThanOrEqualTo(String value) {
            addCriterion("v7_c_positionf >=", value, "v7CPositionf");
            return (Criteria) this;
        }

        public Criteria andV7CPositionfLessThan(String value) {
            addCriterion("v7_c_positionf <", value, "v7CPositionf");
            return (Criteria) this;
        }

        public Criteria andV7CPositionfLessThanOrEqualTo(String value) {
            addCriterion("v7_c_positionf <=", value, "v7CPositionf");
            return (Criteria) this;
        }

        public Criteria andV7CPositionfLike(String value) {
            addCriterion("v7_c_positionf like", value, "v7CPositionf");
            return (Criteria) this;
        }

        public Criteria andV7CPositionfNotLike(String value) {
            addCriterion("v7_c_positionf not like", value, "v7CPositionf");
            return (Criteria) this;
        }

        public Criteria andV7CPositionfIn(List<String> values) {
            addCriterion("v7_c_positionf in", values, "v7CPositionf");
            return (Criteria) this;
        }

        public Criteria andV7CPositionfNotIn(List<String> values) {
            addCriterion("v7_c_positionf not in", values, "v7CPositionf");
            return (Criteria) this;
        }

        public Criteria andV7CPositionfBetween(String value1, String value2) {
            addCriterion("v7_c_positionf between", value1, value2, "v7CPositionf");
            return (Criteria) this;
        }

        public Criteria andV7CPositionfNotBetween(String value1, String value2) {
            addCriterion("v7_c_positionf not between", value1, value2, "v7CPositionf");
            return (Criteria) this;
        }

        public Criteria andV7CChargeMoneyIsNull() {
            addCriterion("v7_c_charge_money is null");
            return (Criteria) this;
        }

        public Criteria andV7CChargeMoneyIsNotNull() {
            addCriterion("v7_c_charge_money is not null");
            return (Criteria) this;
        }

        public Criteria andV7CChargeMoneyEqualTo(Double value) {
            addCriterion("v7_c_charge_money =", value, "v7CChargeMoney");
            return (Criteria) this;
        }

        public Criteria andV7CChargeMoneyNotEqualTo(Double value) {
            addCriterion("v7_c_charge_money <>", value, "v7CChargeMoney");
            return (Criteria) this;
        }

        public Criteria andV7CChargeMoneyGreaterThan(Double value) {
            addCriterion("v7_c_charge_money >", value, "v7CChargeMoney");
            return (Criteria) this;
        }

        public Criteria andV7CChargeMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("v7_c_charge_money >=", value, "v7CChargeMoney");
            return (Criteria) this;
        }

        public Criteria andV7CChargeMoneyLessThan(Double value) {
            addCriterion("v7_c_charge_money <", value, "v7CChargeMoney");
            return (Criteria) this;
        }

        public Criteria andV7CChargeMoneyLessThanOrEqualTo(Double value) {
            addCriterion("v7_c_charge_money <=", value, "v7CChargeMoney");
            return (Criteria) this;
        }

        public Criteria andV7CChargeMoneyIn(List<Double> values) {
            addCriterion("v7_c_charge_money in", values, "v7CChargeMoney");
            return (Criteria) this;
        }

        public Criteria andV7CChargeMoneyNotIn(List<Double> values) {
            addCriterion("v7_c_charge_money not in", values, "v7CChargeMoney");
            return (Criteria) this;
        }

        public Criteria andV7CChargeMoneyBetween(Double value1, Double value2) {
            addCriterion("v7_c_charge_money between", value1, value2, "v7CChargeMoney");
            return (Criteria) this;
        }

        public Criteria andV7CChargeMoneyNotBetween(Double value1, Double value2) {
            addCriterion("v7_c_charge_money not between", value1, value2, "v7CChargeMoney");
            return (Criteria) this;
        }

        public Criteria andV7CChargeExplainIsNull() {
            addCriterion("v7_c_charge_explain is null");
            return (Criteria) this;
        }

        public Criteria andV7CChargeExplainIsNotNull() {
            addCriterion("v7_c_charge_explain is not null");
            return (Criteria) this;
        }

        public Criteria andV7CChargeExplainEqualTo(String value) {
            addCriterion("v7_c_charge_explain =", value, "v7CChargeExplain");
            return (Criteria) this;
        }

        public Criteria andV7CChargeExplainNotEqualTo(String value) {
            addCriterion("v7_c_charge_explain <>", value, "v7CChargeExplain");
            return (Criteria) this;
        }

        public Criteria andV7CChargeExplainGreaterThan(String value) {
            addCriterion("v7_c_charge_explain >", value, "v7CChargeExplain");
            return (Criteria) this;
        }

        public Criteria andV7CChargeExplainGreaterThanOrEqualTo(String value) {
            addCriterion("v7_c_charge_explain >=", value, "v7CChargeExplain");
            return (Criteria) this;
        }

        public Criteria andV7CChargeExplainLessThan(String value) {
            addCriterion("v7_c_charge_explain <", value, "v7CChargeExplain");
            return (Criteria) this;
        }

        public Criteria andV7CChargeExplainLessThanOrEqualTo(String value) {
            addCriterion("v7_c_charge_explain <=", value, "v7CChargeExplain");
            return (Criteria) this;
        }

        public Criteria andV7CChargeExplainLike(String value) {
            addCriterion("v7_c_charge_explain like", value, "v7CChargeExplain");
            return (Criteria) this;
        }

        public Criteria andV7CChargeExplainNotLike(String value) {
            addCriterion("v7_c_charge_explain not like", value, "v7CChargeExplain");
            return (Criteria) this;
        }

        public Criteria andV7CChargeExplainIn(List<String> values) {
            addCriterion("v7_c_charge_explain in", values, "v7CChargeExplain");
            return (Criteria) this;
        }

        public Criteria andV7CChargeExplainNotIn(List<String> values) {
            addCriterion("v7_c_charge_explain not in", values, "v7CChargeExplain");
            return (Criteria) this;
        }

        public Criteria andV7CChargeExplainBetween(String value1, String value2) {
            addCriterion("v7_c_charge_explain between", value1, value2, "v7CChargeExplain");
            return (Criteria) this;
        }

        public Criteria andV7CChargeExplainNotBetween(String value1, String value2) {
            addCriterion("v7_c_charge_explain not between", value1, value2, "v7CChargeExplain");
            return (Criteria) this;
        }

        public Criteria andV7COperUserIsNull() {
            addCriterion("v7_c_oper_user is null");
            return (Criteria) this;
        }

        public Criteria andV7COperUserIsNotNull() {
            addCriterion("v7_c_oper_user is not null");
            return (Criteria) this;
        }

        public Criteria andV7COperUserEqualTo(String value) {
            addCriterion("v7_c_oper_user =", value, "v7COperUser");
            return (Criteria) this;
        }

        public Criteria andV7COperUserNotEqualTo(String value) {
            addCriterion("v7_c_oper_user <>", value, "v7COperUser");
            return (Criteria) this;
        }

        public Criteria andV7COperUserGreaterThan(String value) {
            addCriterion("v7_c_oper_user >", value, "v7COperUser");
            return (Criteria) this;
        }

        public Criteria andV7COperUserGreaterThanOrEqualTo(String value) {
            addCriterion("v7_c_oper_user >=", value, "v7COperUser");
            return (Criteria) this;
        }

        public Criteria andV7COperUserLessThan(String value) {
            addCriterion("v7_c_oper_user <", value, "v7COperUser");
            return (Criteria) this;
        }

        public Criteria andV7COperUserLessThanOrEqualTo(String value) {
            addCriterion("v7_c_oper_user <=", value, "v7COperUser");
            return (Criteria) this;
        }

        public Criteria andV7COperUserLike(String value) {
            addCriterion("v7_c_oper_user like", value, "v7COperUser");
            return (Criteria) this;
        }

        public Criteria andV7COperUserNotLike(String value) {
            addCriterion("v7_c_oper_user not like", value, "v7COperUser");
            return (Criteria) this;
        }

        public Criteria andV7COperUserIn(List<String> values) {
            addCriterion("v7_c_oper_user in", values, "v7COperUser");
            return (Criteria) this;
        }

        public Criteria andV7COperUserNotIn(List<String> values) {
            addCriterion("v7_c_oper_user not in", values, "v7COperUser");
            return (Criteria) this;
        }

        public Criteria andV7COperUserBetween(String value1, String value2) {
            addCriterion("v7_c_oper_user between", value1, value2, "v7COperUser");
            return (Criteria) this;
        }

        public Criteria andV7COperUserNotBetween(String value1, String value2) {
            addCriterion("v7_c_oper_user not between", value1, value2, "v7COperUser");
            return (Criteria) this;
        }

        public Criteria andV7COperTimeIsNull() {
            addCriterion("v7_c_oper_time is null");
            return (Criteria) this;
        }

        public Criteria andV7COperTimeIsNotNull() {
            addCriterion("v7_c_oper_time is not null");
            return (Criteria) this;
        }

        public Criteria andV7COperTimeEqualTo(Date value) {
            addCriterion("v7_c_oper_time =", value, "v7COperTime");
            return (Criteria) this;
        }

        public Criteria andV7COperTimeNotEqualTo(Date value) {
            addCriterion("v7_c_oper_time <>", value, "v7COperTime");
            return (Criteria) this;
        }

        public Criteria andV7COperTimeGreaterThan(Date value) {
            addCriterion("v7_c_oper_time >", value, "v7COperTime");
            return (Criteria) this;
        }

        public Criteria andV7COperTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("v7_c_oper_time >=", value, "v7COperTime");
            return (Criteria) this;
        }

        public Criteria andV7COperTimeLessThan(Date value) {
            addCriterion("v7_c_oper_time <", value, "v7COperTime");
            return (Criteria) this;
        }

        public Criteria andV7COperTimeLessThanOrEqualTo(Date value) {
            addCriterion("v7_c_oper_time <=", value, "v7COperTime");
            return (Criteria) this;
        }

        public Criteria andV7COperTimeIn(List<Date> values) {
            addCriterion("v7_c_oper_time in", values, "v7COperTime");
            return (Criteria) this;
        }

        public Criteria andV7COperTimeNotIn(List<Date> values) {
            addCriterion("v7_c_oper_time not in", values, "v7COperTime");
            return (Criteria) this;
        }

        public Criteria andV7COperTimeBetween(Date value1, Date value2) {
            addCriterion("v7_c_oper_time between", value1, value2, "v7COperTime");
            return (Criteria) this;
        }

        public Criteria andV7COperTimeNotBetween(Date value1, Date value2) {
            addCriterion("v7_c_oper_time not between", value1, value2, "v7COperTime");
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