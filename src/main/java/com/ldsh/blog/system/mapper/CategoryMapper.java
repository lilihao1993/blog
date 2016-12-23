package com.ldsh.blog.system.mapper;

import com.ldsh.blog.system.model.Category;
import com.ldsh.blog.system.model.CategoryExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CategoryMapper {
    /**
     * @mbggenerated
     */
    int countByExample(CategoryExample example);

    /**
     * @mbggenerated
     */
    int deleteByExample(CategoryExample example);

    /**
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * @mbggenerated
     */
    int insert(Category record);

    /**
     * @mbggenerated
     */
    int insertSelective(Category record);

    /**
     * @mbggenerated
     */
    List<Category> selectByExample(CategoryExample example);

    /**
     * @mbggenerated
     */
    Category selectByPrimaryKey(String id);

    /**
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Category record, @Param("example") CategoryExample example);

    /**
     * @mbggenerated
     */
    int updateByExample(@Param("record") Category record, @Param("example") CategoryExample example);

    /**
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Category record);

    /**
     * @mbggenerated
     */
    int updateByPrimaryKey(Category record);

    /**
     * 描述：批量删除类别列表
     *
     * @param categoryIds
     */
    int batchRemoveCategory(List<String> categoryIds);
}