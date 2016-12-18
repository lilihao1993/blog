package com.ldsh.blog.system.mapper;

import com.ldsh.blog.system.model.User;
import com.ldsh.blog.system.model.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     * @mbggenerated
     */
    int countByExample(UserExample example);

    /**
     * @mbggenerated
     */
    int deleteByExample(UserExample example);

    /**
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * @mbggenerated
     */
    int insert(User record);

    /**
     * @mbggenerated
     */
    int insertSelective(User record);

    /**
     * @mbggenerated
     */
    List<User> selectByExample(UserExample example);

    /**
     * @mbggenerated
     */
    User selectByPrimaryKey(String id);

    /**
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * @mbggenerated
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * @mbggenerated
     */
    int updateByPrimaryKey(User record);
}