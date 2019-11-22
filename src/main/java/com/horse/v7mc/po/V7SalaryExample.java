package com.horse.v7mc.po;

import java.util.ArrayList;
import java.util.List;

public class V7SalaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public V7SalaryExample() {
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

        public Criteria andV7SMonthIsNull() {
            addCriterion("v7_s_month is null");
            return (Criteria) this;
        }

        public Criteria andV7SMonthIsNotNull() {
            addCriterion("v7_s_month is not null");
            return (Criteria) this;
        }

        public Criteria andV7SMonthEqualTo(String value) {
            addCriterion("v7_s_month =", value, "v7SMonth");
            return (Criteria) this;
        }

        public Criteria andV7SMonthNotEqualTo(String value) {
            addCriterion("v7_s_month <>", value, "v7SMonth");
            return (Criteria) this;
        }

        public Criteria andV7SMonthGreaterThan(String value) {
            addCriterion("v7_s_month >", value, "v7SMonth");
            return (Criteria) this;
        }

        public Criteria andV7SMonthGreaterThanOrEqualTo(String value) {
            addCriterion("v7_s_month >=", value, "v7SMonth");
            return (Criteria) this;
        }

        public Criteria andV7SMonthLessThan(String value) {
            addCriterion("v7_s_month <", value, "v7SMonth");
            return (Criteria) this;
        }

        public Criteria andV7SMonthLessThanOrEqualTo(String value) {
            addCriterion("v7_s_month <=", value, "v7SMonth");
            return (Criteria) this;
        }

        public Criteria andV7SMonthLike(String value) {
            addCriterion("v7_s_month like", value, "v7SMonth");
            return (Criteria) this;
        }

        public Criteria andV7SMonthNotLike(String value) {
            addCriterion("v7_s_month not like", value, "v7SMonth");
            return (Criteria) this;
        }

        public Criteria andV7SMonthIn(List<String> values) {
            addCriterion("v7_s_month in", values, "v7SMonth");
            return (Criteria) this;
        }

        public Criteria andV7SMonthNotIn(List<String> values) {
            addCriterion("v7_s_month not in", values, "v7SMonth");
            return (Criteria) this;
        }

        public Criteria andV7SMonthBetween(String value1, String value2) {
            addCriterion("v7_s_month between", value1, value2, "v7SMonth");
            return (Criteria) this;
        }

        public Criteria andV7SMonthNotBetween(String value1, String value2) {
            addCriterion("v7_s_month not between", value1, value2, "v7SMonth");
            return (Criteria) this;
        }

        public Criteria andV7SMnumIsNull() {
            addCriterion("v7_s_mnum is null");
            return (Criteria) this;
        }

        public Criteria andV7SMnumIsNotNull() {
            addCriterion("v7_s_mnum is not null");
            return (Criteria) this;
        }

        public Criteria andV7SMnumEqualTo(Integer value) {
            addCriterion("v7_s_mnum =", value, "v7SMnum");
            return (Criteria) this;
        }

        public Criteria andV7SMnumNotEqualTo(Integer value) {
            addCriterion("v7_s_mnum <>", value, "v7SMnum");
            return (Criteria) this;
        }

        public Criteria andV7SMnumGreaterThan(Integer value) {
            addCriterion("v7_s_mnum >", value, "v7SMnum");
            return (Criteria) this;
        }

