package com.carrey.v7mc.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class V7RollMonthAccountsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public V7RollMonthAccountsExample() {
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

        public Criteria andV7MRollingDateIsNull() {
            addCriterion("v7_m_rolling_date is null");
            return (Criteria) this;
        }

        public Criteria andV7MRollingDateIsNotNull() {
            addCriterion("v7_m_rolling_date is not null");
            return (Criteria) this;
        }

        public Criteria andV7MRollingDateEqualTo(String value) {
            addCriterion("v7_m_rolling_date =", value, "v7MRollingDate");
            return (Criteria) this;
        }

        public Criteria andV7MRollingDateNotEqualTo(String value) {
            addCriterion("v7_m_rolling_date <>", value, "v7MRollingDate");
            return (Criteria) this;
        }

        public Criteria andV7MRollingDateGreaterThan(String value) {
            addCriterion("v7_m_rolling_date >", value, "v7MRollingDate");
            return (Criteria) this;
        }

        public Criteria andV7MRollingDateGreaterThanOrEqualTo(String value) {
            addCriterion("v7_m_rolling_date >=", value, "v7MRollingDate");
            return (Criteria) this;
        }

        public Criteria andV7MRollingDateLessThan(String value) {
            addCriterion("v7_m_rolling_date <", value, "v7MRollingDate");
            return (Criteria) this;
        }

        public Criteria andV7MRollingDateLessThanOrEqualTo(String value) {
            addCriterion("v7_m_rolling_date <=", value, "v7MRollingDate");
            return (Criteria) this;
        }

        public Criteria andV7MRollingDateLike(String value) {
            addCriterion("v7_m_rolling_date like", value, "v7MRollingDate");
            return (Criteria) this;
        }

        public Criteria andV7MRollingDateNotLike(String value) {
            addCriterion("v7_m_rolling_date not like", value, "v7MRollingDate");
            return (Criteria) this;
        }

        public Criteria andV7MRollingDateIn(List<String> values) {
            addCriterion("v7_m_rolling_date in", values, "v7MRollingDate");
            return (Criteria) this;
        }

        public Criteria andV7MRollingDateNotIn(List<String> values) {
            addCriterion("v7_m_rolling_date not in", values, "v7MRollingDate");
            return (Criteria) this;
        }

        public Criteria andV7MRollingDateBetween(String value1, String value2) {
            addCriterion("v7_m_rolling_date between", value1, value2, "v7MRollingDate");
            return (Criteria) this;
        }

        public Criteria andV7MRollingDateNotBetween(String value1, String value2) {
            addCriterion("v7_m_rolling_date not between", value1, value2, "v7MRollingDate");
            return (Criteria) this;
        }

        public Criteria andV7MCashIsNull() {
            addCriterion("v7_m_cash is null");
            return (Criteria) this;
        }

        public Criteria andV7MCashIsNotNull() {
            addCriterion("v7_m_cash is not null");
            return (Criteria) this;
        }

        public Criteria andV7MCashEqualTo(Double value) {
            addCriterion("v7_m_cash =", value, "v7MCash");
            return (Criteria) this;
        }

        public Criteria andV7MCashNotEqualTo(Double value) {
            addCriterion("v7_m_cash <>", value, "v7MCash");
            return (Criteria) this;
        }

        public Criteria andV7MCashGreaterThan(Double value) {
            addCriterion("v7_m_cash >", value, "v7MCash");
            return (Criteria) this;
        }

        public Criteria andV7MCashGreaterThanOrEqualTo(Double value) {
            addCriterion("v7_m_cash >=", value, "v7MCash");
            return (Criteria) this;
        }

        public Criteria andV7MCashLessThan(Double value) {
            addCriterion("v7_m_cash <", value, "v7MCash");
            return (Criteria) this;
        }

        public Criteria andV7MCashLessThanOrEqualTo(Double value) {
            addCriterion("v7_m_cash <=", value, "v7MCash");
            return (Criteria) this;
        }

        public Criteria andV7MCashIn(List<Double> values) {
            addCriterion("v7_m_cash in", values, "v7MCash");
            return (Criteria) this;
        }

        public Criteria andV7MCashNotIn(List<Double> values) {
            addCriterion("v7_m_cash not in", values, "v7MCash");
            return (Criteria) this;
        }

        public Criteria andV7MCashBetween(Double value1, Double value2) {
            addCriterion("v7_m_cash between", value1, value2, "v7MCash");
            return (Criteria) this;
        }

        public Criteria andV7MCashNotBetween(Double value1, Double value2) {
            addCriterion("v7_m_cash not between", value1, value2, "v7MCash");
            return (Criteria) this;
        }

        public Criteria andV7MVipoutIsNull() {
            addCriterion("v7_m_vipout is null");
            return (Criteria) this;
        }

        public Criteria andV7MVipoutIsNotNull() {
            addCriterion("v7_m_vipout is not null");
            return (Criteria) this;
        }

        public Criteria andV7MVipoutEqualTo(Double value) {
            addCriterion("v7_m_vipout =", value, "v7MVipout");
            return (Criteria) this;
        }

        public Criteria andV7MVipoutNotEqualTo(Double value) {
            addCriterion("v7_m_vipout <>", value, "v7MVipout");
            return (Criteria) this;
        }

        public Criteria andV7MVipoutGreaterThan(Double value) {
            addCriterion("v7_m_vipout >", value, "v7MVipout");
            return (Criteria) this;
        }

        public Criteria andV7MVipoutGreaterThanOrEqualTo(Double value) {
            addCriterion("v7_m_vipout >=", value, "v7MVipout");
            return (Criteria) this;
        }

        public Criteria andV7MVipoutLessThan(Double value) {
            addCriterion("v7_m_vipout <", value, "v7MVipout");
            return (Criteria) this;
        }

        public Criteria andV7MVipoutLessThanOrEqualTo(Double value) {
            addCriterion("v7_m_vipout <=", value, "v7MVipout");
            return (Criteria) this;
        }

        public Criteria andV7MVipoutIn(List<Double> values) {
            addCriterion("v7_m_vipout in", values, "v7MVipout");
            return (Criteria) this;
        }

        public Criteria andV7MVipoutNotIn(List<Double> values) {
            addCriterion("v7_m_vipout not in", values, "v7MVipout");
            return (Criteria) this;
        }

        public Criteria andV7MVipoutBetween(Double value1, Double value2) {
            addCriterion("v7_m_vipout between", value1, value2, "v7MVipout");
            return (Criteria) this;
        }

        public Criteria andV7MVipoutNotBetween(Double value1, Double value2) {
            addCriterion("v7_m_vipout not between", value1, value2, "v7MVipout");
            return (Criteria) this;
        }

        public Criteria andV7MHedgeoutIsNull() {
            addCriterion("v7_m_hedgeout is null");
            return (Criteria) this;
        }

        public Criteria andV7MHedgeoutIsNotNull() {
            addCriterion("v7_m_hedgeout is not null");
            return (Criteria) this;
        }

        public Criteria andV7MHedgeoutEqualTo(Double value) {
            addCriterion("v7_m_hedgeout =", value, "v7MHedgeout");
            return (Criteria) this;
        }

        public Criteria andV7MHedgeoutNotEqualTo(Double value) {
            addCriterion("v7_m_hedgeout <>", value, "v7MHedgeout");
            return (Criteria) this;
        }

        public Criteria andV7MHedgeoutGreaterThan(Double value) {
            addCriterion("v7_m_hedgeout >", value, "v7MHedgeout");
            return (Criteria) this;
        }

        public Criteria andV7MHedgeoutGreaterThanOrEqualTo(Double value) {
            addCriterion("v7_m_hedgeout >=", value, "v7MHedgeout");
            return (Criteria) this;
        }

        public Criteria andV7MHedgeoutLessThan(Double value) {
            addCriterion("v7_m_hedgeout <", value, "v7MHedgeout");
            return (Criteria) this;
        }

        public Criteria andV7MHedgeoutLessThanOrEqualTo(Double value) {
            addCriterion("v7_m_hedgeout <=", value, "v7MHedgeout");
            return (Criteria) this;
        }

        public Criteria andV7MHedgeoutIn(List<Double> values) {
            addCriterion("v7_m_hedgeout in", values, "v7MHedgeout");
            return (Criteria) this;
        }

        public Criteria andV7MHedgeoutNotIn(List<Double> values) {
            addCriterion("v7_m_hedgeout not in", values, "v7MHedgeout");
            return (Criteria) this;
        }

        public Criteria andV7MHedgeoutBetween(Double value1, Double value2) {
            addCriterion("v7_m_hedgeout between", value1, value2, "v7MHedgeout");
            return (Criteria) this;
        }

        public Criteria andV7MHedgeoutNotBetween(Double value1, Double value2) {
            addCriterion("v7_m_hedgeout not between", value1, value2, "v7MHedgeout");
            return (Criteria) this;
        }

        public Criteria andV7MHedgecashinIsNull() {
            addCriterion("v7_m_hedgecashin is null");
            return (Criteria) this;
        }

        public Criteria andV7MHedgecashinIsNotNull() {
            addCriterion("v7_m_hedgecashin is not null");
            return (Criteria) this;
        }

        public Criteria andV7MHedgecashinEqualTo(Double value) {
            addCriterion("v7_m_hedgecashin =", value, "v7MHedgecashin");
            return (Criteria) this;
        }

        public Criteria andV7MHedgecashinNotEqualTo(Double value) {
            addCriterion("v7_m_hedgecashin <>", value, "v7MHedgecashin");
            return (Criteria) this;
        }

        public Criteria andV7MHedgecashinGreaterThan(Double value) {
            addCriterion("v7_m_hedgecashin >", value, "v7MHedgecashin");
            return (Criteria) this;
        }

        public Criteria andV7MHedgecashinGreaterThanOrEqualTo(Double value) {
            addCriterion("v7_m_hedgecashin >=", value, "v7MHedgecashin");
            return (Criteria) this;
        }

        public Criteria andV7MHedgecashinLessThan(Double value) {
            addCriterion("v7_m_hedgecashin <", value, "v7MHedgecashin");
            return (Criteria) this;
        }

        public Criteria andV7MHedgecashinLessThanOrEqualTo(Double value) {
            addCriterion("v7_m_hedgecashin <=", value, "v7MHedgecashin");
            return (Criteria) this;
        }

        public Criteria andV7MHedgecashinIn(List<Double> values) {
            addCriterion("v7_m_hedgecashin in", values, "v7MHedgecashin");
            return (Criteria) this;
        }

        public Criteria andV7MHedgecashinNotIn(List<Double> values) {
            addCriterion("v7_m_hedgecashin not in", values, "v7MHedgecashin");
            return (Criteria) this;
        }

        public Criteria andV7MHedgecashinBetween(Double value1, Double value2) {
            addCriterion("v7_m_hedgecashin between", value1, value2, "v7MHedgecashin");
            return (Criteria) this;
        }

        public Criteria andV7MHedgecashinNotBetween(Double value1, Double value2) {
            addCriterion("v7_m_hedgecashin not between", value1, value2, "v7MHedgecashin");
            return (Criteria) this;
        }

        public Criteria andV7MBlowwashoutIsNull() {
            addCriterion("v7_m_blowwashout is null");
            return (Criteria) this;
        }

        public Criteria andV7MBlowwashoutIsNotNull() {
            addCriterion("v7_m_blowwashout is not null");
            return (Criteria) this;
        }

        public Criteria andV7MBlowwashoutEqualTo(Integer value) {
            addCriterion("v7_m_blowwashout =", value, "v7MBlowwashout");
            return (Criteria) this;
        }

        public Criteria andV7MBlowwashoutNotEqualTo(Integer value) {
            addCriterion("v7_m_blowwashout <>", value, "v7MBlowwashout");
            return (Criteria) this;
        }

        public Criteria andV7MBlowwashoutGreaterThan(Integer value) {
            addCriterion("v7_m_blowwashout >", value, "v7MBlowwashout");
            return (Criteria) this;
        }

        public Criteria andV7MBlowwashoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("v7_m_blowwashout >=", value, "v7MBlowwashout");
            return (Criteria) this;
        }

        public Criteria andV7MBlowwashoutLessThan(Integer value) {
            addCriterion("v7_m_blowwashout <", value, "v7MBlowwashout");
            return (Criteria) this;
        }

        public Criteria andV7MBlowwashoutLessThanOrEqualTo(Integer value) {
            addCriterion("v7_m_blowwashout <=", value, "v7MBlowwashout");
            return (Criteria) this;
        }

        public Criteria andV7MBlowwashoutIn(List<Integer> values) {
            addCriterion("v7_m_blowwashout in", values, "v7MBlowwashout");
            return (Criteria) this;
        }

        public Criteria andV7MBlowwashoutNotIn(List<Integer> values) {
            addCriterion("v7_m_blowwashout not in", values, "v7MBlowwashout");
            return (Criteria) this;
        }

        public Criteria andV7MBlowwashoutBetween(Integer value1, Integer value2) {
            addCriterion("v7_m_blowwashout between", value1, value2, "v7MBlowwashout");
            return (Criteria) this;
        }

        public Criteria andV7MBlowwashoutNotBetween(Integer value1, Integer value2) {
            addCriterion("v7_m_blowwashout not between", value1, value2, "v7MBlowwashout");
            return (Criteria) this;
        }

        public Criteria andV7MBlowcutwashoutIsNull() {
            addCriterion("v7_m_blowcutwashout is null");
            return (Criteria) this;
        }

        public Criteria andV7MBlowcutwashoutIsNotNull() {
            addCriterion("v7_m_blowcutwashout is not null");
            return (Criteria) this;
        }

        public Criteria andV7MBlowcutwashoutEqualTo(Integer value) {
            addCriterion("v7_m_blowcutwashout =", value, "v7MBlowcutwashout");
            return (Criteria) this;
        }

        public Criteria andV7MBlowcutwashoutNotEqualTo(Integer value) {
            addCriterion("v7_m_blowcutwashout <>", value, "v7MBlowcutwashout");
            return (Criteria) this;
        }

        public Criteria andV7MBlowcutwashoutGreaterThan(Integer value) {
            addCriterion("v7_m_blowcutwashout >", value, "v7MBlowcutwashout");
            return (Criteria) this;
        }

        public Criteria andV7MBlowcutwashoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("v7_m_blowcutwashout >=", value, "v7MBlowcutwashout");
            return (Criteria) this;
        }

        public Criteria andV7MBlowcutwashoutLessThan(Integer value) {
            addCriterion("v7_m_blowcutwashout <", value, "v7MBlowcutwashout");
            return (Criteria) this;
        }

        public Criteria andV7MBlowcutwashoutLessThanOrEqualTo(Integer value) {
            addCriterion("v7_m_blowcutwashout <=", value, "v7MBlowcutwashout");
            return (Criteria) this;
        }

        public Criteria andV7MBlowcutwashoutIn(List<Integer> values) {
            addCriterion("v7_m_blowcutwashout in", values, "v7MBlowcutwashout");
            return (Criteria) this;
        }

        public Criteria andV7MBlowcutwashoutNotIn(List<Integer> values) {
            addCriterion("v7_m_blowcutwashout not in", values, "v7MBlowcutwashout");
            return (Criteria) this;
        }

        public Criteria andV7MBlowcutwashoutBetween(Integer value1, Integer value2) {
            addCriterion("v7_m_blowcutwashout between", value1, value2, "v7MBlowcutwashout");
            return (Criteria) this;
        }

        public Criteria andV7MBlowcutwashoutNotBetween(Integer value1, Integer value2) {
            addCriterion("v7_m_blowcutwashout not between", value1, value2, "v7MBlowcutwashout");
            return (Criteria) this;
        }

        public Criteria andV7MVipinIsNull() {
            addCriterion("v7_m_vipin is null");
            return (Criteria) this;
        }

        public Criteria andV7MVipinIsNotNull() {
            addCriterion("v7_m_vipin is not null");
            return (Criteria) this;
        }

        public Criteria andV7MVipinEqualTo(Integer value) {
            addCriterion("v7_m_vipin =", value, "v7MVipin");
            return (Criteria) this;
        }

        public Criteria andV7MVipinNotEqualTo(Integer value) {
            addCriterion("v7_m_vipin <>", value, "v7MVipin");
            return (Criteria) this;
        }

        public Criteria andV7MVipinGreaterThan(Integer value) {
            addCriterion("v7_m_vipin >", value, "v7MVipin");
            return (Criteria) this;
        }

        public Criteria andV7MVipinGreaterThanOrEqualTo(Integer value) {
            addCriterion("v7_m_vipin >=", value, "v7MVipin");
            return (Criteria) this;
        }

        public Criteria andV7MVipinLessThan(Integer value) {
            addCriterion("v7_m_vipin <", value, "v7MVipin");
            return (Criteria) this;
        }

        public Criteria andV7MVipinLessThanOrEqualTo(Integer value) {
            addCriterion("v7_m_vipin <=", value, "v7MVipin");
            return (Criteria) this;
        }

        public Criteria andV7MVipinIn(List<Integer> values) {
            addCriterion("v7_m_vipin in", values, "v7MVipin");
            return (Criteria) this;
        }

        public Criteria andV7MVipinNotIn(List<Integer> values) {
            addCriterion("v7_m_vipin not in", values, "v7MVipin");
            return (Criteria) this;
        }

        public Criteria andV7MVipinBetween(Integer value1, Integer value2) {
            addCriterion("v7_m_vipin between", value1, value2, "v7MVipin");
            return (Criteria) this;
        }

        public Criteria andV7MVipinNotBetween(Integer value1, Integer value2) {
            addCriterion("v7_m_vipin not between", value1, value2, "v7MVipin");
            return (Criteria) this;
        }

        public Criteria andV7MHedgeinIsNull() {
            addCriterion("v7_m_hedgein is null");
            return (Criteria) this;
        }

        public Criteria andV7MHedgeinIsNotNull() {
            addCriterion("v7_m_hedgein is not null");
            return (Criteria) this;
        }

        public Criteria andV7MHedgeinEqualTo(Integer value) {
            addCriterion("v7_m_hedgein =", value, "v7MHedgein");
            return (Criteria) this;
        }

        public Criteria andV7MHedgeinNotEqualTo(Integer value) {
            addCriterion("v7_m_hedgein <>", value, "v7MHedgein");
            return (Criteria) this;
        }

        public Criteria andV7MHedgeinGreaterThan(Integer value) {
            addCriterion("v7_m_hedgein >", value, "v7MHedgein");
            return (Criteria) this;
        }

        public Criteria andV7MHedgeinGreaterThanOrEqualTo(Integer value) {
            addCriterion("v7_m_hedgein >=", value, "v7MHedgein");
            return (Criteria) this;
        }

        public Criteria andV7MHedgeinLessThan(Integer value) {
            addCriterion("v7_m_hedgein <", value, "v7MHedgein");
            return (Criteria) this;
        }

        public Criteria andV7MHedgeinLessThanOrEqualTo(Integer value) {
            addCriterion("v7_m_hedgein <=", value, "v7MHedgein");
            return (Criteria) this;
        }

        public Criteria andV7MHedgeinIn(List<Integer> values) {
            addCriterion("v7_m_hedgein in", values, "v7MHedgein");
            return (Criteria) this;
        }

        public Criteria andV7MHedgeinNotIn(List<Integer> values) {
            addCriterion("v7_m_hedgein not in", values, "v7MHedgein");
            return (Criteria) this;
        }

        public Criteria andV7MHedgeinBetween(Integer value1, Integer value2) {
            addCriterion("v7_m_hedgein between", value1, value2, "v7MHedgein");
            return (Criteria) this;
        }

        public Criteria andV7MHedgeinNotBetween(Integer value1, Integer value2) {
            addCriterion("v7_m_hedgein not between", value1, value2, "v7MHedgein");
            return (Criteria) this;
        }

        public Criteria andV7MBlowwashinIsNull() {
            addCriterion("v7_m_blowwashin is null");
            return (Criteria) this;
        }

        public Criteria andV7MBlowwashinIsNotNull() {
            addCriterion("v7_m_blowwashin is not null");
            return (Criteria) this;
        }

        public Criteria andV7MBlowwashinEqualTo(Integer value) {
            addCriterion("v7_m_blowwashin =", value, "v7MBlowwashin");
            return (Criteria) this;
        }

        public Criteria andV7MBlowwashinNotEqualTo(Integer value) {
            addCriterion("v7_m_blowwashin <>", value, "v7MBlowwashin");
            return (Criteria) this;
        }

        public Criteria andV7MBlowwashinGreaterThan(Integer value) {
            addCriterion("v7_m_blowwashin >", value, "v7MBlowwashin");
            return (Criteria) this;
        }

        public Criteria andV7MBlowwashinGreaterThanOrEqualTo(Integer value) {
            addCriterion("v7_m_blowwashin >=", value, "v7MBlowwashin");
            return (Criteria) this;
        }

        public Criteria andV7MBlowwashinLessThan(Integer value) {
            addCriterion("v7_m_blowwashin <", value, "v7MBlowwashin");
            return (Criteria) this;
        }

        public Criteria andV7MBlowwashinLessThanOrEqualTo(Integer value) {
            addCriterion("v7_m_blowwashin <=", value, "v7MBlowwashin");
            return (Criteria) this;
        }

        public Criteria andV7MBlowwashinIn(List<Integer> values) {
            addCriterion("v7_m_blowwashin in", values, "v7MBlowwashin");
            return (Criteria) this;
        }

        public Criteria andV7MBlowwashinNotIn(List<Integer> values) {
            addCriterion("v7_m_blowwashin not in", values, "v7MBlowwashin");
            return (Criteria) this;
        }

        public Criteria andV7MBlowwashinBetween(Integer value1, Integer value2) {
            addCriterion("v7_m_blowwashin between", value1, value2, "v7MBlowwashin");
            return (Criteria) this;
        }

        public Criteria andV7MBlowwashinNotBetween(Integer value1, Integer value2) {
            addCriterion("v7_m_blowwashin not between", value1, value2, "v7MBlowwashin");
            return (Criteria) this;
        }

        public Criteria andV7MBlowcutwashinIsNull() {
            addCriterion("v7_m_blowcutwashin is null");
            return (Criteria) this;
        }

        public Criteria andV7MBlowcutwashinIsNotNull() {
            addCriterion("v7_m_blowcutwashin is not null");
            return (Criteria) this;
        }

        public Criteria andV7MBlowcutwashinEqualTo(Integer value) {
            addCriterion("v7_m_blowcutwashin =", value, "v7MBlowcutwashin");
            return (Criteria) this;
        }

        public Criteria andV7MBlowcutwashinNotEqualTo(Integer value) {
            addCriterion("v7_m_blowcutwashin <>", value, "v7MBlowcutwashin");
            return (Criteria) this;
        }

        public Criteria andV7MBlowcutwashinGreaterThan(Integer value) {
            addCriterion("v7_m_blowcutwashin >", value, "v7MBlowcutwashin");
            return (Criteria) this;
        }

        public Criteria andV7MBlowcutwashinGreaterThanOrEqualTo(Integer value) {
            addCriterion("v7_m_blowcutwashin >=", value, "v7MBlowcutwashin");
            return (Criteria) this;
        }

        public Criteria andV7MBlowcutwashinLessThan(Integer value) {
            addCriterion("v7_m_blowcutwashin <", value, "v7MBlowcutwashin");
            return (Criteria) this;
        }

        public Criteria andV7MBlowcutwashinLessThanOrEqualTo(Integer value) {
            addCriterion("v7_m_blowcutwashin <=", value, "v7MBlowcutwashin");
            return (Criteria) this;
        }

        public Criteria andV7MBlowcutwashinIn(List<Integer> values) {
            addCriterion("v7_m_blowcutwashin in", values, "v7MBlowcutwashin");
            return (Criteria) this;
        }

        public Criteria andV7MBlowcutwashinNotIn(List<Integer> values) {
            addCriterion("v7_m_blowcutwashin not in", values, "v7MBlowcutwashin");
            return (Criteria) this;
        }

        public Criteria andV7MBlowcutwashinBetween(Integer value1, Integer value2) {
            addCriterion("v7_m_blowcutwashin between", value1, value2, "v7MBlowcutwashin");
            return (Criteria) this;
        }

        public Criteria andV7MBlowcutwashinNotBetween(Integer value1, Integer value2) {
            addCriterion("v7_m_blowcutwashin not between", value1, value2, "v7MBlowcutwashin");
            return (Criteria) this;
        }

        public Criteria andV7MCardmoneyIsNull() {
            addCriterion("v7_m_cardmoney is null");
            return (Criteria) this;
        }

        public Criteria andV7MCardmoneyIsNotNull() {
            addCriterion("v7_m_cardmoney is not null");
            return (Criteria) this;
        }

        public Criteria andV7MCardmoneyEqualTo(Double value) {
            addCriterion("v7_m_cardmoney =", value, "v7MCardmoney");
            return (Criteria) this;
        }

        public Criteria andV7MCardmoneyNotEqualTo(Double value) {
            addCriterion("v7_m_cardmoney <>", value, "v7MCardmoney");
            return (Criteria) this;
        }

        public Criteria andV7MCardmoneyGreaterThan(Double value) {
            addCriterion("v7_m_cardmoney >", value, "v7MCardmoney");
            return (Criteria) this;
        }

        public Criteria andV7MCardmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("v7_m_cardmoney >=", value, "v7MCardmoney");
            return (Criteria) this;
        }

        public Criteria andV7MCardmoneyLessThan(Double value) {
            addCriterion("v7_m_cardmoney <", value, "v7MCardmoney");
            return (Criteria) this;
        }

        public Criteria andV7MCardmoneyLessThanOrEqualTo(Double value) {
            addCriterion("v7_m_cardmoney <=", value, "v7MCardmoney");
            return (Criteria) this;
        }

        public Criteria andV7MCardmoneyIn(List<Double> values) {
            addCriterion("v7_m_cardmoney in", values, "v7MCardmoney");
            return (Criteria) this;
        }

        public Criteria andV7MCardmoneyNotIn(List<Double> values) {
            addCriterion("v7_m_cardmoney not in", values, "v7MCardmoney");
            return (Criteria) this;
        }

        public Criteria andV7MCardmoneyBetween(Double value1, Double value2) {
            addCriterion("v7_m_cardmoney between", value1, value2, "v7MCardmoney");
            return (Criteria) this;
        }

        public Criteria andV7MCardmoneyNotBetween(Double value1, Double value2) {
            addCriterion("v7_m_cardmoney not between", value1, value2, "v7MCardmoney");
            return (Criteria) this;
        }

        public Criteria andV7MRaiseamountIsNull() {
            addCriterion("v7_m_raiseamount is null");
            return (Criteria) this;
        }

        public Criteria andV7MRaiseamountIsNotNull() {
            addCriterion("v7_m_raiseamount is not null");
            return (Criteria) this;
        }

        public Criteria andV7MRaiseamountEqualTo(Double value) {
            addCriterion("v7_m_raiseamount =", value, "v7MRaiseamount");
            return (Criteria) this;
        }

        public Criteria andV7MRaiseamountNotEqualTo(Double value) {
            addCriterion("v7_m_raiseamount <>", value, "v7MRaiseamount");
            return (Criteria) this;
        }

        public Criteria andV7MRaiseamountGreaterThan(Double value) {
            addCriterion("v7_m_raiseamount >", value, "v7MRaiseamount");
            return (Criteria) this;
        }

        public Criteria andV7MRaiseamountGreaterThanOrEqualTo(Double value) {
            addCriterion("v7_m_raiseamount >=", value, "v7MRaiseamount");
            return (Criteria) this;
        }

        public Criteria andV7MRaiseamountLessThan(Double value) {
            addCriterion("v7_m_raiseamount <", value, "v7MRaiseamount");
            return (Criteria) this;
        }

        public Criteria andV7MRaiseamountLessThanOrEqualTo(Double value) {
            addCriterion("v7_m_raiseamount <=", value, "v7MRaiseamount");
            return (Criteria) this;
        }

        public Criteria andV7MRaiseamountIn(List<Double> values) {
            addCriterion("v7_m_raiseamount in", values, "v7MRaiseamount");
            return (Criteria) this;
        }

        public Criteria andV7MRaiseamountNotIn(List<Double> values) {
            addCriterion("v7_m_raiseamount not in", values, "v7MRaiseamount");
            return (Criteria) this;
        }

        public Criteria andV7MRaiseamountBetween(Double value1, Double value2) {
            addCriterion("v7_m_raiseamount between", value1, value2, "v7MRaiseamount");
            return (Criteria) this;
        }

        public Criteria andV7MRaiseamountNotBetween(Double value1, Double value2) {
            addCriterion("v7_m_raiseamount not between", value1, value2, "v7MRaiseamount");
            return (Criteria) this;
        }

        public Criteria andV7MTakeoutIsNull() {
            addCriterion("v7_m_takeout is null");
            return (Criteria) this;
        }

        public Criteria andV7MTakeoutIsNotNull() {
            addCriterion("v7_m_takeout is not null");
            return (Criteria) this;
        }

        public Criteria andV7MTakeoutEqualTo(Double value) {
            addCriterion("v7_m_takeout =", value, "v7MTakeout");
            return (Criteria) this;
        }

        public Criteria andV7MTakeoutNotEqualTo(Double value) {
            addCriterion("v7_m_takeout <>", value, "v7MTakeout");
            return (Criteria) this;
        }

        public Criteria andV7MTakeoutGreaterThan(Double value) {
            addCriterion("v7_m_takeout >", value, "v7MTakeout");
            return (Criteria) this;
        }

        public Criteria andV7MTakeoutGreaterThanOrEqualTo(Double value) {
            addCriterion("v7_m_takeout >=", value, "v7MTakeout");
            return (Criteria) this;
        }

        public Criteria andV7MTakeoutLessThan(Double value) {
            addCriterion("v7_m_takeout <", value, "v7MTakeout");
            return (Criteria) this;
        }

        public Criteria andV7MTakeoutLessThanOrEqualTo(Double value) {
            addCriterion("v7_m_takeout <=", value, "v7MTakeout");
            return (Criteria) this;
        }

        public Criteria andV7MTakeoutIn(List<Double> values) {
            addCriterion("v7_m_takeout in", values, "v7MTakeout");
            return (Criteria) this;
        }

        public Criteria andV7MTakeoutNotIn(List<Double> values) {
            addCriterion("v7_m_takeout not in", values, "v7MTakeout");
            return (Criteria) this;
        }

        public Criteria andV7MTakeoutBetween(Double value1, Double value2) {
            addCriterion("v7_m_takeout between", value1, value2, "v7MTakeout");
            return (Criteria) this;
        }

        public Criteria andV7MTakeoutNotBetween(Double value1, Double value2) {
            addCriterion("v7_m_takeout not between", value1, value2, "v7MTakeout");
            return (Criteria) this;
        }

        public Criteria andV7MTotalCardIsNull() {
            addCriterion("v7_m_total_card is null");
            return (Criteria) this;
        }

        public Criteria andV7MTotalCardIsNotNull() {
            addCriterion("v7_m_total_card is not null");
            return (Criteria) this;
        }

        public Criteria andV7MTotalCardEqualTo(Double value) {
            addCriterion("v7_m_total_card =", value, "v7MTotalCard");
            return (Criteria) this;
        }

        public Criteria andV7MTotalCardNotEqualTo(Double value) {
            addCriterion("v7_m_total_card <>", value, "v7MTotalCard");
            return (Criteria) this;
        }

        public Criteria andV7MTotalCardGreaterThan(Double value) {
            addCriterion("v7_m_total_card >", value, "v7MTotalCard");
            return (Criteria) this;
        }

        public Criteria andV7MTotalCardGreaterThanOrEqualTo(Double value) {
            addCriterion("v7_m_total_card >=", value, "v7MTotalCard");
            return (Criteria) this;
        }

        public Criteria andV7MTotalCardLessThan(Double value) {
            addCriterion("v7_m_total_card <", value, "v7MTotalCard");
            return (Criteria) this;
        }

        public Criteria andV7MTotalCardLessThanOrEqualTo(Double value) {
            addCriterion("v7_m_total_card <=", value, "v7MTotalCard");
            return (Criteria) this;
        }

        public Criteria andV7MTotalCardIn(List<Double> values) {
            addCriterion("v7_m_total_card in", values, "v7MTotalCard");
            return (Criteria) this;
        }

        public Criteria andV7MTotalCardNotIn(List<Double> values) {
            addCriterion("v7_m_total_card not in", values, "v7MTotalCard");
            return (Criteria) this;
        }

        public Criteria andV7MTotalCardBetween(Double value1, Double value2) {
            addCriterion("v7_m_total_card between", value1, value2, "v7MTotalCard");
            return (Criteria) this;
        }

        public Criteria andV7MTotalCardNotBetween(Double value1, Double value2) {
            addCriterion("v7_m_total_card not between", value1, value2, "v7MTotalCard");
            return (Criteria) this;
        }

        public Criteria andV7MTotalCashIsNull() {
            addCriterion("v7_m_total_cash is null");
            return (Criteria) this;
        }

        public Criteria andV7MTotalCashIsNotNull() {
            addCriterion("v7_m_total_cash is not null");
            return (Criteria) this;
        }

        public Criteria andV7MTotalCashEqualTo(Double value) {
            addCriterion("v7_m_total_cash =", value, "v7MTotalCash");
            return (Criteria) this;
        }

        public Criteria andV7MTotalCashNotEqualTo(Double value) {
            addCriterion("v7_m_total_cash <>", value, "v7MTotalCash");
            return (Criteria) this;
        }

        public Criteria andV7MTotalCashGreaterThan(Double value) {
            addCriterion("v7_m_total_cash >", value, "v7MTotalCash");
            return (Criteria) this;
        }

        public Criteria andV7MTotalCashGreaterThanOrEqualTo(Double value) {
            addCriterion("v7_m_total_cash >=", value, "v7MTotalCash");
            return (Criteria) this;
        }

        public Criteria andV7MTotalCashLessThan(Double value) {
            addCriterion("v7_m_total_cash <", value, "v7MTotalCash");
            return (Criteria) this;
        }

        public Criteria andV7MTotalCashLessThanOrEqualTo(Double value) {
            addCriterion("v7_m_total_cash <=", value, "v7MTotalCash");
            return (Criteria) this;
        }

        public Criteria andV7MTotalCashIn(List<Double> values) {
            addCriterion("v7_m_total_cash in", values, "v7MTotalCash");
            return (Criteria) this;
        }

        public Criteria andV7MTotalCashNotIn(List<Double> values) {
            addCriterion("v7_m_total_cash not in", values, "v7MTotalCash");
            return (Criteria) this;
        }

        public Criteria andV7MTotalCashBetween(Double value1, Double value2) {
            addCriterion("v7_m_total_cash between", value1, value2, "v7MTotalCash");
            return (Criteria) this;
        }

        public Criteria andV7MTotalCashNotBetween(Double value1, Double value2) {
            addCriterion("v7_m_total_cash not between", value1, value2, "v7MTotalCash");
            return (Criteria) this;
        }

        public Criteria andV7MOperuserIsNull() {
            addCriterion("v7_m_operuser is null");
            return (Criteria) this;
        }

        public Criteria andV7MOperuserIsNotNull() {
            addCriterion("v7_m_operuser is not null");
            return (Criteria) this;
        }

        public Criteria andV7MOperuserEqualTo(String value) {
            addCriterion("v7_m_operuser =", value, "v7MOperuser");
            return (Criteria) this;
        }

        public Criteria andV7MOperuserNotEqualTo(String value) {
            addCriterion("v7_m_operuser <>", value, "v7MOperuser");
            return (Criteria) this;
        }

        public Criteria andV7MOperuserGreaterThan(String value) {
            addCriterion("v7_m_operuser >", value, "v7MOperuser");
            return (Criteria) this;
        }

        public Criteria andV7MOperuserGreaterThanOrEqualTo(String value) {
            addCriterion("v7_m_operuser >=", value, "v7MOperuser");
            return (Criteria) this;
        }

        public Criteria andV7MOperuserLessThan(String value) {
            addCriterion("v7_m_operuser <", value, "v7MOperuser");
            return (Criteria) this;
        }

        public Criteria andV7MOperuserLessThanOrEqualTo(String value) {
            addCriterion("v7_m_operuser <=", value, "v7MOperuser");
            return (Criteria) this;
        }

        public Criteria andV7MOperuserLike(String value) {
            addCriterion("v7_m_operuser like", value, "v7MOperuser");
            return (Criteria) this;
        }

        public Criteria andV7MOperuserNotLike(String value) {
            addCriterion("v7_m_operuser not like", value, "v7MOperuser");
            return (Criteria) this;
        }

        public Criteria andV7MOperuserIn(List<String> values) {
            addCriterion("v7_m_operuser in", values, "v7MOperuser");
            return (Criteria) this;
        }

        public Criteria andV7MOperuserNotIn(List<String> values) {
            addCriterion("v7_m_operuser not in", values, "v7MOperuser");
            return (Criteria) this;
        }

        public Criteria andV7MOperuserBetween(String value1, String value2) {
            addCriterion("v7_m_operuser between", value1, value2, "v7MOperuser");
            return (Criteria) this;
        }

        public Criteria andV7MOperuserNotBetween(String value1, String value2) {
            addCriterion("v7_m_operuser not between", value1, value2, "v7MOperuser");
            return (Criteria) this;
        }

        public Criteria andV7MOpertimeIsNull() {
            addCriterion("v7_m_opertime is null");
            return (Criteria) this;
        }

        public Criteria andV7MOpertimeIsNotNull() {
            addCriterion("v7_m_opertime is not null");
            return (Criteria) this;
        }

        public Criteria andV7MOpertimeEqualTo(Date value) {
            addCriterion("v7_m_opertime =", value, "v7MOpertime");
            return (Criteria) this;
        }

        public Criteria andV7MOpertimeNotEqualTo(Date value) {
            addCriterion("v7_m_opertime <>", value, "v7MOpertime");
            return (Criteria) this;
        }

        public Criteria andV7MOpertimeGreaterThan(Date value) {
            addCriterion("v7_m_opertime >", value, "v7MOpertime");
            return (Criteria) this;
        }

        public Criteria andV7MOpertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("v7_m_opertime >=", value, "v7MOpertime");
            return (Criteria) this;
        }

        public Criteria andV7MOpertimeLessThan(Date value) {
            addCriterion("v7_m_opertime <", value, "v7MOpertime");
            return (Criteria) this;
        }

        public Criteria andV7MOpertimeLessThanOrEqualTo(Date value) {
            addCriterion("v7_m_opertime <=", value, "v7MOpertime");
            return (Criteria) this;
        }

        public Criteria andV7MOpertimeIn(List<Date> values) {
            addCriterion("v7_m_opertime in", values, "v7MOpertime");
            return (Criteria) this;
        }

        public Criteria andV7MOpertimeNotIn(List<Date> values) {
            addCriterion("v7_m_opertime not in", values, "v7MOpertime");
            return (Criteria) this;
        }

        public Criteria andV7MOpertimeBetween(Date value1, Date value2) {
            addCriterion("v7_m_opertime between", value1, value2, "v7MOpertime");
            return (Criteria) this;
        }

        public Criteria andV7MOpertimeNotBetween(Date value1, Date value2) {
            addCriterion("v7_m_opertime not between", value1, value2, "v7MOpertime");
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