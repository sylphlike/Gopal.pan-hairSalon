package com.carrey.v7mc.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class V7BrandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public V7BrandExample() {
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

        public Criteria andV7BNameIsNull() {
            addCriterion("v7_b_name is null");
            return (Criteria) this;
        }

        public Criteria andV7BNameIsNotNull() {
            addCriterion("v7_b_name is not null");
            return (Criteria) this;
        }

        public Criteria andV7BNameEqualTo(String value) {
            addCriterion("v7_b_name =", value, "v7BName");
            return (Criteria) this;
        }

        public Criteria andV7BNameNotEqualTo(String value) {
            addCriterion("v7_b_name <>", value, "v7BName");
            return (Criteria) this;
        }

        public Criteria andV7BNameGreaterThan(String value) {
            addCriterion("v7_b_name >", value, "v7BName");
            return (Criteria) this;
        }

        public Criteria andV7BNameGreaterThanOrEqualTo(String value) {
            addCriterion("v7_b_name >=", value, "v7BName");
            return (Criteria) this;
        }

        public Criteria andV7BNameLessThan(String value) {
            addCriterion("v7_b_name <", value, "v7BName");
            return (Criteria) this;
        }

        public Criteria andV7BNameLessThanOrEqualTo(String value) {
            addCriterion("v7_b_name <=", value, "v7BName");
            return (Criteria) this;
        }

        public Criteria andV7BNameLike(String value) {
            addCriterion("v7_b_name like", value, "v7BName");
            return (Criteria) this;
        }

        public Criteria andV7BNameNotLike(String value) {
            addCriterion("v7_b_name not like", value, "v7BName");
            return (Criteria) this;
        }

        public Criteria andV7BNameIn(List<String> values) {
            addCriterion("v7_b_name in", values, "v7BName");
            return (Criteria) this;
        }

        public Criteria andV7BNameNotIn(List<String> values) {
            addCriterion("v7_b_name not in", values, "v7BName");
            return (Criteria) this;
        }

        public Criteria andV7BNameBetween(String value1, String value2) {
            addCriterion("v7_b_name between", value1, value2, "v7BName");
            return (Criteria) this;
        }

        public Criteria andV7BNameNotBetween(String value1, String value2) {
            addCriterion("v7_b_name not between", value1, value2, "v7BName");
            return (Criteria) this;
        }

        public Criteria andV7BTypeIsNull() {
            addCriterion("v7_b_type is null");
            return (Criteria) this;
        }

        public Criteria andV7BTypeIsNotNull() {
            addCriterion("v7_b_type is not null");
            return (Criteria) this;
        }

        public Criteria andV7BTypeEqualTo(String value) {
            addCriterion("v7_b_type =", value, "v7BType");
            return (Criteria) this;
        }

        public Criteria andV7BTypeNotEqualTo(String value) {
            addCriterion("v7_b_type <>", value, "v7BType");
            return (Criteria) this;
        }

        public Criteria andV7BTypeGreaterThan(String value) {
            addCriterion("v7_b_type >", value, "v7BType");
            return (Criteria) this;
        }

        public Criteria andV7BTypeGreaterThanOrEqualTo(String value) {
            addCriterion("v7_b_type >=", value, "v7BType");
            return (Criteria) this;
        }

        public Criteria andV7BTypeLessThan(String value) {
            addCriterion("v7_b_type <", value, "v7BType");
            return (Criteria) this;
        }

        public Criteria andV7BTypeLessThanOrEqualTo(String value) {
            addCriterion("v7_b_type <=", value, "v7BType");
            return (Criteria) this;
        }

        public Criteria andV7BTypeLike(String value) {
            addCriterion("v7_b_type like", value, "v7BType");
            return (Criteria) this;
        }

        public Criteria andV7BTypeNotLike(String value) {
            addCriterion("v7_b_type not like", value, "v7BType");
            return (Criteria) this;
        }

        public Criteria andV7BTypeIn(List<String> values) {
            addCriterion("v7_b_type in", values, "v7BType");
            return (Criteria) this;
        }

        public Criteria andV7BTypeNotIn(List<String> values) {
            addCriterion("v7_b_type not in", values, "v7BType");
            return (Criteria) this;
        }

        public Criteria andV7BTypeBetween(String value1, String value2) {
            addCriterion("v7_b_type between", value1, value2, "v7BType");
            return (Criteria) this;
        }

        public Criteria andV7BTypeNotBetween(String value1, String value2) {
            addCriterion("v7_b_type not between", value1, value2, "v7BType");
            return (Criteria) this;
        }

        public Criteria andV7BBrandDeclareIsNull() {
            addCriterion("v7_b_brand_declare is null");
            return (Criteria) this;
        }

        public Criteria andV7BBrandDeclareIsNotNull() {
            addCriterion("v7_b_brand_declare is not null");
            return (Criteria) this;
        }

        public Criteria andV7BBrandDeclareEqualTo(String value) {
            addCriterion("v7_b_brand_declare =", value, "v7BBrandDeclare");
            return (Criteria) this;
        }

        public Criteria andV7BBrandDeclareNotEqualTo(String value) {
            addCriterion("v7_b_brand_declare <>", value, "v7BBrandDeclare");
            return (Criteria) this;
        }

        public Criteria andV7BBrandDeclareGreaterThan(String value) {
            addCriterion("v7_b_brand_declare >", value, "v7BBrandDeclare");
            return (Criteria) this;
        }

        public Criteria andV7BBrandDeclareGreaterThanOrEqualTo(String value) {
            addCriterion("v7_b_brand_declare >=", value, "v7BBrandDeclare");
            return (Criteria) this;
        }

        public Criteria andV7BBrandDeclareLessThan(String value) {
            addCriterion("v7_b_brand_declare <", value, "v7BBrandDeclare");
            return (Criteria) this;
        }

        public Criteria andV7BBrandDeclareLessThanOrEqualTo(String value) {
            addCriterion("v7_b_brand_declare <=", value, "v7BBrandDeclare");
            return (Criteria) this;
        }

        public Criteria andV7BBrandDeclareLike(String value) {
            addCriterion("v7_b_brand_declare like", value, "v7BBrandDeclare");
            return (Criteria) this;
        }

        public Criteria andV7BBrandDeclareNotLike(String value) {
            addCriterion("v7_b_brand_declare not like", value, "v7BBrandDeclare");
            return (Criteria) this;
        }

        public Criteria andV7BBrandDeclareIn(List<String> values) {
            addCriterion("v7_b_brand_declare in", values, "v7BBrandDeclare");
            return (Criteria) this;
        }

        public Criteria andV7BBrandDeclareNotIn(List<String> values) {
            addCriterion("v7_b_brand_declare not in", values, "v7BBrandDeclare");
            return (Criteria) this;
        }

        public Criteria andV7BBrandDeclareBetween(String value1, String value2) {
            addCriterion("v7_b_brand_declare between", value1, value2, "v7BBrandDeclare");
            return (Criteria) this;
        }

        public Criteria andV7BBrandDeclareNotBetween(String value1, String value2) {
            addCriterion("v7_b_brand_declare not between", value1, value2, "v7BBrandDeclare");
            return (Criteria) this;
        }

        public Criteria andV7BStatusIsNull() {
            addCriterion("v7_b_status is null");
            return (Criteria) this;
        }

        public Criteria andV7BStatusIsNotNull() {
            addCriterion("v7_b_status is not null");
            return (Criteria) this;
        }

        public Criteria andV7BStatusEqualTo(Integer value) {
            addCriterion("v7_b_status =", value, "v7BStatus");
            return (Criteria) this;
        }

        public Criteria andV7BStatusNotEqualTo(Integer value) {
            addCriterion("v7_b_status <>", value, "v7BStatus");
            return (Criteria) this;
        }

        public Criteria andV7BStatusGreaterThan(Integer value) {
            addCriterion("v7_b_status >", value, "v7BStatus");
            return (Criteria) this;
        }

        public Criteria andV7BStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("v7_b_status >=", value, "v7BStatus");
            return (Criteria) this;
        }

        public Criteria andV7BStatusLessThan(Integer value) {
            addCriterion("v7_b_status <", value, "v7BStatus");
            return (Criteria) this;
        }

        public Criteria andV7BStatusLessThanOrEqualTo(Integer value) {
            addCriterion("v7_b_status <=", value, "v7BStatus");
            return (Criteria) this;
        }

        public Criteria andV7BStatusIn(List<Integer> values) {
            addCriterion("v7_b_status in", values, "v7BStatus");
            return (Criteria) this;
        }

        public Criteria andV7BStatusNotIn(List<Integer> values) {
            addCriterion("v7_b_status not in", values, "v7BStatus");
            return (Criteria) this;
        }

        public Criteria andV7BStatusBetween(Integer value1, Integer value2) {
            addCriterion("v7_b_status between", value1, value2, "v7BStatus");
            return (Criteria) this;
        }

        public Criteria andV7BStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("v7_b_status not between", value1, value2, "v7BStatus");
            return (Criteria) this;
        }

        public Criteria andV7BCreateUserIsNull() {
            addCriterion("v7_b_create_user is null");
            return (Criteria) this;
        }

        public Criteria andV7BCreateUserIsNotNull() {
            addCriterion("v7_b_create_user is not null");
            return (Criteria) this;
        }

        public Criteria andV7BCreateUserEqualTo(String value) {
            addCriterion("v7_b_create_user =", value, "v7BCreateUser");
            return (Criteria) this;
        }

        public Criteria andV7BCreateUserNotEqualTo(String value) {
            addCriterion("v7_b_create_user <>", value, "v7BCreateUser");
            return (Criteria) this;
        }

        public Criteria andV7BCreateUserGreaterThan(String value) {
            addCriterion("v7_b_create_user >", value, "v7BCreateUser");
            return (Criteria) this;
        }

        public Criteria andV7BCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("v7_b_create_user >=", value, "v7BCreateUser");
            return (Criteria) this;
        }

        public Criteria andV7BCreateUserLessThan(String value) {
            addCriterion("v7_b_create_user <", value, "v7BCreateUser");
            return (Criteria) this;
        }

        public Criteria andV7BCreateUserLessThanOrEqualTo(String value) {
            addCriterion("v7_b_create_user <=", value, "v7BCreateUser");
            return (Criteria) this;
        }

        public Criteria andV7BCreateUserLike(String value) {
            addCriterion("v7_b_create_user like", value, "v7BCreateUser");
            return (Criteria) this;
        }

        public Criteria andV7BCreateUserNotLike(String value) {
            addCriterion("v7_b_create_user not like", value, "v7BCreateUser");
            return (Criteria) this;
        }

        public Criteria andV7BCreateUserIn(List<String> values) {
            addCriterion("v7_b_create_user in", values, "v7BCreateUser");
            return (Criteria) this;
        }

        public Criteria andV7BCreateUserNotIn(List<String> values) {
            addCriterion("v7_b_create_user not in", values, "v7BCreateUser");
            return (Criteria) this;
        }

        public Criteria andV7BCreateUserBetween(String value1, String value2) {
            addCriterion("v7_b_create_user between", value1, value2, "v7BCreateUser");
            return (Criteria) this;
        }

        public Criteria andV7BCreateUserNotBetween(String value1, String value2) {
            addCriterion("v7_b_create_user not between", value1, value2, "v7BCreateUser");
            return (Criteria) this;
        }

        public Criteria andV7BCrateTimeIsNull() {
            addCriterion("v7_b_crate_time is null");
            return (Criteria) this;
        }

        public Criteria andV7BCrateTimeIsNotNull() {
            addCriterion("v7_b_crate_time is not null");
            return (Criteria) this;
        }

        public Criteria andV7BCrateTimeEqualTo(Date value) {
            addCriterion("v7_b_crate_time =", value, "v7BCrateTime");
            return (Criteria) this;
        }

        public Criteria andV7BCrateTimeNotEqualTo(Date value) {
            addCriterion("v7_b_crate_time <>", value, "v7BCrateTime");
            return (Criteria) this;
        }

        public Criteria andV7BCrateTimeGreaterThan(Date value) {
            addCriterion("v7_b_crate_time >", value, "v7BCrateTime");
            return (Criteria) this;
        }

        public Criteria andV7BCrateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("v7_b_crate_time >=", value, "v7BCrateTime");
            return (Criteria) this;
        }

        public Criteria andV7BCrateTimeLessThan(Date value) {
            addCriterion("v7_b_crate_time <", value, "v7BCrateTime");
            return (Criteria) this;
        }

        public Criteria andV7BCrateTimeLessThanOrEqualTo(Date value) {
            addCriterion("v7_b_crate_time <=", value, "v7BCrateTime");
            return (Criteria) this;
        }

        public Criteria andV7BCrateTimeIn(List<Date> values) {
            addCriterion("v7_b_crate_time in", values, "v7BCrateTime");
            return (Criteria) this;
        }

        public Criteria andV7BCrateTimeNotIn(List<Date> values) {
            addCriterion("v7_b_crate_time not in", values, "v7BCrateTime");
            return (Criteria) this;
        }

        public Criteria andV7BCrateTimeBetween(Date value1, Date value2) {
            addCriterion("v7_b_crate_time between", value1, value2, "v7BCrateTime");
            return (Criteria) this;
        }

        public Criteria andV7BCrateTimeNotBetween(Date value1, Date value2) {
            addCriterion("v7_b_crate_time not between", value1, value2, "v7BCrateTime");
            return (Criteria) this;
        }

        public Criteria andV7BUpdateUserIsNull() {
            addCriterion("v7_b_update_user is null");
            return (Criteria) this;
        }

        public Criteria andV7BUpdateUserIsNotNull() {
            addCriterion("v7_b_update_user is not null");
            return (Criteria) this;
        }

        public Criteria andV7BUpdateUserEqualTo(String value) {
            addCriterion("v7_b_update_user =", value, "v7BUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7BUpdateUserNotEqualTo(String value) {
            addCriterion("v7_b_update_user <>", value, "v7BUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7BUpdateUserGreaterThan(String value) {
            addCriterion("v7_b_update_user >", value, "v7BUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7BUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("v7_b_update_user >=", value, "v7BUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7BUpdateUserLessThan(String value) {
            addCriterion("v7_b_update_user <", value, "v7BUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7BUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("v7_b_update_user <=", value, "v7BUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7BUpdateUserLike(String value) {
            addCriterion("v7_b_update_user like", value, "v7BUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7BUpdateUserNotLike(String value) {
            addCriterion("v7_b_update_user not like", value, "v7BUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7BUpdateUserIn(List<String> values) {
            addCriterion("v7_b_update_user in", values, "v7BUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7BUpdateUserNotIn(List<String> values) {
            addCriterion("v7_b_update_user not in", values, "v7BUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7BUpdateUserBetween(String value1, String value2) {
            addCriterion("v7_b_update_user between", value1, value2, "v7BUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7BUpdateUserNotBetween(String value1, String value2) {
            addCriterion("v7_b_update_user not between", value1, value2, "v7BUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7BUpdateTimeIsNull() {
            addCriterion("V7_b_update_time is null");
            return (Criteria) this;
        }

        public Criteria andV7BUpdateTimeIsNotNull() {
            addCriterion("V7_b_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andV7BUpdateTimeEqualTo(Date value) {
            addCriterion("V7_b_update_time =", value, "v7BUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7BUpdateTimeNotEqualTo(Date value) {
            addCriterion("V7_b_update_time <>", value, "v7BUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7BUpdateTimeGreaterThan(Date value) {
            addCriterion("V7_b_update_time >", value, "v7BUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7BUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("V7_b_update_time >=", value, "v7BUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7BUpdateTimeLessThan(Date value) {
            addCriterion("V7_b_update_time <", value, "v7BUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7BUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("V7_b_update_time <=", value, "v7BUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7BUpdateTimeIn(List<Date> values) {
            addCriterion("V7_b_update_time in", values, "v7BUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7BUpdateTimeNotIn(List<Date> values) {
            addCriterion("V7_b_update_time not in", values, "v7BUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7BUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("V7_b_update_time between", value1, value2, "v7BUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7BUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("V7_b_update_time not between", value1, value2, "v7BUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7BRemarksIsNull() {
            addCriterion("v7_b_remarks is null");
            return (Criteria) this;
        }

        public Criteria andV7BRemarksIsNotNull() {
            addCriterion("v7_b_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andV7BRemarksEqualTo(String value) {
            addCriterion("v7_b_remarks =", value, "v7BRemarks");
            return (Criteria) this;
        }

        public Criteria andV7BRemarksNotEqualTo(String value) {
            addCriterion("v7_b_remarks <>", value, "v7BRemarks");
            return (Criteria) this;
        }

        public Criteria andV7BRemarksGreaterThan(String value) {
            addCriterion("v7_b_remarks >", value, "v7BRemarks");
            return (Criteria) this;
        }

        public Criteria andV7BRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("v7_b_remarks >=", value, "v7BRemarks");
            return (Criteria) this;
        }

        public Criteria andV7BRemarksLessThan(String value) {
            addCriterion("v7_b_remarks <", value, "v7BRemarks");
            return (Criteria) this;
        }

        public Criteria andV7BRemarksLessThanOrEqualTo(String value) {
            addCriterion("v7_b_remarks <=", value, "v7BRemarks");
            return (Criteria) this;
        }

        public Criteria andV7BRemarksLike(String value) {
            addCriterion("v7_b_remarks like", value, "v7BRemarks");
            return (Criteria) this;
        }

        public Criteria andV7BRemarksNotLike(String value) {
            addCriterion("v7_b_remarks not like", value, "v7BRemarks");
            return (Criteria) this;
        }

        public Criteria andV7BRemarksIn(List<String> values) {
            addCriterion("v7_b_remarks in", values, "v7BRemarks");
            return (Criteria) this;
        }

        public Criteria andV7BRemarksNotIn(List<String> values) {
            addCriterion("v7_b_remarks not in", values, "v7BRemarks");
            return (Criteria) this;
        }

        public Criteria andV7BRemarksBetween(String value1, String value2) {
            addCriterion("v7_b_remarks between", value1, value2, "v7BRemarks");
            return (Criteria) this;
        }

        public Criteria andV7BRemarksNotBetween(String value1, String value2) {
            addCriterion("v7_b_remarks not between", value1, value2, "v7BRemarks");
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