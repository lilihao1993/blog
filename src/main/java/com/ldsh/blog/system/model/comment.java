package com.ldsh.blog.system.model;

import java.util.Date;

public class comment {
    /**
     * 唯一标识, 所属表字段为blog_comment.ID
     * @mbggenerated
     */
    private String id;

    /**
     * 客户端 用户id, 所属表字段为blog_comment.BC_CLIENT_USER_ID
     * @mbggenerated
     */
    private String clientUserId;

    /**
     * 文章id, 所属表字段为blog_comment.BC_ARTICLE_ID
     * @mbggenerated
     */
    private String articleId;

    /**
     * 内容, 所属表字段为blog_comment.BC_CONTENT
     * @mbggenerated
     */
    private String content;

    /**
     * 创建时间, 所属表字段为blog_comment.BC_CREATE_TIME
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 操作时间, 所属表字段为blog_comment.BC_OPERATE_TIME
     * @mbggenerated
     */
    private Date operateTime;

    /**
     * 返回列值： blog_comment.ID
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * 设置列值：blog_comment.ID
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 返回列值： blog_comment.BC_CLIENT_USER_ID
     * @mbggenerated
     */
    public String getClientUserId() {
        return clientUserId;
    }

    /**
     * 设置列值：blog_comment.BC_CLIENT_USER_ID
     * @mbggenerated
     */
    public void setClientUserId(String clientUserId) {
        this.clientUserId = clientUserId;
    }

    /**
     * 返回列值： blog_comment.BC_ARTICLE_ID
     * @mbggenerated
     */
    public String getArticleId() {
        return articleId;
    }

    /**
     * 设置列值：blog_comment.BC_ARTICLE_ID
     * @mbggenerated
     */
    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    /**
     * 返回列值： blog_comment.BC_CONTENT
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置列值：blog_comment.BC_CONTENT
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 返回列值： blog_comment.BC_CREATE_TIME
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置列值：blog_comment.BC_CREATE_TIME
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 返回列值： blog_comment.BC_OPERATE_TIME
     * @mbggenerated
     */
    public Date getOperateTime() {
        return operateTime;
    }

    /**
     * 设置列值：blog_comment.BC_OPERATE_TIME
     * @mbggenerated
     */
    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }
}