package com.ldsh.blog.system.mapper;

import com.ldsh.blog.system.model.ClientUser;
import com.ldsh.blog.system.model.ClientUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClientUserMapper {
    /**
     * @mbggenerated
     */
    int countByExample(ClientUserExample example);

    /**
     * @mbggenerated
     */
    int deleteByExample(ClientUserExample example);

    /**
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * @mbggenerated
     */
    int insert(ClientUser record);

    /**
     * @mbggenerated
     */
    int insertSelective(ClientUser record);

    /**
     * @mbggenerated
     */
    List<ClientUser> selectByExample(ClientUserExample example);

    /**
     * @mbggenerated
     */
    ClientUser selectByPrimaryKey(String id);

    /**
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ClientUser record, @Param("example") ClientUserExample example);

    /**
     * @mbggenerated
     */
    int updateByExample(@Param("record") ClientUser record, @Param("example") ClientUserExample example);

    /**
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ClientUser record);

    /**
     * @mbggenerated
     */
    int updateByPrimaryKey(ClientUser record);
}