        public Criteria andV7SMnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("v7_s_mnum >=", value, "v7SMnum");
            return (Criteria) this;
        }

        public Criteria andV7SMnumLessThan(Integer value) {
            addCriterion("v7_s_mnum <", value, "v7SMnum");
            return (Criteria) this;
        }

        public Criteria andV7SMnumLessThanOrEqualTo(Integer value) {
            addCriterion("v7_s_mnum <=", value, "v7SMnum");
            return (Criteria) this;
        }

        public Criteria andV7SMnumIn(List<Integer> values) {
            addCriterion("v7_s_mnum in", values, "v7SMnum");
            return (Criteria) this;
        }

        public Criteria andV7SMnumNotIn(List<Integer> values) {
            addCriterion("v7_s_mnum not in", values, "v7SMnum");
            return (Criteria) this;
        }

        public Criteria andV7SMnumBetween(Integer value1, Integer value2) {
            addCriterion("v7_s_mnum between", value1, value2, "v7SMnum");
            return (Criteria) this;
        }

        public Criteria andV7SMnumNotBetween(Integer value1, Integer value2) {
            addCriterion("v7_s_mnum not between", value1, value2, "v7SMnum");
            return (Criteria) this;
        }

        public Criteria andV7SNameIsNull() {
            addCriterion("v7_s_name is null");
            return (Criteria) this;
        }

        public Criteria andV7SNameIsNotNull() {
            addCriterion("v7_s_name is not null");
            return (Criteria) this;
        }

        public Criteria andV7SNameEqualTo(String value) {
            addCriterion("v7_s_name =", value, "v7SName");
            return (Criteria) this;
        }

        public Criteria andV7SNameNotEqualTo(String value) {
            addCriterion("v7_s_name <>", value, "v7SName");
            return (Criteria) this;
        }

        public Criteria andV7SNameGreaterThan(String value) {
            addCriterion("v7_s_name >", value, "v7SName");
            return (Criteria) this;
        }

        public Criteria andV7SNameGreaterThanOrEqualTo(String value) {
            addCriterion("v7_s_name >=", value, "v7SName");
            return (Criteria) this;
        }

        public Criteria andV7SNameLessThan(String value) {
            addCriterion("v7_s_name <", value, "v7SName");
            return (Criteria) this;
        }

        public Criteria andV7SNameLessThanOrEqualTo(String value) {
            addCriterion("v7_s_name <=", value, "v7SName");
            return (Criteria) this;
        }

        public Criteria andV7SNameLike(String value) {
            addCriterion("v7_s_name like", value, "v7SName");
            return (Criteria) this;
        }

        public Criteria andV7SNameNotLike(String value) {
            addCriterion("v7_s_name not like", value, "v7SName");
            return (Criteria) this;
        }

        public Criteria andV7SNameIn(List<String> values) {
            addCriterion("v7_s_name in", values, "v7SName");
            return (Criteria) this;
        }

        public Criteria andV7SNameNotIn(List<String> values) {
            addCriterion("v7_s_name not in", values, "v7SName");
            return (Criteria) this;
        }

        public Criteria andV7SNameBetween(String value1, String value2) {
            addCriterion("v7_s_name between", value1, value2, "v7SName");
            return (Criteria) this;
        }

        public Criteria andV7SNameNotBetween(String value1, String value2) {
            addCriterion("v7_s_name not between", value1, value2, "v7SName");
            return (Criteria) this;
        }

        public Criteria andV7SPositionIsNull() {
            addCriterion("v7_s_position is null");
            return (Criteria) this;
        }

        public Criteria andV7SPositionIsNotNull() {
            addCriterion("v7_s_position is not null");
            return (Criteria) this;
        }

        public Criteria andV7SPositionEqualTo(String value) {
            addCriterion("v7_s_position =", value, "v7SPosition");
            return (Criteria) this;
        }

        public Criteria andV7SPositionNotEqualTo(String value) {
            addCriterion("v7_s_position <>", value, "v7SPosition");
            return (Criteria) this;
        }

        public Criteria andV7SPositionGreaterThan(String value) {
            addCriterion("v7_s_position >", value, "v7SPosition");
            return (Criteria) this;
        }

        public Criteria andV7SPositionGreaterThanOrEqualTo(String value) {
            addCriterion("v7_s_position >=", value, "v7SPosition");
            return (Criteria) this;
        }

        public Criteria andV7SPositionLessThan(String value) {
            addCriterion("v7_s_position <", value, "v7SPosition");
            return (Criteria) this;
        }

        public Criteria andV7SPositionLessThanOrEqualTo(String value) {
            addCriterion("v7_s_position <=", value, "v7SPosition");
            return (Criteria) this;
        }

        public Criteria andV7SPositionLike(String value) {
            addCriterion("v7_s_position like", value, "v7SPosition");
            return (Criteria) this;
        }

        public Criteria andV7SPositionNotLike(String value) {
            addCriterion("v7_s_position not like", value, "v7SPosition");
            return (Criteria) this;
        }

        public Criteria andV7SPositionIn(List<String> values) {
            addCriterion("v7_s_position in", values, "v7SPosition");
            return (Criteria) this;
        }

        public Criteria andV7SPositionNotIn(List<String> values) {
            addCriterion("v7_s_position not in", values, "v7SPosition");
            return (Criteria) this;
        }

        public Criteria andV7SPositionBetween(String value1, String value2) {
            addCriterion("v7_s_position between", value1, value2, "v7SPosition");
            return (Criteria) this;
        }

        public Criteria andV7SPositionNotBetween(String value1, String value2) {
            addCriterion("v7_s_position not between", value1, value2, "v7SPosition");
            return (Criteria) this;
        }

        public Criteria andV7SBaseSalaryIsNull() {
            addCriterion("v7_s_base_salary is null");
            return (Criteria) this;
        }

        public Criteria andV7SBaseSalaryIsNotNull() {
            addCriterion("v7_s_base_salary is not null");
            return (Criteria) this;
        }

        public Criteria andV7SBaseSalaryEqualTo(Double value) {
            addCriterion("v7_s_base_salary =", value, "v7SBaseSalary");
            return (Criteria) this;
        }

        public Criteria andV7SBaseSalaryNotEqualTo(Double value) {
            addCriterion("v7_s_base_salary <>", value, "v7SBaseSalary");
            return (Criteria) this;
        }

        public Criteria andV7SBaseSalaryGreaterThan(Double value) {
            addCriterion("v7_s_base_salary >", value, "v7SBaseSalary");
            return (Criteria) this;
        }

        public Criteria andV7SBaseSalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("v7_s_base_salary >=", value, "v7SBaseSalary");
            return (Criteria) this;
        }

        public Criteria andV7SBaseSalaryLessThan(Double value) {
            addCriterion("v7_s_base_salary <", value, "v7SBaseSalary");
            return (Criteria) this;
        }

        public Criteria andV7SBaseSalaryLessThanOrEqualTo(Double value) {
            addCriterion("v7_s_base_salary <=", value, "v7SBaseSalary");
            return (Criteria) this;
        }

        public Criteria andV7SBaseSalaryIn(List<Double> values) {
            addCriterion("v7_s_base_salary in", values, "v7SBaseSalary");
            return (Criteria) this;
        }

        public Criteria andV7SBaseSalaryNotIn(List<Double> values) {
            addCriterion("v7_s_base_salary not in", values, "v7SBaseSalary");
            return (Criteria) this;
        }

        public Criteria andV7SBaseSalaryBetween(Double value1, Double value2) {
            addCriterion("v7_s_base_salary between", value1, value2, "v7SBaseSalary");
            return (Criteria) this;
        }

        public Criteria andV7SBaseSalaryNotBetween(Double value1, Double value2) {
            addCriterion("v7_s_base_salary not between", value1, value2, "v7SBaseSalary");
            return (Criteria) this;
        }

        public Criteria andV7SPreSalaryIsNull() {
            addCriterion("v7_s_pre_salary is null");
            return (Criteria) this;
        }

        public Criteria andV7SPreSalaryIsNotNull() {
            addCriterion("v7_s_pre_salary is not null");
            return (Criteria) this;
        }

        public Criteria andV7SPreSalaryEqualTo(Double value) {
            addCriterion("v7_s_pre_salary =", value, "v7SPreSalary");
            return (Criteria) this;
        }

        public Criteria andV7SPreSalaryNotEqualTo(Double value) {
            addCriterion("v7_s_pre_salary <>", value, "v7SPreSalary");
            return (Criteria) this;
        }

        public Criteria andV7SPreSalaryGreaterThan(Double value) {
            addCriterion("v7_s_pre_salary >", value, "v7SPreSalary");
            return (Criteria) this;
        }

        public Criteria andV7SPreSalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("v7_s_pre_salary >=", value, "v7SPreSalary");
            return (Criteria) this;
        }

        public Criteria andV7SPreSalaryLessThan(Double value) {
            addCriterion("v7_s_pre_salary <", value, "v7SPreSalary");
            return (Criteria) this;
        }

        public Criteria andV7SPreSalaryLessThanOrEqualTo(Double value) {
            addCriterion("v7_s_pre_salary <=", value, "v7SPreSalary");
            return (Criteria) this;
        }

        public Criteria andV7SPreSalaryIn(List<Double> values) {
            addCriterion("v7_s_pre_salary in", values, "v7SPreSalary");
            return (Criteria) this;
        }

        public Criteria andV7SPreSalaryNotIn(List<Double> values) {
            addCriterion("v7_s_pre_salary not in", values, "v7SPreSalary");
            return (Criteria) this;
        }

        public Criteria andV7SPreSalaryBetween(Double value1, Double value2) {
            addCriterion("v7_s_pre_salary between", value1, value2, "v7SPreSalary");
            return (Criteria) this;
        }

        public Criteria andV7SPreSalaryNotBetween(Double value1, Double value2) {
            addCriterion("v7_s_pre_salary not between", value1, value2, "v7SPreSalary");
            return (Criteria) this;
        }

        public Criteria andV7SOutSalaryIsNull() {
            addCriterion("v7_s_out_salary is null");
            return (Criteria) this;
        }

        public Criteria andV7SOutSalaryIsNotNull() {
            addCriterion("v7_s_out_salary is not null");
            return (Criteria) this;
        }

        public Criteria andV7SOutSalaryEqualTo(Double value) {
            addCriterion("v7_s_out_salary =", value, "v7SOutSalary");
            return (Criteria) this;
        }

        public Criteria andV7SOutSalaryNotEqualTo(Double value) {
            addCriterion("v7_s_out_salary <>", value, "v7SOutSalary");
            return (Criteria) this;
        }

        public Criteria andV7SOutSalaryGreaterThan(Double value) {
            addCriterion("v7_s_out_salary >", value, "v7SOutSalary");
            return (Criteria) this;
        }

        public Criteria andV7SOutSalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("v7_s_out_salary >=", value, "v7SOutSalary");
            return (Criteria) this;
        }

        public Criteria andV7SOutSalaryLessThan(Double value) {
            addCriterion("v7_s_out_salary <", value, "v7SOutSalary");
            return (Criteria) this;
        }

        public Criteria andV7SOutSalaryLessThanOrEqualTo(Double value) {
            addCriterion("v7_s_out_salary <=", value, "v7SOutSalary");
            return (Criteria) this;
        }

        public Criteria andV7SOutSalaryIn(List<Double> values) {
            addCriterion("v7_s_out_salary in", values, "v7SOutSalary");
            return (Criteria) this;
        }

        public Criteria andV7SOutSalaryNotIn(List<Double> values) {
            addCriterion("v7_s_out_salary not in", values, "v7SOutSalary");
            return (Criteria) this;
        }

        public Criteria andV7SOutSalaryBetween(Double value1, Double value2) {
            addCriterion("v7_s_out_salary between", value1, value2, "v7SOutSalary");
            return (Criteria) this;
        }

        public Criteria andV7SOutSalaryNotBetween(Double value1, Double value2) {
            addCriterion("v7_s_out_salary not between", value1, value2, "v7SOutSalary");
            return (Criteria) this;
        }

        public Criteria andV7STransSalaryIsNull() {
            addCriterion("v7_s_trans_salary is null");
            return (Criteria) this;
        }

        public Criteria andV7STransSalaryIsNotNull() {
            addCriterion("v7_s_trans_salary is not null");
            return (Criteria) this;
        }

        public Criteria andV7STransSalaryEqualTo(Double value) {
            addCriterion("v7_s_trans_salary =", value, "v7STransSalary");
            return (Criteria) this;
        }

        public Criteria andV7STransSalaryNotEqualTo(Double value) {
            addCriterion("v7_s_trans_salary <>", value, "v7STransSalary");
            return (Criteria) this;
        }

        public Criteria andV7STransSalaryGreaterThan(Double value) {
            addCriterion("v7_s_trans_salary >", value, "v7STransSalary");
            return (Criteria) this;
        }

        public Criteria andV7STransSalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("v7_s_trans_salary >=", value, "v7STransSalary");
            return (Criteria) this;
        }

        public Criteria andV7STransSalaryLessThan(Double value) {
            addCriterion("v7_s_trans_salary <", value, "v7STransSalary");
            return (Criteria) this;
        }

        public Criteria andV7STransSalaryLessThanOrEqualTo(Double value) {
            addCriterion("v7_s_trans_salary <=", value, "v7STransSalary");
            return (Criteria) this;
        }

        public Criteria andV7STransSalaryIn(List<Double> values) {
            addCriterion("v7_s_trans_salary in", values, "v7STransSalary");
            return (Criteria) this;
        }

        public Criteria andV7STransSalaryNotIn(List<Double> values) {
            addCriterion("v7_s_trans_salary not in", values, "v7STransSalary");
            return (Criteria) this;
        }

        public Criteria andV7STransSalaryBetween(Double value1, Double value2) {
            addCriterion("v7_s_trans_salary between", value1, value2, "v7STransSalary");
            return (Criteria) this;
        }

        public Criteria andV7STransSalaryNotBetween(Double value1, Double value2) {
            addCriterion("v7_s_trans_salary not between", value1, value2, "v7STransSalary");
            return (Criteria) this;
        }

        public Criteria andV7SChargeSalaryIsNull() {
            addCriterion("v7_s_charge_salary is null");
            return (Criteria) this;
        }

        public Criteria andV7SChargeSalaryIsNotNull() {
            addCriterion("v7_s_charge_salary is not null");
            return (Criteria) this;
        }

        public Criteria andV7SChargeSalaryEqualTo(Double value) {
            addCriterion("v7_s_charge_salary =", value, "v7SChargeSalary");
            return (Criteria) this;
        }

        public Criteria andV7SChargeSalaryNotEqualTo(Double value) {
            addCriterion("v7_s_charge_salary <>", value, "v7SChargeSalary");
            return (Criteria) this;
        }

        public Criteria andV7SChargeSalaryGreaterThan(Double value) {
            addCriterion("v7_s_charge_salary >", value, "v7SChargeSalary");
            return (Criteria) this;
        }

        public Criteria andV7SChargeSalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("v7_s_charge_salary >=", value, "v7SChargeSalary");
            return (Criteria) this;
        }

        public Criteria andV7SChargeSalaryLessThan(Double value) {
            addCriterion("v7_s_charge_salary <", value, "v7SChargeSalary");
            return (Criteria) this;
        }

        public Criteria andV7SChargeSalaryLessThanOrEqualTo(Double value) {
            addCriterion("v7_s_charge_salary <=", value, "v7SChargeSalary");
            return (Criteria) this;
        }

        public Criteria andV7SChargeSalaryIn(List<Double> values) {
            addCriterion("v7_s_charge_salary in", values, "v7SChargeSalary");
            return (Criteria) this;
        }

        public Criteria andV7SChargeSalaryNotIn(List<Double> values) {
            addCriterion("v7_s_charge_salary not in", values, "v7SChargeSalary");
            return (Criteria) this;
        }

        public Criteria andV7SChargeSalaryBetween(Double value1, Double value2) {
            addCriterion("v7_s_charge_salary between", value1, value2, "v7SChargeSalary");
            return (Criteria) this;
        }

        public Criteria andV7SChargeSalaryNotBetween(Double value1, Double value2) {
            addCriterion("v7_s_charge_salary not between", value1, value2, "v7SChargeSalary");
            return (Criteria) this;
        }

        public Criteria andV7SRealitySalaryIsNull() {
            addCriterion("v7_s_reality_salary is null");
            return (Criteria) this;
        }

        public Criteria andV7SRealitySalaryIsNotNull() {
            addCriterion("v7_s_reality_salary is not null");
            return (Criteria) this;
        }

        public Criteria andV7SRealitySalaryEqualTo(Double value) {
            addCriterion("v7_s_reality_salary =", value, "v7SRealitySalary");
            return (Criteria) this;
        }

        public Criteria andV7SRealitySalaryNotEqualTo(Double value) {
            addCriterion("v7_s_reality_salary <>", value, "v7SRealitySalary");
            return (Criteria) this;
        }

        public Criteria andV7SRealitySalaryGreaterThan(Double value) {
            addCriterion("v7_s_reality_salary >", value, "v7SRealitySalary");
            return (Criteria) this;
        }

        public Criteria andV7SRealitySalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("v7_s_reality_salary >=", value, "v7SRealitySalary");
            return (Criteria) this;
        }

        public Criteria andV7SRealitySalaryLessThan(Double value) {
            addCriterion("v7_s_reality_salary <", value, "v7SRealitySalary");
            return (Criteria) this;
        }

        public Criteria andV7SRealitySalaryLessThanOrEqualTo(Double value) {
            addCriterion("v7_s_reality_salary <=", value, "v7SRealitySalary");
            return (Criteria) this;
        }

        public Criteria andV7SRealitySalaryIn(List<Double> values) {
            addCriterion("v7_s_reality_salary in", values, "v7SRealitySalary");
            return (Criteria) this;
        }

        public Criteria andV7SRealitySalaryNotIn(List<Double> values) {
            addCriterion("v7_s_reality_salary not in", values, "v7SRealitySalary");
            return (Criteria) this;
        }

        public Criteria andV7SRealitySalaryBetween(Double value1, Double value2) {
            addCriterion("v7_s_reality_salary between", value1, value2, "v7SRealitySalary");
            return (Criteria) this;
        }

        public Criteria andV7SRealitySalaryNotBetween(Double value1, Double value2) {
            addCriterion("v7_s_reality_salary not between", value1, value2, "v7SRealitySalary");
            return (Criteria) this;
        }

        public Criteria andV7SStatusIsNull() {
            addCriterion("v7_s_status is null");
            return (Criteria) this;
        }

        public Criteria andV7SStatusIsNotNull() {
            addCriterion("v7_s_status is not null");
            return (Criteria) this;
        }

        public Criteria andV7SStatusEqualTo(Integer value) {
            addCriterion("v7_s_status =", value, "v7SStatus");
            return (Criteria) this;
        }

        public Criteria andV7SStatusNotEqualTo(Integer value) {
            addCriterion("v7_s_status <>", value, "v7SStatus");
            return (Criteria) this;
        }

        public Criteria andV7SStatusGreaterThan(Integer value) {
            addCriterion("v7_s_status >", value, "v7SStatus");
            return (Criteria) this;
        }

        public Criteria andV7SStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("v7_s_status >=", value, "v7SStatus");
            return (Criteria) this;
        }

        public Criteria andV7SStatusLessThan(Integer value) {
            addCriterion("v7_s_status <", value, "v7SStatus");
            return (Criteria) this;
        }

        public Criteria andV7SStatusLessThanOrEqualTo(Integer value) {
            addCriterion("v7_s_status <=", value, "v7SStatus");
            return (Criteria) this;
        }

        public Criteria andV7SStatusIn(List<Integer> values) {
            addCriterion("v7_s_status in", values, "v7SStatus");
            return (Criteria) this;
        }

        public Criteria andV7SStatusNotIn(List<Integer> values) {
            addCriterion("v7_s_status not in", values, "v7SStatus");
            return (Criteria) this;
        }

        public Criteria andV7SStatusBetween(Integer value1, Integer value2) {
            addCriterion("v7_s_status between", value1, value2, "v7SStatus");
            return (Criteria) this;
        }

        public Criteria andV7SStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("v7_s_status not between", value1, value2, "v7SStatus");
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