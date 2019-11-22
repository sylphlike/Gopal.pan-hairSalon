package com.horse.v7mc.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class V7StoreInExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public V7StoreInExample() {
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

        public Criteria andV7SBrandIsNull() {
            addCriterion("v7_s_brand is null");
            return (Criteria) this;
        }

        public Criteria andV7SBrandIsNotNull() {
            addCriterion("v7_s_brand is not null");
            return (Criteria) this;
        }

        public Criteria andV7SBrandEqualTo(String value) {
            addCriterion("v7_s_brand =", value, "v7SBrand");
            return (Criteria) this;
        }

        public Criteria andV7SBrandNotEqualTo(String value) {
            addCriterion("v7_s_brand <>", value, "v7SBrand");
            return (Criteria) this;
        }

        public Criteria andV7SBrandGreaterThan(String value) {
            addCriterion("v7_s_brand >", value, "v7SBrand");
            return (Criteria) this;
        }

        public Criteria andV7SBrandGreaterThanOrEqualTo(String value) {
            addCriterion("v7_s_brand >=", value, "v7SBrand");
            return (Criteria) this;
        }

        public Criteria andV7SBrandLessThan(String value) {
            addCriterion("v7_s_brand <", value, "v7SBrand");
            return (Criteria) this;
        }

        public Criteria andV7SBrandLessThanOrEqualTo(String value) {
            addCriterion("v7_s_brand <=", value, "v7SBrand");
            return (Criteria) this;
        }

        public Criteria andV7SBrandLike(String value) {
            addCriterion("v7_s_brand like", value, "v7SBrand");
            return (Criteria) this;
        }

        public Criteria andV7SBrandNotLike(String value) {
            addCriterion("v7_s_brand not like", value, "v7SBrand");
            return (Criteria) this;
        }

        public Criteria andV7SBrandIn(List<String> values) {
            addCriterion("v7_s_brand in", values, "v7SBrand");
            return (Criteria) this;
        }

        public Criteria andV7SBrandNotIn(List<String> values) {
            addCriterion("v7_s_brand not in", values, "v7SBrand");
            return (Criteria) this;
        }

        public Criteria andV7SBrandBetween(String value1, String value2) {
            addCriterion("v7_s_brand between", value1, value2, "v7SBrand");
            return (Criteria) this;
        }

        public Criteria andV7SBrandNotBetween(String value1, String value2) {
            addCriterion("v7_s_brand not between", value1, value2, "v7SBrand");
            return (Criteria) this;
        }

        public Criteria andV7STypeIsNull() {
            addCriterion("v7_s_type is null");
            return (Criteria) this;
        }

        public Criteria andV7STypeIsNotNull() {
            addCriterion("v7_s_type is not null");
            return (Criteria) this;
        }

        public Criteria andV7STypeEqualTo(String value) {
            addCriterion("v7_s_type =", value, "v7SType");
            return (Criteria) this;
        }

        public Criteria andV7STypeNotEqualTo(String value) {
            addCriterion("v7_s_type <>", value, "v7SType");
            return (Criteria) this;
        }

        public Criteria andV7STypeGreaterThan(String value) {
            addCriterion("v7_s_type >", value, "v7SType");
            return (Criteria) this;
        }

        public Criteria andV7STypeGreaterThanOrEqualTo(String value) {
            addCriterion("v7_s_type >=", value, "v7SType");
            return (Criteria) this;
        }

        public Criteria andV7STypeLessThan(String value) {
            addCriterion("v7_s_type <", value, "v7SType");
            return (Criteria) this;
        }

        public Criteria andV7STypeLessThanOrEqualTo(String value) {
            addCriterion("v7_s_type <=", value, "v7SType");
            return (Criteria) this;
        }

        public Criteria andV7STypeLike(String value) {
            addCriterion("v7_s_type like", value, "v7SType");
            return (Criteria) this;
        }

        public Criteria andV7STypeNotLike(String value) {
            addCriterion("v7_s_type not like", value, "v7SType");
            return (Criteria) this;
        }

        public Criteria andV7STypeIn(List<String> values) {
            addCriterion("v7_s_type in", values, "v7SType");
            return (Criteria) this;
        }

        public Criteria andV7STypeNotIn(List<String> values) {
            addCriterion("v7_s_type not in", values, "v7SType");
            return (Criteria) this;
        }

        public Criteria andV7STypeBetween(String value1, String value2) {
            addCriterion("v7_s_type between", value1, value2, "v7SType");
            return (Criteria) this;
        }

        public Criteria andV7STypeNotBetween(String value1, String value2) {
            addCriterion("v7_s_type not between", value1, value2, "v7SType");
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

        public Criteria andV7SPriceIsNull() {
            addCriterion("v7_s_price is null");
            return (Criteria) this;
        }

        public Criteria andV7SPriceIsNotNull() {
            addCriterion("v7_s_price is not null");
            return (Criteria) this;
        }

        public Criteria andV7SPriceEqualTo(Double value) {
            addCriterion("v7_s_price =", value, "v7SPrice");
            return (Criteria) this;
        }

        public Criteria andV7SPriceNotEqualTo(Double value) {
            addCriterion("v7_s_price <>", value, "v7SPrice");
            return (Criteria) this;
        }

        public Criteria andV7SPriceGreaterThan(Double value) {
            addCriterion("v7_s_price >", value, "v7SPrice");
            return (Criteria) this;
        }

        public Criteria andV7SPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("v7_s_price >=", value, "v7SPrice");
            return (Criteria) this;
        }

        public Criteria andV7SPriceLessThan(Double value) {
            addCriterion("v7_s_price <", value, "v7SPrice");
            return (Criteria) this;
        }

        public Criteria andV7SPriceLessThanOrEqualTo(Double value) {
            addCriterion("v7_s_price <=", value, "v7SPrice");
            return (Criteria) this;
        }

        public Criteria andV7SPriceIn(List<Double> values) {
            addCriterion("v7_s_price in", values, "v7SPrice");
            return (Criteria) this;
        }

        public Criteria andV7SPriceNotIn(List<Double> values) {
            addCriterion("v7_s_price not in", values, "v7SPrice");
            return (Criteria) this;
        }

        public Criteria andV7SPriceBetween(Double value1, Double value2) {
            addCriterion("v7_s_price between", value1, value2, "v7SPrice");
            return (Criteria) this;
        }

        public Criteria andV7SPriceNotBetween(Double value1, Double value2) {
            addCriterion("v7_s_price not between", value1, value2, "v7SPrice");
            return (Criteria) this;
        }

        public Criteria andV7SStandardIsNull() {
            addCriterion("v7_s_standard is null");
            return (Criteria) this;
        }

        public Criteria andV7SStandardIsNotNull() {
            addCriterion("v7_s_standard is not null");
            return (Criteria) this;
        }

        public Criteria andV7SStandardEqualTo(String value) {
            addCriterion("v7_s_standard =", value, "v7SStandard");
            return (Criteria) this;
        }

        public Criteria andV7SStandardNotEqualTo(String value) {
            addCriterion("v7_s_standard <>", value, "v7SStandard");
            return (Criteria) this;
        }

        public Criteria andV7SStandardGreaterThan(String value) {
            addCriterion("v7_s_standard >", value, "v7SStandard");
            return (Criteria) this;
        }

        public Criteria andV7SStandardGreaterThanOrEqualTo(String value) {
            addCriterion("v7_s_standard >=", value, "v7SStandard");
            return (Criteria) this;
        }

        public Criteria andV7SStandardLessThan(String value) {
            addCriterion("v7_s_standard <", value, "v7SStandard");
            return (Criteria) this;
        }

        public Criteria andV7SStandardLessThanOrEqualTo(String value) {
            addCriterion("v7_s_standard <=", value, "v7SStandard");
            return (Criteria) this;
        }

        public Criteria andV7SStandardLike(String value) {
            addCriterion("v7_s_standard like", value, "v7SStandard");
            return (Criteria) this;
        }

        public Criteria andV7SStandardNotLike(String value) {
            addCriterion("v7_s_standard not like", value, "v7SStandard");
            return (Criteria) this;
        }

        public Criteria andV7SStandardIn(List<String> values) {
            addCriterion("v7_s_standard in", values, "v7SStandard");
            return (Criteria) this;
        }

        public Criteria andV7SStandardNotIn(List<String> values) {
            addCriterion("v7_s_standard not in", values, "v7SStandard");
            return (Criteria) this;
        }

        public Criteria andV7SStandardBetween(String value1, String value2) {
            addCriterion("v7_s_standard between", value1, value2, "v7SStandard");
            return (Criteria) this;
        }

        public Criteria andV7SStandardNotBetween(String value1, String value2) {
            addCriterion("v7_s_standard not between", value1, value2, "v7SStandard");
            return (Criteria) this;
        }

        public Criteria andV7SUnitIsNull() {
            addCriterion("v7_s_unit is null");
            return (Criteria) this;
        }

        public Criteria andV7SUnitIsNotNull() {
            addCriterion("v7_s_unit is not null");
            return (Criteria) this;
        }

        public Criteria andV7SUnitEqualTo(String value) {
            addCriterion("v7_s_unit =", value, "v7SUnit");
            return (Criteria) this;
        }

        public Criteria andV7SUnitNotEqualTo(String value) {
            addCriterion("v7_s_unit <>", value, "v7SUnit");
            return (Criteria) this;
        }

        public Criteria andV7SUnitGreaterThan(String value) {
            addCriterion("v7_s_unit >", value, "v7SUnit");
            return (Criteria) this;
        }

        public Criteria andV7SUnitGreaterThanOrEqualTo(String value) {
            addCriterion("v7_s_unit >=", value, "v7SUnit");
            return (Criteria) this;
        }

        public Criteria andV7SUnitLessThan(String value) {
            addCriterion("v7_s_unit <", value, "v7SUnit");
            return (Criteria) this;
        }

        public Criteria andV7SUnitLessThanOrEqualTo(String value) {
            addCriterion("v7_s_unit <=", value, "v7SUnit");
            return (Criteria) this;
        }

        public Criteria andV7SUnitLike(String value) {
            addCriterion("v7_s_unit like", value, "v7SUnit");
            return (Criteria) this;
        }

        public Criteria andV7SUnitNotLike(String value) {
            addCriterion("v7_s_unit not like", value, "v7SUnit");
            return (Criteria) this;
        }

        public Criteria andV7SUnitIn(List<String> values) {
            addCriterion("v7_s_unit in", values, "v7SUnit");
            return (Criteria) this;
        }

        public Criteria andV7SUnitNotIn(List<String> values) {
            addCriterion("v7_s_unit not in", values, "v7SUnit");
            return (Criteria) this;
        }

        public Criteria andV7SUnitBetween(String value1, String value2) {
            addCriterion("v7_s_unit between", value1, value2, "v7SUnit");
            return (Criteria) this;
        }

        public Criteria andV7SUnitNotBetween(String value1, String value2) {
            addCriterion("v7_s_unit not between", value1, value2, "v7SUnit");
            return (Criteria) this;
        }

        public Criteria andV7SPriceCountIsNull() {
            addCriterion("v7_s_price_count is null");
            return (Criteria) this;
        }

        public Criteria andV7SPriceCountIsNotNull() {
            addCriterion("v7_s_price_count is not null");
            return (Criteria) this;
        }

        public Criteria andV7SPriceCountEqualTo(Double value) {
            addCriterion("v7_s_price_count =", value, "v7SPriceCount");
            return (Criteria) this;
        }

        public Criteria andV7SPriceCountNotEqualTo(Double value) {
            addCriterion("v7_s_price_count <>", value, "v7SPriceCount");
            return (Criteria) this;
        }

        public Criteria andV7SPriceCountGreaterThan(Double value) {
            addCriterion("v7_s_price_count >", value, "v7SPriceCount");
            return (Criteria) this;
        }

        public Criteria andV7SPriceCountGreaterThanOrEqualTo(Double value) {
            addCriterion("v7_s_price_count >=", value, "v7SPriceCount");
            return (Criteria) this;
        }

        public Criteria andV7SPriceCountLessThan(Double value) {
            addCriterion("v7_s_price_count <", value, "v7SPriceCount");
            return (Criteria) this;
        }

        public Criteria andV7SPriceCountLessThanOrEqualTo(Double value) {
            addCriterion("v7_s_price_count <=", value, "v7SPriceCount");
            return (Criteria) this;
        }

        public Criteria andV7SPriceCountIn(List<Double> values) {
            addCriterion("v7_s_price_count in", values, "v7SPriceCount");
            return (Criteria) this;
        }

        public Criteria andV7SPriceCountNotIn(List<Double> values) {
            addCriterion("v7_s_price_count not in", values, "v7SPriceCount");
            return (Criteria) this;
        }

        public Criteria andV7SPriceCountBetween(Double value1, Double value2) {
            addCriterion("v7_s_price_count between", value1, value2, "v7SPriceCount");
            return (Criteria) this;
        }

        public Criteria andV7SPriceCountNotBetween(Double value1, Double value2) {
            addCriterion("v7_s_price_count not between", value1, value2, "v7SPriceCount");
            return (Criteria) this;
        }

        public Criteria andV7SCountIsNull() {
            addCriterion("v7_s_count is null");
            return (Criteria) this;
        }

        public Criteria andV7SCountIsNotNull() {
            addCriterion("v7_s_count is not null");
            return (Criteria) this;
        }

        public Criteria andV7SCountEqualTo(Integer value) {
            addCriterion("v7_s_count =", value, "v7SCount");
            return (Criteria) this;
        }

        public Criteria andV7SCountNotEqualTo(Integer value) {
            addCriterion("v7_s_count <>", value, "v7SCount");
            return (Criteria) this;
        }

        public Criteria andV7SCountGreaterThan(Integer value) {
            addCriterion("v7_s_count >", value, "v7SCount");
            return (Criteria) this;
        }

        public Criteria andV7SCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("v7_s_count >=", value, "v7SCount");
            return (Criteria) this;
        }

        public Criteria andV7SCountLessThan(Integer value) {
            addCriterion("v7_s_count <", value, "v7SCount");
            return (Criteria) this;
        }

        public Criteria andV7SCountLessThanOrEqualTo(Integer value) {
            addCriterion("v7_s_count <=", value, "v7SCount");
            return (Criteria) this;
        }

        public Criteria andV7SCountIn(List<Integer> values) {
            addCriterion("v7_s_count in", values, "v7SCount");
            return (Criteria) this;
        }

        public Criteria andV7SCountNotIn(List<Integer> values) {
            addCriterion("v7_s_count not in", values, "v7SCount");
            return (Criteria) this;
        }

        public Criteria andV7SCountBetween(Integer value1, Integer value2) {
            addCriterion("v7_s_count between", value1, value2, "v7SCount");
            return (Criteria) this;
        }

        public Criteria andV7SCountNotBetween(Integer value1, Integer value2) {
            addCriterion("v7_s_count not between", value1, value2, "v7SCount");
            return (Criteria) this;
        }

        public Criteria andV7SOperUserIsNull() {
            addCriterion("v7_s_oper_user is null");
            return (Criteria) this;
        }

        public Criteria andV7SOperUserIsNotNull() {
            addCriterion("v7_s_oper_user is not null");
            return (Criteria) this;
        }

        public Criteria andV7SOperUserEqualTo(String value) {
            addCriterion("v7_s_oper_user =", value, "v7SOperUser");
            return (Criteria) this;
        }

        public Criteria andV7SOperUserNotEqualTo(String value) {
            addCriterion("v7_s_oper_user <>", value, "v7SOperUser");
            return (Criteria) this;
        }

        public Criteria andV7SOperUserGreaterThan(String value) {
            addCriterion("v7_s_oper_user >", value, "v7SOperUser");
            return (Criteria) this;
        }

        public Criteria andV7SOperUserGreaterThanOrEqualTo(String value) {
            addCriterion("v7_s_oper_user >=", value, "v7SOperUser");
            return (Criteria) this;
        }

        public Criteria andV7SOperUserLessThan(String value) {
            addCriterion("v7_s_oper_user <", value, "v7SOperUser");
            return (Criteria) this;
        }

        public Criteria andV7SOperUserLessThanOrEqualTo(String value) {
            addCriterion("v7_s_oper_user <=", value, "v7SOperUser");
            return (Criteria) this;
        }

        public Criteria andV7SOperUserLike(String value) {
            addCriterion("v7_s_oper_user like", value, "v7SOperUser");
            return (Criteria) this;
        }

        public Criteria andV7SOperUserNotLike(String value) {
            addCriterion("v7_s_oper_user not like", value, "v7SOperUser");
            return (Criteria) this;
        }

        public Criteria andV7SOperUserIn(List<String> values) {
            addCriterion("v7_s_oper_user in", values, "v7SOperUser");
            return (Criteria) this;
        }

        public Criteria andV7SOperUserNotIn(List<String> values) {
            addCriterion("v7_s_oper_user not in", values, "v7SOperUser");
            return (Criteria) this;
        }

        public Criteria andV7SOperUserBetween(String value1, String value2) {
            addCriterion("v7_s_oper_user between", value1, value2, "v7SOperUser");
            return (Criteria) this;
        }

        public Criteria andV7SOperUserNotBetween(String value1, String value2) {
            addCriterion("v7_s_oper_user not between", value1, value2, "v7SOperUser");
            return (Criteria) this;
        }

        public Criteria andV7SOperTimeIsNull() {
            addCriterion("v7_s_oper_time is null");
            return (Criteria) this;
        }

        public Criteria andV7SOperTimeIsNotNull() {
            addCriterion("v7_s_oper_time is not null");
            return (Criteria) this;
        }

        public Criteria andV7SOperTimeEqualTo(Date value) {
            addCriterion("v7_s_oper_time =", value, "v7SOperTime");
            return (Criteria) this;
        }

        public Criteria andV7SOperTimeNotEqualTo(Date value) {
            addCriterion("v7_s_oper_time <>", value, "v7SOperTime");
            return (Criteria) this;
        }

        public Criteria andV7SOperTimeGreaterThan(Date value) {
            addCriterion("v7_s_oper_time >", value, "v7SOperTime");
            return (Criteria) this;
        }

        public Criteria andV7SOperTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("v7_s_oper_time >=", value, "v7SOperTime");
            return (Criteria) this;
        }

        public Criteria andV7SOperTimeLessThan(Date value) {
            addCriterion("v7_s_oper_time <", value, "v7SOperTime");
            return (Criteria) this;
        }

        public Criteria andV7SOperTimeLessThanOrEqualTo(Date value) {
            addCriterion("v7_s_oper_time <=", value, "v7SOperTime");
            return (Criteria) this;
        }

        public Criteria andV7SOperTimeIn(List<Date> values) {
            addCriterion("v7_s_oper_time in", values, "v7SOperTime");
            return (Criteria) this;
        }

        public Criteria andV7SOperTimeNotIn(List<Date> values) {
            addCriterion("v7_s_oper_time not in", values, "v7SOperTime");
            return (Criteria) this;
        }

        public Criteria andV7SOperTimeBetween(Date value1, Date value2) {
            addCriterion("v7_s_oper_time between", value1, value2, "v7SOperTime");
            return (Criteria) this;
        }

        public Criteria andV7SOperTimeNotBetween(Date value1, Date value2) {
            addCriterion("v7_s_oper_time not between", value1, value2, "v7SOperTime");
            return (Criteria) this;
        }

        public Criteria andV7SUpdateUserIsNull() {
            addCriterion("v7_s_update_user is null");
            return (Criteria) this;
        }

        public Criteria andV7SUpdateUserIsNotNull() {
            addCriterion("v7_s_update_user is not null");
            return (Criteria) this;
        }

        public Criteria andV7SUpdateUserEqualTo(String value) {
            addCriterion("v7_s_update_user =", value, "v7SUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7SUpdateUserNotEqualTo(String value) {
            addCriterion("v7_s_update_user <>", value, "v7SUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7SUpdateUserGreaterThan(String value) {
            addCriterion("v7_s_update_user >", value, "v7SUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7SUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("v7_s_update_user >=", value, "v7SUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7SUpdateUserLessThan(String value) {
            addCriterion("v7_s_update_user <", value, "v7SUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7SUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("v7_s_update_user <=", value, "v7SUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7SUpdateUserLike(String value) {
            addCriterion("v7_s_update_user like", value, "v7SUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7SUpdateUserNotLike(String value) {
            addCriterion("v7_s_update_user not like", value, "v7SUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7SUpdateUserIn(List<String> values) {
            addCriterion("v7_s_update_user in", values, "v7SUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7SUpdateUserNotIn(List<String> values) {
            addCriterion("v7_s_update_user not in", values, "v7SUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7SUpdateUserBetween(String value1, String value2) {
            addCriterion("v7_s_update_user between", value1, value2, "v7SUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7SUpdateUserNotBetween(String value1, String value2) {
            addCriterion("v7_s_update_user not between", value1, value2, "v7SUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7SUpdateTimeIsNull() {
            addCriterion("v7_s_update_time is null");
            return (Criteria) this;
        }

        public Criteria andV7SUpdateTimeIsNotNull() {
            addCriterion("v7_s_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andV7SUpdateTimeEqualTo(Date value) {
            addCriterion("v7_s_update_time =", value, "v7SUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7SUpdateTimeNotEqualTo(Date value) {
            addCriterion("v7_s_update_time <>", value, "v7SUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7SUpdateTimeGreaterThan(Date value) {
            addCriterion("v7_s_update_time >", value, "v7SUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7SUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("v7_s_update_time >=", value, "v7SUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7SUpdateTimeLessThan(Date value) {
            addCriterion("v7_s_update_time <", value, "v7SUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7SUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("v7_s_update_time <=", value, "v7SUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7SUpdateTimeIn(List<Date> values) {
            addCriterion("v7_s_update_time in", values, "v7SUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7SUpdateTimeNotIn(List<Date> values) {
            addCriterion("v7_s_update_time not in", values, "v7SUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7SUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("v7_s_update_time between", value1, value2, "v7SUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7SUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("v7_s_update_time not between", value1, value2, "v7SUpdateTime");
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

        public Criteria andV7PkProductIsNull() {
            addCriterion("v7_pk_product is null");
            return (Criteria) this;
        }

        public Criteria andV7PkProductIsNotNull() {
            addCriterion("v7_pk_product is not null");
            return (Criteria) this;
        }

        public Criteria andV7PkProductEqualTo(String value) {
            addCriterion("v7_pk_product =", value, "v7PkProduct");
            return (Criteria) this;
        }

        public Criteria andV7PkProductNotEqualTo(String value) {
            addCriterion("v7_pk_product <>", value, "v7PkProduct");
            return (Criteria) this;
        }

        public Criteria andV7PkProductGreaterThan(String value) {
            addCriterion("v7_pk_product >", value, "v7PkProduct");
            return (Criteria) this;
        }

        public Criteria andV7PkProductGreaterThanOrEqualTo(String value) {
            addCriterion("v7_pk_product >=", value, "v7PkProduct");
            return (Criteria) this;
        }

        public Criteria andV7PkProductLessThan(String value) {
            addCriterion("v7_pk_product <", value, "v7PkProduct");
            return (Criteria) this;
        }

        public Criteria andV7PkProductLessThanOrEqualTo(String value) {
            addCriterion("v7_pk_product <=", value, "v7PkProduct");
            return (Criteria) this;
        }

        public Criteria andV7PkProductLike(String value) {
            addCriterion("v7_pk_product like", value, "v7PkProduct");
            return (Criteria) this;
        }

        public Criteria andV7PkProductNotLike(String value) {
            addCriterion("v7_pk_product not like", value, "v7PkProduct");
            return (Criteria) this;
        }

        public Criteria andV7PkProductIn(List<String> values) {
            addCriterion("v7_pk_product in", values, "v7PkProduct");
            return (Criteria) this;
        }

        public Criteria andV7PkProductNotIn(List<String> values) {
            addCriterion("v7_pk_product not in", values, "v7PkProduct");
            return (Criteria) this;
        }

        public Criteria andV7PkProductBetween(String value1, String value2) {
            addCriterion("v7_pk_product between", value1, value2, "v7PkProduct");
            return (Criteria) this;
        }

        public Criteria andV7PkProductNotBetween(String value1, String value2) {
            addCriterion("v7_pk_product not between", value1, value2, "v7PkProduct");
            return (Criteria) this;
        }

        public Criteria andV7PkStoreQuantityIsNull() {
            addCriterion("v7_pk_store_quantity is null");
            return (Criteria) this;
        }

        public Criteria andV7PkStoreQuantityIsNotNull() {
            addCriterion("v7_pk_store_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andV7PkStoreQuantityEqualTo(String value) {
            addCriterion("v7_pk_store_quantity =", value, "v7PkStoreQuantity");
            return (Criteria) this;
        }

        public Criteria andV7PkStoreQuantityNotEqualTo(String value) {
            addCriterion("v7_pk_store_quantity <>", value, "v7PkStoreQuantity");
            return (Criteria) this;
        }

        public Criteria andV7PkStoreQuantityGreaterThan(String value) {
            addCriterion("v7_pk_store_quantity >", value, "v7PkStoreQuantity");
            return (Criteria) this;
        }

        public Criteria andV7PkStoreQuantityGreaterThanOrEqualTo(String value) {
            addCriterion("v7_pk_store_quantity >=", value, "v7PkStoreQuantity");
            return (Criteria) this;
        }

        public Criteria andV7PkStoreQuantityLessThan(String value) {
            addCriterion("v7_pk_store_quantity <", value, "v7PkStoreQuantity");
            return (Criteria) this;
        }

        public Criteria andV7PkStoreQuantityLessThanOrEqualTo(String value) {
            addCriterion("v7_pk_store_quantity <=", value, "v7PkStoreQuantity");
            return (Criteria) this;
        }

        public Criteria andV7PkStoreQuantityLike(String value) {
            addCriterion("v7_pk_store_quantity like", value, "v7PkStoreQuantity");
            return (Criteria) this;
        }

        public Criteria andV7PkStoreQuantityNotLike(String value) {
            addCriterion("v7_pk_store_quantity not like", value, "v7PkStoreQuantity");
            return (Criteria) this;
        }

        public Criteria andV7PkStoreQuantityIn(List<String> values) {
            addCriterion("v7_pk_store_quantity in", values, "v7PkStoreQuantity");
            return (Criteria) this;
        }

        public Criteria andV7PkStoreQuantityNotIn(List<String> values) {
            addCriterion("v7_pk_store_quantity not in", values, "v7PkStoreQuantity");
            return (Criteria) this;
        }

        public Criteria andV7PkStoreQuantityBetween(String value1, String value2) {
            addCriterion("v7_pk_store_quantity between", value1, value2, "v7PkStoreQuantity");
            return (Criteria) this;
        }

        public Criteria andV7PkStoreQuantityNotBetween(String value1, String value2) {
            addCriterion("v7_pk_store_quantity not between", value1, value2, "v7PkStoreQuantity");
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