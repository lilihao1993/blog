package com.ldsh.blog.system.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminUserExample {
    /**
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * @mbggenerated
     */
    public AdminUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * @mbggenerated
     */
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

        public Criteria andUserNameIsNull() {
            addCriterion("BAU_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("BAU_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("BAU_USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("BAU_USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("BAU_USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("BAU_USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("BAU_USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("BAU_USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("BAU_USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("BAU_USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("BAU_USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("BAU_USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("BAU_USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("BAU_USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("BAU_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("BAU_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("BAU_PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("BAU_PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("BAU_PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("BAU_PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("BAU_PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("BAU_PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("BAU_PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("BAU_PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("BAU_PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("BAU_PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("BAU_PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("BAU_PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("BAU_NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("BAU_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("BAU_NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("BAU_NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("BAU_NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("BAU_NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("BAU_NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("BAU_NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("BAU_NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("BAU_NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("BAU_NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("BAU_NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("BAU_NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("BAU_NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("BAU_SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("BAU_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("BAU_SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("BAU_SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("BAU_SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("BAU_SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("BAU_SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("BAU_SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("BAU_SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("BAU_SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("BAU_SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("BAU_SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("BAU_SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("BAU_SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("BAU_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("BAU_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("BAU_ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("BAU_ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("BAU_ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("BAU_ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("BAU_ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("BAU_ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("BAU_ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("BAU_ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("BAU_ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("BAU_ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("BAU_ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("BAU_ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andDirthdayIsNull() {
            addCriterion("BAU_DIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andDirthdayIsNotNull() {
            addCriterion("BAU_DIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andDirthdayEqualTo(Date value) {
            addCriterion("BAU_DIRTHDAY =", value, "dirthday");
            return (Criteria) this;
        }

        public Criteria andDirthdayNotEqualTo(Date value) {
            addCriterion("BAU_DIRTHDAY <>", value, "dirthday");
            return (Criteria) this;
        }

        public Criteria andDirthdayGreaterThan(Date value) {
            addCriterion("BAU_DIRTHDAY >", value, "dirthday");
            return (Criteria) this;
        }

        public Criteria andDirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("BAU_DIRTHDAY >=", value, "dirthday");
            return (Criteria) this;
        }

        public Criteria andDirthdayLessThan(Date value) {
            addCriterion("BAU_DIRTHDAY <", value, "dirthday");
            return (Criteria) this;
        }

        public Criteria andDirthdayLessThanOrEqualTo(Date value) {
            addCriterion("BAU_DIRTHDAY <=", value, "dirthday");
            return (Criteria) this;
        }

        public Criteria andDirthdayIn(List<Date> values) {
            addCriterion("BAU_DIRTHDAY in", values, "dirthday");
            return (Criteria) this;
        }

        public Criteria andDirthdayNotIn(List<Date> values) {
            addCriterion("BAU_DIRTHDAY not in", values, "dirthday");
            return (Criteria) this;
        }

        public Criteria andDirthdayBetween(Date value1, Date value2) {
            addCriterion("BAU_DIRTHDAY between", value1, value2, "dirthday");
            return (Criteria) this;
        }

        public Criteria andDirthdayNotBetween(Date value1, Date value2) {
            addCriterion("BAU_DIRTHDAY not between", value1, value2, "dirthday");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("BAU_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("BAU_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("BAU_MOBILE =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("BAU_MOBILE <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("BAU_MOBILE >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("BAU_MOBILE >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("BAU_MOBILE <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("BAU_MOBILE <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("BAU_MOBILE like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("BAU_MOBILE not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("BAU_MOBILE in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("BAU_MOBILE not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("BAU_MOBILE between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("BAU_MOBILE not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMailIsNull() {
            addCriterion("BAU_MAIL is null");
            return (Criteria) this;
        }

        public Criteria andMailIsNotNull() {
            addCriterion("BAU_MAIL is not null");
            return (Criteria) this;
        }

        public Criteria andMailEqualTo(String value) {
            addCriterion("BAU_MAIL =", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotEqualTo(String value) {
            addCriterion("BAU_MAIL <>", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThan(String value) {
            addCriterion("BAU_MAIL >", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThanOrEqualTo(String value) {
            addCriterion("BAU_MAIL >=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThan(String value) {
            addCriterion("BAU_MAIL <", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThanOrEqualTo(String value) {
            addCriterion("BAU_MAIL <=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLike(String value) {
            addCriterion("BAU_MAIL like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotLike(String value) {
            addCriterion("BAU_MAIL not like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailIn(List<String> values) {
            addCriterion("BAU_MAIL in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotIn(List<String> values) {
            addCriterion("BAU_MAIL not in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailBetween(String value1, String value2) {
            addCriterion("BAU_MAIL between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotBetween(String value1, String value2) {
            addCriterion("BAU_MAIL not between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andWechatIsNull() {
            addCriterion("BAU_WECHAT is null");
            return (Criteria) this;
        }

        public Criteria andWechatIsNotNull() {
            addCriterion("BAU_WECHAT is not null");
            return (Criteria) this;
        }

        public Criteria andWechatEqualTo(String value) {
            addCriterion("BAU_WECHAT =", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotEqualTo(String value) {
            addCriterion("BAU_WECHAT <>", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThan(String value) {
            addCriterion("BAU_WECHAT >", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThanOrEqualTo(String value) {
            addCriterion("BAU_WECHAT >=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThan(String value) {
            addCriterion("BAU_WECHAT <", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThanOrEqualTo(String value) {
            addCriterion("BAU_WECHAT <=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLike(String value) {
            addCriterion("BAU_WECHAT like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotLike(String value) {
            addCriterion("BAU_WECHAT not like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatIn(List<String> values) {
            addCriterion("BAU_WECHAT in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotIn(List<String> values) {
            addCriterion("BAU_WECHAT not in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatBetween(String value1, String value2) {
            addCriterion("BAU_WECHAT between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotBetween(String value1, String value2) {
            addCriterion("BAU_WECHAT not between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andSketchIsNull() {
            addCriterion("BAU_SKETCH is null");
            return (Criteria) this;
        }

        public Criteria andSketchIsNotNull() {
            addCriterion("BAU_SKETCH is not null");
            return (Criteria) this;
        }

        public Criteria andSketchEqualTo(String value) {
            addCriterion("BAU_SKETCH =", value, "sketch");
            return (Criteria) this;
        }

        public Criteria andSketchNotEqualTo(String value) {
            addCriterion("BAU_SKETCH <>", value, "sketch");
            return (Criteria) this;
        }

        public Criteria andSketchGreaterThan(String value) {
            addCriterion("BAU_SKETCH >", value, "sketch");
            return (Criteria) this;
        }

        public Criteria andSketchGreaterThanOrEqualTo(String value) {
            addCriterion("BAU_SKETCH >=", value, "sketch");
            return (Criteria) this;
        }

        public Criteria andSketchLessThan(String value) {
            addCriterion("BAU_SKETCH <", value, "sketch");
            return (Criteria) this;
        }

        public Criteria andSketchLessThanOrEqualTo(String value) {
            addCriterion("BAU_SKETCH <=", value, "sketch");
            return (Criteria) this;
        }

        public Criteria andSketchLike(String value) {
            addCriterion("BAU_SKETCH like", value, "sketch");
            return (Criteria) this;
        }

        public Criteria andSketchNotLike(String value) {
            addCriterion("BAU_SKETCH not like", value, "sketch");
            return (Criteria) this;
        }

        public Criteria andSketchIn(List<String> values) {
            addCriterion("BAU_SKETCH in", values, "sketch");
            return (Criteria) this;
        }

        public Criteria andSketchNotIn(List<String> values) {
            addCriterion("BAU_SKETCH not in", values, "sketch");
            return (Criteria) this;
        }

        public Criteria andSketchBetween(String value1, String value2) {
            addCriterion("BAU_SKETCH between", value1, value2, "sketch");
            return (Criteria) this;
        }

        public Criteria andSketchNotBetween(String value1, String value2) {
            addCriterion("BAU_SKETCH not between", value1, value2, "sketch");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("BAU_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("BAU_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("BAU_STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("BAU_STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("BAU_STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("BAU_STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("BAU_STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("BAU_STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("BAU_STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("BAU_STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("BAU_STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("BAU_STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("BAU_STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("BAU_STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andEncryptSaltIsNull() {
            addCriterion("BAU_ENCRYPT_SALT is null");
            return (Criteria) this;
        }

        public Criteria andEncryptSaltIsNotNull() {
            addCriterion("BAU_ENCRYPT_SALT is not null");
            return (Criteria) this;
        }

        public Criteria andEncryptSaltEqualTo(String value) {
            addCriterion("BAU_ENCRYPT_SALT =", value, "encryptSalt");
            return (Criteria) this;
        }

        public Criteria andEncryptSaltNotEqualTo(String value) {
            addCriterion("BAU_ENCRYPT_SALT <>", value, "encryptSalt");
            return (Criteria) this;
        }

        public Criteria andEncryptSaltGreaterThan(String value) {
            addCriterion("BAU_ENCRYPT_SALT >", value, "encryptSalt");
            return (Criteria) this;
        }

        public Criteria andEncryptSaltGreaterThanOrEqualTo(String value) {
            addCriterion("BAU_ENCRYPT_SALT >=", value, "encryptSalt");
            return (Criteria) this;
        }

        public Criteria andEncryptSaltLessThan(String value) {
            addCriterion("BAU_ENCRYPT_SALT <", value, "encryptSalt");
            return (Criteria) this;
        }

        public Criteria andEncryptSaltLessThanOrEqualTo(String value) {
            addCriterion("BAU_ENCRYPT_SALT <=", value, "encryptSalt");
            return (Criteria) this;
        }

        public Criteria andEncryptSaltLike(String value) {
            addCriterion("BAU_ENCRYPT_SALT like", value, "encryptSalt");
            return (Criteria) this;
        }

        public Criteria andEncryptSaltNotLike(String value) {
            addCriterion("BAU_ENCRYPT_SALT not like", value, "encryptSalt");
            return (Criteria) this;
        }

        public Criteria andEncryptSaltIn(List<String> values) {
            addCriterion("BAU_ENCRYPT_SALT in", values, "encryptSalt");
            return (Criteria) this;
        }

        public Criteria andEncryptSaltNotIn(List<String> values) {
            addCriterion("BAU_ENCRYPT_SALT not in", values, "encryptSalt");
            return (Criteria) this;
        }

        public Criteria andEncryptSaltBetween(String value1, String value2) {
            addCriterion("BAU_ENCRYPT_SALT between", value1, value2, "encryptSalt");
            return (Criteria) this;
        }

        public Criteria andEncryptSaltNotBetween(String value1, String value2) {
            addCriterion("BAU_ENCRYPT_SALT not between", value1, value2, "encryptSalt");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("BAU_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("BAU_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("BAU_CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("BAU_CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("BAU_CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BAU_CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("BAU_CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("BAU_CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("BAU_CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("BAU_CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("BAU_CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("BAU_CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIsNull() {
            addCriterion("BAU_OPERATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIsNotNull() {
            addCriterion("BAU_OPERATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOperateTimeEqualTo(Date value) {
            addCriterion("BAU_OPERATE_TIME =", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotEqualTo(Date value) {
            addCriterion("BAU_OPERATE_TIME <>", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeGreaterThan(Date value) {
            addCriterion("BAU_OPERATE_TIME >", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BAU_OPERATE_TIME >=", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeLessThan(Date value) {
            addCriterion("BAU_OPERATE_TIME <", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeLessThanOrEqualTo(Date value) {
            addCriterion("BAU_OPERATE_TIME <=", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIn(List<Date> values) {
            addCriterion("BAU_OPERATE_TIME in", values, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotIn(List<Date> values) {
            addCriterion("BAU_OPERATE_TIME not in", values, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeBetween(Date value1, Date value2) {
            addCriterion("BAU_OPERATE_TIME between", value1, value2, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotBetween(Date value1, Date value2) {
            addCriterion("BAU_OPERATE_TIME not between", value1, value2, "operateTime");
            return (Criteria) this;
        }

        public Criteria andActivateTimeIsNull() {
            addCriterion("BAU_ACTIVATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andActivateTimeIsNotNull() {
            addCriterion("BAU_ACTIVATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andActivateTimeEqualTo(Date value) {
            addCriterion("BAU_ACTIVATE_TIME =", value, "activateTime");
            return (Criteria) this;
        }

        public Criteria andActivateTimeNotEqualTo(Date value) {
            addCriterion("BAU_ACTIVATE_TIME <>", value, "activateTime");
            return (Criteria) this;
        }

        public Criteria andActivateTimeGreaterThan(Date value) {
            addCriterion("BAU_ACTIVATE_TIME >", value, "activateTime");
            return (Criteria) this;
        }

        public Criteria andActivateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BAU_ACTIVATE_TIME >=", value, "activateTime");
            return (Criteria) this;
        }

        public Criteria andActivateTimeLessThan(Date value) {
            addCriterion("BAU_ACTIVATE_TIME <", value, "activateTime");
            return (Criteria) this;
        }

        public Criteria andActivateTimeLessThanOrEqualTo(Date value) {
            addCriterion("BAU_ACTIVATE_TIME <=", value, "activateTime");
            return (Criteria) this;
        }

        public Criteria andActivateTimeIn(List<Date> values) {
            addCriterion("BAU_ACTIVATE_TIME in", values, "activateTime");
            return (Criteria) this;
        }

        public Criteria andActivateTimeNotIn(List<Date> values) {
            addCriterion("BAU_ACTIVATE_TIME not in", values, "activateTime");
            return (Criteria) this;
        }

        public Criteria andActivateTimeBetween(Date value1, Date value2) {
            addCriterion("BAU_ACTIVATE_TIME between", value1, value2, "activateTime");
            return (Criteria) this;
        }

        public Criteria andActivateTimeNotBetween(Date value1, Date value2) {
            addCriterion("BAU_ACTIVATE_TIME not between", value1, value2, "activateTime");
            return (Criteria) this;
        }

        public Criteria andPasswordModifyTimeIsNull() {
            addCriterion("BAU_PASSWORD_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPasswordModifyTimeIsNotNull() {
            addCriterion("BAU_PASSWORD_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordModifyTimeEqualTo(Date value) {
            addCriterion("BAU_PASSWORD_MODIFY_TIME =", value, "passwordModifyTime");
            return (Criteria) this;
        }

        public Criteria andPasswordModifyTimeNotEqualTo(Date value) {
            addCriterion("BAU_PASSWORD_MODIFY_TIME <>", value, "passwordModifyTime");
            return (Criteria) this;
        }

        public Criteria andPasswordModifyTimeGreaterThan(Date value) {
            addCriterion("BAU_PASSWORD_MODIFY_TIME >", value, "passwordModifyTime");
            return (Criteria) this;
        }

        public Criteria andPasswordModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BAU_PASSWORD_MODIFY_TIME >=", value, "passwordModifyTime");
            return (Criteria) this;
        }

        public Criteria andPasswordModifyTimeLessThan(Date value) {
            addCriterion("BAU_PASSWORD_MODIFY_TIME <", value, "passwordModifyTime");
            return (Criteria) this;
        }

        public Criteria andPasswordModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("BAU_PASSWORD_MODIFY_TIME <=", value, "passwordModifyTime");
            return (Criteria) this;
        }

        public Criteria andPasswordModifyTimeIn(List<Date> values) {
            addCriterion("BAU_PASSWORD_MODIFY_TIME in", values, "passwordModifyTime");
            return (Criteria) this;
        }

        public Criteria andPasswordModifyTimeNotIn(List<Date> values) {
            addCriterion("BAU_PASSWORD_MODIFY_TIME not in", values, "passwordModifyTime");
            return (Criteria) this;
        }

        public Criteria andPasswordModifyTimeBetween(Date value1, Date value2) {
            addCriterion("BAU_PASSWORD_MODIFY_TIME between", value1, value2, "passwordModifyTime");
            return (Criteria) this;
        }

        public Criteria andPasswordModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("BAU_PASSWORD_MODIFY_TIME not between", value1, value2, "passwordModifyTime");
            return (Criteria) this;
        }
    }

    /**
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * @mbggenerated
     */
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