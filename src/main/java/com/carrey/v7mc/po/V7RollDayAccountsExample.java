package com.carrey.v7mc.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class V7RollDayAccountsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public V7RollDayAccountsExample() {
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

        public Criteria andV7RRollingDateIsNull() {
            addCriterion("v7_r_rolling_date is null");
            return (Criteria) this;
        }

        public Criteria andV7RRollingDateIsNotNull() {
            addCriterion("v7_r_rolling_date is not null");
            return (Criteria) this;
        }

        public Criteria andV7RRollingDateEqualTo(Date value) {
            addCriterionForJDBCDate("v7_r_rolling_date =", value, "v7RRollingDate");
            return (Criteria) this;
        }

        public Criteria andV7RRollingDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("v7_r_rolling_date <>", value, "v7RRollingDate");
            return (Criteria) this;
        }

        public Criteria andV7RRollingDateGreaterThan(Date value) {
            addCriterionForJDBCDate("v7_r_rolling_date >", value, "v7RRollingDate");
            return (Criteria) this;
        }

        public Criteria andV7RRollingDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("v7_r_rolling_date >=", value, "v7RRollingDate");
            return (Criteria) this;
        }

        public Criteria andV7RRollingDateLessThan(Date value) {
            addCriterionForJDBCDate("v7_r_rolling_date <", value, "v7RRollingDate");
            return (Criteria) this;
        }

        public Criteria andV7RRollingDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("v7_r_rolling_date <=", value, "v7RRollingDate");
            return (Criteria) this;
        }

        public Criteria andV7RRollingDateIn(List<Date> values) {
            addCriterionForJDBCDate("v7_r_rolling_date in", values, "v7RRollingDate");
            return (Criteria) this;
        }

        public Criteria andV7RRollingDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("v7_r_rolling_date not in", values, "v7RRollingDate");
            return (Criteria) this;
        }

        public Criteria andV7RRollingDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("v7_r_rolling_date between", value1, value2, "v7RRollingDate");
            return (Criteria) this;
        }

        public Criteria andV7RRollingDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("v7_r_rolling_date not between", value1, value2, "v7RRollingDate");
            return (Criteria) this;
        }

        public Criteria andV7RCashIsNull() {
            addCriterion("v7_r_cash is null");
            return (Criteria) this;
        }

        public Criteria andV7RCashIsNotNull() {
            addCriterion("v7_r_cash is not null");
            return (Criteria) this;
        }

        public Criteria andV7RCashEqualTo(Double value) {
            addCriterion("v7_r_cash =", value, "v7RCash");
            return (Criteria) this;
        }

        public Criteria andV7RCashNotEqualTo(Double value) {
            addCriterion("v7_r_cash <>", value, "v7RCash");
            return (Criteria) this;
        }

        public Criteria andV7RCashGreaterThan(Double value) {
            addCriterion("v7_r_cash >", value, "v7RCash");
            return (Criteria) this;
        }

        public Criteria andV7RCashGreaterThanOrEqualTo(Double value) {
            addCriterion("v7_r_cash >=", value, "v7RCash");
            return (Criteria) this;
        }

        public Criteria andV7RCashLessThan(Double value) {
            addCriterion("v7_r_cash <", value, "v7RCash");
            return (Criteria) this;
        }

        public Criteria andV7RCashLessThanOrEqualTo(Double value) {
            addCriterion("v7_r_cash <=", value, "v7RCash");
            return (Criteria) this;
        }

        public Criteria andV7RCashIn(List<Double> values) {
            addCriterion("v7_r_cash in", values, "v7RCash");
            return (Criteria) this;
        }

        public Criteria andV7RCashNotIn(List<Double> values) {
            addCriterion("v7_r_cash not in", values, "v7RCash");
            return (Criteria) this;
        }

        public Criteria andV7RCashBetween(Double value1, Double value2) {
            addCriterion("v7_r_cash between", value1, value2, "v7RCash");
            return (Criteria) this;
        }

        public Criteria andV7RCashNotBetween(Double value1, Double value2) {
            addCriterion("v7_r_cash not between", value1, value2, "v7RCash");
            return (Criteria) this;
        }

        public Criteria andV7RVipoutIsNull() {
            addCriterion("v7_r_vipout is null");
            return (Criteria) this;
        }

        public Criteria andV7RVipoutIsNotNull() {
            addCriterion("v7_r_vipout is not null");
            return (Criteria) this;
        }

        public Criteria andV7RVipoutEqualTo(Double value) {
            addCriterion("v7_r_vipout =", value, "v7RVipout");
            return (Criteria) this;
        }

        public Criteria andV7RVipoutNotEqualTo(Double value) {
            addCriterion("v7_r_vipout <>", value, "v7RVipout");
            return (Criteria) this;
        }

        public Criteria andV7RVipoutGreaterThan(Double value) {
            addCriterion("v7_r_vipout >", value, "v7RVipout");
            return (Criteria) this;
        }

        public Criteria andV7RVipoutGreaterThanOrEqualTo(Double value) {
            addCriterion("v7_r_vipout >=", value, "v7RVipout");
            return (Criteria) this;
        }

        public Criteria andV7RVipoutLessThan(Double value) {
            addCriterion("v7_r_vipout <", value, "v7RVipout");
            return (Criteria) this;
        }

        public Criteria andV7RVipoutLessThanOrEqualTo(Double value) {
            addCriterion("v7_r_vipout <=", value, "v7RVipout");
            return (Criteria) this;
        }

        public Criteria andV7RVipoutIn(List<Double> values) {
            addCriterion("v7_r_vipout in", values, "v7RVipout");
            return (Criteria) this;
        }

        public Criteria andV7RVipoutNotIn(List<Double> values) {
            addCriterion("v7_r_vipout not in", values, "v7RVipout");
            return (Criteria) this;
        }

        public Criteria andV7RVipoutBetween(Double value1, Double value2) {
            addCriterion("v7_r_vipout between", value1, value2, "v7RVipout");
            return (Criteria) this;
        }

        public Criteria andV7RVipoutNotBetween(Double value1, Double value2) {
            addCriterion("v7_r_vipout not between", value1, value2, "v7RVipout");
            return (Criteria) this;
        }

        public Criteria andV7RHedgeoutIsNull() {
            addCriterion("v7_r_hedgeout is null");
            return (Criteria) this;
        }

        public Criteria andV7RHedgeoutIsNotNull() {
            addCriterion("v7_r_hedgeout is not null");
            return (Criteria) this;
        }

        public Criteria andV7RHedgeoutEqualTo(Double value) {
            addCriterion("v7_r_hedgeout =", value, "v7RHedgeout");
            return (Criteria) this;
        }

        public Criteria andV7RHedgeoutNotEqualTo(Double value) {
            addCriterion("v7_r_hedgeout <>", value, "v7RHedgeout");
            return (Criteria) this;
        }

        public Criteria andV7RHedgeoutGreaterThan(Double value) {
            addCriterion("v7_r_hedgeout >", value, "v7RHedgeout");
            return (Criteria) this;
        }

        public Criteria andV7RHedgeoutGreaterThanOrEqualTo(Double value) {
            addCriterion("v7_r_hedgeout >=", value, "v7RHedgeout");
            return (Criteria) this;
        }

        public Criteria andV7RHedgeoutLessThan(Double value) {
            addCriterion("v7_r_hedgeout <", value, "v7RHedgeout");
            return (Criteria) this;
        }

        public Criteria andV7RHedgeoutLessThanOrEqualTo(Double value) {
            addCriterion("v7_r_hedgeout <=", value, "v7RHedgeout");
            return (Criteria) this;
        }

        public Criteria andV7RHedgeoutIn(List<Double> values) {
            addCriterion("v7_r_hedgeout in", values, "v7RHedgeout");
            return (Criteria) this;
        }

        public Criteria andV7RHedgeoutNotIn(List<Double> values) {
            addCriterion("v7_r_hedgeout not in", values, "v7RHedgeout");
            return (Criteria) this;
        }

        public Criteria andV7RHedgeoutBetween(Double value1, Double value2) {
            addCriterion("v7_r_hedgeout between", value1, value2, "v7RHedgeout");
            return (Criteria) this;
        }

        public Criteria andV7RHedgeoutNotBetween(Double value1, Double value2) {
            addCriterion("v7_r_hedgeout not between", value1, value2, "v7RHedgeout");
            return (Criteria) this;
        }

        public Criteria andV7RHedgecashinIsNull() {
            addCriterion("v7_r_hedgecashin is null");
            return (Criteria) this;
        }

        public Criteria andV7RHedgecashinIsNotNull() {
            addCriterion("v7_r_hedgecashin is not null");
            return (Criteria) this;
        }

        public Criteria andV7RHedgecashinEqualTo(Double value) {
            addCriterion("v7_r_hedgecashin =", value, "v7RHedgecashin");
            return (Criteria) this;
        }

        public Criteria andV7RHedgecashinNotEqualTo(Double value) {
            addCriterion("v7_r_hedgecashin <>", value, "v7RHedgecashin");
            return (Criteria) this;
        }

        public Criteria andV7RHedgecashinGreaterThan(Double value) {
            addCriterion("v7_r_hedgecashin >", value, "v7RHedgecashin");
            return (Criteria) this;
        }

        public Criteria andV7RHedgecashinGreaterThanOrEqualTo(Double value) {
            addCriterion("v7_r_hedgecashin >=", value, "v7RHedgecashin");
            return (Criteria) this;
        }

        public Criteria andV7RHedgecashinLessThan(Double value) {
            addCriterion("v7_r_hedgecashin <", value, "v7RHedgecashin");
            return (Criteria) this;
        }

        public Criteria andV7RHedgecashinLessThanOrEqualTo(Double value) {
            addCriterion("v7_r_hedgecashin <=", value, "v7RHedgecashin");
            return (Criteria) this;
        }

        public Criteria andV7RHedgecashinIn(List<Double> values) {
            addCriterion("v7_r_hedgecashin in", values, "v7RHedgecashin");
            return (Criteria) this;
        }

        public Criteria andV7RHedgecashinNotIn(List<Double> values) {
            addCriterion("v7_r_hedgecashin not in", values, "v7RHedgecashin");
            return (Criteria) this;
        }

        public Criteria andV7RHedgecashinBetween(Double value1, Double value2) {
            addCriterion("v7_r_hedgecashin between", value1, value2, "v7RHedgecashin");
            return (Criteria) this;
        }

        public Criteria andV7RHedgecashinNotBetween(Double value1, Double value2) {
            addCriterion("v7_r_hedgecashin not between", value1, value2, "v7RHedgecashin");
            return (Criteria) this;
        }

        public Criteria andV7RBlowwashoutIsNull() {
            addCriterion("v7_r_blowwashout is null");
            return (Criteria) this;
        }

        public Criteria andV7RBlowwashoutIsNotNull() {
            addCriterion("v7_r_blowwashout is not null");
            return (Criteria) this;
        }

        public Criteria andV7RBlowwashoutEqualTo(Integer value) {
            addCriterion("v7_r_blowwashout =", value, "v7RBlowwashout");
            return (Criteria) this;
        }

        public Criteria andV7RBlowwashoutNotEqualTo(Integer value) {
            addCriterion("v7_r_blowwashout <>", value, "v7RBlowwashout");
            return (Criteria) this;
        }

        public Criteria andV7RBlowwashoutGreaterThan(Integer value) {
            addCriterion("v7_r_blowwashout >", value, "v7RBlowwashout");
            return (Criteria) this;
        }

        public Criteria andV7RBlowwashoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("v7_r_blowwashout >=", value, "v7RBlowwashout");
            return (Criteria) this;
        }

        public Criteria andV7RBlowwashoutLessThan(Integer value) {
            addCriterion("v7_r_blowwashout <", value, "v7RBlowwashout");
            return (Criteria) this;
        }

        public Criteria andV7RBlowwashoutLessThanOrEqualTo(Integer value) {
            addCriterion("v7_r_blowwashout <=", value, "v7RBlowwashout");
            return (Criteria) this;
        }

        public Criteria andV7RBlowwashoutIn(List<Integer> values) {
            addCriterion("v7_r_blowwashout in", values, "v7RBlowwashout");
            return (Criteria) this;
        }

        public Criteria andV7RBlowwashoutNotIn(List<Integer> values) {
            addCriterion("v7_r_blowwashout not in", values, "v7RBlowwashout");
            return (Criteria) this;
        }

        public Criteria andV7RBlowwashoutBetween(Integer value1, Integer value2) {
            addCriterion("v7_r_blowwashout between", value1, value2, "v7RBlowwashout");
            return (Criteria) this;
        }

        public Criteria andV7RBlowwashoutNotBetween(Integer value1, Integer value2) {
            addCriterion("v7_r_blowwashout not between", value1, value2, "v7RBlowwashout");
            return (Criteria) this;
        }

        public Criteria andV7RBlowcutwashoutIsNull() {
            addCriterion("v7_r_blowcutwashout is null");
            return (Criteria) this;
        }

        public Criteria andV7RBlowcutwashoutIsNotNull() {
            addCriterion("v7_r_blowcutwashout is not null");
            return (Criteria) this;
        }

        public Criteria andV7RBlowcutwashoutEqualTo(Integer value) {
            addCriterion("v7_r_blowcutwashout =", value, "v7RBlowcutwashout");
            return (Criteria) this;
        }

        public Criteria andV7RBlowcutwashoutNotEqualTo(Integer value) {
            addCriterion("v7_r_blowcutwashout <>", value, "v7RBlowcutwashout");
            return (Criteria) this;
        }

        public Criteria andV7RBlowcutwashoutGreaterThan(Integer value) {
            addCriterion("v7_r_blowcutwashout >", value, "v7RBlowcutwashout");
            return (Criteria) this;
        }

        public Criteria andV7RBlowcutwashoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("v7_r_blowcutwashout >=", value, "v7RBlowcutwashout");
            return (Criteria) this;
        }

        public Criteria andV7RBlowcutwashoutLessThan(Integer value) {
            addCriterion("v7_r_blowcutwashout <", value, "v7RBlowcutwashout");
            return (Criteria) this;
        }

        public Criteria andV7RBlowcutwashoutLessThanOrEqualTo(Integer value) {
            addCriterion("v7_r_blowcutwashout <=", value, "v7RBlowcutwashout");
            return (Criteria) this;
        }

        public Criteria andV7RBlowcutwashoutIn(List<Integer> values) {
            addCriterion("v7_r_blowcutwashout in", values, "v7RBlowcutwashout");
            return (Criteria) this;
        }

        public Criteria andV7RBlowcutwashoutNotIn(List<Integer> values) {
            addCriterion("v7_r_blowcutwashout not in", values, "v7RBlowcutwashout");
            return (Criteria) this;
        }

        public Criteria andV7RBlowcutwashoutBetween(Integer value1, Integer value2) {
            addCriterion("v7_r_blowcutwashout between", value1, value2, "v7RBlowcutwashout");
            return (Criteria) this;
        }

        public Criteria andV7RBlowcutwashoutNotBetween(Integer value1, Integer value2) {
            addCriterion("v7_r_blowcutwashout not between", value1, value2, "v7RBlowcutwashout");
            return (Criteria) this;
        }

        public Criteria andV7RVipinIsNull() {
            addCriterion("v7_r_vipin is null");
            return (Criteria) this;
        }

        public Criteria andV7RVipinIsNotNull() {
            addCriterion("v7_r_vipin is not null");
            return (Criteria) this;
        }

        public Criteria andV7RVipinEqualTo(Integer value) {
            addCriterion("v7_r_vipin =", value, "v7RVipin");
            return (Criteria) this;
        }

        public Criteria andV7RVipinNotEqualTo(Integer value) {
            addCriterion("v7_r_vipin <>", value, "v7RVipin");
            return (Criteria) this;
        }

        public Criteria andV7RVipinGreaterThan(Integer value) {
            addCriterion("v7_r_vipin >", value, "v7RVipin");
            return (Criteria) this;
        }

        public Criteria andV7RVipinGreaterThanOrEqualTo(Integer value) {
            addCriterion("v7_r_vipin >=", value, "v7RVipin");
            return (Criteria) this;
        }

        public Criteria andV7RVipinLessThan(Integer value) {
            addCriterion("v7_r_vipin <", value, "v7RVipin");
            return (Criteria) this;
        }

        public Criteria andV7RVipinLessThanOrEqualTo(Integer value) {
            addCriterion("v7_r_vipin <=", value, "v7RVipin");
            return (Criteria) this;
        }

        public Criteria andV7RVipinIn(List<Integer> values) {
            addCriterion("v7_r_vipin in", values, "v7RVipin");
            return (Criteria) this;
        }

        public Criteria andV7RVipinNotIn(List<Integer> values) {
            addCriterion("v7_r_vipin not in", values, "v7RVipin");
            return (Criteria) this;
        }

        public Criteria andV7RVipinBetween(Integer value1, Integer value2) {
            addCriterion("v7_r_vipin between", value1, value2, "v7RVipin");
            return (Criteria) this;
        }

        public Criteria andV7RVipinNotBetween(Integer value1, Integer value2) {
            addCriterion("v7_r_vipin not between", value1, value2, "v7RVipin");
            return (Criteria) this;
        }

        public Criteria andV7RHedgeinIsNull() {
            addCriterion("v7_r_hedgein is null");
            return (Criteria) this;
        }

        public Criteria andV7RHedgeinIsNotNull() {
            addCriterion("v7_r_hedgein is not null");
            return (Criteria) this;
        }

        public Criteria andV7RHedgeinEqualTo(Integer value) {
            addCriterion("v7_r_hedgein =", value, "v7RHedgein");
            return (Criteria) this;
        }

        public Criteria andV7RHedgeinNotEqualTo(Integer value) {
            addCriterion("v7_r_hedgein <>", value, "v7RHedgein");
            return (Criteria) this;
        }

        public Criteria andV7RHedgeinGreaterThan(Integer value) {
            addCriterion("v7_r_hedgein >", value, "v7RHedgein");
            return (Criteria) this;
        }

        public Criteria andV7RHedgeinGreaterThanOrEqualTo(Integer value) {
            addCriterion("v7_r_hedgein >=", value, "v7RHedgein");
            return (Criteria) this;
        }

        public Criteria andV7RHedgeinLessThan(Integer value) {
            addCriterion("v7_r_hedgein <", value, "v7RHedgein");
            return (Criteria) this;
        }

        public Criteria andV7RHedgeinLessThanOrEqualTo(Integer value) {
            addCriterion("v7_r_hedgein <=", value, "v7RHedgein");
            return (Criteria) this;
        }

        public Criteria andV7RHedgeinIn(List<Integer> values) {
            addCriterion("v7_r_hedgein in", values, "v7RHedgein");
            return (Criteria) this;
        }

        public Criteria andV7RHedgeinNotIn(List<Integer> values) {
            addCriterion("v7_r_hedgein not in", values, "v7RHedgein");
            return (Criteria) this;
        }

        public Criteria andV7RHedgeinBetween(Integer value1, Integer value2) {
            addCriterion("v7_r_hedgein between", value1, value2, "v7RHedgein");
            return (Criteria) this;
        }

        public Criteria andV7RHedgeinNotBetween(Integer value1, Integer value2) {
            addCriterion("v7_r_hedgein not between", value1, value2, "v7RHedgein");
            return (Criteria) this;
        }

        public Criteria andV7RBlowwashinIsNull() {
            addCriterion("v7_r_blowwashin is null");
            return (Criteria) this;
        }

        public Criteria andV7RBlowwashinIsNotNull() {
            addCriterion("v7_r_blowwashin is not null");
            return (Criteria) this;
        }

        public Criteria andV7RBlowwashinEqualTo(Integer value) {
            addCriterion("v7_r_blowwashin =", value, "v7RBlowwashin");
            return (Criteria) this;
        }

        public Criteria andV7RBlowwashinNotEqualTo(Integer value) {
            addCriterion("v7_r_blowwashin <>", value, "v7RBlowwashin");
            return (Criteria) this;
        }

        public Criteria andV7RBlowwashinGreaterThan(Integer value) {
            addCriterion("v7_r_blowwashin >", value, "v7RBlowwashin");
            return (Criteria) this;
        }

        public Criteria andV7RBlowwashinGreaterThanOrEqualTo(Integer value) {
            addCriterion("v7_r_blowwashin >=", value, "v7RBlowwashin");
            return (Criteria) this;
        }

        public Criteria andV7RBlowwashinLessThan(Integer value) {
            addCriterion("v7_r_blowwashin <", value, "v7RBlowwashin");
            return (Criteria) this;
        }

        public Criteria andV7RBlowwashinLessThanOrEqualTo(Integer value) {
            addCriterion("v7_r_blowwashin <=", value, "v7RBlowwashin");
            return (Criteria) this;
        }

        public Criteria andV7RBlowwashinIn(List<Integer> values) {
            addCriterion("v7_r_blowwashin in", values, "v7RBlowwashin");
            return (Criteria) this;
        }

        public Criteria andV7RBlowwashinNotIn(List<Integer> values) {
            addCriterion("v7_r_blowwashin not in", values, "v7RBlowwashin");
            return (Criteria) this;
        }

        public Criteria andV7RBlowwashinBetween(Integer value1, Integer value2) {
            addCriterion("v7_r_blowwashin between", value1, value2, "v7RBlowwashin");
            return (Criteria) this;
        }

        public Criteria andV7RBlowwashinNotBetween(Integer value1, Integer value2) {
            addCriterion("v7_r_blowwashin not between", value1, value2, "v7RBlowwashin");
            return (Criteria) this;
        }

        public Criteria andV7RBlowcutwashinIsNull() {
            addCriterion("v7_r_blowcutwashin is null");
            return (Criteria) this;
        }

        public Criteria andV7RBlowcutwashinIsNotNull() {
            addCriterion("v7_r_blowcutwashin is not null");
            return (Criteria) this;
        }

        public Criteria andV7RBlowcutwashinEqualTo(Integer value) {
            addCriterion("v7_r_blowcutwashin =", value, "v7RBlowcutwashin");
            return (Criteria) this;
        }

        public Criteria andV7RBlowcutwashinNotEqualTo(Integer value) {
            addCriterion("v7_r_blowcutwashin <>", value, "v7RBlowcutwashin");
            return (Criteria) this;
        }

        public Criteria andV7RBlowcutwashinGreaterThan(Integer value) {
            addCriterion("v7_r_blowcutwashin >", value, "v7RBlowcutwashin");
            return (Criteria) this;
        }

        public Criteria andV7RBlowcutwashinGreaterThanOrEqualTo(Integer value) {
            addCriterion("v7_r_blowcutwashin >=", value, "v7RBlowcutwashin");
            return (Criteria) this;
        }

        public Criteria andV7RBlowcutwashinLessThan(Integer value) {
            addCriterion("v7_r_blowcutwashin <", value, "v7RBlowcutwashin");
            return (Criteria) this;
        }

        public Criteria andV7RBlowcutwashinLessThanOrEqualTo(Integer value) {
            addCriterion("v7_r_blowcutwashin <=", value, "v7RBlowcutwashin");
            return (Criteria) this;
        }

        public Criteria andV7RBlowcutwashinIn(List<Integer> values) {
            addCriterion("v7_r_blowcutwashin in", values, "v7RBlowcutwashin");
            return (Criteria) this;
        }

        public Criteria andV7RBlowcutwashinNotIn(List<Integer> values) {
            addCriterion("v7_r_blowcutwashin not in", values, "v7RBlowcutwashin");
            return (Criteria) this;
        }

        public Criteria andV7RBlowcutwashinBetween(Integer value1, Integer value2) {
            addCriterion("v7_r_blowcutwashin between", value1, value2, "v7RBlowcutwashin");
            return (Criteria) this;
        }

        public Criteria andV7RBlowcutwashinNotBetween(Integer value1, Integer value2) {
            addCriterion("v7_r_blowcutwashin not between", value1, value2, "v7RBlowcutwashin");
            return (Criteria) this;
        }

        public Criteria andV7RCardmoneyIsNull() {
            addCriterion("v7_r_cardmoney is null");
            return (Criteria) this;
        }

        public Criteria andV7RCardmoneyIsNotNull() {
            addCriterion("v7_r_cardmoney is not null");
            return (Criteria) this;
        }

        public Criteria andV7RCardmoneyEqualTo(Double value) {
            addCriterion("v7_r_cardmoney =", value, "v7RCardmoney");
            return (Criteria) this;
        }

        public Criteria andV7RCardmoneyNotEqualTo(Double value) {
            addCriterion("v7_r_cardmoney <>", value, "v7RCardmoney");
            return (Criteria) this;
        }

        public Criteria andV7RCardmoneyGreaterThan(Double value) {
            addCriterion("v7_r_cardmoney >", value, "v7RCardmoney");
            return (Criteria) this;
        }

        public Criteria andV7RCardmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("v7_r_cardmoney >=", value, "v7RCardmoney");
            return (Criteria) this;
        }

        public Criteria andV7RCardmoneyLessThan(Double value) {
            addCriterion("v7_r_cardmoney <", value, "v7RCardmoney");
            return (Criteria) this;
        }

        public Criteria andV7RCardmoneyLessThanOrEqualTo(Double value) {
            addCriterion("v7_r_cardmoney <=", value, "v7RCardmoney");
            return (Criteria) this;
        }

        public Criteria andV7RCardmoneyIn(List<Double> values) {
            addCriterion("v7_r_cardmoney in", values, "v7RCardmoney");
            return (Criteria) this;
        }

        public Criteria andV7RCardmoneyNotIn(List<Double> values) {
            addCriterion("v7_r_cardmoney not in", values, "v7RCardmoney");
            return (Criteria) this;
        }

        public Criteria andV7RCardmoneyBetween(Double value1, Double value2) {
            addCriterion("v7_r_cardmoney between", value1, value2, "v7RCardmoney");
            return (Criteria) this;
        }

        public Criteria andV7RCardmoneyNotBetween(Double value1, Double value2) {
            addCriterion("v7_r_cardmoney not between", value1, value2, "v7RCardmoney");
            return (Criteria) this;
        }

        public Criteria andV7RRaiseamountIsNull() {
            addCriterion("v7_r_raiseamount is null");
            return (Criteria) this;
        }

        public Criteria andV7RRaiseamountIsNotNull() {
            addCriterion("v7_r_raiseamount is not null");
            return (Criteria) this;
        }

        public Criteria andV7RRaiseamountEqualTo(Double value) {
            addCriterion("v7_r_raiseamount =", value, "v7RRaiseamount");
            return (Criteria) this;
        }

        public Criteria andV7RRaiseamountNotEqualTo(Double value) {
            addCriterion("v7_r_raiseamount <>", value, "v7RRaiseamount");
            return (Criteria) this;
        }

        public Criteria andV7RRaiseamountGreaterThan(Double value) {
            addCriterion("v7_r_raiseamount >", value, "v7RRaiseamount");
            return (Criteria) this;
        }

        public Criteria andV7RRaiseamountGreaterThanOrEqualTo(Double value) {
            addCriterion("v7_r_raiseamount >=", value, "v7RRaiseamount");
            return (Criteria) this;
        }

        public Criteria andV7RRaiseamountLessThan(Double value) {
            addCriterion("v7_r_raiseamount <", value, "v7RRaiseamount");
            return (Criteria) this;
        }

        public Criteria andV7RRaiseamountLessThanOrEqualTo(Double value) {
            addCriterion("v7_r_raiseamount <=", value, "v7RRaiseamount");
            return (Criteria) this;
        }

        public Criteria andV7RRaiseamountIn(List<Double> values) {
            addCriterion("v7_r_raiseamount in", values, "v7RRaiseamount");
            return (Criteria) this;
        }

        public Criteria andV7RRaiseamountNotIn(List<Double> values) {
            addCriterion("v7_r_raiseamount not in", values, "v7RRaiseamount");
            return (Criteria) this;
        }

        public Criteria andV7RRaiseamountBetween(Double value1, Double value2) {
            addCriterion("v7_r_raiseamount between", value1, value2, "v7RRaiseamount");
            return (Criteria) this;
        }

        public Criteria andV7RRaiseamountNotBetween(Double value1, Double value2) {
            addCriterion("v7_r_raiseamount not between", value1, value2, "v7RRaiseamount");
            return (Criteria) this;
        }

        public Criteria andV7RTakeoutIsNull() {
            addCriterion("v7_r_takeout is null");
            return (Criteria) this;
        }

        public Criteria andV7RTakeoutIsNotNull() {
            addCriterion("v7_r_takeout is not null");
            return (Criteria) this;
        }

        public Criteria andV7RTakeoutEqualTo(Double value) {
            addCriterion("v7_r_takeout =", value, "v7RTakeout");
            return (Criteria) this;
        }

        public Criteria andV7RTakeoutNotEqualTo(Double value) {
            addCriterion("v7_r_takeout <>", value, "v7RTakeout");
            return (Criteria) this;
        }

        public Criteria andV7RTakeoutGreaterThan(Double value) {
            addCriterion("v7_r_takeout >", value, "v7RTakeout");
            return (Criteria) this;
        }

        public Criteria andV7RTakeoutGreaterThanOrEqualTo(Double value) {
            addCriterion("v7_r_takeout >=", value, "v7RTakeout");
            return (Criteria) this;
        }

        public Criteria andV7RTakeoutLessThan(Double value) {
            addCriterion("v7_r_takeout <", value, "v7RTakeout");
            return (Criteria) this;
        }

        public Criteria andV7RTakeoutLessThanOrEqualTo(Double value) {
            addCriterion("v7_r_takeout <=", value, "v7RTakeout");
            return (Criteria) this;
        }

        public Criteria andV7RTakeoutIn(List<Double> values) {
            addCriterion("v7_r_takeout in", values, "v7RTakeout");
            return (Criteria) this;
        }

        public Criteria andV7RTakeoutNotIn(List<Double> values) {
            addCriterion("v7_r_takeout not in", values, "v7RTakeout");
            return (Criteria) this;
        }

        public Criteria andV7RTakeoutBetween(Double value1, Double value2) {
            addCriterion("v7_r_takeout between", value1, value2, "v7RTakeout");
            return (Criteria) this;
        }

        public Criteria andV7RTakeoutNotBetween(Double value1, Double value2) {
            addCriterion("v7_r_takeout not between", value1, value2, "v7RTakeout");
            return (Criteria) this;
        }

        public Criteria andV7RTotalCardIsNull() {
            addCriterion("v7_r_total_card is null");
            return (Criteria) this;
        }

        public Criteria andV7RTotalCardIsNotNull() {
            addCriterion("v7_r_total_card is not null");
            return (Criteria) this;
        }

        public Criteria andV7RTotalCardEqualTo(Double value) {
            addCriterion("v7_r_total_card =", value, "v7RTotalCard");
            return (Criteria) this;
        }

        public Criteria andV7RTotalCardNotEqualTo(Double value) {
            addCriterion("v7_r_total_card <>", value, "v7RTotalCard");
            return (Criteria) this;
        }

        public Criteria andV7RTotalCardGreaterThan(Double value) {
            addCriterion("v7_r_total_card >", value, "v7RTotalCard");
            return (Criteria) this;
        }

        public Criteria andV7RTotalCardGreaterThanOrEqualTo(Double value) {
            addCriterion("v7_r_total_card >=", value, "v7RTotalCard");
            return (Criteria) this;
        }

        public Criteria andV7RTotalCardLessThan(Double value) {
            addCriterion("v7_r_total_card <", value, "v7RTotalCard");
            return (Criteria) this;
        }

        public Criteria andV7RTotalCardLessThanOrEqualTo(Double value) {
            addCriterion("v7_r_total_card <=", value, "v7RTotalCard");
            return (Criteria) this;
        }

        public Criteria andV7RTotalCardIn(List<Double> values) {
            addCriterion("v7_r_total_card in", values, "v7RTotalCard");
            return (Criteria) this;
        }

        public Criteria andV7RTotalCardNotIn(List<Double> values) {
            addCriterion("v7_r_total_card not in", values, "v7RTotalCard");
            return (Criteria) this;
        }

        public Criteria andV7RTotalCardBetween(Double value1, Double value2) {
            addCriterion("v7_r_total_card between", value1, value2, "v7RTotalCard");
            return (Criteria) this;
        }

        public Criteria andV7RTotalCardNotBetween(Double value1, Double value2) {
            addCriterion("v7_r_total_card not between", value1, value2, "v7RTotalCard");
            return (Criteria) this;
        }

        public Criteria andV7RTotalCashIsNull() {
            addCriterion("v7_r_total_cash is null");
            return (Criteria) this;
        }

        public Criteria andV7RTotalCashIsNotNull() {
            addCriterion("v7_r_total_cash is not null");
            return (Criteria) this;
        }

        public Criteria andV7RTotalCashEqualTo(Double value) {
            addCriterion("v7_r_total_cash =", value, "v7RTotalCash");
            return (Criteria) this;
        }

        public Criteria andV7RTotalCashNotEqualTo(Double value) {
            addCriterion("v7_r_total_cash <>", value, "v7RTotalCash");
            return (Criteria) this;
        }

        public Criteria andV7RTotalCashGreaterThan(Double value) {
            addCriterion("v7_r_total_cash >", value, "v7RTotalCash");
            return (Criteria) this;
        }

        public Criteria andV7RTotalCashGreaterThanOrEqualTo(Double value) {
            addCriterion("v7_r_total_cash >=", value, "v7RTotalCash");
            return (Criteria) this;
        }

        public Criteria andV7RTotalCashLessThan(Double value) {
            addCriterion("v7_r_total_cash <", value, "v7RTotalCash");
            return (Criteria) this;
        }

        public Criteria andV7RTotalCashLessThanOrEqualTo(Double value) {
            addCriterion("v7_r_total_cash <=", value, "v7RTotalCash");
            return (Criteria) this;
        }

        public Criteria andV7RTotalCashIn(List<Double> values) {
            addCriterion("v7_r_total_cash in", values, "v7RTotalCash");
            return (Criteria) this;
        }

        public Criteria andV7RTotalCashNotIn(List<Double> values) {
            addCriterion("v7_r_total_cash not in", values, "v7RTotalCash");
            return (Criteria) this;
        }

        public Criteria andV7RTotalCashBetween(Double value1, Double value2) {
            addCriterion("v7_r_total_cash between", value1, value2, "v7RTotalCash");
            return (Criteria) this;
        }

        public Criteria andV7RTotalCashNotBetween(Double value1, Double value2) {
            addCriterion("v7_r_total_cash not between", value1, value2, "v7RTotalCash");
            return (Criteria) this;
        }

        public Criteria andV7ROperuserIsNull() {
            addCriterion("v7_r_operuser is null");
            return (Criteria) this;
        }

        public Criteria andV7ROperuserIsNotNull() {
            addCriterion("v7_r_operuser is not null");
            return (Criteria) this;
        }

        public Criteria andV7ROperuserEqualTo(String value) {
            addCriterion("v7_r_operuser =", value, "v7ROperuser");
            return (Criteria) this;
        }

        public Criteria andV7ROperuserNotEqualTo(String value) {
            addCriterion("v7_r_operuser <>", value, "v7ROperuser");
            return (Criteria) this;
        }

        public Criteria andV7ROperuserGreaterThan(String value) {
            addCriterion("v7_r_operuser >", value, "v7ROperuser");
            return (Criteria) this;
        }

        public Criteria andV7ROperuserGreaterThanOrEqualTo(String value) {
            addCriterion("v7_r_operuser >=", value, "v7ROperuser");
            return (Criteria) this;
        }

        public Criteria andV7ROperuserLessThan(String value) {
            addCriterion("v7_r_operuser <", value, "v7ROperuser");
            return (Criteria) this;
        }

        public Criteria andV7ROperuserLessThanOrEqualTo(String value) {
            addCriterion("v7_r_operuser <=", value, "v7ROperuser");
            return (Criteria) this;
        }

        public Criteria andV7ROperuserLike(String value) {
            addCriterion("v7_r_operuser like", value, "v7ROperuser");
            return (Criteria) this;
        }

        public Criteria andV7ROperuserNotLike(String value) {
            addCriterion("v7_r_operuser not like", value, "v7ROperuser");
            return (Criteria) this;
        }

        public Criteria andV7ROperuserIn(List<String> values) {
            addCriterion("v7_r_operuser in", values, "v7ROperuser");
            return (Criteria) this;
        }

        public Criteria andV7ROperuserNotIn(List<String> values) {
            addCriterion("v7_r_operuser not in", values, "v7ROperuser");
            return (Criteria) this;
        }

        public Criteria andV7ROperuserBetween(String value1, String value2) {
            addCriterion("v7_r_operuser between", value1, value2, "v7ROperuser");
            return (Criteria) this;
        }

        public Criteria andV7ROperuserNotBetween(String value1, String value2) {
            addCriterion("v7_r_operuser not between", value1, value2, "v7ROperuser");
            return (Criteria) this;
        }

        public Criteria andV7ROpertimeIsNull() {
            addCriterion("v7_r_opertime is null");
            return (Criteria) this;
        }

        public Criteria andV7ROpertimeIsNotNull() {
            addCriterion("v7_r_opertime is not null");
            return (Criteria) this;
        }

        public Criteria andV7ROpertimeEqualTo(Date value) {
            addCriterion("v7_r_opertime =", value, "v7ROpertime");
            return (Criteria) this;
        }

        public Criteria andV7ROpertimeNotEqualTo(Date value) {
            addCriterion("v7_r_opertime <>", value, "v7ROpertime");
            return (Criteria) this;
        }

        public Criteria andV7ROpertimeGreaterThan(Date value) {
            addCriterion("v7_r_opertime >", value, "v7ROpertime");
            return (Criteria) this;
        }

        public Criteria andV7ROpertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("v7_r_opertime >=", value, "v7ROpertime");
            return (Criteria) this;
        }

        public Criteria andV7ROpertimeLessThan(Date value) {
            addCriterion("v7_r_opertime <", value, "v7ROpertime");
            return (Criteria) this;
        }

        public Criteria andV7ROpertimeLessThanOrEqualTo(Date value) {
            addCriterion("v7_r_opertime <=", value, "v7ROpertime");
            return (Criteria) this;
        }

        public Criteria andV7ROpertimeIn(List<Date> values) {
            addCriterion("v7_r_opertime in", values, "v7ROpertime");
            return (Criteria) this;
        }

        public Criteria andV7ROpertimeNotIn(List<Date> values) {
            addCriterion("v7_r_opertime not in", values, "v7ROpertime");
            return (Criteria) this;
        }

        public Criteria andV7ROpertimeBetween(Date value1, Date value2) {
            addCriterion("v7_r_opertime between", value1, value2, "v7ROpertime");
            return (Criteria) this;
        }

        public Criteria andV7ROpertimeNotBetween(Date value1, Date value2) {
            addCriterion("v7_r_opertime not between", value1, value2, "v7ROpertime");
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