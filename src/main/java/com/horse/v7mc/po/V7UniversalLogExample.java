package com.horse.v7mc.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class V7UniversalLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public V7UniversalLogExample() {
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

        public Criteria andV7UModuleNameIsNull() {
            addCriterion("v7_u_module_name is null");
            return (Criteria) this;
        }

        public Criteria andV7UModuleNameIsNotNull() {
            addCriterion("v7_u_module_name is not null");
            return (Criteria) this;
        }

        public Criteria andV7UModuleNameEqualTo(String value) {
            addCriterion("v7_u_module_name =", value, "v7UModuleName");
            return (Criteria) this;
        }

        public Criteria andV7UModuleNameNotEqualTo(String value) {
            addCriterion("v7_u_module_name <>", value, "v7UModuleName");
            return (Criteria) this;
        }

        public Criteria andV7UModuleNameGreaterThan(String value) {
            addCriterion("v7_u_module_name >", value, "v7UModuleName");
            return (Criteria) this;
        }

        public Criteria andV7UModuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("v7_u_module_name >=", value, "v7UModuleName");
            return (Criteria) this;
        }

        public Criteria andV7UModuleNameLessThan(String value) {
            addCriterion("v7_u_module_name <", value, "v7UModuleName");
            return (Criteria) this;
        }

        public Criteria andV7UModuleNameLessThanOrEqualTo(String value) {
            addCriterion("v7_u_module_name <=", value, "v7UModuleName");
            return (Criteria) this;
        }

        public Criteria andV7UModuleNameLike(String value) {
            addCriterion("v7_u_module_name like", value, "v7UModuleName");
            return (Criteria) this;
        }

        public Criteria andV7UModuleNameNotLike(String value) {
            addCriterion("v7_u_module_name not like", value, "v7UModuleName");
            return (Criteria) this;
        }

        public Criteria andV7UModuleNameIn(List<String> values) {
            addCriterion("v7_u_module_name in", values, "v7UModuleName");
            return (Criteria) this;
        }

        public Criteria andV7UModuleNameNotIn(List<String> values) {
            addCriterion("v7_u_module_name not in", values, "v7UModuleName");
            return (Criteria) this;
        }

        public Criteria andV7UModuleNameBetween(String value1, String value2) {
            addCriterion("v7_u_module_name between", value1, value2, "v7UModuleName");
            return (Criteria) this;
        }

        public Criteria andV7UModuleNameNotBetween(String value1, String value2) {
            addCriterion("v7_u_module_name not between", value1, value2, "v7UModuleName");
            return (Criteria) this;
        }

        public Criteria andV7UFeatureNameIsNull() {
            addCriterion("v7_u_feature_name is null");
            return (Criteria) this;
        }

        public Criteria andV7UFeatureNameIsNotNull() {
            addCriterion("v7_u_feature_name is not null");
            return (Criteria) this;
        }

        public Criteria andV7UFeatureNameEqualTo(String value) {
            addCriterion("v7_u_feature_name =", value, "v7UFeatureName");
            return (Criteria) this;
        }

        public Criteria andV7UFeatureNameNotEqualTo(String value) {
            addCriterion("v7_u_feature_name <>", value, "v7UFeatureName");
            return (Criteria) this;
        }

        public Criteria andV7UFeatureNameGreaterThan(String value) {
            addCriterion("v7_u_feature_name >", value, "v7UFeatureName");
            return (Criteria) this;
        }

        public Criteria andV7UFeatureNameGreaterThanOrEqualTo(String value) {
            addCriterion("v7_u_feature_name >=", value, "v7UFeatureName");
            return (Criteria) this;
        }

        public Criteria andV7UFeatureNameLessThan(String value) {
            addCriterion("v7_u_feature_name <", value, "v7UFeatureName");
            return (Criteria) this;
        }

        public Criteria andV7UFeatureNameLessThanOrEqualTo(String value) {
            addCriterion("v7_u_feature_name <=", value, "v7UFeatureName");
            return (Criteria) this;
        }

        public Criteria andV7UFeatureNameLike(String value) {
            addCriterion("v7_u_feature_name like", value, "v7UFeatureName");
            return (Criteria) this;
        }

        public Criteria andV7UFeatureNameNotLike(String value) {
            addCriterion("v7_u_feature_name not like", value, "v7UFeatureName");
            return (Criteria) this;
        }

        public Criteria andV7UFeatureNameIn(List<String> values) {
            addCriterion("v7_u_feature_name in", values, "v7UFeatureName");
            return (Criteria) this;
        }

        public Criteria andV7UFeatureNameNotIn(List<String> values) {
            addCriterion("v7_u_feature_name not in", values, "v7UFeatureName");
            return (Criteria) this;
        }

        public Criteria andV7UFeatureNameBetween(String value1, String value2) {
            addCriterion("v7_u_feature_name between", value1, value2, "v7UFeatureName");
            return (Criteria) this;
        }

        public Criteria andV7UFeatureNameNotBetween(String value1, String value2) {
            addCriterion("v7_u_feature_name not between", value1, value2, "v7UFeatureName");
            return (Criteria) this;
        }

        public Criteria andV7UFeaturePathIsNull() {
            addCriterion("v7_u_feature_path is null");
            return (Criteria) this;
        }

        public Criteria andV7UFeaturePathIsNotNull() {
            addCriterion("v7_u_feature_path is not null");
            return (Criteria) this;
        }

        public Criteria andV7UFeaturePathEqualTo(String value) {
            addCriterion("v7_u_feature_path =", value, "v7UFeaturePath");
            return (Criteria) this;
        }

        public Criteria andV7UFeaturePathNotEqualTo(String value) {
            addCriterion("v7_u_feature_path <>", value, "v7UFeaturePath");
            return (Criteria) this;
        }

        public Criteria andV7UFeaturePathGreaterThan(String value) {
            addCriterion("v7_u_feature_path >", value, "v7UFeaturePath");
            return (Criteria) this;
        }

        public Criteria andV7UFeaturePathGreaterThanOrEqualTo(String value) {
            addCriterion("v7_u_feature_path >=", value, "v7UFeaturePath");
            return (Criteria) this;
        }

        public Criteria andV7UFeaturePathLessThan(String value) {
            addCriterion("v7_u_feature_path <", value, "v7UFeaturePath");
            return (Criteria) this;
        }

        public Criteria andV7UFeaturePathLessThanOrEqualTo(String value) {
            addCriterion("v7_u_feature_path <=", value, "v7UFeaturePath");
            return (Criteria) this;
        }

        public Criteria andV7UFeaturePathLike(String value) {
            addCriterion("v7_u_feature_path like", value, "v7UFeaturePath");
            return (Criteria) this;
        }

        public Criteria andV7UFeaturePathNotLike(String value) {
            addCriterion("v7_u_feature_path not like", value, "v7UFeaturePath");
            return (Criteria) this;
        }

        public Criteria andV7UFeaturePathIn(List<String> values) {
            addCriterion("v7_u_feature_path in", values, "v7UFeaturePath");
            return (Criteria) this;
        }

        public Criteria andV7UFeaturePathNotIn(List<String> values) {
            addCriterion("v7_u_feature_path not in", values, "v7UFeaturePath");
            return (Criteria) this;
        }

        public Criteria andV7UFeaturePathBetween(String value1, String value2) {
            addCriterion("v7_u_feature_path between", value1, value2, "v7UFeaturePath");
            return (Criteria) this;
        }

        public Criteria andV7UFeaturePathNotBetween(String value1, String value2) {
            addCriterion("v7_u_feature_path not between", value1, value2, "v7UFeaturePath");
            return (Criteria) this;
        }

        public Criteria andV7URequestResultIsNull() {
            addCriterion("v7_u_request_result is null");
            return (Criteria) this;
        }

        public Criteria andV7URequestResultIsNotNull() {
            addCriterion("v7_u_request_result is not null");
            return (Criteria) this;
        }

        public Criteria andV7URequestResultEqualTo(String value) {
            addCriterion("v7_u_request_result =", value, "v7URequestResult");
            return (Criteria) this;
        }

        public Criteria andV7URequestResultNotEqualTo(String value) {
            addCriterion("v7_u_request_result <>", value, "v7URequestResult");
            return (Criteria) this;
        }

        public Criteria andV7URequestResultGreaterThan(String value) {
            addCriterion("v7_u_request_result >", value, "v7URequestResult");
            return (Criteria) this;
        }

        public Criteria andV7URequestResultGreaterThanOrEqualTo(String value) {
            addCriterion("v7_u_request_result >=", value, "v7URequestResult");
            return (Criteria) this;
        }

        public Criteria andV7URequestResultLessThan(String value) {
            addCriterion("v7_u_request_result <", value, "v7URequestResult");
            return (Criteria) this;
        }

        public Criteria andV7URequestResultLessThanOrEqualTo(String value) {
            addCriterion("v7_u_request_result <=", value, "v7URequestResult");
            return (Criteria) this;
        }

        public Criteria andV7URequestResultLike(String value) {
            addCriterion("v7_u_request_result like", value, "v7URequestResult");
            return (Criteria) this;
        }

        public Criteria andV7URequestResultNotLike(String value) {
            addCriterion("v7_u_request_result not like", value, "v7URequestResult");
            return (Criteria) this;
        }

        public Criteria andV7URequestResultIn(List<String> values) {
            addCriterion("v7_u_request_result in", values, "v7URequestResult");
            return (Criteria) this;
        }

        public Criteria andV7URequestResultNotIn(List<String> values) {
            addCriterion("v7_u_request_result not in", values, "v7URequestResult");
            return (Criteria) this;
        }

        public Criteria andV7URequestResultBetween(String value1, String value2) {
            addCriterion("v7_u_request_result between", value1, value2, "v7URequestResult");
            return (Criteria) this;
        }

        public Criteria andV7URequestResultNotBetween(String value1, String value2) {
            addCriterion("v7_u_request_result not between", value1, value2, "v7URequestResult");
            return (Criteria) this;
        }

        public Criteria andV7URequestUserIsNull() {
            addCriterion("v7_u_request_user is null");
            return (Criteria) this;
        }

        public Criteria andV7URequestUserIsNotNull() {
            addCriterion("v7_u_request_user is not null");
            return (Criteria) this;
        }

        public Criteria andV7URequestUserEqualTo(String value) {
            addCriterion("v7_u_request_user =", value, "v7URequestUser");
            return (Criteria) this;
        }

        public Criteria andV7URequestUserNotEqualTo(String value) {
            addCriterion("v7_u_request_user <>", value, "v7URequestUser");
            return (Criteria) this;
        }

        public Criteria andV7URequestUserGreaterThan(String value) {
            addCriterion("v7_u_request_user >", value, "v7URequestUser");
            return (Criteria) this;
        }

        public Criteria andV7URequestUserGreaterThanOrEqualTo(String value) {
            addCriterion("v7_u_request_user >=", value, "v7URequestUser");
            return (Criteria) this;
        }

        public Criteria andV7URequestUserLessThan(String value) {
            addCriterion("v7_u_request_user <", value, "v7URequestUser");
            return (Criteria) this;
        }

        public Criteria andV7URequestUserLessThanOrEqualTo(String value) {
            addCriterion("v7_u_request_user <=", value, "v7URequestUser");
            return (Criteria) this;
        }

        public Criteria andV7URequestUserLike(String value) {
            addCriterion("v7_u_request_user like", value, "v7URequestUser");
            return (Criteria) this;
        }

        public Criteria andV7URequestUserNotLike(String value) {
            addCriterion("v7_u_request_user not like", value, "v7URequestUser");
            return (Criteria) this;
        }

        public Criteria andV7URequestUserIn(List<String> values) {
            addCriterion("v7_u_request_user in", values, "v7URequestUser");
            return (Criteria) this;
        }

        public Criteria andV7URequestUserNotIn(List<String> values) {
            addCriterion("v7_u_request_user not in", values, "v7URequestUser");
            return (Criteria) this;
        }

        public Criteria andV7URequestUserBetween(String value1, String value2) {
            addCriterion("v7_u_request_user between", value1, value2, "v7URequestUser");
            return (Criteria) this;
        }

        public Criteria andV7URequestUserNotBetween(String value1, String value2) {
            addCriterion("v7_u_request_user not between", value1, value2, "v7URequestUser");
            return (Criteria) this;
        }

        public Criteria andV7URequestTimeIsNull() {
            addCriterion("v7_u_request_time is null");
            return (Criteria) this;
        }

        public Criteria andV7URequestTimeIsNotNull() {
            addCriterion("v7_u_request_time is not null");
            return (Criteria) this;
        }

        public Criteria andV7URequestTimeEqualTo(Date value) {
            addCriterion("v7_u_request_time =", value, "v7URequestTime");
            return (Criteria) this;
        }

        public Criteria andV7URequestTimeNotEqualTo(Date value) {
            addCriterion("v7_u_request_time <>", value, "v7URequestTime");
            return (Criteria) this;
        }

        public Criteria andV7URequestTimeGreaterThan(Date value) {
            addCriterion("v7_u_request_time >", value, "v7URequestTime");
            return (Criteria) this;
        }

        public Criteria andV7URequestTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("v7_u_request_time >=", value, "v7URequestTime");
            return (Criteria) this;
        }

        public Criteria andV7URequestTimeLessThan(Date value) {
            addCriterion("v7_u_request_time <", value, "v7URequestTime");
            return (Criteria) this;
        }

        public Criteria andV7URequestTimeLessThanOrEqualTo(Date value) {
            addCriterion("v7_u_request_time <=", value, "v7URequestTime");
            return (Criteria) this;
        }

        public Criteria andV7URequestTimeIn(List<Date> values) {
            addCriterion("v7_u_request_time in", values, "v7URequestTime");
            return (Criteria) this;
        }

        public Criteria andV7URequestTimeNotIn(List<Date> values) {
            addCriterion("v7_u_request_time not in", values, "v7URequestTime");
            return (Criteria) this;
        }

        public Criteria andV7URequestTimeBetween(Date value1, Date value2) {
            addCriterion("v7_u_request_time between", value1, value2, "v7URequestTime");
            return (Criteria) this;
        }

        public Criteria andV7URequestTimeNotBetween(Date value1, Date value2) {
            addCriterion("v7_u_request_time not between", value1, value2, "v7URequestTime");
            return (Criteria) this;
        }

        public Criteria andV7URequestPcnameIsNull() {
            addCriterion("v7_u_request_pcname is null");
            return (Criteria) this;
        }

        public Criteria andV7URequestPcnameIsNotNull() {
            addCriterion("v7_u_request_pcname is not null");
            return (Criteria) this;
        }

        public Criteria andV7URequestPcnameEqualTo(String value) {
            addCriterion("v7_u_request_pcname =", value, "v7URequestPcname");
            return (Criteria) this;
        }

        public Criteria andV7URequestPcnameNotEqualTo(String value) {
            addCriterion("v7_u_request_pcname <>", value, "v7URequestPcname");
            return (Criteria) this;
        }

        public Criteria andV7URequestPcnameGreaterThan(String value) {
            addCriterion("v7_u_request_pcname >", value, "v7URequestPcname");
            return (Criteria) this;
        }

        public Criteria andV7URequestPcnameGreaterThanOrEqualTo(String value) {
            addCriterion("v7_u_request_pcname >=", value, "v7URequestPcname");
            return (Criteria) this;
        }

        public Criteria andV7URequestPcnameLessThan(String value) {
            addCriterion("v7_u_request_pcname <", value, "v7URequestPcname");
            return (Criteria) this;
        }

        public Criteria andV7URequestPcnameLessThanOrEqualTo(String value) {
            addCriterion("v7_u_request_pcname <=", value, "v7URequestPcname");
            return (Criteria) this;
        }

        public Criteria andV7URequestPcnameLike(String value) {
            addCriterion("v7_u_request_pcname like", value, "v7URequestPcname");
            return (Criteria) this;
        }

        public Criteria andV7URequestPcnameNotLike(String value) {
            addCriterion("v7_u_request_pcname not like", value, "v7URequestPcname");
            return (Criteria) this;
        }

        public Criteria andV7URequestPcnameIn(List<String> values) {
            addCriterion("v7_u_request_pcname in", values, "v7URequestPcname");
            return (Criteria) this;
        }

        public Criteria andV7URequestPcnameNotIn(List<String> values) {
            addCriterion("v7_u_request_pcname not in", values, "v7URequestPcname");
            return (Criteria) this;
        }

        public Criteria andV7URequestPcnameBetween(String value1, String value2) {
            addCriterion("v7_u_request_pcname between", value1, value2, "v7URequestPcname");
            return (Criteria) this;
        }

        public Criteria andV7URequestPcnameNotBetween(String value1, String value2) {
            addCriterion("v7_u_request_pcname not between", value1, value2, "v7URequestPcname");
            return (Criteria) this;
        }

        public Criteria andV7URequestIpIsNull() {
            addCriterion("v7_u_request_ip is null");
            return (Criteria) this;
        }

        public Criteria andV7URequestIpIsNotNull() {
            addCriterion("v7_u_request_ip is not null");
            return (Criteria) this;
        }

        public Criteria andV7URequestIpEqualTo(String value) {
            addCriterion("v7_u_request_ip =", value, "v7URequestIp");
            return (Criteria) this;
        }

        public Criteria andV7URequestIpNotEqualTo(String value) {
            addCriterion("v7_u_request_ip <>", value, "v7URequestIp");
            return (Criteria) this;
        }

        public Criteria andV7URequestIpGreaterThan(String value) {
            addCriterion("v7_u_request_ip >", value, "v7URequestIp");
            return (Criteria) this;
        }

        public Criteria andV7URequestIpGreaterThanOrEqualTo(String value) {
            addCriterion("v7_u_request_ip >=", value, "v7URequestIp");
            return (Criteria) this;
        }

        public Criteria andV7URequestIpLessThan(String value) {
            addCriterion("v7_u_request_ip <", value, "v7URequestIp");
            return (Criteria) this;
        }

        public Criteria andV7URequestIpLessThanOrEqualTo(String value) {
            addCriterion("v7_u_request_ip <=", value, "v7URequestIp");
            return (Criteria) this;
        }

        public Criteria andV7URequestIpLike(String value) {
            addCriterion("v7_u_request_ip like", value, "v7URequestIp");
            return (Criteria) this;
        }

        public Criteria andV7URequestIpNotLike(String value) {
            addCriterion("v7_u_request_ip not like", value, "v7URequestIp");
            return (Criteria) this;
        }

        public Criteria andV7URequestIpIn(List<String> values) {
            addCriterion("v7_u_request_ip in", values, "v7URequestIp");
            return (Criteria) this;
        }

        public Criteria andV7URequestIpNotIn(List<String> values) {
            addCriterion("v7_u_request_ip not in", values, "v7URequestIp");
            return (Criteria) this;
        }

        public Criteria andV7URequestIpBetween(String value1, String value2) {
            addCriterion("v7_u_request_ip between", value1, value2, "v7URequestIp");
            return (Criteria) this;
        }

        public Criteria andV7URequestIpNotBetween(String value1, String value2) {
            addCriterion("v7_u_request_ip not between", value1, value2, "v7URequestIp");
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