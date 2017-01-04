package com.ldsh.blog.system.service;

import com.ldsh.blog.system.model.AdminUser;
import com.ldsh.blog.system.model.ClientUser;

import java.util.List;

/**
 * 客户端 用户service
 */
public interface IClientUserService {


    /**
     * 描述：保存用户
     *
     * @param clientUser 用户对象
     * @return
     * @throws Exception
     */
    boolean addUser(ClientUser clientUser) throws Exception;


    /**
     * 描述：根据id操作用户
     *
     * @param id 用户id
     * @return
     * @throws Exception
     */
    ClientUser selectById(String id) throws Exception;

    /**
     * 描述：判断邮箱是否已被注册
     *
     * @param email 邮箱地址
     * @return
     * @throws Exception
     */
    boolean isEmailExist(String email) throws Exception;

    /**
     * 描述：根据用户名称获取用户
     *
     * @param userName 用户名称
     * @return
     * @throws Exception
     */
    List<ClientUser> isUserNameExist(String userName) throws Exception;

    /**
     * 描述：更新用户信息
     *
     * @param clientUser 后台用户
     * @return
     * @throws Exception
     */
    boolean modifyUser(ClientUser clientUser) throws Exception;
}
