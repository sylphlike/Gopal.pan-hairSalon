package com.horse.v7mc.po;

import java.util.ArrayList;
import java.util.List;

public class V7ResultsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public V7ResultsExample() {
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

        public Criteria andV7RMonthIsNull() {
            addCriterion("v7_r_month is null");
            return (Criteria) this;
        }

        public Criteria andV7RMonthIsNotNull() {
            addCriterion("v7_r_month is not null");
            return (Criteria) this;
        }

        public Criteria andV7RMonthEqualTo(String value) {
            addCriterion("v7_r_month =", value, "v7RMonth");
            return (Criteria) this;
        }

        public Criteria andV7RMonthNotEqualTo(String value) {
            addCriterion("v7_r_month <>", value, "v7RMonth");
            return (Criteria) this;
        }

        public Criteria andV7RMonthGreaterThan(String value) {
            addCriterion("v7_r_month >", value, "v7RMonth");
            return (Criteria) this;
        }

        public Criteria andV7RMonthGreaterThanOrEqualTo(String value) {
            addCriterion("v7_r_month >=", value, "v7RMonth");
            return (Criteria) this;
        }

        public Criteria andV7RMonthLessThan(String value) {
            addCriterion("v7_r_month <", value, "v7RMonth");
            return (Criteria) this;
        }

        public Criteria andV7RMonthLessThanOrEqualTo(String value) {
            addCriterion("v7_r_month <=", value, "v7RMonth");
            return (Criteria) this;
        }

        public Criteria andV7RMonthLike(String value) {
            addCriterion("v7_r_month like", value, "v7RMonth");
            return (Criteria) this;
        }

        public Criteria andV7RMonthNotLike(String value) {
            addCriterion("v7_r_month not like", value, "v7RMonth");
            return (Criteria) this;
        }

        public Criteria andV7RMonthIn(List<String> values) {
            addCriterion("v7_r_month in", values, "v7RMonth");
            return (Criteria) this;
        }

        public Criteria andV7RMonthNotIn(List<String> values) {
            addCriterion("v7_r_month not in", values, "v7RMonth");
            return (Criteria) this;
        }

        public Criteria andV7RMonthBetween(String value1, String value2) {
            addCriterion("v7_r_month between", value1, value2, "v7RMonth");
            return (Criteria) this;
        }

        public Criteria andV7RMonthNotBetween(String value1, String value2) {
            addCriterion("v7_r_month not between", value1, value2, "v7RMonth");
            return (Criteria) this;
        }

        public Criteria andV7REidIsNull() {
            addCriterion("v7_r_eid is null");
            return (Criteria) this;
        }

        public Criteria andV7REidIsNotNull() {
            addCriterion("v7_r_eid is not null");
            return (Criteria) this;
        }

        public Criteria andV7REidEqualTo(String value) {
            addCriterion("v7_r_eid =", value, "v7REid");
            return (Criteria) this;
        }

        public Criteria andV7REidNotEqualTo(String value) {
            addCriterion("v7_r_eid <>", value, "v7REid");
            return (Criteria) this;
        }

        public Criteria andV7REidGreaterThan(String value) {
            addCriterion("v7_r_eid >", value, "v7REid");
            return (Criteria) this;
        }

        public Criteria andV7REidGreaterThanOrEqualTo(String value) {
            addCriterion("v7_r_eid >=", value, "v7REid");
            return (Criteria) this;
        }

        public Criteria andV7REidLessThan(String value) {
            addCriterion("v7_r_eid <", value, "v7REid");
            return (Criteria) this;
        }

        public Criteria andV7REidLessThanOrEqualTo(String value) {
            addCriterion("v7_r_eid <=", value, "v7REid");
            return (Criteria) this;
        }

        public Criteria andV7REidLike(String value) {
            addCriterion("v7_r_eid like", value, "v7REid");
            return (Criteria) this;
        }

        public Criteria andV7REidNotLike(String value) {
            addCriterion("v7_r_eid not like", value, "v7REid");
            return (Criteria) this;
        }

        public Criteria andV7REidIn(List<String> values) {
            addCriterion("v7_r_eid in", values, "v7REid");
            return (Criteria) this;
        }

