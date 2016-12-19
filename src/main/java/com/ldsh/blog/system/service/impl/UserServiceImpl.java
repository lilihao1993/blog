package com.ldsh.blog.system.service.impl;

import com.ldsh.blog.common.util.EncryptUtils;
import com.ldsh.blog.system.mapper.UserMapper;
import com.ldsh.blog.system.model.User;
import com.ldsh.blog.system.model.UserExample;
import com.ldsh.blog.system.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 描述：service 实现
 */
@Service
public class UserServiceImpl implements IUserService {

    /**
     * mapper注入
     */
    @Autowired
    private UserMapper userMapper;

    /**
     * 描述：保存用户
     *
     * @param user 用户对象
     * @return true:保存成功 false:保存失败
     * @throws Exception
     */
    @Override
    public boolean addUser(User user) throws Exception {
        EncryptUtils.encryptPassword(user);
        user.setCreateTime(new Date());
        user.setOperateTime(user.getCreateTime());
        return userMapper.insert(user) > 0 ? true : false;
    }

    /**
     * 描述：根据id查找用户
     *
     * @param id 用户id
     * @return
     * @throws Exception
     */
    @Override
    public User selectById(String id) throws Exception {
        return userMapper.selectByPrimaryKey(id);
    }

    /**
     * 描述:根据用户名称获取用户
     *
     * @param userName 用户名称
     * @return List 用户列表
     * @throws Exception
     */
    @Override
    public List<User> isUserNameExist(String userName) throws Exception {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserNameEqualTo(userName);
        return userMapper.selectByExample(userExample);
    }

    /**
     * 描述：判断邮箱是否已存在
     *
     * @param email 邮箱地址
     * @return true:邮箱已注册 false：邮箱未注册
     * @throws Exception
     */
    @Override
    public boolean isEmailExist(String email) throws Exception {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andMailEqualTo(email);
        List<User> users = userMapper.selectByExample(userExample);
        return users.size() > 0 ? true : false;
    }

    /**
     * 描述：更新用户信息
     *
     * @param user 用户对象
     * @return
     * @throws Exception
     */
    @Override
    public boolean modifyUser(User user) throws Exception {
        return userMapper.updateByPrimaryKeySelective(user) > 0 ? true : false;
    }
}
