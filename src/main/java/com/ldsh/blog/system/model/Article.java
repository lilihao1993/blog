package com.ldsh.blog.system.model;

import java.util.Date;

public class Article {
    /**
     * 唯一标识, 所属表字段为blog_article.ID
     * @mbggenerated
     */
    private String id;

    /**
     * 标签id, 所属表字段为blog_article.BA_LABEL_ID
     * @mbggenerated
     */
    private String labelId;

    /**
     * 用户id, 所属表字段为blog_article.BA_USER_ID
     * @mbggenerated
     */
    private String userId;

    /**
     * 类别ID, 所属表字段为blog_article.BA_CATEGORY_ID
     * @mbggenerated
     */
    private String categoryId;

    /**
     * 标题, 所属表字段为blog_article.BA_TITLE
     * @mbggenerated
     */
    private String title;

    /**
     * 总结, 所属表字段为blog_article.BA_SUMMARY
     * @mbggenerated
     */
    private String summary;

    /**
     * 文章状态（0：不可见，1：可见，2：非法文章）, 所属表字段为blog_article.BA_STATUS
     * @mbggenerated
     */
    private String status;

    /**
     * 热门文章（0：非热门文章 1：热门文章）, 所属表字段为blog_article.BA_HOT
     * @mbggenerated
     */
    private String hot;

    /**
     * 创建时间, 所属表字段为blog_article.BA_CREATE_TIME
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 操作时间, 所属表字段为blog_article.BA_OPERATE_TIME
     * @mbggenerated
     */
    private Date operateTime;

    /**
     * 内容, 所属表字段为blog_article.BA_CONTENT
     * @mbggenerated
     */
    private String content;

    /**
     * 返回列值： blog_article.ID
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * 设置列值：blog_article.ID
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 返回列值： blog_article.BA_LABEL_ID
     * @mbggenerated
     */
    public String getLabelId() {
        return labelId;
    }

    /**
     * 设置列值：blog_article.BA_LABEL_ID
     * @mbggenerated
     */
    public void setLabelId(String labelId) {
        this.labelId = labelId;
    }

    /**
     * 返回列值： blog_article.BA_USER_ID
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置列值：blog_article.BA_USER_ID
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 返回列值： blog_article.BA_CATEGORY_ID
     * @mbggenerated
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * 设置列值：blog_article.BA_CATEGORY_ID
     * @mbggenerated
     */
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 返回列值： blog_article.BA_TITLE
     * @mbggenerated
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置列值：blog_article.BA_TITLE
     * @mbggenerated
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 返回列值： blog_article.BA_SUMMARY
     * @mbggenerated
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 设置列值：blog_article.BA_SUMMARY
     * @mbggenerated
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * 返回列值： blog_article.BA_STATUS
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置列值：blog_article.BA_STATUS
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 返回列值： blog_article.BA_HOT
     * @mbggenerated
     */
    public String getHot() {
        return hot;
    }

    /**
     * 设置列值：blog_article.BA_HOT
     * @mbggenerated
     */
    public void setHot(String hot) {
        this.hot = hot;
    }

    /**
     * 返回列值： blog_article.BA_CREATE_TIME
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置列值：blog_article.BA_CREATE_TIME
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 返回列值： blog_article.BA_OPERATE_TIME
     * @mbggenerated
     */
    public Date getOperateTime() {
        return operateTime;
    }

    /**
     * 设置列值：blog_article.BA_OPERATE_TIME
     * @mbggenerated
     */
    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    /**
     * 返回列值： blog_article.BA_CONTENT
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置列值：blog_article.BA_CONTENT
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content;
    }
}