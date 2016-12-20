package com.ldsh.blog.system.model;

public class Category {
    /**
     * 唯一标识, 所属表字段为blog_category.ID
     * @mbggenerated
     */
    private String id;

    /**
     * 类别名称, 所属表字段为blog_category.BC_NAME
     * @mbggenerated
     */
    private String name;

    /**
     * 排序, 所属表字段为blog_category.BC_ORDER_NUMBER
     * @mbggenerated
     */
    private Integer orderNumber;

    /**
     * 返回列值： blog_category.ID
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * 设置列值：blog_category.ID
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 返回列值： blog_category.BC_NAME
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * 设置列值：blog_category.BC_NAME
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 返回列值： blog_category.BC_ORDER_NUMBER
     * @mbggenerated
     */
    public Integer getOrderNumber() {
        return orderNumber;
    }

    /**
     * 设置列值：blog_category.BC_ORDER_NUMBER
     * @mbggenerated
     */
    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }
}