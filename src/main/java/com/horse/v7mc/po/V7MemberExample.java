package com.horse.v7mc.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class V7MemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public V7MemberExample() {
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

        public Criteria andV7MNumIsNull() {
            addCriterion("v7_m_num is null");
            return (Criteria) this;
        }

        public Criteria andV7MNumIsNotNull() {
            addCriterion("v7_m_num is not null");
            return (Criteria) this;
        }

        public Criteria andV7MNumEqualTo(Integer value) {
            addCriterion("v7_m_num =", value, "v7MNum");
            return (Criteria) this;
        }

        public Criteria andV7MNumNotEqualTo(Integer value) {
            addCriterion("v7_m_num <>", value, "v7MNum");
            return (Criteria) this;
        }

        public Criteria andV7MNumGreaterThan(Integer value) {
            addCriterion("v7_m_num >", value, "v7MNum");
            return (Criteria) this;
        }

        public Criteria andV7MNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("v7_m_num >=", value, "v7MNum");
            return (Criteria) this;
        }

        public Criteria andV7MNumLessThan(Integer value) {
            addCriterion("v7_m_num <", value, "v7MNum");
            return (Criteria) this;
        }

        public Criteria andV7MNumLessThanOrEqualTo(Integer value) {
            addCriterion("v7_m_num <=", value, "v7MNum");
            return (Criteria) this;
        }

        public Criteria andV7MNumIn(List<Integer> values) {
            addCriterion("v7_m_num in", values, "v7MNum");
            return (Criteria) this;
        }

        public Criteria andV7MNumNotIn(List<Integer> values) {
            addCriterion("v7_m_num not in", values, "v7MNum");
            return (Criteria) this;
        }

        public Criteria andV7MNumBetween(Integer value1, Integer value2) {
            addCriterion("v7_m_num between", value1, value2, "v7MNum");
            return (Criteria) this;
        }

        public Criteria andV7MNumNotBetween(Integer value1, Integer value2) {
            addCriterion("v7_m_num not between", value1, value2, "v7MNum");
            return (Criteria) this;
        }

        public Criteria andV7MNameIsNull() {
            addCriterion("v7_m_name is null");
            return (Criteria) this;
        }

        public Criteria andV7MNameIsNotNull() {
            addCriterion("v7_m_name is not null");
            return (Criteria) this;
        }

        public Criteria andV7MNameEqualTo(String value) {
            addCriterion("v7_m_name =", value, "v7MName");
            return (Criteria) this;
        }

        public Criteria andV7MNameNotEqualTo(String value) {
            addCriterion("v7_m_name <>", value, "v7MName");
            return (Criteria) this;
        }

        public Criteria andV7MNameGreaterThan(String value) {
            addCriterion("v7_m_name >", value, "v7MName");
            return (Criteria) this;
        }

        public Criteria andV7MNameGreaterThanOrEqualTo(String value) {
            addCriterion("v7_m_name >=", value, "v7MName");
            return (Criteria) this;
        }

        public Criteria andV7MNameLessThan(String value) {
            addCriterion("v7_m_name <", value, "v7MName");
            return (Criteria) this;
        }

        public Criteria andV7MNameLessThanOrEqualTo(String value) {
            addCriterion("v7_m_name <=", value, "v7MName");
            return (Criteria) this;
        }

        public Criteria andV7MNameLike(String value) {
            addCriterion("v7_m_name like", value, "v7MName");
            return (Criteria) this;
        }

        public Criteria andV7MNameNotLike(String value) {
            addCriterion("v7_m_name not like", value, "v7MName");
            return (Criteria) this;
        }

        public Criteria andV7MNameIn(List<String> values) {
            addCriterion("v7_m_name in", values, "v7MName");
            return (Criteria) this;
        }

        public Criteria andV7MNameNotIn(List<String> values) {
            addCriterion("v7_m_name not in", values, "v7MName");
            return (Criteria) this;
        }

        public Criteria andV7MNameBetween(String value1, String value2) {
            addCriterion("v7_m_name between", value1, value2, "v7MName");
            return (Criteria) this;
        }

        public Criteria andV7MNameNotBetween(String value1, String value2) {
            addCriterion("v7_m_name not between", value1, value2, "v7MName");
            return (Criteria) this;
        }

        public Criteria andV7MRealNameIsNull() {
            addCriterion("v7_m_real_name is null");
            return (Criteria) this;
        }

        public Criteria andV7MRealNameIsNotNull() {
            addCriterion("v7_m_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andV7MRealNameEqualTo(String value) {
            addCriterion("v7_m_real_name =", value, "v7MRealName");
            return (Criteria) this;
        }

        public Criteria andV7MRealNameNotEqualTo(String value) {
            addCriterion("v7_m_real_name <>", value, "v7MRealName");
            return (Criteria) this;
        }

        public Criteria andV7MRealNameGreaterThan(String value) {
            addCriterion("v7_m_real_name >", value, "v7MRealName");
            return (Criteria) this;
        }

        public Criteria andV7MRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("v7_m_real_name >=", value, "v7MRealName");
            return (Criteria) this;
        }

        public Criteria andV7MRealNameLessThan(String value) {
            addCriterion("v7_m_real_name <", value, "v7MRealName");
            return (Criteria) this;
        }

        public Criteria andV7MRealNameLessThanOrEqualTo(String value) {
            addCriterion("v7_m_real_name <=", value, "v7MRealName");
            return (Criteria) this;
        }

        public Criteria andV7MRealNameLike(String value) {
            addCriterion("v7_m_real_name like", value, "v7MRealName");
            return (Criteria) this;
        }

        public Criteria andV7MRealNameNotLike(String value) {
            addCriterion("v7_m_real_name not like", value, "v7MRealName");
            return (Criteria) this;
        }

        public Criteria andV7MRealNameIn(List<String> values) {
            addCriterion("v7_m_real_name in", values, "v7MRealName");
            return (Criteria) this;
        }

        public Criteria andV7MRealNameNotIn(List<String> values) {
            addCriterion("v7_m_real_name not in", values, "v7MRealName");
            return (Criteria) this;
        }

        public Criteria andV7MRealNameBetween(String value1, String value2) {
            addCriterion("v7_m_real_name between", value1, value2, "v7MRealName");
            return (Criteria) this;
        }

        public Criteria andV7MRealNameNotBetween(String value1, String value2) {
            addCriterion("v7_m_real_name not between", value1, value2, "v7MRealName");
            return (Criteria) this;
        }

        public Criteria andV7MSexIsNull() {
            addCriterion("v7_m_sex is null");
            return (Criteria) this;
        }

        public Criteria andV7MSexIsNotNull() {
            addCriterion("v7_m_sex is not null");
            return (Criteria) this;
        }

        public Criteria andV7MSexEqualTo(Integer value) {
            addCriterion("v7_m_sex =", value, "v7MSex");
            return (Criteria) this;
        }

        public Criteria andV7MSexNotEqualTo(Integer value) {
            addCriterion("v7_m_sex <>", value, "v7MSex");
            return (Criteria) this;
        }

        public Criteria andV7MSexGreaterThan(Integer value) {
            addCriterion("v7_m_sex >", value, "v7MSex");
            return (Criteria) this;
        }

        public Criteria andV7MSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("v7_m_sex >=", value, "v7MSex");
            return (Criteria) this;
        }

        public Criteria andV7MSexLessThan(Integer value) {
            addCriterion("v7_m_sex <", value, "v7MSex");
            return (Criteria) this;
        }

        public Criteria andV7MSexLessThanOrEqualTo(Integer value) {
            addCriterion("v7_m_sex <=", value, "v7MSex");
            return (Criteria) this;
        }

        public Criteria andV7MSexIn(List<Integer> values) {
            addCriterion("v7_m_sex in", values, "v7MSex");
            return (Criteria) this;
        }

        public Criteria andV7MSexNotIn(List<Integer> values) {
            addCriterion("v7_m_sex not in", values, "v7MSex");
            return (Criteria) this;
        }

        public Criteria andV7MSexBetween(Integer value1, Integer value2) {
            addCriterion("v7_m_sex between", value1, value2, "v7MSex");
            return (Criteria) this;
        }

        public Criteria andV7MSexNotBetween(Integer value1, Integer value2) {
            addCriterion("v7_m_sex not between", value1, value2, "v7MSex");
            return (Criteria) this;
        }

        public Criteria andV7MBirthdayIsNull() {
            addCriterion("v7_m_birthday is null");
            return (Criteria) this;
        }

        public Criteria andV7MBirthdayIsNotNull() {
            addCriterion("v7_m_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andV7MBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("v7_m_birthday =", value, "v7MBirthday");
            return (Criteria) this;
        }

        public Criteria andV7MBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("v7_m_birthday <>", value, "v7MBirthday");
            return (Criteria) this;
        }

        public Criteria andV7MBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("v7_m_birthday >", value, "v7MBirthday");
            return (Criteria) this;
        }

        public Criteria andV7MBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("v7_m_birthday >=", value, "v7MBirthday");
            return (Criteria) this;
        }

        public Criteria andV7MBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("v7_m_birthday <", value, "v7MBirthday");
            return (Criteria) this;
        }

        public Criteria andV7MBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("v7_m_birthday <=", value, "v7MBirthday");
            return (Criteria) this;
        }

        public Criteria andV7MBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("v7_m_birthday in", values, "v7MBirthday");
            return (Criteria) this;
        }

        public Criteria andV7MBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("v7_m_birthday not in", values, "v7MBirthday");
            return (Criteria) this;
        }

        public Criteria andV7MBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("v7_m_birthday between", value1, value2, "v7MBirthday");
            return (Criteria) this;
        }

        public Criteria andV7MBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("v7_m_birthday not between", value1, value2, "v7MBirthday");
            return (Criteria) this;
        }

        public Criteria andV7MPassowrdIsNull() {
            addCriterion("v7_m_passowrd is null");
            return (Criteria) this;
        }

        public Criteria andV7MPassowrdIsNotNull() {
            addCriterion("v7_m_passowrd is not null");
            return (Criteria) this;
        }

        public Criteria andV7MPassowrdEqualTo(String value) {
            addCriterion("v7_m_passowrd =", value, "v7MPassowrd");
            return (Criteria) this;
        }

        public Criteria andV7MPassowrdNotEqualTo(String value) {
            addCriterion("v7_m_passowrd <>", value, "v7MPassowrd");
            return (Criteria) this;
        }

        public Criteria andV7MPassowrdGreaterThan(String value) {
            addCriterion("v7_m_passowrd >", value, "v7MPassowrd");
            return (Criteria) this;
        }

        public Criteria andV7MPassowrdGreaterThanOrEqualTo(String value) {
            addCriterion("v7_m_passowrd >=", value, "v7MPassowrd");
            return (Criteria) this;
        }

        public Criteria andV7MPassowrdLessThan(String value) {
            addCriterion("v7_m_passowrd <", value, "v7MPassowrd");
            return (Criteria) this;
        }

        public Criteria andV7MPassowrdLessThanOrEqualTo(String value) {
            addCriterion("v7_m_passowrd <=", value, "v7MPassowrd");
            return (Criteria) this;
        }

        public Criteria andV7MPassowrdLike(String value) {
            addCriterion("v7_m_passowrd like", value, "v7MPassowrd");
            return (Criteria) this;
        }

        public Criteria andV7MPassowrdNotLike(String value) {
            addCriterion("v7_m_passowrd not like", value, "v7MPassowrd");
            return (Criteria) this;
        }

        public Criteria andV7MPassowrdIn(List<String> values) {
            addCriterion("v7_m_passowrd in", values, "v7MPassowrd");
            return (Criteria) this;
        }

        public Criteria andV7MPassowrdNotIn(List<String> values) {
            addCriterion("v7_m_passowrd not in", values, "v7MPassowrd");
            return (Criteria) this;
        }

        public Criteria andV7MPassowrdBetween(String value1, String value2) {
            addCriterion("v7_m_passowrd between", value1, value2, "v7MPassowrd");
            return (Criteria) this;
        }

        public Criteria andV7MPassowrdNotBetween(String value1, String value2) {
            addCriterion("v7_m_passowrd not between", value1, value2, "v7MPassowrd");
            return (Criteria) this;
        }

        public Criteria andV7MStatusIsNull() {
            addCriterion("v7_m_status is null");
            return (Criteria) this;
        }

        public Criteria andV7MStatusIsNotNull() {
            addCriterion("v7_m_status is not null");
            return (Criteria) this;
        }

        public Criteria andV7MStatusEqualTo(Integer value) {
            addCriterion("v7_m_status =", value, "v7MStatus");
            return (Criteria) this;
        }

        public Criteria andV7MStatusNotEqualTo(Integer value) {
            addCriterion("v7_m_status <>", value, "v7MStatus");
            return (Criteria) this;
        }

        public Criteria andV7MStatusGreaterThan(Integer value) {
            addCriterion("v7_m_status >", value, "v7MStatus");
            return (Criteria) this;
        }

        public Criteria andV7MStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("v7_m_status >=", value, "v7MStatus");
            return (Criteria) this;
        }

        public Criteria andV7MStatusLessThan(Integer value) {
            addCriterion("v7_m_status <", value, "v7MStatus");
            return (Criteria) this;
        }

        public Criteria andV7MStatusLessThanOrEqualTo(Integer value) {
            addCriterion("v7_m_status <=", value, "v7MStatus");
            return (Criteria) this;
        }

        public Criteria andV7MStatusIn(List<Integer> values) {
            addCriterion("v7_m_status in", values, "v7MStatus");
            return (Criteria) this;
        }

        public Criteria andV7MStatusNotIn(List<Integer> values) {
            addCriterion("v7_m_status not in", values, "v7MStatus");
            return (Criteria) this;
        }

        public Criteria andV7MStatusBetween(Integer value1, Integer value2) {
            addCriterion("v7_m_status between", value1, value2, "v7MStatus");
            return (Criteria) this;
        }

        public Criteria andV7MStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("v7_m_status not between", value1, value2, "v7MStatus");
            return (Criteria) this;
        }

        public Criteria andV7MPhoneIsNull() {
            addCriterion("v7_m_phone is null");
            return (Criteria) this;
        }

        public Criteria andV7MPhoneIsNotNull() {
            addCriterion("v7_m_phone is not null");
            return (Criteria) this;
        }

        public Criteria andV7MPhoneEqualTo(String value) {
            addCriterion("v7_m_phone =", value, "v7MPhone");
            return (Criteria) this;
        }

        public Criteria andV7MPhoneNotEqualTo(String value) {
            addCriterion("v7_m_phone <>", value, "v7MPhone");
            return (Criteria) this;
        }

        public Criteria andV7MPhoneGreaterThan(String value) {
            addCriterion("v7_m_phone >", value, "v7MPhone");
            return (Criteria) this;
        }

        public Criteria andV7MPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("v7_m_phone >=", value, "v7MPhone");
            return (Criteria) this;
        }

        public Criteria andV7MPhoneLessThan(String value) {
            addCriterion("v7_m_phone <", value, "v7MPhone");
            return (Criteria) this;
        }

        public Criteria andV7MPhoneLessThanOrEqualTo(String value) {
            addCriterion("v7_m_phone <=", value, "v7MPhone");
            return (Criteria) this;
        }

        public Criteria andV7MPhoneLike(String value) {
            addCriterion("v7_m_phone like", value, "v7MPhone");
            return (Criteria) this;
        }

        public Criteria andV7MPhoneNotLike(String value) {
            addCriterion("v7_m_phone not like", value, "v7MPhone");
            return (Criteria) this;
        }

        public Criteria andV7MPhoneIn(List<String> values) {
            addCriterion("v7_m_phone in", values, "v7MPhone");
            return (Criteria) this;
        }

        public Criteria andV7MPhoneNotIn(List<String> values) {
            addCriterion("v7_m_phone not in", values, "v7MPhone");
            return (Criteria) this;
        }

        public Criteria andV7MPhoneBetween(String value1, String value2) {
            addCriterion("v7_m_phone between", value1, value2, "v7MPhone");
            return (Criteria) this;
        }

        public Criteria andV7MPhoneNotBetween(String value1, String value2) {
            addCriterion("v7_m_phone not between", value1, value2, "v7MPhone");
            return (Criteria) this;
        }

        public Criteria andV7ReCTypeIsNull() {
            addCriterion("v7_re_c_type is null");
            return (Criteria) this;
        }

        public Criteria andV7ReCTypeIsNotNull() {
            addCriterion("v7_re_c_type is not null");
            return (Criteria) this;
        }

        public Criteria andV7ReCTypeEqualTo(String value) {
            addCriterion("v7_re_c_type =", value, "v7ReCType");
            return (Criteria) this;
        }

        public Criteria andV7ReCTypeNotEqualTo(String value) {
            addCriterion("v7_re_c_type <>", value, "v7ReCType");
            return (Criteria) this;
        }

        public Criteria andV7ReCTypeGreaterThan(String value) {
            addCriterion("v7_re_c_type >", value, "v7ReCType");
            return (Criteria) this;
        }

        public Criteria andV7ReCTypeGreaterThanOrEqualTo(String value) {
            addCriterion("v7_re_c_type >=", value, "v7ReCType");
            return (Criteria) this;
        }

        public Criteria andV7ReCTypeLessThan(String value) {
            addCriterion("v7_re_c_type <", value, "v7ReCType");
            return (Criteria) this;
        }

        public Criteria andV7ReCTypeLessThanOrEqualTo(String value) {
            addCriterion("v7_re_c_type <=", value, "v7ReCType");
            return (Criteria) this;
        }

        public Criteria andV7ReCTypeLike(String value) {
            addCriterion("v7_re_c_type like", value, "v7ReCType");
            return (Criteria) this;
        }

        public Criteria andV7ReCTypeNotLike(String value) {
            addCriterion("v7_re_c_type not like", value, "v7ReCType");
            return (Criteria) this;
        }

        public Criteria andV7ReCTypeIn(List<String> values) {
            addCriterion("v7_re_c_type in", values, "v7ReCType");
            return (Criteria) this;
        }

        public Criteria andV7ReCTypeNotIn(List<String> values) {
            addCriterion("v7_re_c_type not in", values, "v7ReCType");
            return (Criteria) this;
        }

        public Criteria andV7ReCTypeBetween(String value1, String value2) {
            addCriterion("v7_re_c_type between", value1, value2, "v7ReCType");
            return (Criteria) this;
        }

        public Criteria andV7ReCTypeNotBetween(String value1, String value2) {
            addCriterion("v7_re_c_type not between", value1, value2, "v7ReCType");
            return (Criteria) this;
        }

        public Criteria andV7MCreateUserIsNull() {
            addCriterion("v7_m_create_user is null");
            return (Criteria) this;
        }

        public Criteria andV7MCreateUserIsNotNull() {
            addCriterion("v7_m_create_user is not null");
            return (Criteria) this;
        }

        public Criteria andV7MCreateUserEqualTo(String value) {
            addCriterion("v7_m_create_user =", value, "v7MCreateUser");
            return (Criteria) this;
        }

        public Criteria andV7MCreateUserNotEqualTo(String value) {
            addCriterion("v7_m_create_user <>", value, "v7MCreateUser");
            return (Criteria) this;
        }

        public Criteria andV7MCreateUserGreaterThan(String value) {
            addCriterion("v7_m_create_user >", value, "v7MCreateUser");
            return (Criteria) this;
        }

        public Criteria andV7MCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("v7_m_create_user >=", value, "v7MCreateUser");
            return (Criteria) this;
        }

        public Criteria andV7MCreateUserLessThan(String value) {
            addCriterion("v7_m_create_user <", value, "v7MCreateUser");
            return (Criteria) this;
        }

        public Criteria andV7MCreateUserLessThanOrEqualTo(String value) {
            addCriterion("v7_m_create_user <=", value, "v7MCreateUser");
            return (Criteria) this;
        }

        public Criteria andV7MCreateUserLike(String value) {
            addCriterion("v7_m_create_user like", value, "v7MCreateUser");
            return (Criteria) this;
        }

        public Criteria andV7MCreateUserNotLike(String value) {
            addCriterion("v7_m_create_user not like", value, "v7MCreateUser");
            return (Criteria) this;
        }

        public Criteria andV7MCreateUserIn(List<String> values) {
            addCriterion("v7_m_create_user in", values, "v7MCreateUser");
            return (Criteria) this;
        }

        public Criteria andV7MCreateUserNotIn(List<String> values) {
            addCriterion("v7_m_create_user not in", values, "v7MCreateUser");
            return (Criteria) this;
        }

        public Criteria andV7MCreateUserBetween(String value1, String value2) {
            addCriterion("v7_m_create_user between", value1, value2, "v7MCreateUser");
            return (Criteria) this;
        }

        public Criteria andV7MCreateUserNotBetween(String value1, String value2) {
            addCriterion("v7_m_create_user not between", value1, value2, "v7MCreateUser");
            return (Criteria) this;
        }

        public Criteria andV7MCrateTimeIsNull() {
            addCriterion("v7_m_crate_time is null");
            return (Criteria) this;
        }

        public Criteria andV7MCrateTimeIsNotNull() {
            addCriterion("v7_m_crate_time is not null");
            return (Criteria) this;
        }

        public Criteria andV7MCrateTimeEqualTo(Date value) {
            addCriterion("v7_m_crate_time =", value, "v7MCrateTime");
            return (Criteria) this;
        }

        public Criteria andV7MCrateTimeNotEqualTo(Date value) {
            addCriterion("v7_m_crate_time <>", value, "v7MCrateTime");
            return (Criteria) this;
        }

        public Criteria andV7MCrateTimeGreaterThan(Date value) {
            addCriterion("v7_m_crate_time >", value, "v7MCrateTime");
            return (Criteria) this;
        }

        public Criteria andV7MCrateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("v7_m_crate_time >=", value, "v7MCrateTime");
            return (Criteria) this;
        }

        public Criteria andV7MCrateTimeLessThan(Date value) {
            addCriterion("v7_m_crate_time <", value, "v7MCrateTime");
            return (Criteria) this;
        }

        public Criteria andV7MCrateTimeLessThanOrEqualTo(Date value) {
            addCriterion("v7_m_crate_time <=", value, "v7MCrateTime");
            return (Criteria) this;
        }

        public Criteria andV7MCrateTimeIn(List<Date> values) {
            addCriterion("v7_m_crate_time in", values, "v7MCrateTime");
            return (Criteria) this;
        }

        public Criteria andV7MCrateTimeNotIn(List<Date> values) {
            addCriterion("v7_m_crate_time not in", values, "v7MCrateTime");
            return (Criteria) this;
        }

        public Criteria andV7MCrateTimeBetween(Date value1, Date value2) {
            addCriterion("v7_m_crate_time between", value1, value2, "v7MCrateTime");
            return (Criteria) this;
        }

        public Criteria andV7MCrateTimeNotBetween(Date value1, Date value2) {
            addCriterion("v7_m_crate_time not between", value1, value2, "v7MCrateTime");
            return (Criteria) this;
        }

        public Criteria andV7MUpdateUserIsNull() {
            addCriterion("v7_m_update_user is null");
            return (Criteria) this;
        }

        public Criteria andV7MUpdateUserIsNotNull() {
            addCriterion("v7_m_update_user is not null");
            return (Criteria) this;
        }

        public Criteria andV7MUpdateUserEqualTo(String value) {
            addCriterion("v7_m_update_user =", value, "v7MUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7MUpdateUserNotEqualTo(String value) {
            addCriterion("v7_m_update_user <>", value, "v7MUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7MUpdateUserGreaterThan(String value) {
            addCriterion("v7_m_update_user >", value, "v7MUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7MUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("v7_m_update_user >=", value, "v7MUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7MUpdateUserLessThan(String value) {
            addCriterion("v7_m_update_user <", value, "v7MUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7MUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("v7_m_update_user <=", value, "v7MUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7MUpdateUserLike(String value) {
            addCriterion("v7_m_update_user like", value, "v7MUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7MUpdateUserNotLike(String value) {
            addCriterion("v7_m_update_user not like", value, "v7MUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7MUpdateUserIn(List<String> values) {
            addCriterion("v7_m_update_user in", values, "v7MUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7MUpdateUserNotIn(List<String> values) {
            addCriterion("v7_m_update_user not in", values, "v7MUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7MUpdateUserBetween(String value1, String value2) {
            addCriterion("v7_m_update_user between", value1, value2, "v7MUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7MUpdateUserNotBetween(String value1, String value2) {
            addCriterion("v7_m_update_user not between", value1, value2, "v7MUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7MUpdateTimeIsNull() {
            addCriterion("V7_m_update_time is null");
            return (Criteria) this;
        }

        public Criteria andV7MUpdateTimeIsNotNull() {
            addCriterion("V7_m_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andV7MUpdateTimeEqualTo(Date value) {
            addCriterion("V7_m_update_time =", value, "v7MUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7MUpdateTimeNotEqualTo(Date value) {
            addCriterion("V7_m_update_time <>", value, "v7MUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7MUpdateTimeGreaterThan(Date value) {
            addCriterion("V7_m_update_time >", value, "v7MUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7MUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("V7_m_update_time >=", value, "v7MUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7MUpdateTimeLessThan(Date value) {
            addCriterion("V7_m_update_time <", value, "v7MUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7MUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("V7_m_update_time <=", value, "v7MUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7MUpdateTimeIn(List<Date> values) {
            addCriterion("V7_m_update_time in", values, "v7MUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7MUpdateTimeNotIn(List<Date> values) {
            addCriterion("V7_m_update_time not in", values, "v7MUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7MUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("V7_m_update_time between", value1, value2, "v7MUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7MUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("V7_m_update_time not between", value1, value2, "v7MUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7MRemarksIsNull() {
            addCriterion("v7_m_remarks is null");
            return (Criteria) this;
        }

        public Criteria andV7MRemarksIsNotNull() {
            addCriterion("v7_m_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andV7MRemarksEqualTo(String value) {
            addCriterion("v7_m_remarks =", value, "v7MRemarks");
            return (Criteria) this;
        }

        public Criteria andV7MRemarksNotEqualTo(String value) {
            addCriterion("v7_m_remarks <>", value, "v7MRemarks");
            return (Criteria) this;
        }

        public Criteria andV7MRemarksGreaterThan(String value) {
            addCriterion("v7_m_remarks >", value, "v7MRemarks");
            return (Criteria) this;
        }

        public Criteria andV7MRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("v7_m_remarks >=", value, "v7MRemarks");
            return (Criteria) this;
        }

        public Criteria andV7MRemarksLessThan(String value) {
            addCriterion("v7_m_remarks <", value, "v7MRemarks");
            return (Criteria) this;
        }

        public Criteria andV7MRemarksLessThanOrEqualTo(String value) {
            addCriterion("v7_m_remarks <=", value, "v7MRemarks");
            return (Criteria) this;
        }

        public Criteria andV7MRemarksLike(String value) {
            addCriterion("v7_m_remarks like", value, "v7MRemarks");
            return (Criteria) this;
        }

        public Criteria andV7MRemarksNotLike(String value) {
            addCriterion("v7_m_remarks not like", value, "v7MRemarks");
            return (Criteria) this;
        }

        public Criteria andV7MRemarksIn(List<String> values) {
            addCriterion("v7_m_remarks in", values, "v7MRemarks");
            return (Criteria) this;
        }

        public Criteria andV7MRemarksNotIn(List<String> values) {
            addCriterion("v7_m_remarks not in", values, "v7MRemarks");
            return (Criteria) this;
        }

        public Criteria andV7MRemarksBetween(String value1, String value2) {
            addCriterion("v7_m_remarks between", value1, value2, "v7MRemarks");
            return (Criteria) this;
        }

        public Criteria andV7MRemarksNotBetween(String value1, String value2) {
            addCriterion("v7_m_remarks not between", value1, value2, "v7MRemarks");
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