        public Criteria andV7REidNotIn(List<String> values) {
            addCriterion("v7_r_eid not in", values, "v7REid");
            return (Criteria) this;
        }

        public Criteria andV7REidBetween(String value1, String value2) {
            addCriterion("v7_r_eid between", value1, value2, "v7REid");
            return (Criteria) this;
        }

        public Criteria andV7REidNotBetween(String value1, String value2) {
            addCriterion("v7_r_eid not between", value1, value2, "v7REid");
            return (Criteria) this;
        }

        public Criteria andV7RMnumIsNull() {
            addCriterion("v7_r_mnum is null");
            return (Criteria) this;
        }

        public Criteria andV7RMnumIsNotNull() {
            addCriterion("v7_r_mnum is not null");
            return (Criteria) this;
        }

        public Criteria andV7RMnumEqualTo(Integer value) {
            addCriterion("v7_r_mnum =", value, "v7RMnum");
            return (Criteria) this;
        }

        public Criteria andV7RMnumNotEqualTo(Integer value) {
            addCriterion("v7_r_mnum <>", value, "v7RMnum");
            return (Criteria) this;
        }

        public Criteria andV7RMnumGreaterThan(Integer value) {
            addCriterion("v7_r_mnum >", value, "v7RMnum");
            return (Criteria) this;
        }

