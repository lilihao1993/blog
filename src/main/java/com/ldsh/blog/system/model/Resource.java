package com.ldsh.blog.system.model;

public class Resource {
    /**
     * 唯一标识, 所属表字段为blog_resource.ID
     * @mbggenerated
     */
    private String id;

    /**
     * 资源名称, 所属表字段为blog_resource.BR_NAME
     * @mbggenerated
     */
    private String name;

    /**
     * 资源地址, 所属表字段为blog_resource.BR_URL
     * @mbggenerated
     */
    private String url;

    /**
     * 状态0：显示 1：不显示 , 所属表字段为blog_resource.BR_STATUS
     * @mbggenerated
     */
    private String status;

    /**
     * （层级：0 顶级 1 子级） , 所属表字段为blog_resource.BR_LEVEL
     * @mbggenerated
     */
    private String level;

    /**
     * 父级ID, 所属表字段为blog_resource.BR_PARENT_ID
     * @mbggenerated
     */
    private String parentId;

    /**
     * 返回列值： blog_resource.ID
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * 设置列值：blog_resource.ID
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 返回列值： blog_resource.BR_NAME
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * 设置列值：blog_resource.BR_NAME
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 返回列值： blog_resource.BR_URL
     * @mbggenerated
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置列值：blog_resource.BR_URL
     * @mbggenerated
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 返回列值： blog_resource.BR_STATUS
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置列值：blog_resource.BR_STATUS
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 返回列值： blog_resource.BR_LEVEL
     * @mbggenerated
     */
    public String getLevel() {
        return level;
    }

    /**
     * 设置列值：blog_resource.BR_LEVEL
     * @mbggenerated
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * 返回列值： blog_resource.BR_PARENT_ID
     * @mbggenerated
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 设置列值：blog_resource.BR_PARENT_ID
     * @mbggenerated
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
}