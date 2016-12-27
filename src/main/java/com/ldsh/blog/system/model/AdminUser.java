package com.ldsh.blog.system.model;

import java.util.Date;

public class AdminUser {
    /**
     * 唯一标识, 所属表字段为blog_admin_user.ID
     * @mbggenerated
     */
    private String id;

    /**
     * 用户名, 所属表字段为blog_admin_user.BAU_USER_NAME
     * @mbggenerated
     */
    private String userName;

    /**
     * 密码, 所属表字段为blog_admin_user.BAU_PASSWORD
     * @mbggenerated
     */
    private String password;

    /**
     * 姓名, 所属表字段为blog_admin_user.BAU_NAME
     * @mbggenerated
     */
    private String name;

    /**
     * 性别(0:女 1:男), 所属表字段为blog_admin_user.BAU_SEX
     * @mbggenerated
     */
    private String sex;

    /**
     * 地址, 所属表字段为blog_admin_user.BAU_ADDRESS
     * @mbggenerated
     */
    private String address;

    /**
     * 生日, 所属表字段为blog_admin_user.BAU_DIRTHDAY
     * @mbggenerated
     */
    private Date dirthday;

    /**
     * 手机号, 所属表字段为blog_admin_user.BAU_MOBILE
     * @mbggenerated
     */
    private String mobile;

    /**
     * 邮箱, 所属表字段为blog_admin_user.BAU_MAIL
     * @mbggenerated
     */
    private String mail;

    /**
     * 微信号, 所属表字段为blog_admin_user.BAU_WECHAT
     * @mbggenerated
     */
    private String wechat;

    /**
     * 描述, 所属表字段为blog_admin_user.BAU_SKETCH
     * @mbggenerated
     */
    private String sketch;

    /**
     * 用户状态（0：正常 ，1：锁定）, 所属表字段为blog_admin_user.BAU_STATUS
     * @mbggenerated
     */
    private String status;

    /**
     * 加盐值, 所属表字段为blog_admin_user.BAU_ENCRYPT_SALT
     * @mbggenerated
     */
    private String encryptSalt;

    /**
     * 创建时间, 所属表字段为blog_admin_user.BAU_CREATE_TIME
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 操作时间, 所属表字段为blog_admin_user.BAU_OPERATE_TIME
     * @mbggenerated
     */
    private Date operateTime;

    /**
     * 激活时间, 所属表字段为blog_admin_user.BAU_ACTIVATE_TIME
     * @mbggenerated
     */
    private Date activateTime;

    /**
     * 密码修改时间, 所属表字段为blog_admin_user.BAU_PASSWORD_MODIFY_TIME
     * @mbggenerated
     */
    private Date passwordModifyTime;

    /**
     * 返回列值： blog_admin_user.ID
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * 设置列值：blog_admin_user.ID
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 返回列值： blog_admin_user.BAU_USER_NAME
     * @mbggenerated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置列值：blog_admin_user.BAU_USER_NAME
     * @mbggenerated
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 返回列值： blog_admin_user.BAU_PASSWORD
     * @mbggenerated
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置列值：blog_admin_user.BAU_PASSWORD
     * @mbggenerated
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 返回列值： blog_admin_user.BAU_NAME
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * 设置列值：blog_admin_user.BAU_NAME
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 返回列值： blog_admin_user.BAU_SEX
     * @mbggenerated
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置列值：blog_admin_user.BAU_SEX
     * @mbggenerated
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 返回列值： blog_admin_user.BAU_ADDRESS
     * @mbggenerated
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置列值：blog_admin_user.BAU_ADDRESS
     * @mbggenerated
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 返回列值： blog_admin_user.BAU_DIRTHDAY
     * @mbggenerated
     */
    public Date getDirthday() {
        return dirthday;
    }

    /**
     * 设置列值：blog_admin_user.BAU_DIRTHDAY
     * @mbggenerated
     */
    public void setDirthday(Date dirthday) {
        this.dirthday = dirthday;
    }

    /**
     * 返回列值： blog_admin_user.BAU_MOBILE
     * @mbggenerated
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置列值：blog_admin_user.BAU_MOBILE
     * @mbggenerated
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 返回列值： blog_admin_user.BAU_MAIL
     * @mbggenerated
     */
    public String getMail() {
        return mail;
    }

    /**
     * 设置列值：blog_admin_user.BAU_MAIL
     * @mbggenerated
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * 返回列值： blog_admin_user.BAU_WECHAT
     * @mbggenerated
     */
    public String getWechat() {
        return wechat;
    }

    /**
     * 设置列值：blog_admin_user.BAU_WECHAT
     * @mbggenerated
     */
    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    /**
     * 返回列值： blog_admin_user.BAU_SKETCH
     * @mbggenerated
     */
    public String getSketch() {
        return sketch;
    }

    /**
     * 设置列值：blog_admin_user.BAU_SKETCH
     * @mbggenerated
     */
    public void setSketch(String sketch) {
        this.sketch = sketch;
    }

    /**
     * 返回列值： blog_admin_user.BAU_STATUS
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置列值：blog_admin_user.BAU_STATUS
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 返回列值： blog_admin_user.BAU_ENCRYPT_SALT
     * @mbggenerated
     */
    public String getEncryptSalt() {
        return encryptSalt;
    }

    /**
     * 设置列值：blog_admin_user.BAU_ENCRYPT_SALT
     * @mbggenerated
     */
    public void setEncryptSalt(String encryptSalt) {
        this.encryptSalt = encryptSalt;
    }

    /**
     * 返回列值： blog_admin_user.BAU_CREATE_TIME
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置列值：blog_admin_user.BAU_CREATE_TIME
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 返回列值： blog_admin_user.BAU_OPERATE_TIME
     * @mbggenerated
     */
    public Date getOperateTime() {
        return operateTime;
    }

    /**
     * 设置列值：blog_admin_user.BAU_OPERATE_TIME
     * @mbggenerated
     */
    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    /**
     * 返回列值： blog_admin_user.BAU_ACTIVATE_TIME
     * @mbggenerated
     */
    public Date getActivateTime() {
        return activateTime;
    }

    /**
     * 设置列值：blog_admin_user.BAU_ACTIVATE_TIME
     * @mbggenerated
     */
    public void setActivateTime(Date activateTime) {
        this.activateTime = activateTime;
    }

    /**
     * 返回列值： blog_admin_user.BAU_PASSWORD_MODIFY_TIME
     * @mbggenerated
     */
    public Date getPasswordModifyTime() {
        return passwordModifyTime;
    }

    /**
     * 设置列值：blog_admin_user.BAU_PASSWORD_MODIFY_TIME
     * @mbggenerated
     */
    public void setPasswordModifyTime(Date passwordModifyTime) {
        this.passwordModifyTime = passwordModifyTime;
    }
}