        public Criteria andV7RMnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("v7_r_mnum >=", value, "v7RMnum");
            return (Criteria) this;
        }

        public Criteria andV7RMnumLessThan(Integer value) {
            addCriterion("v7_r_mnum <", value, "v7RMnum");
            return (Criteria) this;
        }

        public Criteria andV7RMnumLessThanOrEqualTo(Integer value) {
            addCriterion("v7_r_mnum <=", value, "v7RMnum");
            return (Criteria) this;
        }

        public Criteria andV7RMnumIn(List<Integer> values) {
            addCriterion("v7_r_mnum in", values, "v7RMnum");
            return (Criteria) this;
        }

        public Criteria andV7RMnumNotIn(List<Integer> values) {
            addCriterion("v7_r_mnum not in", values, "v7RMnum");
            return (Criteria) this;
        }

        public Criteria andV7RMnumBetween(Integer value1, Integer value2) {
            addCriterion("v7_r_mnum between", value1, value2, "v7RMnum");
            return (Criteria) this;
        }

        public Criteria andV7RMnumNotBetween(Integer value1, Integer value2) {
            addCriterion("v7_r_mnum not between", value1, value2, "v7RMnum");
            return (Criteria) this;
        }

        public Criteria andV7RNameIsNull() {
            addCriterion("v7_r_name is null");
            return (Criteria) this;
        }

        public Criteria andV7RNameIsNotNull() {
            addCriterion("v7_r_name is not null");
            return (Criteria) this;
        }

        public Criteria andV7RNameEqualTo(String value) {
            addCriterion("v7_r_name =", value, "v7RName");
            return (Criteria) this;
        }

        public Criteria andV7RNameNotEqualTo(String value) {
            addCriterion("v7_r_name <>", value, "v7RName");
            return (Criteria) this;
        }

        public Criteria andV7RNameGreaterThan(String value) {
            addCriterion("v7_r_name >", value, "v7RName");
            return (Criteria) this;
        }

        public Criteria andV7RNameGreaterThanOrEqualTo(String value) {
            addCriterion("v7_r_name >=", value, "v7RName");
            return (Criteria) this;
        }

        public Criteria andV7RNameLessThan(String value) {
            addCriterion("v7_r_name <", value, "v7RName");
            return (Criteria) this;
        }

        public Criteria andV7RNameLessThanOrEqualTo(String value) {
            addCriterion("v7_r_name <=", value, "v7RName");
            return (Criteria) this;
        }

        public Criteria andV7RNameLike(String value) {
            addCriterion("v7_r_name like", value, "v7RName");
            return (Criteria) this;
        }

        public Criteria andV7RNameNotLike(String value) {
            addCriterion("v7_r_name not like", value, "v7RName");
            return (Criteria) this;
        }

        public Criteria andV7RNameIn(List<String> values) {
            addCriterion("v7_r_name in", values, "v7RName");
            return (Criteria) this;
        }

        public Criteria andV7RNameNotIn(List<String> values) {
            addCriterion("v7_r_name not in", values, "v7RName");
            return (Criteria) this;
        }

        public Criteria andV7RNameBetween(String value1, String value2) {
            addCriterion("v7_r_name between", value1, value2, "v7RName");
            return (Criteria) this;
        }

        public Criteria andV7RNameNotBetween(String value1, String value2) {
            addCriterion("v7_r_name not between", value1, value2, "v7RName");
            return (Criteria) this;
        }

        public Criteria andV7RPositionIsNull() {
            addCriterion("v7_r_position is null");
            return (Criteria) this;
        }

        public Criteria andV7RPositionIsNotNull() {
            addCriterion("v7_r_position is not null");
            return (Criteria) this;
        }

        public Criteria andV7RPositionEqualTo(String value) {
            addCriterion("v7_r_position =", value, "v7RPosition");
            return (Criteria) this;
        }

        public Criteria andV7RPositionNotEqualTo(String value) {
            addCriterion("v7_r_position <>", value, "v7RPosition");
            return (Criteria) this;
        }

        public Criteria andV7RPositionGreaterThan(String value) {
            addCriterion("v7_r_position >", value, "v7RPosition");
            return (Criteria) this;
        }

        public Criteria andV7RPositionGreaterThanOrEqualTo(String value) {
            addCriterion("v7_r_position >=", value, "v7RPosition");
            return (Criteria) this;
        }

        public Criteria andV7RPositionLessThan(String value) {
            addCriterion("v7_r_position <", value, "v7RPosition");
            return (Criteria) this;
        }

        public Criteria andV7RPositionLessThanOrEqualTo(String value) {
            addCriterion("v7_r_position <=", value, "v7RPosition");
            return (Criteria) this;
        }

        public Criteria andV7RPositionLike(String value) {
            addCriterion("v7_r_position like", value, "v7RPosition");
            return (Criteria) this;
        }

        public Criteria andV7RPositionNotLike(String value) {
            addCriterion("v7_r_position not like", value, "v7RPosition");
            return (Criteria) this;
        }

        public Criteria andV7RPositionIn(List<String> values) {
            addCriterion("v7_r_position in", values, "v7RPosition");
            return (Criteria) this;
        }

        public Criteria andV7RPositionNotIn(List<String> values) {
            addCriterion("v7_r_position not in", values, "v7RPosition");
            return (Criteria) this;
        }

        public Criteria andV7RPositionBetween(String value1, String value2) {
            addCriterion("v7_r_position between", value1, value2, "v7RPosition");
            return (Criteria) this;
        }

        public Criteria andV7RPositionNotBetween(String value1, String value2) {
            addCriterion("v7_r_position not between", value1, value2, "v7RPosition");
            return (Criteria) this;
        }

        public Criteria andV7RBusResultsIsNull() {
            addCriterion("v7_r_bus_results is null");
            return (Criteria) this;
        }

        public Criteria andV7RBusResultsIsNotNull() {
            addCriterion("v7_r_bus_results is not null");
            return (Criteria) this;
        }

        public Criteria andV7RBusResultsEqualTo(Double value) {
            addCriterion("v7_r_bus_results =", value, "v7RBusResults");
            return (Criteria) this;
        }

        public Criteria andV7RBusResultsNotEqualTo(Double value) {
            addCriterion("v7_r_bus_results <>", value, "v7RBusResults");
            return (Criteria) this;
        }

        public Criteria andV7RBusResultsGreaterThan(Double value) {
            addCriterion("v7_r_bus_results >", value, "v7RBusResults");
            return (Criteria) this;
        }

        public Criteria andV7RBusResultsGreaterThanOrEqualTo(Double value) {
            addCriterion("v7_r_bus_results >=", value, "v7RBusResults");
            return (Criteria) this;
        }

        public Criteria andV7RBusResultsLessThan(Double value) {
            addCriterion("v7_r_bus_results <", value, "v7RBusResults");
            return (Criteria) this;
        }

        public Criteria andV7RBusResultsLessThanOrEqualTo(Double value) {
            addCriterion("v7_r_bus_results <=", value, "v7RBusResults");
            return (Criteria) this;
        }

        public Criteria andV7RBusResultsIn(List<Double> values) {
            addCriterion("v7_r_bus_results in", values, "v7RBusResults");
            return (Criteria) this;
        }

        public Criteria andV7RBusResultsNotIn(List<Double> values) {
            addCriterion("v7_r_bus_results not in", values, "v7RBusResults");
            return (Criteria) this;
        }

        public Criteria andV7RBusResultsBetween(Double value1, Double value2) {
            addCriterion("v7_r_bus_results between", value1, value2, "v7RBusResults");
            return (Criteria) this;
        }

        public Criteria andV7RBusResultsNotBetween(Double value1, Double value2) {
            addCriterion("v7_r_bus_results not between", value1, value2, "v7RBusResults");
            return (Criteria) this;
        }

        public Criteria andV7RRaiseResultsIsNull() {
            addCriterion("v7_r_raise_results is null");
            return (Criteria) this;
        }

        public Criteria andV7RRaiseResultsIsNotNull() {
            addCriterion("v7_r_raise_results is not null");
            return (Criteria) this;
        }

        public Criteria andV7RRaiseResultsEqualTo(Double value) {
            addCriterion("v7_r_raise_results =", value, "v7RRaiseResults");
            return (Criteria) this;
        }

        public Criteria andV7RRaiseResultsNotEqualTo(Double value) {
            addCriterion("v7_r_raise_results <>", value, "v7RRaiseResults");
            return (Criteria) this;
        }

        public Criteria andV7RRaiseResultsGreaterThan(Double value) {
            addCriterion("v7_r_raise_results >", value, "v7RRaiseResults");
            return (Criteria) this;
        }

        public Criteria andV7RRaiseResultsGreaterThanOrEqualTo(Double value) {
            addCriterion("v7_r_raise_results >=", value, "v7RRaiseResults");
            return (Criteria) this;
        }

        public Criteria andV7RRaiseResultsLessThan(Double value) {
            addCriterion("v7_r_raise_results <", value, "v7RRaiseResults");
            return (Criteria) this;
        }

        public Criteria andV7RRaiseResultsLessThanOrEqualTo(Double value) {
            addCriterion("v7_r_raise_results <=", value, "v7RRaiseResults");
            return (Criteria) this;
        }

        public Criteria andV7RRaiseResultsIn(List<Double> values) {
            addCriterion("v7_r_raise_results in", values, "v7RRaiseResults");
            return (Criteria) this;
        }

        public Criteria andV7RRaiseResultsNotIn(List<Double> values) {
            addCriterion("v7_r_raise_results not in", values, "v7RRaiseResults");
            return (Criteria) this;
        }

        public Criteria andV7RRaiseResultsBetween(Double value1, Double value2) {
            addCriterion("v7_r_raise_results between", value1, value2, "v7RRaiseResults");
            return (Criteria) this;
        }

        public Criteria andV7RRaiseResultsNotBetween(Double value1, Double value2) {
            addCriterion("v7_r_raise_results not between", value1, value2, "v7RRaiseResults");
            return (Criteria) this;
        }

        public Criteria andV7ROutResultsIsNull() {
            addCriterion("v7_r_out_results is null");
            return (Criteria) this;
        }

        public Criteria andV7ROutResultsIsNotNull() {
            addCriterion("v7_r_out_results is not null");
            return (Criteria) this;
        }

        public Criteria andV7ROutResultsEqualTo(Double value) {
            addCriterion("v7_r_out_results =", value, "v7ROutResults");
            return (Criteria) this;
        }

        public Criteria andV7ROutResultsNotEqualTo(Double value) {
            addCriterion("v7_r_out_results <>", value, "v7ROutResults");
            return (Criteria) this;
        }

        public Criteria andV7ROutResultsGreaterThan(Double value) {
            addCriterion("v7_r_out_results >", value, "v7ROutResults");
            return (Criteria) this;
        }

        public Criteria andV7ROutResultsGreaterThanOrEqualTo(Double value) {
            addCriterion("v7_r_out_results >=", value, "v7ROutResults");
            return (Criteria) this;
        }

        public Criteria andV7ROutResultsLessThan(Double value) {
            addCriterion("v7_r_out_results <", value, "v7ROutResults");
            return (Criteria) this;
        }

        public Criteria andV7ROutResultsLessThanOrEqualTo(Double value) {
            addCriterion("v7_r_out_results <=", value, "v7ROutResults");
            return (Criteria) this;
        }

        public Criteria andV7ROutResultsIn(List<Double> values) {
            addCriterion("v7_r_out_results in", values, "v7ROutResults");
            return (Criteria) this;
        }

        public Criteria andV7ROutResultsNotIn(List<Double> values) {
            addCriterion("v7_r_out_results not in", values, "v7ROutResults");
            return (Criteria) this;
        }

        public Criteria andV7ROutResultsBetween(Double value1, Double value2) {
            addCriterion("v7_r_out_results between", value1, value2, "v7ROutResults");
            return (Criteria) this;
        }

        public Criteria andV7ROutResultsNotBetween(Double value1, Double value2) {
            addCriterion("v7_r_out_results not between", value1, value2, "v7ROutResults");
            return (Criteria) this;
        }

        public Criteria andV7RTransResultsIsNull() {
            addCriterion("v7_r_trans_results is null");
            return (Criteria) this;
        }

        public Criteria andV7RTransResultsIsNotNull() {
            addCriterion("v7_r_trans_results is not null");
            return (Criteria) this;
        }

        public Criteria andV7RTransResultsEqualTo(Double value) {
            addCriterion("v7_r_trans_results =", value, "v7RTransResults");
            return (Criteria) this;
        }

        public Criteria andV7RTransResultsNotEqualTo(Double value) {
            addCriterion("v7_r_trans_results <>", value, "v7RTransResults");
            return (Criteria) this;
        }

        public Criteria andV7RTransResultsGreaterThan(Double value) {
            addCriterion("v7_r_trans_results >", value, "v7RTransResults");
            return (Criteria) this;
        }

        public Criteria andV7RTransResultsGreaterThanOrEqualTo(Double value) {
            addCriterion("v7_r_trans_results >=", value, "v7RTransResults");
            return (Criteria) this;
        }

        public Criteria andV7RTransResultsLessThan(Double value) {
            addCriterion("v7_r_trans_results <", value, "v7RTransResults");
            return (Criteria) this;
        }

        public Criteria andV7RTransResultsLessThanOrEqualTo(Double value) {
            addCriterion("v7_r_trans_results <=", value, "v7RTransResults");
            return (Criteria) this;
        }

        public Criteria andV7RTransResultsIn(List<Double> values) {
            addCriterion("v7_r_trans_results in", values, "v7RTransResults");
            return (Criteria) this;
        }

        public Criteria andV7RTransResultsNotIn(List<Double> values) {
            addCriterion("v7_r_trans_results not in", values, "v7RTransResults");
            return (Criteria) this;
        }

        public Criteria andV7RTransResultsBetween(Double value1, Double value2) {
            addCriterion("v7_r_trans_results between", value1, value2, "v7RTransResults");
            return (Criteria) this;
        }

        public Criteria andV7RTransResultsNotBetween(Double value1, Double value2) {
            addCriterion("v7_r_trans_results not between", value1, value2, "v7RTransResults");
            return (Criteria) this;
        }

        public Criteria andV7RBlowwashIsNull() {
            addCriterion("v7_r_blowwash is null");
            return (Criteria) this;
        }

        public Criteria andV7RBlowwashIsNotNull() {
            addCriterion("v7_r_blowwash is not null");
            return (Criteria) this;
        }

        public Criteria andV7RBlowwashEqualTo(Integer value) {
            addCriterion("v7_r_blowwash =", value, "v7RBlowwash");
            return (Criteria) this;
        }

        public Criteria andV7RBlowwashNotEqualTo(Integer value) {
            addCriterion("v7_r_blowwash <>", value, "v7RBlowwash");
            return (Criteria) this;
        }

        public Criteria andV7RBlowwashGreaterThan(Integer value) {
            addCriterion("v7_r_blowwash >", value, "v7RBlowwash");
            return (Criteria) this;
        }

        public Criteria andV7RBlowwashGreaterThanOrEqualTo(Integer value) {
            addCriterion("v7_r_blowwash >=", value, "v7RBlowwash");
            return (Criteria) this;
        }

        public Criteria andV7RBlowwashLessThan(Integer value) {
            addCriterion("v7_r_blowwash <", value, "v7RBlowwash");
            return (Criteria) this;
        }

        public Criteria andV7RBlowwashLessThanOrEqualTo(Integer value) {
            addCriterion("v7_r_blowwash <=", value, "v7RBlowwash");
            return (Criteria) this;
        }

        public Criteria andV7RBlowwashIn(List<Integer> values) {
            addCriterion("v7_r_blowwash in", values, "v7RBlowwash");
            return (Criteria) this;
        }

        public Criteria andV7RBlowwashNotIn(List<Integer> values) {
            addCriterion("v7_r_blowwash not in", values, "v7RBlowwash");
            return (Criteria) this;
        }

        public Criteria andV7RBlowwashBetween(Integer value1, Integer value2) {
            addCriterion("v7_r_blowwash between", value1, value2, "v7RBlowwash");
            return (Criteria) this;
        }

        public Criteria andV7RBlowwashNotBetween(Integer value1, Integer value2) {
            addCriterion("v7_r_blowwash not between", value1, value2, "v7RBlowwash");
            return (Criteria) this;
        }

        public Criteria andV7RBlowcutwashIsNull() {
            addCriterion("v7_r_blowcutwash is null");
            return (Criteria) this;
        }

        public Criteria andV7RBlowcutwashIsNotNull() {
            addCriterion("v7_r_blowcutwash is not null");
            return (Criteria) this;
        }

        public Criteria andV7RBlowcutwashEqualTo(Integer value) {
            addCriterion("v7_r_blowcutwash =", value, "v7RBlowcutwash");
            return (Criteria) this;
        }

        public Criteria andV7RBlowcutwashNotEqualTo(Integer value) {
            addCriterion("v7_r_blowcutwash <>", value, "v7RBlowcutwash");
            return (Criteria) this;
        }

        public Criteria andV7RBlowcutwashGreaterThan(Integer value) {
            addCriterion("v7_r_blowcutwash >", value, "v7RBlowcutwash");
            return (Criteria) this;
        }

        public Criteria andV7RBlowcutwashGreaterThanOrEqualTo(Integer value) {
            addCriterion("v7_r_blowcutwash >=", value, "v7RBlowcutwash");
            return (Criteria) this;
        }

        public Criteria andV7RBlowcutwashLessThan(Integer value) {
            addCriterion("v7_r_blowcutwash <", value, "v7RBlowcutwash");
            return (Criteria) this;
        }

        public Criteria andV7RBlowcutwashLessThanOrEqualTo(Integer value) {
            addCriterion("v7_r_blowcutwash <=", value, "v7RBlowcutwash");
            return (Criteria) this;
        }

        public Criteria andV7RBlowcutwashIn(List<Integer> values) {
            addCriterion("v7_r_blowcutwash in", values, "v7RBlowcutwash");
            return (Criteria) this;
        }

        public Criteria andV7RBlowcutwashNotIn(List<Integer> values) {
            addCriterion("v7_r_blowcutwash not in", values, "v7RBlowcutwash");
            return (Criteria) this;
        }

        public Criteria andV7RBlowcutwashBetween(Integer value1, Integer value2) {
            addCriterion("v7_r_blowcutwash between", value1, value2, "v7RBlowcutwash");
            return (Criteria) this;
        }

        public Criteria andV7RBlowcutwashNotBetween(Integer value1, Integer value2) {
            addCriterion("v7_r_blowcutwash not between", value1, value2, "v7RBlowcutwash");
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