package com.ldsh.blog.system.service.impl;

import com.ldsh.blog.common.util.EncryptUtils;
import com.ldsh.blog.system.mapper.ClientUserMapper;
import com.ldsh.blog.system.model.ClientUser;
import com.ldsh.blog.system.model.ClientUserExample;
import com.ldsh.blog.system.service.IClientUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 描述:客户端 用户实现类
 */
@Service
public class ClientUserServiceImpl implements IClientUserService {
    /**
     * mapper注入
     */
    @Autowired
    private ClientUserMapper clientUserMapper;

    /**
     * 描述：保存用户
     *
     * @param clientUser 用户对象
     * @return true:保存成功 false:保存失败
     * @throws Exception
     */
    @Override
    public boolean addUser(ClientUser clientUser) throws Exception {
        EncryptUtils.clientEncryptPassword(clientUser);
        clientUser.setCreateTime(new Date());
        clientUser.setOperateTime(clientUser.getCreateTime());
        return clientUserMapper.insert(clientUser) > 0 ? true : false;
    }

    /**
     * 描述：根据id查找用户
     *
     * @param id 用户id
     * @return
     * @throws Exception
     */
    @Override
    public ClientUser selectById(String id) throws Exception {
        return clientUserMapper.selectByPrimaryKey(id);
    }

    /**
     * 描述:根据用户名称获取用户
     *
     * @param userName 用户名称
     * @return List 用户列表
     * @throws Exception
     */
    @Override
    public List<ClientUser> isUserNameExist(String userName) throws Exception {
        ClientUserExample clientUserExample = new ClientUserExample();
        clientUserExample.createCriteria().andUserNameEqualTo(userName);
        return clientUserMapper.selectByExample(clientUserExample);
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
        ClientUserExample cdminUserExample = new ClientUserExample();
        cdminUserExample.createCriteria().andMailEqualTo(email);
        List<ClientUser> users = clientUserMapper.selectByExample(cdminUserExample);
        return users.size() > 0 ? true : false;
    }

    /**
     * 描述：更新用户信息
     *
     * @param clientUser 用户对象
     * @return
     * @throws Exception
     */
    @Override
    public boolean modifyUser(ClientUser clientUser) throws Exception {
        return clientUserMapper.updateByPrimaryKeySelective(clientUser) > 0 ? true : false;
    }
}
