package com.ldsh.blog.system.mapper;

import com.ldsh.blog.system.model.AdminUser;
import com.ldsh.blog.system.model.AdminUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminUserMapper {
    /**
     * @mbggenerated
     */
    int countByExample(AdminUserExample example);

    /**
     * @mbggenerated
     */
    int deleteByExample(AdminUserExample example);

    /**
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * @mbggenerated
     */
    int insert(AdminUser record);

    /**
     * @mbggenerated
     */
    int insertSelective(AdminUser record);

    /**
     * @mbggenerated
     */
    List<AdminUser> selectByExample(AdminUserExample example);

    /**
     * @mbggenerated
     */
    AdminUser selectByPrimaryKey(String id);

    /**
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") AdminUser record, @Param("example") AdminUserExample example);

    /**
     * @mbggenerated
     */
    int updateByExample(@Param("record") AdminUser record, @Param("example") AdminUserExample example);

    /**
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AdminUser record);

    /**
     * @mbggenerated
     */
    int updateByPrimaryKey(AdminUser record);
}