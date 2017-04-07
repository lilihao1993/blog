package com.ldsh.blog.system.mapper;

import com.ldsh.blog.system.model.comment;
import com.ldsh.blog.system.model.commentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface commentMapper {
    /**
     * @mbggenerated
     */
    int countByExample(commentExample example);

    /**
     * @mbggenerated
     */
    int deleteByExample(commentExample example);

    /**
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * @mbggenerated
     */
    int insert(comment record);

    /**
     * @mbggenerated
     */
    int insertSelective(comment record);

    /**
     * @mbggenerated
     */
    List<comment> selectByExample(commentExample example);

    /**
     * @mbggenerated
     */
    comment selectByPrimaryKey(String id);

    /**
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") comment record, @Param("example") commentExample example);

    /**
     * @mbggenerated
     */
    int updateByExample(@Param("record") comment record, @Param("example") commentExample example);

    /**
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(comment record);

    /**
     * @mbggenerated
     */
    int updateByPrimaryKey(comment record);
}