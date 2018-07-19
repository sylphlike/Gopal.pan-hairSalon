package com.carrey.v7mc.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class V7EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public V7EmployeeExample() {
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

        public Criteria andV7ENumIsNull() {
            addCriterion("v7_e_num is null");
            return (Criteria) this;
        }

        public Criteria andV7ENumIsNotNull() {
            addCriterion("v7_e_num is not null");
            return (Criteria) this;
        }

        public Criteria andV7ENumEqualTo(Integer value) {
            addCriterion("v7_e_num =", value, "v7ENum");
            return (Criteria) this;
        }

        public Criteria andV7ENumNotEqualTo(Integer value) {
            addCriterion("v7_e_num <>", value, "v7ENum");
            return (Criteria) this;
        }

        public Criteria andV7ENumGreaterThan(Integer value) {
            addCriterion("v7_e_num >", value, "v7ENum");
            return (Criteria) this;
        }

        public Criteria andV7ENumGreaterThanOrEqualTo(Integer value) {
            addCriterion("v7_e_num >=", value, "v7ENum");
            return (Criteria) this;
        }

        public Criteria andV7ENumLessThan(Integer value) {
            addCriterion("v7_e_num <", value, "v7ENum");
            return (Criteria) this;
        }

        public Criteria andV7ENumLessThanOrEqualTo(Integer value) {
            addCriterion("v7_e_num <=", value, "v7ENum");
            return (Criteria) this;
        }

        public Criteria andV7ENumIn(List<Integer> values) {
            addCriterion("v7_e_num in", values, "v7ENum");
            return (Criteria) this;
        }

        public Criteria andV7ENumNotIn(List<Integer> values) {
            addCriterion("v7_e_num not in", values, "v7ENum");
            return (Criteria) this;
        }

        public Criteria andV7ENumBetween(Integer value1, Integer value2) {
            addCriterion("v7_e_num between", value1, value2, "v7ENum");
            return (Criteria) this;
        }

        public Criteria andV7ENumNotBetween(Integer value1, Integer value2) {
            addCriterion("v7_e_num not between", value1, value2, "v7ENum");
            return (Criteria) this;
        }

        public Criteria andV7ENameIsNull() {
            addCriterion("v7_e_name is null");
            return (Criteria) this;
        }

        public Criteria andV7ENameIsNotNull() {
            addCriterion("v7_e_name is not null");
            return (Criteria) this;
        }

        public Criteria andV7ENameEqualTo(String value) {
            addCriterion("v7_e_name =", value, "v7EName");
            return (Criteria) this;
        }

        public Criteria andV7ENameNotEqualTo(String value) {
            addCriterion("v7_e_name <>", value, "v7EName");
            return (Criteria) this;
        }

        public Criteria andV7ENameGreaterThan(String value) {
            addCriterion("v7_e_name >", value, "v7EName");
            return (Criteria) this;
        }

        public Criteria andV7ENameGreaterThanOrEqualTo(String value) {
            addCriterion("v7_e_name >=", value, "v7EName");
            return (Criteria) this;
        }

        public Criteria andV7ENameLessThan(String value) {
            addCriterion("v7_e_name <", value, "v7EName");
            return (Criteria) this;
        }

        public Criteria andV7ENameLessThanOrEqualTo(String value) {
            addCriterion("v7_e_name <=", value, "v7EName");
            return (Criteria) this;
        }

        public Criteria andV7ENameLike(String value) {
            addCriterion("v7_e_name like", value, "v7EName");
            return (Criteria) this;
        }

        public Criteria andV7ENameNotLike(String value) {
            addCriterion("v7_e_name not like", value, "v7EName");
            return (Criteria) this;
        }

        public Criteria andV7ENameIn(List<String> values) {
            addCriterion("v7_e_name in", values, "v7EName");
            return (Criteria) this;
        }

        public Criteria andV7ENameNotIn(List<String> values) {
            addCriterion("v7_e_name not in", values, "v7EName");
            return (Criteria) this;
        }

        public Criteria andV7ENameBetween(String value1, String value2) {
            addCriterion("v7_e_name between", value1, value2, "v7EName");
            return (Criteria) this;
        }

        public Criteria andV7ENameNotBetween(String value1, String value2) {
            addCriterion("v7_e_name not between", value1, value2, "v7EName");
            return (Criteria) this;
        }

        public Criteria andV7ERealNameIsNull() {
            addCriterion("v7_e_real_name is null");
            return (Criteria) this;
        }

        public Criteria andV7ERealNameIsNotNull() {
            addCriterion("v7_e_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andV7ERealNameEqualTo(String value) {
            addCriterion("v7_e_real_name =", value, "v7ERealName");
            return (Criteria) this;
        }

        public Criteria andV7ERealNameNotEqualTo(String value) {
            addCriterion("v7_e_real_name <>", value, "v7ERealName");
            return (Criteria) this;
        }

        public Criteria andV7ERealNameGreaterThan(String value) {
            addCriterion("v7_e_real_name >", value, "v7ERealName");
            return (Criteria) this;
        }

        public Criteria andV7ERealNameGreaterThanOrEqualTo(String value) {
            addCriterion("v7_e_real_name >=", value, "v7ERealName");
            return (Criteria) this;
        }

        public Criteria andV7ERealNameLessThan(String value) {
            addCriterion("v7_e_real_name <", value, "v7ERealName");
            return (Criteria) this;
        }

        public Criteria andV7ERealNameLessThanOrEqualTo(String value) {
            addCriterion("v7_e_real_name <=", value, "v7ERealName");
            return (Criteria) this;
        }

        public Criteria andV7ERealNameLike(String value) {
            addCriterion("v7_e_real_name like", value, "v7ERealName");
            return (Criteria) this;
        }

        public Criteria andV7ERealNameNotLike(String value) {
            addCriterion("v7_e_real_name not like", value, "v7ERealName");
            return (Criteria) this;
        }

        public Criteria andV7ERealNameIn(List<String> values) {
            addCriterion("v7_e_real_name in", values, "v7ERealName");
            return (Criteria) this;
        }

        public Criteria andV7ERealNameNotIn(List<String> values) {
            addCriterion("v7_e_real_name not in", values, "v7ERealName");
            return (Criteria) this;
        }

        public Criteria andV7ERealNameBetween(String value1, String value2) {
            addCriterion("v7_e_real_name between", value1, value2, "v7ERealName");
            return (Criteria) this;
        }

        public Criteria andV7ERealNameNotBetween(String value1, String value2) {
            addCriterion("v7_e_real_name not between", value1, value2, "v7ERealName");
            return (Criteria) this;
        }

        public Criteria andV7ESexIsNull() {
            addCriterion("v7_e_sex is null");
            return (Criteria) this;
        }

        public Criteria andV7ESexIsNotNull() {
            addCriterion("v7_e_sex is not null");
            return (Criteria) this;
        }

        public Criteria andV7ESexEqualTo(Integer value) {
            addCriterion("v7_e_sex =", value, "v7ESex");
            return (Criteria) this;
        }

        public Criteria andV7ESexNotEqualTo(Integer value) {
            addCriterion("v7_e_sex <>", value, "v7ESex");
            return (Criteria) this;
        }

        public Criteria andV7ESexGreaterThan(Integer value) {
            addCriterion("v7_e_sex >", value, "v7ESex");
            return (Criteria) this;
        }

        public Criteria andV7ESexGreaterThanOrEqualTo(Integer value) {
            addCriterion("v7_e_sex >=", value, "v7ESex");
            return (Criteria) this;
        }

        public Criteria andV7ESexLessThan(Integer value) {
            addCriterion("v7_e_sex <", value, "v7ESex");
            return (Criteria) this;
        }

        public Criteria andV7ESexLessThanOrEqualTo(Integer value) {
            addCriterion("v7_e_sex <=", value, "v7ESex");
            return (Criteria) this;
        }

        public Criteria andV7ESexIn(List<Integer> values) {
            addCriterion("v7_e_sex in", values, "v7ESex");
            return (Criteria) this;
        }

        public Criteria andV7ESexNotIn(List<Integer> values) {
            addCriterion("v7_e_sex not in", values, "v7ESex");
            return (Criteria) this;
        }

        public Criteria andV7ESexBetween(Integer value1, Integer value2) {
            addCriterion("v7_e_sex between", value1, value2, "v7ESex");
            return (Criteria) this;
        }

        public Criteria andV7ESexNotBetween(Integer value1, Integer value2) {
            addCriterion("v7_e_sex not between", value1, value2, "v7ESex");
            return (Criteria) this;
        }

        public Criteria andV7EBirthdayIsNull() {
            addCriterion("v7_e_birthday is null");
            return (Criteria) this;
        }

        public Criteria andV7EBirthdayIsNotNull() {
            addCriterion("v7_e_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andV7EBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("v7_e_birthday =", value, "v7EBirthday");
            return (Criteria) this;
        }

        public Criteria andV7EBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("v7_e_birthday <>", value, "v7EBirthday");
            return (Criteria) this;
        }

        public Criteria andV7EBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("v7_e_birthday >", value, "v7EBirthday");
            return (Criteria) this;
        }

        public Criteria andV7EBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("v7_e_birthday >=", value, "v7EBirthday");
            return (Criteria) this;
        }

        public Criteria andV7EBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("v7_e_birthday <", value, "v7EBirthday");
            return (Criteria) this;
        }

        public Criteria andV7EBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("v7_e_birthday <=", value, "v7EBirthday");
            return (Criteria) this;
        }

        public Criteria andV7EBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("v7_e_birthday in", values, "v7EBirthday");
            return (Criteria) this;
        }

        public Criteria andV7EBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("v7_e_birthday not in", values, "v7EBirthday");
            return (Criteria) this;
        }

        public Criteria andV7EBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("v7_e_birthday between", value1, value2, "v7EBirthday");
            return (Criteria) this;
        }

        public Criteria andV7EBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("v7_e_birthday not between", value1, value2, "v7EBirthday");
            return (Criteria) this;
        }

        public Criteria andV7EPhoneIsNull() {
            addCriterion("v7_e_phone is null");
            return (Criteria) this;
        }

        public Criteria andV7EPhoneIsNotNull() {
            addCriterion("v7_e_phone is not null");
            return (Criteria) this;
        }

        public Criteria andV7EPhoneEqualTo(String value) {
            addCriterion("v7_e_phone =", value, "v7EPhone");
            return (Criteria) this;
        }

        public Criteria andV7EPhoneNotEqualTo(String value) {
            addCriterion("v7_e_phone <>", value, "v7EPhone");
            return (Criteria) this;
        }

        public Criteria andV7EPhoneGreaterThan(String value) {
            addCriterion("v7_e_phone >", value, "v7EPhone");
            return (Criteria) this;
        }

        public Criteria andV7EPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("v7_e_phone >=", value, "v7EPhone");
            return (Criteria) this;
        }

        public Criteria andV7EPhoneLessThan(String value) {
            addCriterion("v7_e_phone <", value, "v7EPhone");
            return (Criteria) this;
        }

        public Criteria andV7EPhoneLessThanOrEqualTo(String value) {
            addCriterion("v7_e_phone <=", value, "v7EPhone");
            return (Criteria) this;
        }

        public Criteria andV7EPhoneLike(String value) {
            addCriterion("v7_e_phone like", value, "v7EPhone");
            return (Criteria) this;
        }

        public Criteria andV7EPhoneNotLike(String value) {
            addCriterion("v7_e_phone not like", value, "v7EPhone");
            return (Criteria) this;
        }

        public Criteria andV7EPhoneIn(List<String> values) {
            addCriterion("v7_e_phone in", values, "v7EPhone");
            return (Criteria) this;
        }

        public Criteria andV7EPhoneNotIn(List<String> values) {
            addCriterion("v7_e_phone not in", values, "v7EPhone");
            return (Criteria) this;
        }

        public Criteria andV7EPhoneBetween(String value1, String value2) {
            addCriterion("v7_e_phone between", value1, value2, "v7EPhone");
            return (Criteria) this;
        }

        public Criteria andV7EPhoneNotBetween(String value1, String value2) {
            addCriterion("v7_e_phone not between", value1, value2, "v7EPhone");
            return (Criteria) this;
        }

        public Criteria andV7EPositionIsNull() {
            addCriterion("v7_e_position is null");
            return (Criteria) this;
        }

        public Criteria andV7EPositionIsNotNull() {
            addCriterion("v7_e_position is not null");
            return (Criteria) this;
        }

        public Criteria andV7EPositionEqualTo(String value) {
            addCriterion("v7_e_position =", value, "v7EPosition");
            return (Criteria) this;
        }

        public Criteria andV7EPositionNotEqualTo(String value) {
            addCriterion("v7_e_position <>", value, "v7EPosition");
            return (Criteria) this;
        }

        public Criteria andV7EPositionGreaterThan(String value) {
            addCriterion("v7_e_position >", value, "v7EPosition");
            return (Criteria) this;
        }

        public Criteria andV7EPositionGreaterThanOrEqualTo(String value) {
            addCriterion("v7_e_position >=", value, "v7EPosition");
            return (Criteria) this;
        }

        public Criteria andV7EPositionLessThan(String value) {
            addCriterion("v7_e_position <", value, "v7EPosition");
            return (Criteria) this;
        }

        public Criteria andV7EPositionLessThanOrEqualTo(String value) {
            addCriterion("v7_e_position <=", value, "v7EPosition");
            return (Criteria) this;
        }

        public Criteria andV7EPositionLike(String value) {
            addCriterion("v7_e_position like", value, "v7EPosition");
            return (Criteria) this;
        }

        public Criteria andV7EPositionNotLike(String value) {
            addCriterion("v7_e_position not like", value, "v7EPosition");
            return (Criteria) this;
        }

        public Criteria andV7EPositionIn(List<String> values) {
            addCriterion("v7_e_position in", values, "v7EPosition");
            return (Criteria) this;
        }

        public Criteria andV7EPositionNotIn(List<String> values) {
            addCriterion("v7_e_position not in", values, "v7EPosition");
            return (Criteria) this;
        }

        public Criteria andV7EPositionBetween(String value1, String value2) {
            addCriterion("v7_e_position between", value1, value2, "v7EPosition");
            return (Criteria) this;
        }

        public Criteria andV7EPositionNotBetween(String value1, String value2) {
            addCriterion("v7_e_position not between", value1, value2, "v7EPosition");
            return (Criteria) this;
        }

        public Criteria andV7EJoinDateIsNull() {
            addCriterion("v7_e_join_date is null");
            return (Criteria) this;
        }

        public Criteria andV7EJoinDateIsNotNull() {
            addCriterion("v7_e_join_date is not null");
            return (Criteria) this;
        }

        public Criteria andV7EJoinDateEqualTo(Date value) {
            addCriterionForJDBCDate("v7_e_join_date =", value, "v7EJoinDate");
            return (Criteria) this;
        }

        public Criteria andV7EJoinDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("v7_e_join_date <>", value, "v7EJoinDate");
            return (Criteria) this;
        }

        public Criteria andV7EJoinDateGreaterThan(Date value) {
            addCriterionForJDBCDate("v7_e_join_date >", value, "v7EJoinDate");
            return (Criteria) this;
        }

        public Criteria andV7EJoinDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("v7_e_join_date >=", value, "v7EJoinDate");
            return (Criteria) this;
        }

        public Criteria andV7EJoinDateLessThan(Date value) {
            addCriterionForJDBCDate("v7_e_join_date <", value, "v7EJoinDate");
            return (Criteria) this;
        }

        public Criteria andV7EJoinDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("v7_e_join_date <=", value, "v7EJoinDate");
            return (Criteria) this;
        }

        public Criteria andV7EJoinDateIn(List<Date> values) {
            addCriterionForJDBCDate("v7_e_join_date in", values, "v7EJoinDate");
            return (Criteria) this;
        }

        public Criteria andV7EJoinDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("v7_e_join_date not in", values, "v7EJoinDate");
            return (Criteria) this;
        }

        public Criteria andV7EJoinDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("v7_e_join_date between", value1, value2, "v7EJoinDate");
            return (Criteria) this;
        }

        public Criteria andV7EJoinDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("v7_e_join_date not between", value1, value2, "v7EJoinDate");
            return (Criteria) this;
        }

        public Criteria andV7EPasswordIsNull() {
            addCriterion("v7_e_password is null");
            return (Criteria) this;
        }

        public Criteria andV7EPasswordIsNotNull() {
            addCriterion("v7_e_password is not null");
            return (Criteria) this;
        }

        public Criteria andV7EPasswordEqualTo(String value) {
            addCriterion("v7_e_password =", value, "v7EPassword");
            return (Criteria) this;
        }

        public Criteria andV7EPasswordNotEqualTo(String value) {
            addCriterion("v7_e_password <>", value, "v7EPassword");
            return (Criteria) this;
        }

        public Criteria andV7EPasswordGreaterThan(String value) {
            addCriterion("v7_e_password >", value, "v7EPassword");
            return (Criteria) this;
        }

        public Criteria andV7EPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("v7_e_password >=", value, "v7EPassword");
            return (Criteria) this;
        }

        public Criteria andV7EPasswordLessThan(String value) {
            addCriterion("v7_e_password <", value, "v7EPassword");
            return (Criteria) this;
        }

        public Criteria andV7EPasswordLessThanOrEqualTo(String value) {
            addCriterion("v7_e_password <=", value, "v7EPassword");
            return (Criteria) this;
        }

        public Criteria andV7EPasswordLike(String value) {
            addCriterion("v7_e_password like", value, "v7EPassword");
            return (Criteria) this;
        }

        public Criteria andV7EPasswordNotLike(String value) {
            addCriterion("v7_e_password not like", value, "v7EPassword");
            return (Criteria) this;
        }

        public Criteria andV7EPasswordIn(List<String> values) {
            addCriterion("v7_e_password in", values, "v7EPassword");
            return (Criteria) this;
        }

        public Criteria andV7EPasswordNotIn(List<String> values) {
            addCriterion("v7_e_password not in", values, "v7EPassword");
            return (Criteria) this;
        }

        public Criteria andV7EPasswordBetween(String value1, String value2) {
            addCriterion("v7_e_password between", value1, value2, "v7EPassword");
            return (Criteria) this;
        }

        public Criteria andV7EPasswordNotBetween(String value1, String value2) {
            addCriterion("v7_e_password not between", value1, value2, "v7EPassword");
            return (Criteria) this;
        }

        public Criteria andV7EStatusIsNull() {
            addCriterion("v7_e_status is null");
            return (Criteria) this;
        }

        public Criteria andV7EStatusIsNotNull() {
            addCriterion("v7_e_status is not null");
            return (Criteria) this;
        }

        public Criteria andV7EStatusEqualTo(Integer value) {
            addCriterion("v7_e_status =", value, "v7EStatus");
            return (Criteria) this;
        }

        public Criteria andV7EStatusNotEqualTo(Integer value) {
            addCriterion("v7_e_status <>", value, "v7EStatus");
            return (Criteria) this;
        }

        public Criteria andV7EStatusGreaterThan(Integer value) {
            addCriterion("v7_e_status >", value, "v7EStatus");
            return (Criteria) this;
        }

        public Criteria andV7EStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("v7_e_status >=", value, "v7EStatus");
            return (Criteria) this;
        }

        public Criteria andV7EStatusLessThan(Integer value) {
            addCriterion("v7_e_status <", value, "v7EStatus");
            return (Criteria) this;
        }

        public Criteria andV7EStatusLessThanOrEqualTo(Integer value) {
            addCriterion("v7_e_status <=", value, "v7EStatus");
            return (Criteria) this;
        }

        public Criteria andV7EStatusIn(List<Integer> values) {
            addCriterion("v7_e_status in", values, "v7EStatus");
            return (Criteria) this;
        }

        public Criteria andV7EStatusNotIn(List<Integer> values) {
            addCriterion("v7_e_status not in", values, "v7EStatus");
            return (Criteria) this;
        }

        public Criteria andV7EStatusBetween(Integer value1, Integer value2) {
            addCriterion("v7_e_status between", value1, value2, "v7EStatus");
            return (Criteria) this;
        }

        public Criteria andV7EStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("v7_e_status not between", value1, value2, "v7EStatus");
            return (Criteria) this;
        }

        public Criteria andV7ELastLoginIsNull() {
            addCriterion("v7_e_last_login is null");
            return (Criteria) this;
        }

        public Criteria andV7ELastLoginIsNotNull() {
            addCriterion("v7_e_last_login is not null");
            return (Criteria) this;
        }

        public Criteria andV7ELastLoginEqualTo(Date value) {
            addCriterion("v7_e_last_login =", value, "v7ELastLogin");
            return (Criteria) this;
        }

        public Criteria andV7ELastLoginNotEqualTo(Date value) {
            addCriterion("v7_e_last_login <>", value, "v7ELastLogin");
            return (Criteria) this;
        }

        public Criteria andV7ELastLoginGreaterThan(Date value) {
            addCriterion("v7_e_last_login >", value, "v7ELastLogin");
            return (Criteria) this;
        }

        public Criteria andV7ELastLoginGreaterThanOrEqualTo(Date value) {
            addCriterion("v7_e_last_login >=", value, "v7ELastLogin");
            return (Criteria) this;
        }

        public Criteria andV7ELastLoginLessThan(Date value) {
            addCriterion("v7_e_last_login <", value, "v7ELastLogin");
            return (Criteria) this;
        }

        public Criteria andV7ELastLoginLessThanOrEqualTo(Date value) {
            addCriterion("v7_e_last_login <=", value, "v7ELastLogin");
            return (Criteria) this;
        }

        public Criteria andV7ELastLoginIn(List<Date> values) {
            addCriterion("v7_e_last_login in", values, "v7ELastLogin");
            return (Criteria) this;
        }

        public Criteria andV7ELastLoginNotIn(List<Date> values) {
            addCriterion("v7_e_last_login not in", values, "v7ELastLogin");
            return (Criteria) this;
        }

        public Criteria andV7ELastLoginBetween(Date value1, Date value2) {
            addCriterion("v7_e_last_login between", value1, value2, "v7ELastLogin");
            return (Criteria) this;
        }

        public Criteria andV7ELastLoginNotBetween(Date value1, Date value2) {
            addCriterion("v7_e_last_login not between", value1, value2, "v7ELastLogin");
            return (Criteria) this;
        }

        public Criteria andV7ELastIpIsNull() {
            addCriterion("v7_e_last_ip is null");
            return (Criteria) this;
        }

        public Criteria andV7ELastIpIsNotNull() {
            addCriterion("v7_e_last_ip is not null");
            return (Criteria) this;
        }

        public Criteria andV7ELastIpEqualTo(String value) {
            addCriterion("v7_e_last_ip =", value, "v7ELastIp");
            return (Criteria) this;
        }

        public Criteria andV7ELastIpNotEqualTo(String value) {
            addCriterion("v7_e_last_ip <>", value, "v7ELastIp");
            return (Criteria) this;
        }

        public Criteria andV7ELastIpGreaterThan(String value) {
            addCriterion("v7_e_last_ip >", value, "v7ELastIp");
            return (Criteria) this;
        }

        public Criteria andV7ELastIpGreaterThanOrEqualTo(String value) {
            addCriterion("v7_e_last_ip >=", value, "v7ELastIp");
            return (Criteria) this;
        }

        public Criteria andV7ELastIpLessThan(String value) {
            addCriterion("v7_e_last_ip <", value, "v7ELastIp");
            return (Criteria) this;
        }

        public Criteria andV7ELastIpLessThanOrEqualTo(String value) {
            addCriterion("v7_e_last_ip <=", value, "v7ELastIp");
            return (Criteria) this;
        }

        public Criteria andV7ELastIpLike(String value) {
            addCriterion("v7_e_last_ip like", value, "v7ELastIp");
            return (Criteria) this;
        }

        public Criteria andV7ELastIpNotLike(String value) {
            addCriterion("v7_e_last_ip not like", value, "v7ELastIp");
            return (Criteria) this;
        }

        public Criteria andV7ELastIpIn(List<String> values) {
            addCriterion("v7_e_last_ip in", values, "v7ELastIp");
            return (Criteria) this;
        }

        public Criteria andV7ELastIpNotIn(List<String> values) {
            addCriterion("v7_e_last_ip not in", values, "v7ELastIp");
            return (Criteria) this;
        }

        public Criteria andV7ELastIpBetween(String value1, String value2) {
            addCriterion("v7_e_last_ip between", value1, value2, "v7ELastIp");
            return (Criteria) this;
        }

        public Criteria andV7ELastIpNotBetween(String value1, String value2) {
            addCriterion("v7_e_last_ip not between", value1, value2, "v7ELastIp");
            return (Criteria) this;
        }

        public Criteria andV7ESumLoginIsNull() {
            addCriterion("v7_e_sum_login is null");
            return (Criteria) this;
        }

        public Criteria andV7ESumLoginIsNotNull() {
            addCriterion("v7_e_sum_login is not null");
            return (Criteria) this;
        }

        public Criteria andV7ESumLoginEqualTo(Integer value) {
            addCriterion("v7_e_sum_login =", value, "v7ESumLogin");
            return (Criteria) this;
        }

        public Criteria andV7ESumLoginNotEqualTo(Integer value) {
            addCriterion("v7_e_sum_login <>", value, "v7ESumLogin");
            return (Criteria) this;
        }

        public Criteria andV7ESumLoginGreaterThan(Integer value) {
            addCriterion("v7_e_sum_login >", value, "v7ESumLogin");
            return (Criteria) this;
        }

        public Criteria andV7ESumLoginGreaterThanOrEqualTo(Integer value) {
            addCriterion("v7_e_sum_login >=", value, "v7ESumLogin");
            return (Criteria) this;
        }

        public Criteria andV7ESumLoginLessThan(Integer value) {
            addCriterion("v7_e_sum_login <", value, "v7ESumLogin");
            return (Criteria) this;
        }

        public Criteria andV7ESumLoginLessThanOrEqualTo(Integer value) {
            addCriterion("v7_e_sum_login <=", value, "v7ESumLogin");
            return (Criteria) this;
        }

        public Criteria andV7ESumLoginIn(List<Integer> values) {
            addCriterion("v7_e_sum_login in", values, "v7ESumLogin");
            return (Criteria) this;
        }

        public Criteria andV7ESumLoginNotIn(List<Integer> values) {
            addCriterion("v7_e_sum_login not in", values, "v7ESumLogin");
            return (Criteria) this;
        }

        public Criteria andV7ESumLoginBetween(Integer value1, Integer value2) {
            addCriterion("v7_e_sum_login between", value1, value2, "v7ESumLogin");
            return (Criteria) this;
        }

        public Criteria andV7ESumLoginNotBetween(Integer value1, Integer value2) {
            addCriterion("v7_e_sum_login not between", value1, value2, "v7ESumLogin");
            return (Criteria) this;
        }

        public Criteria andV7EOnlineTimeIsNull() {
            addCriterion("v7_e_online_time is null");
            return (Criteria) this;
        }

        public Criteria andV7EOnlineTimeIsNotNull() {
            addCriterion("v7_e_online_time is not null");
            return (Criteria) this;
        }

        public Criteria andV7EOnlineTimeEqualTo(Date value) {
            addCriterion("v7_e_online_time =", value, "v7EOnlineTime");
            return (Criteria) this;
        }

        public Criteria andV7EOnlineTimeNotEqualTo(Date value) {
            addCriterion("v7_e_online_time <>", value, "v7EOnlineTime");
            return (Criteria) this;
        }

        public Criteria andV7EOnlineTimeGreaterThan(Date value) {
            addCriterion("v7_e_online_time >", value, "v7EOnlineTime");
            return (Criteria) this;
        }

        public Criteria andV7EOnlineTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("v7_e_online_time >=", value, "v7EOnlineTime");
            return (Criteria) this;
        }

        public Criteria andV7EOnlineTimeLessThan(Date value) {
            addCriterion("v7_e_online_time <", value, "v7EOnlineTime");
            return (Criteria) this;
        }

        public Criteria andV7EOnlineTimeLessThanOrEqualTo(Date value) {
            addCriterion("v7_e_online_time <=", value, "v7EOnlineTime");
            return (Criteria) this;
        }

        public Criteria andV7EOnlineTimeIn(List<Date> values) {
            addCriterion("v7_e_online_time in", values, "v7EOnlineTime");
            return (Criteria) this;
        }

        public Criteria andV7EOnlineTimeNotIn(List<Date> values) {
            addCriterion("v7_e_online_time not in", values, "v7EOnlineTime");
            return (Criteria) this;
        }

        public Criteria andV7EOnlineTimeBetween(Date value1, Date value2) {
            addCriterion("v7_e_online_time between", value1, value2, "v7EOnlineTime");
            return (Criteria) this;
        }

        public Criteria andV7EOnlineTimeNotBetween(Date value1, Date value2) {
            addCriterion("v7_e_online_time not between", value1, value2, "v7EOnlineTime");
            return (Criteria) this;
        }

        public Criteria andV7ERemarksIsNull() {
            addCriterion("v7_e_remarks is null");
            return (Criteria) this;
        }

        public Criteria andV7ERemarksIsNotNull() {
            addCriterion("v7_e_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andV7ERemarksEqualTo(String value) {
            addCriterion("v7_e_remarks =", value, "v7ERemarks");
            return (Criteria) this;
        }

        public Criteria andV7ERemarksNotEqualTo(String value) {
            addCriterion("v7_e_remarks <>", value, "v7ERemarks");
            return (Criteria) this;
        }

        public Criteria andV7ERemarksGreaterThan(String value) {
            addCriterion("v7_e_remarks >", value, "v7ERemarks");
            return (Criteria) this;
        }

        public Criteria andV7ERemarksGreaterThanOrEqualTo(String value) {
            addCriterion("v7_e_remarks >=", value, "v7ERemarks");
            return (Criteria) this;
        }

        public Criteria andV7ERemarksLessThan(String value) {
            addCriterion("v7_e_remarks <", value, "v7ERemarks");
            return (Criteria) this;
        }

        public Criteria andV7ERemarksLessThanOrEqualTo(String value) {
            addCriterion("v7_e_remarks <=", value, "v7ERemarks");
            return (Criteria) this;
        }

        public Criteria andV7ERemarksLike(String value) {
            addCriterion("v7_e_remarks like", value, "v7ERemarks");
            return (Criteria) this;
        }

        public Criteria andV7ERemarksNotLike(String value) {
            addCriterion("v7_e_remarks not like", value, "v7ERemarks");
            return (Criteria) this;
        }

        public Criteria andV7ERemarksIn(List<String> values) {
            addCriterion("v7_e_remarks in", values, "v7ERemarks");
            return (Criteria) this;
        }

        public Criteria andV7ERemarksNotIn(List<String> values) {
            addCriterion("v7_e_remarks not in", values, "v7ERemarks");
            return (Criteria) this;
        }

        public Criteria andV7ERemarksBetween(String value1, String value2) {
            addCriterion("v7_e_remarks between", value1, value2, "v7ERemarks");
            return (Criteria) this;
        }

        public Criteria andV7ERemarksNotBetween(String value1, String value2) {
            addCriterion("v7_e_remarks not between", value1, value2, "v7ERemarks");
            return (Criteria) this;
        }

        public Criteria andV7ECreateUserIsNull() {
            addCriterion("v7_e_create_user is null");
            return (Criteria) this;
        }

        public Criteria andV7ECreateUserIsNotNull() {
            addCriterion("v7_e_create_user is not null");
            return (Criteria) this;
        }

        public Criteria andV7ECreateUserEqualTo(String value) {
            addCriterion("v7_e_create_user =", value, "v7ECreateUser");
            return (Criteria) this;
        }

        public Criteria andV7ECreateUserNotEqualTo(String value) {
            addCriterion("v7_e_create_user <>", value, "v7ECreateUser");
            return (Criteria) this;
        }

        public Criteria andV7ECreateUserGreaterThan(String value) {
            addCriterion("v7_e_create_user >", value, "v7ECreateUser");
            return (Criteria) this;
        }

        public Criteria andV7ECreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("v7_e_create_user >=", value, "v7ECreateUser");
            return (Criteria) this;
        }

        public Criteria andV7ECreateUserLessThan(String value) {
            addCriterion("v7_e_create_user <", value, "v7ECreateUser");
            return (Criteria) this;
        }

        public Criteria andV7ECreateUserLessThanOrEqualTo(String value) {
            addCriterion("v7_e_create_user <=", value, "v7ECreateUser");
            return (Criteria) this;
        }

        public Criteria andV7ECreateUserLike(String value) {
            addCriterion("v7_e_create_user like", value, "v7ECreateUser");
            return (Criteria) this;
        }

        public Criteria andV7ECreateUserNotLike(String value) {
            addCriterion("v7_e_create_user not like", value, "v7ECreateUser");
            return (Criteria) this;
        }

        public Criteria andV7ECreateUserIn(List<String> values) {
            addCriterion("v7_e_create_user in", values, "v7ECreateUser");
            return (Criteria) this;
        }

        public Criteria andV7ECreateUserNotIn(List<String> values) {
            addCriterion("v7_e_create_user not in", values, "v7ECreateUser");
            return (Criteria) this;
        }

        public Criteria andV7ECreateUserBetween(String value1, String value2) {
            addCriterion("v7_e_create_user between", value1, value2, "v7ECreateUser");
            return (Criteria) this;
        }

        public Criteria andV7ECreateUserNotBetween(String value1, String value2) {
            addCriterion("v7_e_create_user not between", value1, value2, "v7ECreateUser");
            return (Criteria) this;
        }

        public Criteria andV7ECreateDateIsNull() {
            addCriterion("v7_e_create_date is null");
            return (Criteria) this;
        }

        public Criteria andV7ECreateDateIsNotNull() {
            addCriterion("v7_e_create_date is not null");
            return (Criteria) this;
        }

        public Criteria andV7ECreateDateEqualTo(Date value) {
            addCriterion("v7_e_create_date =", value, "v7ECreateDate");
            return (Criteria) this;
        }

        public Criteria andV7ECreateDateNotEqualTo(Date value) {
            addCriterion("v7_e_create_date <>", value, "v7ECreateDate");
            return (Criteria) this;
        }

        public Criteria andV7ECreateDateGreaterThan(Date value) {
            addCriterion("v7_e_create_date >", value, "v7ECreateDate");
            return (Criteria) this;
        }

        public Criteria andV7ECreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("v7_e_create_date >=", value, "v7ECreateDate");
            return (Criteria) this;
        }

        public Criteria andV7ECreateDateLessThan(Date value) {
            addCriterion("v7_e_create_date <", value, "v7ECreateDate");
            return (Criteria) this;
        }

        public Criteria andV7ECreateDateLessThanOrEqualTo(Date value) {
            addCriterion("v7_e_create_date <=", value, "v7ECreateDate");
            return (Criteria) this;
        }

        public Criteria andV7ECreateDateIn(List<Date> values) {
            addCriterion("v7_e_create_date in", values, "v7ECreateDate");
            return (Criteria) this;
        }

        public Criteria andV7ECreateDateNotIn(List<Date> values) {
            addCriterion("v7_e_create_date not in", values, "v7ECreateDate");
            return (Criteria) this;
        }

        public Criteria andV7ECreateDateBetween(Date value1, Date value2) {
            addCriterion("v7_e_create_date between", value1, value2, "v7ECreateDate");
            return (Criteria) this;
        }

        public Criteria andV7ECreateDateNotBetween(Date value1, Date value2) {
            addCriterion("v7_e_create_date not between", value1, value2, "v7ECreateDate");
            return (Criteria) this;
        }

        public Criteria andV7EUpdateUserIsNull() {
            addCriterion("v7_e_update_user is null");
            return (Criteria) this;
        }

        public Criteria andV7EUpdateUserIsNotNull() {
            addCriterion("v7_e_update_user is not null");
            return (Criteria) this;
        }

        public Criteria andV7EUpdateUserEqualTo(String value) {
            addCriterion("v7_e_update_user =", value, "v7EUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7EUpdateUserNotEqualTo(String value) {
            addCriterion("v7_e_update_user <>", value, "v7EUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7EUpdateUserGreaterThan(String value) {
            addCriterion("v7_e_update_user >", value, "v7EUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7EUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("v7_e_update_user >=", value, "v7EUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7EUpdateUserLessThan(String value) {
            addCriterion("v7_e_update_user <", value, "v7EUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7EUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("v7_e_update_user <=", value, "v7EUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7EUpdateUserLike(String value) {
            addCriterion("v7_e_update_user like", value, "v7EUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7EUpdateUserNotLike(String value) {
            addCriterion("v7_e_update_user not like", value, "v7EUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7EUpdateUserIn(List<String> values) {
            addCriterion("v7_e_update_user in", values, "v7EUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7EUpdateUserNotIn(List<String> values) {
            addCriterion("v7_e_update_user not in", values, "v7EUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7EUpdateUserBetween(String value1, String value2) {
            addCriterion("v7_e_update_user between", value1, value2, "v7EUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7EUpdateUserNotBetween(String value1, String value2) {
            addCriterion("v7_e_update_user not between", value1, value2, "v7EUpdateUser");
            return (Criteria) this;
        }

        public Criteria andV7EUpdateTimeIsNull() {
            addCriterion("v7_e_update_time is null");
            return (Criteria) this;
        }

        public Criteria andV7EUpdateTimeIsNotNull() {
            addCriterion("v7_e_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andV7EUpdateTimeEqualTo(Date value) {
            addCriterion("v7_e_update_time =", value, "v7EUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7EUpdateTimeNotEqualTo(Date value) {
            addCriterion("v7_e_update_time <>", value, "v7EUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7EUpdateTimeGreaterThan(Date value) {
            addCriterion("v7_e_update_time >", value, "v7EUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7EUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("v7_e_update_time >=", value, "v7EUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7EUpdateTimeLessThan(Date value) {
            addCriterion("v7_e_update_time <", value, "v7EUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7EUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("v7_e_update_time <=", value, "v7EUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7EUpdateTimeIn(List<Date> values) {
            addCriterion("v7_e_update_time in", values, "v7EUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7EUpdateTimeNotIn(List<Date> values) {
            addCriterion("v7_e_update_time not in", values, "v7EUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7EUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("v7_e_update_time between", value1, value2, "v7EUpdateTime");
            return (Criteria) this;
        }

        public Criteria andV7EUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("v7_e_update_time not between", value1, value2, "v7EUpdateTime");
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