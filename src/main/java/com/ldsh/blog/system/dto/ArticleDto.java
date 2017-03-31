package com.ldsh.blog.system.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2017/3/22.
 */
public class ArticleDto {
    /**
     * 文章id
     */
    private String articleId;
    /**
     * 类别id
     */
    private String categoryId;
    /**
     * 类别名称
     */
    private String categoryName;
    /**
     * 用户真实姓名
     */
    private String name;
    /**
     * 用户名称
     */
    private String userName;
    /**
     * 文章标题
     */
    private String title;
    /**
     * 文章状态：（0：不可见，1：可见，2：非法文章）
     */
    private String status;
    /**
     * 是否为热门文章：（0：非热门文章 1：热门文章）
     */
    private String hot;
    /**
     * 文章创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date  createTime;

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getHot() {
        return hot;
    }

    public void setHot(String hot) {
        this.hot = hot;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
