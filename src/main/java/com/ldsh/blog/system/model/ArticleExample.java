package com.ldsh.blog.system.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleExample {
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
    public ArticleExample() {
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

        public Criteria andLabelIdIsNull() {
            addCriterion("BA_LABEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andLabelIdIsNotNull() {
            addCriterion("BA_LABEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLabelIdEqualTo(String value) {
            addCriterion("BA_LABEL_ID =", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdNotEqualTo(String value) {
            addCriterion("BA_LABEL_ID <>", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdGreaterThan(String value) {
            addCriterion("BA_LABEL_ID >", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdGreaterThanOrEqualTo(String value) {
            addCriterion("BA_LABEL_ID >=", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdLessThan(String value) {
            addCriterion("BA_LABEL_ID <", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdLessThanOrEqualTo(String value) {
            addCriterion("BA_LABEL_ID <=", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdLike(String value) {
            addCriterion("BA_LABEL_ID like", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdNotLike(String value) {
            addCriterion("BA_LABEL_ID not like", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdIn(List<String> values) {
            addCriterion("BA_LABEL_ID in", values, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdNotIn(List<String> values) {
            addCriterion("BA_LABEL_ID not in", values, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdBetween(String value1, String value2) {
            addCriterion("BA_LABEL_ID between", value1, value2, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdNotBetween(String value1, String value2) {
            addCriterion("BA_LABEL_ID not between", value1, value2, "labelId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("BA_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("BA_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("BA_USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("BA_USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("BA_USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("BA_USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("BA_USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("BA_USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("BA_USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("BA_USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("BA_USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("BA_USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("BA_USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("BA_USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("BA_CATEGORY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("BA_CATEGORY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(String value) {
            addCriterion("BA_CATEGORY_ID =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(String value) {
            addCriterion("BA_CATEGORY_ID <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(String value) {
            addCriterion("BA_CATEGORY_ID >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("BA_CATEGORY_ID >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(String value) {
            addCriterion("BA_CATEGORY_ID <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("BA_CATEGORY_ID <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLike(String value) {
            addCriterion("BA_CATEGORY_ID like", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotLike(String value) {
            addCriterion("BA_CATEGORY_ID not like", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<String> values) {
            addCriterion("BA_CATEGORY_ID in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<String> values) {
            addCriterion("BA_CATEGORY_ID not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(String value1, String value2) {
            addCriterion("BA_CATEGORY_ID between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(String value1, String value2) {
            addCriterion("BA_CATEGORY_ID not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("BA_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("BA_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("BA_TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("BA_TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("BA_TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("BA_TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("BA_TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("BA_TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("BA_TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("BA_TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("BA_TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("BA_TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("BA_TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("BA_TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNull() {
            addCriterion("BA_SUMMARY is null");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNotNull() {
            addCriterion("BA_SUMMARY is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryEqualTo(String value) {
            addCriterion("BA_SUMMARY =", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotEqualTo(String value) {
            addCriterion("BA_SUMMARY <>", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThan(String value) {
            addCriterion("BA_SUMMARY >", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("BA_SUMMARY >=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThan(String value) {
            addCriterion("BA_SUMMARY <", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThanOrEqualTo(String value) {
            addCriterion("BA_SUMMARY <=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLike(String value) {
            addCriterion("BA_SUMMARY like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotLike(String value) {
            addCriterion("BA_SUMMARY not like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryIn(List<String> values) {
            addCriterion("BA_SUMMARY in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotIn(List<String> values) {
            addCriterion("BA_SUMMARY not in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryBetween(String value1, String value2) {
            addCriterion("BA_SUMMARY between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotBetween(String value1, String value2) {
            addCriterion("BA_SUMMARY not between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andReadCountIsNull() {
            addCriterion("BA_READ_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andReadCountIsNotNull() {
            addCriterion("BA_READ_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andReadCountEqualTo(Integer value) {
            addCriterion("BA_READ_COUNT =", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountNotEqualTo(Integer value) {
            addCriterion("BA_READ_COUNT <>", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountGreaterThan(Integer value) {
            addCriterion("BA_READ_COUNT >", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("BA_READ_COUNT >=", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountLessThan(Integer value) {
            addCriterion("BA_READ_COUNT <", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountLessThanOrEqualTo(Integer value) {
            addCriterion("BA_READ_COUNT <=", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountIn(List<Integer> values) {
            addCriterion("BA_READ_COUNT in", values, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountNotIn(List<Integer> values) {
            addCriterion("BA_READ_COUNT not in", values, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountBetween(Integer value1, Integer value2) {
            addCriterion("BA_READ_COUNT between", value1, value2, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountNotBetween(Integer value1, Integer value2) {
            addCriterion("BA_READ_COUNT not between", value1, value2, "readCount");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("BA_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("BA_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("BA_STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("BA_STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("BA_STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("BA_STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("BA_STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("BA_STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("BA_STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("BA_STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("BA_STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("BA_STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("BA_STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("BA_STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andHotIsNull() {
            addCriterion("BA_HOT is null");
            return (Criteria) this;
        }

        public Criteria andHotIsNotNull() {
            addCriterion("BA_HOT is not null");
            return (Criteria) this;
        }

        public Criteria andHotEqualTo(String value) {
            addCriterion("BA_HOT =", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotNotEqualTo(String value) {
            addCriterion("BA_HOT <>", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotGreaterThan(String value) {
            addCriterion("BA_HOT >", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotGreaterThanOrEqualTo(String value) {
            addCriterion("BA_HOT >=", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotLessThan(String value) {
            addCriterion("BA_HOT <", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotLessThanOrEqualTo(String value) {
            addCriterion("BA_HOT <=", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotLike(String value) {
            addCriterion("BA_HOT like", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotNotLike(String value) {
            addCriterion("BA_HOT not like", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotIn(List<String> values) {
            addCriterion("BA_HOT in", values, "hot");
            return (Criteria) this;
        }

        public Criteria andHotNotIn(List<String> values) {
            addCriterion("BA_HOT not in", values, "hot");
            return (Criteria) this;
        }

        public Criteria andHotBetween(String value1, String value2) {
            addCriterion("BA_HOT between", value1, value2, "hot");
            return (Criteria) this;
        }

        public Criteria andHotNotBetween(String value1, String value2) {
            addCriterion("BA_HOT not between", value1, value2, "hot");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("BA_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("BA_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("BA_CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("BA_CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("BA_CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BA_CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("BA_CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("BA_CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("BA_CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("BA_CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("BA_CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("BA_CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIsNull() {
            addCriterion("BA_OPERATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIsNotNull() {
            addCriterion("BA_OPERATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOperateTimeEqualTo(Date value) {
            addCriterion("BA_OPERATE_TIME =", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotEqualTo(Date value) {
            addCriterion("BA_OPERATE_TIME <>", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeGreaterThan(Date value) {
            addCriterion("BA_OPERATE_TIME >", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BA_OPERATE_TIME >=", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeLessThan(Date value) {
            addCriterion("BA_OPERATE_TIME <", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeLessThanOrEqualTo(Date value) {
            addCriterion("BA_OPERATE_TIME <=", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIn(List<Date> values) {
            addCriterion("BA_OPERATE_TIME in", values, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotIn(List<Date> values) {
            addCriterion("BA_OPERATE_TIME not in", values, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeBetween(Date value1, Date value2) {
            addCriterion("BA_OPERATE_TIME between", value1, value2, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotBetween(Date value1, Date value2) {
            addCriterion("BA_OPERATE_TIME not between", value1, value2, "operateTime");
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