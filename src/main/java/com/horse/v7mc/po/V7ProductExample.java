package com.horse.v7mc.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class V7ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public V7ProductExample() {
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

        public Criteria andV7PBrandIsNull() {
            addCriterion("v7_p_brand is null");
            return (Criteria) this;
        }

        public Criteria andV7PBrandIsNotNull() {
            addCriterion("v7_p_brand is not null");
            return (Criteria) this;
        }

        public Criteria andV7PBrandEqualTo(String value) {
            addCriterion("v7_p_brand =", value, "v7PBrand");
            return (Criteria) this;
        }

        public Criteria andV7PBrandNotEqualTo(String value) {
            addCriterion("v7_p_brand <>", value, "v7PBrand");
            return (Criteria) this;
        }

        public Criteria andV7PBrandGreaterThan(String value) {
            addCriterion("v7_p_brand >", value, "v7PBrand");
            return (Criteria) this;
        }

        public Criteria andV7PBrandGreaterThanOrEqualTo(String value) {
            addCriterion("v7_p_brand >=", value, "v7PBrand");
            return (Criteria) this;
        }

        public Criteria andV7PBrandLessThan(String value) {
            addCriterion("v7_p_brand <", value, "v7PBrand");
            return (Criteria) this;
        }

        public Criteria andV7PBrandLessThanOrEqualTo(String value) {
            addCriterion("v7_p_brand <=", value, "v7PBrand");
            return (Criteria) this;
        }

        public Criteria andV7PBrandLike(String value) {
            addCriterion("v7_p_brand like", value, "v7PBrand");
            return (Criteria) this;
        }

        public Criteria andV7PBrandNotLike(String value) {
            addCriterion("v7_p_brand not like", value, "v7PBrand");
            return (Criteria) this;
        }

        public Criteria andV7PBrandIn(List<String> values) {
            addCriterion("v7_p_brand in", values, "v7PBrand");
            return (Criteria) this;
        }

        public Criteria andV7PBrandNotIn(List<String> values) {
            addCriterion("v7_p_brand not in", values, "v7PBrand");
            return (Criteria) this;
        }

        public Criteria andV7PBrandBetween(String value1, String value2) {
            addCriterion("v7_p_brand between", value1, value2, "v7PBrand");
            return (Criteria) this;
        }

        public Criteria andV7PBrandNotBetween(String value1, String value2) {
            addCriterion("v7_p_brand not between", value1, value2, "v7PBrand");
            return (Criteria) this;
        }

        public Criteria andV7PTypeIsNull() {
            addCriterion("v7_p_type is null");
            return (Criteria) this;
        }

        public Criteria andV7PTypeIsNotNull() {
            addCriterion("v7_p_type is not null");
            return (Criteria) this;
        }

        public Criteria andV7PTypeEqualTo(String value) {
            addCriterion("v7_p_type =", value, "v7PType");
            return (Criteria) this;
        }

        public Criteria andV7PTypeNotEqualTo(String value) {
            addCriterion("v7_p_type <>", value, "v7PType");
            return (Criteria) this;
        }

        public Criteria andV7PTypeGreaterThan(String value) {
            addCriterion("v7_p_type >", value, "v7PType");
            return (Criteria) this;
        }

        public Criteria andV7PTypeGreaterThanOrEqualTo(String value) {
            addCriterion("v7_p_type >=", value, "v7PType");
            return (Criteria) this;
        }

        public Criteria andV7PTypeLessThan(String value) {
            addCriterion("v7_p_type <", value, "v7PType");
            return (Criteria) this;
        }

        public Criteria andV7PTypeLessThanOrEqualTo(String value) {
            addCriterion("v7_p_type <=", value, "v7PType");
            return (Criteria) this;
        }

        public Criteria andV7PTypeLike(String value) {
            addCriterion("v7_p_type like", value, "v7PType");
            return (Criteria) this;
        }

        public Criteria andV7PTypeNotLike(String value) {
            addCriterion("v7_p_type not like", value, "v7PType");
            return (Criteria) this;
        }

        public Criteria andV7PTypeIn(List<String> values) {
            addCriterion("v7_p_type in", values, "v7PType");
            return (Criteria) this;
        }

        public Criteria andV7PTypeNotIn(List<String> values) {
            addCriterion("v7_p_type not in", values, "v7PType");
            return (Criteria) this;
        }

        public Criteria andV7PTypeBetween(String value1, String value2) {
            addCriterion("v7_p_type between", value1, value2, "v7PType");
            return (Criteria) this;
        }

        public Criteria andV7PTypeNotBetween(String value1, String value2) {
            addCriterion("v7_p_type not between", value1, value2, "v7PType");
            return (Criteria) this;
        }

        public Criteria andV7PNameIsNull() {
            addCriterion("v7_p_name is null");
            return (Criteria) this;
        }

        public Criteria andV7PNameIsNotNull() {
            addCriterion("v7_p_name is not null");
            return (Criteria) this;
        }

        public Criteria andV7PNameEqualTo(String value) {
            addCriterion("v7_p_name =", value, "v7PName");
            return (Criteria) this;
        }

        public Criteria andV7PNameNotEqualTo(String value) {
            addCriterion("v7_p_name <>", value, "v7PName");
            return (Criteria) this;
        }

        public Criteria andV7PNameGreaterThan(String value) {
            addCriterion("v7_p_name >", value, "v7PName");
            return (Criteria) this;
        }

        public Criteria andV7PNameGreaterThanOrEqualTo(String value) {
            addCriterion("v7_p_name >=", value, "v7PName");
            return (Criteria) this;
        }

        public Criteria andV7PNameLessThan(String value) {
            addCriterion("v7_p_name <", value, "v7PName");
            return (Criteria) this;
        }

        public Criteria andV7PNameLessThanOrEqualTo(String value) {
            addCriterion("v7_p_name <=", value, "v7PName");
            return (Criteria) this;
        }

        public Criteria andV7PNameLike(String value) {
            addCriterion("v7_p_name like", value, "v7PName");
            return (Criteria) this;
        }

        public Criteria andV7PNameNotLike(String value) {
            addCriterion("v7_p_name not like", value, "v7PName");
            return (Criteria) this;
        }

        public Criteria andV7PNameIn(List<String> values) {
            addCriterion("v7_p_name in", values, "v7PName");
            return (Criteria) this;
        }

        public Criteria andV7PNameNotIn(List<String> values) {
            addCriterion("v7_p_name not in", values, "v7PName");
            return (Criteria) this;
        }

        public Criteria andV7PNameBetween(String value1, String value2) {
            addCriterion("v7_p_name between", value1, value2, "v7PName");
            return (Criteria) this;
        }

        public Criteria andV7PNameNotBetween(String value1, String value2) {
            addCriterion("v7_p_name not between", value1, value2, "v7PName");
            return (Criteria) this;
        }

        public Criteria andV7PUnitIsNull() {
            addCriterion("v7_p_unit is null");
            return (Criteria) this;
        }

        public Criteria andV7PUnitIsNotNull() {
            addCriterion("v7_p_unit is not null");
            return (Criteria) this;
        }

        public Criteria andV7PUnitEqualTo(String value) {
            addCriterion("v7_p_unit =", value, "v7PUnit");
            return (Criteria) this;
        }

        public Criteria andV7PUnitNotEqualTo(String value) {
            addCriterion("v7_p_unit <>", value, "v7PUnit");
            return (Criteria) this;
        }

        public Criteria andV7PUnitGreaterThan(String value) {
            addCriterion("v7_p_unit >", value, "v7PUnit");
            return (Criteria) this;
        }

        public Criteria andV7PUnitGreaterThanOrEqualTo(String value) {
            addCriterion("v7_p_unit >=", value, "v7PUnit");
            return (Criteria) this;
        }

        public Criteria andV7PUnitLessThan(String value) {
            addCriterion("v7_p_unit <", value, "v7PUnit");
            return (Criteria) this;
        }

        public Criteria andV7PUnitLessThanOrEqualTo(String value) {
            addCriterion("v7_p_unit <=", value, "v7PUnit");
            return (Criteria) this;
        }

        public Criteria andV7PUnitLike(String value) {
            addCriterion("v7_p_unit like", value, "v7PUnit");
            return (Criteria) this;
        }

        public Criteria andV7PUnitNotLike(String value) {
            addCriterion("v7_p_unit not like", value, "v7PUnit");
            return (Criteria) this;
        }

        public Criteria andV7PUnitIn(List<String> values) {
            addCriterion("v7_p_unit in", values, "v7PUnit");
            return (Criteria) this;
        }

        public Criteria andV7PUnitNotIn(List<String> values) {
            addCriterion("v7_p_unit not in", values, "v7PUnit");
            return (Criteria) this;
        }

        public Criteria andV7PUnitBetween(String value1, String value2) {
            addCriterion("v7_p_unit between", value1, value2, "v7PUnit");
            return (Criteria) this;
        }

        public Criteria andV7PUnitNotBetween(String value1, String value2) {
            addCriterion("v7_p_unit not between", value1, value2, "v7PUnit");
            return (Criteria) this;
        }

        public Criteria andV7PStandardIsNull() {
            addCriterion("v7_p_standard is null");
            return (Criteria) this;
        }

        public Criteria andV7PStandardIsNotNull() {
            addCriterion("v7_p_standard is not null");
            return (Criteria) this;
        }

        public Criteria andV7PStandardEqualTo(String value) {
            addCriterion("v7_p_standard =", value, "v7PStandard");
            return (Criteria) this;
        }

        public Criteria andV7PStandardNotEqualTo(String value) {
            addCriterion("v7_p_standard <>", value, "v7PStandard");
            return (Criteria) this;
        }

        public Criteria andV7PStandardGreaterThan(String value) {
            addCriterion("v7_p_standard >", value, "v7PStandard");
            return (Criteria) this;
        }

        public Criteria andV7PStandardGreaterThanOrEqualTo(String value) {
            addCriterion("v7_p_standard >=", value, "v7PStandard");
            return (Criteria) this;
        }

        public Criteria andV7PStandardLessThan(String value) {
            addCriterion("v7_p_standard <", value, "v7PStandard");
            return (Criteria) this;
        }

        public Criteria andV7PStandardLessThanOrEqualTo(String value) {
            addCriterion("v7_p_standard <=", value, "v7PStandard");
            return (Criteria) this;
        }

        public Criteria andV7PStandardLike(String value) {
            addCriterion("v7_p_standard like", value, "v7PStandard");
            return (Criteria) this;
        }

        public Criteria andV7PStandardNotLike(String value) {
            addCriterion("v7_p_standard not like", value, "v7PStandard");
            return (Criteria) this;
        }

        public Criteria andV7PStandardIn(List<String> values) {
            addCriterion("v7_p_standard in", values, "v7PStandard");
            return (Criteria) this;
        }

        public Criteria andV7PStandardNotIn(List<String> values) {
            addCriterion("v7_p_standard not in", values, "v7PStandard");
            return (Criteria) this;
        }

        public Criteria andV7PStandardBetween(String value1, String value2) {
            addCriterion("v7_p_standard between", value1, value2, "v7PStandard");
            return (Criteria) this;
        }

        public Criteria andV7PStandardNotBetween(String value1, String value2) {
            addCriterion("v7_p_standard not between", value1, value2, "v7PStandard");
            return (Criteria) this;
        }

        public Criteria andV7PAgentIsNull() {
            addCriterion("v7_p_agent is null");
            return (Criteria) this;
        }

        public Criteria andV7PAgentIsNotNull() {
            addCriterion("v7_p_agent is not null");
            return (Criteria) this;
        }

        public Criteria andV7PAgentEqualTo(String value) {
            addCriterion("v7_p_agent =", value, "v7PAgent");
            return (Criteria) this;
        }

        public Criteria andV7PAgentNotEqualTo(String value) {
            addCriterion("v7_p_agent <>", value, "v7PAgent");
            return (Criteria) this;
        }

        public Criteria andV7PAgentGreaterThan(String value) {
            addCriterion("v7_p_agent >", value, "v7PAgent");
            return (Criteria) this;
        }

        public Criteria andV7PAgentGreaterThanOrEqualTo(String value) {
            addCriterion("v7_p_agent >=", value, "v7PAgent");
            return (Criteria) this;
        }

        public Criteria andV7PAgentLessThan(String value) {
            addCriterion("v7_p_agent <", value, "v7PAgent");
            return (Criteria) this;
        }

        public Criteria andV7PAgentLessThanOrEqualTo(String value) {
            addCriterion("v7_p_agent <=", value, "v7PAgent");
            return (Criteria) this;
        }

        public Criteria andV7PAgentLike(String value) {
            addCriterion("v7_p_agent like", value, "v7PAgent");
            return (Criteria) this;
        }

        public Criteria andV7PAgentNotLike(String value) {
            addCriterion("v7_p_agent not like", value, "v7PAgent");
            return (Criteria) this;
        }

        public Criteria andV7PAgentIn(List<String> values) {
            addCriterion("v7_p_agent in", values, "v7PAgent");
            return (Criteria) this;
        }

        public Criteria andV7PAgentNotIn(List<String> values) {
            addCriterion("v7_p_agent not in", values, "v7PAgent");
            return (Criteria) this;
        }

        public Criteria andV7PAgentBetween(String value1, String value2) {
            addCriterion("v7_p_agent between", value1, value2, "v7PAgent");
            return (Criteria) this;
        }

        public Criteria andV7PAgentNotBetween(String value1, String value2) {
            addCriterion("v7_p_agent not between", value1, value2, "v7PAgent");
            return (Criteria) this;
        }

        public Criteria andV7PAgentPhoneIsNull() {
            addCriterion("v7_p_agent_phone is null");
            return (Criteria) this;
        }

        public Criteria andV7PAgentPhoneIsNotNull() {
            addCriterion("v7_p_agent_phone is not null");
            return (Criteria) this;
        }

        public Criteria andV7PAgentPhoneEqualTo(String value) {
            addCriterion("v7_p_agent_phone =", value, "v7PAgentPhone");
            return (Criteria) this;
        }

        public Criteria andV7PAgentPhoneNotEqualTo(String value) {
            addCriterion("v7_p_agent_phone <>", value, "v7PAgentPhone");
            return (Criteria) this;
        }

        public Criteria andV7PAgentPhoneGreaterThan(String value) {
            addCriterion("v7_p_agent_phone >", value, "v7PAgentPhone");
            return (Criteria) this;
        }

        public Criteria andV7PAgentPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("v7_p_agent_phone >=", value, "v7PAgentPhone");
            return (Criteria) this;
        }

        public Criteria andV7PAgentPhoneLessThan(String value) {
            addCriterion("v7_p_agent_phone <", value, "v7PAgentPhone");
            return (Criteria) this;
        }

        public Criteria andV7PAgentPhoneLessThanOrEqualTo(String value) {
            addCriterion("v7_p_agent_phone <=", value, "v7PAgentPhone");
            return (Criteria) this;
        }

        public Criteria andV7PAgentPhoneLike(String value) {
            addCriterion("v7_p_agent_phone like", value, "v7PAgentPhone");
            return (Criteria) this;
        }

        public Criteria andV7PAgentPhoneNotLike(String value) {
            addCriterion("v7_p_agent_phone not like", value, "v7PAgentPhone");
            return (Criteria) this;
        }

        public Criteria andV7PAgentPhoneIn(List<String> values) {
            addCriterion("v7_p_agent_phone in", values, "v7PAgentPhone");
            return (Criteria) this;
        }

        public Criteria andV7PAgentPhoneNotIn(List<String> values) {
            addCriterion("v7_p_agent_phone not in", values, "v7PAgentPhone");
            return (Criteria) this;
        }

        public Criteria andV7PAgentPhoneBetween(String value1, String value2) {
            addCriterion("v7_p_agent_phone between", value1, value2, "v7PAgentPhone");
            return (Criteria) this;
        }

        public Criteria andV7PAgentPhoneNotBetween(String value1, String value2) {
            addCriterion("v7_p_agent_phone not between", value1, value2, "v7PAgentPhone");
            return (Criteria) this;
        }

        public Criteria andV7PStatusIsNull() {
            addCriterion("v7_p_status is null");
            return (Criteria) this;
        }

        public Criteria andV7PStatusIsNotNull() {
            addCriterion("v7_p_status is not null");
            return (Criteria) this;
        }

        public Criteria andV7PStatusEqualTo(Integer value) {
            addCriterion("v7_p_status =", value, "v7PStatus");
            return (Criteria) this;
        }

        public Criteria andV7PStatusNotEqualTo(Integer value) {
            addCriterion("v7_p_status <>", value, "v7PStatus");
            return (Criteria) this;
        }

        public Criteria andV7PStatusGreaterThan(Integer value) {
            addCriterion("v7_p_status >", value, "v7PStatus");
            return (Criteria) this;
        }

        public Criteria andV7PStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("v7_p_status >=", value, "v7PStatus");
            return (Criteria) this;
        }

        public Criteria andV7PStatusLessThan(Integer value) {
            addCriterion("v7_p_status <", value, "v7PStatus");
            return (Criteria) this;
        }

        public Criteria andV7PStatusLessThanOrEqualTo(Integer value) {
            addCriterion("v7_p_status <=", value, "v7PStatus");
            return (Criteria) this;
        }

        public Criteria andV7PStatusIn(List<Integer> values) {
            addCriterion("v7_p_status in", values, "v7PStatus");
            return (Criteria) this;
        }

        public Criteria andV7PStatusNotIn(List<Integer> values) {
            addCriterion("v7_p_status not in", values, "v7PStatus");
            return (Criteria) this;
        }

        public Criteria andV7PStatusBetween(Integer value1, Integer value2) {
            addCriterion("v7_p_status between", value1, value2, "v7PStatus");
            return (Criteria) this;
        }

        public Criteria andV7PStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("v7_p_status not between", value1, value2, "v7PStatus");
            return (Criteria) this;
        }

        public Criteria andV7PRemarksIsNull() {
            addCriterion("v7_p_remarks is null");
            return (Criteria) this;
        }

        public Criteria andV7PRemarksIsNotNull() {
            addCriterion("v7_p_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andV7PRemarksEqualTo(String value) {
            addCriterion("v7_p_remarks =", value, "v7PRemarks");
            return (Criteria) this;
        }

        public Criteria andV7PRemarksNotEqualTo(String value) {
            addCriterion("v7_p_remarks <>", value, "v7PRemarks");
            return (Criteria) this;
        }

        public Criteria andV7PRemarksGreaterThan(String value) {
            addCriterion("v7_p_remarks >", value, "v7PRemarks");
            return (Criteria) this;
        }

        public Criteria andV7PRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("v7_p_remarks >=", value, "v7PRemarks");
            return (Criteria) this;
        }

        public Criteria andV7PRemarksLessThan(String value) {
            addCriterion("v7_p_remarks <", value, "v7PRemarks");
            return (Criteria) this;
        }

        public Criteria andV7PRemarksLessThanOrEqualTo(String value) {
            addCriterion("v7_p_remarks <=", value, "v7PRemarks");
            return (Criteria) this;
        }

        public Criteria andV7PRemarksLike(String value) {
            addCriterion("v7_p_remarks like", value, "v7PRemarks");
            return (Criteria) this;
        }

        public Criteria andV7PRemarksNotLike(String value) {
            addCriterion("v7_p_remarks not like", value, "v7PRemarks");
            return (Criteria) this;
        }

        public Criteria andV7PRemarksIn(List<String> values) {
            addCriterion("v7_p_remarks in", values, "v7PRemarks");
            return (Criteria) this;
        }

        public Criteria andV7PRemarksNotIn(List<String> values) {
            addCriterion("v7_p_remarks not in", values, "v7PRemarks");
            return (Criteria) this;
        }

        public Criteria andV7PRemarksBetween(String value1, String value2) {
            addCriterion("v7_p_remarks between", value1, value2, "v7PRemarks");
            return (Criteria) this;
        }

        public Criteria andV7PRemarksNotBetween(String value1, String value2) {
            addCriterion("v7_p_remarks not between", value1, value2, "v7PRemarks");
            return (Criteria) this;
        }

        public Criteria andV7PCreateUserIsNull() {
            addCriterion("v7_p_create_user is null");
            return (Criteria) this;
        }

        public Criteria andV7PCreateUserIsNotNull() {
            addCriterion("v7_p_create_user is not null");
            return (Criteria) this;
        }

        public Criteria andV7PCreateUserEqualTo(String value) {
            addCriterion("v7_p_create_user =", value, "v7PCreateUser");
            return (Criteria) this;
        }

        public Criteria andV7PCreateUserNotEqualTo(String value) {
            addCriterion("v7_p_create_user <>", value, "v7PCreateUser");
            return (Criteria) this;
        }

        public Criteria andV7PCreateUserGreaterThan(String value) {
            addCriterion("v7_p_create_user >", value, "v7PCreateUser");
            return (Criteria) this;
        }

        public Criteria andV7PCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("v7_p_create_user >=", value, "v7PCreateUser");
            return (Criteria) this;
        }

        public Criteria andV7PCreateUserLessThan(String value) {
            addCriterion("v7_p_create_user <", value, "v7PCreateUser");
            return (Criteria) this;
        }

        public Criteria andV7PCreateUserLessThanOrEqualTo(String value) {
            addCriterion("v7_p_create_user <=", value, "v7PCreateUser");
            return (Criteria) this;
        }

        public Criteria andV7PCreateUserLike(String value) {
            addCriterion("v7_p_create_user like", value, "v7PCreateUser");
            return (Criteria) this;
        }

        public Criteria andV7PCreateUserNotLike(String value) {
            addCriterion("v7_p_create_user not like", value, "v7PCreateUser");
            return (Criteria) this;
        }

        public Criteria andV7PCreateUserIn(List<String> values) {
            addCriterion("v7_p_create_user in", values, "v7PCreateUser");
            return (Criteria) this;
        }

        public Criteria andV7PCreateUserNotIn(List<String> values) {
            addCriterion("v7_p_create_user not in", values, "v7PCreateUser");
            return (Criteria) this;
        }

        public Criteria andV7PCreateUserBetween(String value1, String value2) {
            addCriterion("v7_p_create_user between", value1, value2, "v7PCreateUser");
            return (Criteria) this;
        }

        public Criteria andV7PCreateUserNotBetween(String value1, String value2) {
            addCriterion("v7_p_create_user not between", value1, value2, "v7PCreateUser");
            return (Criteria) this;
        }

        public Criteria andV7PCrateTimeIsNull() {
            addCriterion("v7_p_crate_time is null");
            return (Criteria) this;
        }

        public Criteria andV7PCrateTimeIsNotNull() {
            addCriterion("v7_p_crate_time is not null");
            return (Criteria) this;
        }

        public Criteria andV7PCrateTimeEqualTo(Date value) {
            addCriterion("v7_p_crate_time =", value, "v7PCrateTime");
            return (Criteria) this;
        }

        public Criteria andV7PCrateTimeNotEqualTo(Date value) {
            addCriterion("v7_p_crate_time <>", value, "v7PCrateTime");
            return (Criteria) this;
        }

        public Criteria andV7PCrateTimeGreaterThan(Date value) {
            addCriterion("v7_p_crate_time >", value, "v7PCrateTime");
            return (Criteria) this;
        }

        public Criteria andV7PCrateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("v7_p_crate_time >=", value, "v7PCrateTime");
            return (Criteria) this;
        }

        public Criteria andV7PCrateTimeLessThan(Date value) {
            addCriterion("v7_p_crate_time <", value, "v7PCrateTime");
            return (Criteria) this;
        }

        public Criteria andV7PCrateTimeLessThanOrEqualTo(Date value) {
            addCriterion("v7_p_crate_time <=", value, "v7PCrateTime");
            return (Criteria) this;
        }

        public Criteria andV7PCrateTimeIn(List<Date> values) {
            addCriterion("v7_p_crate_time in", values, "v7PCrateTime");
            return (Criteria) this;
        }

        public Criteria andV7PCrateTimeNotIn(List<Date> values) {
            addCriterion("v7_p_crate_time not in", values, "v7PCrateTime");
            return (Criteria) this;
        }

        public Criteria andV7PCrateTimeBetween(Date value1, Date value2) {
            addCriterion("v7_p_crate_time between", value1, value2, "v7PCrateTime");
            return (Criteria) this;
        }

        public Criteria andV7PCrateTimeNotBetween(Date value1, Date value2) {
            addCriterion("v7_p_crate_time not between", value1, value2, "v7PCrateTime");
            return (Criteria) this;
        }

        public Criteria andV7PUpdateUserIsNull() {
            addCriterion("v7_p_update_user is null");
            return (Criteria) this;
        }

        public Criteria andV7PUpdateUserIsNotNull() {
            addCriterion("v7_p_update_user is not null");
            return (Criteria) this;
        }

        public Criteria andV7PUpdateUserEqualTo(String value) {
            addCriterion("v7_p_update_user =", value, "v7PUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7PUpdateUserNotEqualTo(String value) {
            addCriterion("v7_p_update_user <>", value, "v7PUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7PUpdateUserGreaterThan(String value) {
            addCriterion("v7_p_update_user >", value, "v7PUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7PUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("v7_p_update_user >=", value, "v7PUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7PUpdateUserLessThan(String value) {
            addCriterion("v7_p_update_user <", value, "v7PUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7PUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("v7_p_update_user <=", value, "v7PUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7PUpdateUserLike(String value) {
            addCriterion("v7_p_update_user like", value, "v7PUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7PUpdateUserNotLike(String value) {
            addCriterion("v7_p_update_user not like", value, "v7PUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7PUpdateUserIn(List<String> values) {
            addCriterion("v7_p_update_user in", values, "v7PUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7PUpdateUserNotIn(List<String> values) {
            addCriterion("v7_p_update_user not in", values, "v7PUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7PUpdateUserBetween(String value1, String value2) {
            addCriterion("v7_p_update_user between", value1, value2, "v7PUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7PUpdateUserNotBetween(String value1, String value2) {
            addCriterion("v7_p_update_user not between", value1, value2, "v7PUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7PUpdateTimeIsNull() {
            addCriterion("v7_p_update_time is null");
            return (Criteria) this;
        }

        public Criteria andV7PUpdateTimeIsNotNull() {
            addCriterion("v7_p_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andV7PUpdateTimeEqualTo(Date value) {
            addCriterion("v7_p_update_time =", value, "v7PUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7PUpdateTimeNotEqualTo(Date value) {
            addCriterion("v7_p_update_time <>", value, "v7PUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7PUpdateTimeGreaterThan(Date value) {
            addCriterion("v7_p_update_time >", value, "v7PUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7PUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("v7_p_update_time >=", value, "v7PUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7PUpdateTimeLessThan(Date value) {
            addCriterion("v7_p_update_time <", value, "v7PUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7PUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("v7_p_update_time <=", value, "v7PUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7PUpdateTimeIn(List<Date> values) {
            addCriterion("v7_p_update_time in", values, "v7PUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7PUpdateTimeNotIn(List<Date> values) {
            addCriterion("v7_p_update_time not in", values, "v7PUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7PUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("v7_p_update_time between", value1, value2, "v7PUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7PUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("v7_p_update_time not between", value1, value2, "v7PUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7PkBrandIsNull() {
            addCriterion("v7_pk_brand is null");
            return (Criteria) this;
        }

        public Criteria andV7PkBrandIsNotNull() {
            addCriterion("v7_pk_brand is not null");
            return (Criteria) this;
        }

        public Criteria andV7PkBrandEqualTo(String value) {
            addCriterion("v7_pk_brand =", value, "v7PkBrand");
            return (Criteria) this;
        }

        public Criteria andV7PkBrandNotEqualTo(String value) {
            addCriterion("v7_pk_brand <>", value, "v7PkBrand");
            return (Criteria) this;
        }

        public Criteria andV7PkBrandGreaterThan(String value) {
            addCriterion("v7_pk_brand >", value, "v7PkBrand");
            return (Criteria) this;
        }

        public Criteria andV7PkBrandGreaterThanOrEqualTo(String value) {
            addCriterion("v7_pk_brand >=", value, "v7PkBrand");
            return (Criteria) this;
        }

        public Criteria andV7PkBrandLessThan(String value) {
            addCriterion("v7_pk_brand <", value, "v7PkBrand");
            return (Criteria) this;
        }

        public Criteria andV7PkBrandLessThanOrEqualTo(String value) {
            addCriterion("v7_pk_brand <=", value, "v7PkBrand");
            return (Criteria) this;
        }

        public Criteria andV7PkBrandLike(String value) {
            addCriterion("v7_pk_brand like", value, "v7PkBrand");
            return (Criteria) this;
        }

        public Criteria andV7PkBrandNotLike(String value) {
            addCriterion("v7_pk_brand not like", value, "v7PkBrand");
            return (Criteria) this;
        }

        public Criteria andV7PkBrandIn(List<String> values) {
            addCriterion("v7_pk_brand in", values, "v7PkBrand");
            return (Criteria) this;
        }

        public Criteria andV7PkBrandNotIn(List<String> values) {
            addCriterion("v7_pk_brand not in", values, "v7PkBrand");
            return (Criteria) this;
        }

        public Criteria andV7PkBrandBetween(String value1, String value2) {
            addCriterion("v7_pk_brand between", value1, value2, "v7PkBrand");
            return (Criteria) this;
        }

        public Criteria andV7PkBrandNotBetween(String value1, String value2) {
            addCriterion("v7_pk_brand not between", value1, value2, "v7PkBrand");
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