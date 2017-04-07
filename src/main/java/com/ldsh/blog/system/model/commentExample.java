package com.ldsh.blog.system.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class commentExample {
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
    public commentExample() {
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

        public Criteria andClientUserIdIsNull() {
            addCriterion("BC_CLIENT_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andClientUserIdIsNotNull() {
            addCriterion("BC_CLIENT_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andClientUserIdEqualTo(String value) {
            addCriterion("BC_CLIENT_USER_ID =", value, "clientUserId");
            return (Criteria) this;
        }

        public Criteria andClientUserIdNotEqualTo(String value) {
            addCriterion("BC_CLIENT_USER_ID <>", value, "clientUserId");
            return (Criteria) this;
        }

        public Criteria andClientUserIdGreaterThan(String value) {
            addCriterion("BC_CLIENT_USER_ID >", value, "clientUserId");
            return (Criteria) this;
        }

        public Criteria andClientUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("BC_CLIENT_USER_ID >=", value, "clientUserId");
            return (Criteria) this;
        }

        public Criteria andClientUserIdLessThan(String value) {
            addCriterion("BC_CLIENT_USER_ID <", value, "clientUserId");
            return (Criteria) this;
        }

        public Criteria andClientUserIdLessThanOrEqualTo(String value) {
            addCriterion("BC_CLIENT_USER_ID <=", value, "clientUserId");
            return (Criteria) this;
        }

        public Criteria andClientUserIdLike(String value) {
            addCriterion("BC_CLIENT_USER_ID like", value, "clientUserId");
            return (Criteria) this;
        }

        public Criteria andClientUserIdNotLike(String value) {
            addCriterion("BC_CLIENT_USER_ID not like", value, "clientUserId");
            return (Criteria) this;
        }

        public Criteria andClientUserIdIn(List<String> values) {
            addCriterion("BC_CLIENT_USER_ID in", values, "clientUserId");
            return (Criteria) this;
        }

        public Criteria andClientUserIdNotIn(List<String> values) {
            addCriterion("BC_CLIENT_USER_ID not in", values, "clientUserId");
            return (Criteria) this;
        }

        public Criteria andClientUserIdBetween(String value1, String value2) {
            addCriterion("BC_CLIENT_USER_ID between", value1, value2, "clientUserId");
            return (Criteria) this;
        }

        public Criteria andClientUserIdNotBetween(String value1, String value2) {
            addCriterion("BC_CLIENT_USER_ID not between", value1, value2, "clientUserId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNull() {
            addCriterion("BC_ARTICLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNotNull() {
            addCriterion("BC_ARTICLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andArticleIdEqualTo(String value) {
            addCriterion("BC_ARTICLE_ID =", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotEqualTo(String value) {
            addCriterion("BC_ARTICLE_ID <>", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThan(String value) {
            addCriterion("BC_ARTICLE_ID >", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThanOrEqualTo(String value) {
            addCriterion("BC_ARTICLE_ID >=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThan(String value) {
            addCriterion("BC_ARTICLE_ID <", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThanOrEqualTo(String value) {
            addCriterion("BC_ARTICLE_ID <=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLike(String value) {
            addCriterion("BC_ARTICLE_ID like", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotLike(String value) {
            addCriterion("BC_ARTICLE_ID not like", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIn(List<String> values) {
            addCriterion("BC_ARTICLE_ID in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotIn(List<String> values) {
            addCriterion("BC_ARTICLE_ID not in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdBetween(String value1, String value2) {
            addCriterion("BC_ARTICLE_ID between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotBetween(String value1, String value2) {
            addCriterion("BC_ARTICLE_ID not between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("BC_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("BC_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("BC_CONTENT =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("BC_CONTENT <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("BC_CONTENT >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("BC_CONTENT >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("BC_CONTENT <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("BC_CONTENT <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("BC_CONTENT like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("BC_CONTENT not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("BC_CONTENT in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("BC_CONTENT not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("BC_CONTENT between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("BC_CONTENT not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("BC_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("BC_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("BC_CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("BC_CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("BC_CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BC_CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("BC_CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("BC_CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("BC_CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("BC_CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("BC_CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("BC_CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIsNull() {
            addCriterion("BC_OPERATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIsNotNull() {
            addCriterion("BC_OPERATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOperateTimeEqualTo(Date value) {
            addCriterion("BC_OPERATE_TIME =", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotEqualTo(Date value) {
            addCriterion("BC_OPERATE_TIME <>", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeGreaterThan(Date value) {
            addCriterion("BC_OPERATE_TIME >", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BC_OPERATE_TIME >=", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeLessThan(Date value) {
            addCriterion("BC_OPERATE_TIME <", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeLessThanOrEqualTo(Date value) {
            addCriterion("BC_OPERATE_TIME <=", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIn(List<Date> values) {
            addCriterion("BC_OPERATE_TIME in", values, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotIn(List<Date> values) {
            addCriterion("BC_OPERATE_TIME not in", values, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeBetween(Date value1, Date value2) {
            addCriterion("BC_OPERATE_TIME between", value1, value2, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotBetween(Date value1, Date value2) {
            addCriterion("BC_OPERATE_TIME not between", value1, value2, "operateTime");
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