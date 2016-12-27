package com.ldsh.blog.system.service.impl;

import com.ldsh.blog.common.util.EncryptUtils;
import com.ldsh.blog.system.mapper.AdminUserMapper;
import com.ldsh.blog.system.model.AdminUser;
import com.ldsh.blog.system.model.AdminUserExample;
import com.ldsh.blog.system.service.IAdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 描述：service 实现
 */
@Service
public class AdminUserServiceImpl implements IAdminUserService {

    /**
     * mapper注入
     */
    @Autowired
    private AdminUserMapper adminUserMapper;

    /**
     * 描述：保存用户
     *
     * @param adminUser 用户对象
     * @return true:保存成功 false:保存失败
     * @throws Exception
     */
    @Override
    public boolean addUser(AdminUser adminUser) throws Exception {
        EncryptUtils.encryptPassword(adminUser);
        adminUser.setCreateTime(new Date());
        adminUser.setOperateTime(adminUser.getCreateTime());
        return adminUserMapper.insert(adminUser) > 0 ? true : false;
    }

    /**
     * 描述：根据id查找用户
     *
     * @param id 用户id
     * @return
     * @throws Exception
     */
    @Override
    public AdminUser selectById(String id) throws Exception {
        return adminUserMapper.selectByPrimaryKey(id);
    }

    /**
     * 描述:根据用户名称获取用户
     *
     * @param userName 用户名称
     * @return List 用户列表
     * @throws Exception
     */
    @Override
    public List<AdminUser> isUserNameExist(String userName) throws Exception {
        AdminUserExample AdminUserExample = new AdminUserExample();
        AdminUserExample.createCriteria().andUserNameEqualTo(userName);
        return adminUserMapper.selectByExample(AdminUserExample);
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
        AdminUserExample AdminUserExample = new AdminUserExample();
        AdminUserExample.createCriteria().andMailEqualTo(email);
        List<AdminUser> users = adminUserMapper.selectByExample(AdminUserExample);
        return users.size() > 0 ? true : false;
    }

    /**
     * 描述：更新用户信息
     *
     * @param adminUser 用户对象
     * @return
     * @throws Exception
     */
    @Override
    public boolean modifyUser(AdminUser adminUser) throws Exception {
        return adminUserMapper.updateByPrimaryKeySelective(adminUser) > 0 ? true : false;
    }
}
