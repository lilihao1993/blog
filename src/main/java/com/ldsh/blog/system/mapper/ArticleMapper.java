package com.ldsh.blog.system.mapper;

import com.ldsh.blog.system.model.Article;
import com.ldsh.blog.system.model.ArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleMapper {
    /**
     * @mbggenerated
     */
    int countByExample(ArticleExample example);

    /**
     * @mbggenerated
     */
    int deleteByExample(ArticleExample example);

    /**
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * @mbggenerated
     */
    int insert(Article record);

    /**
     * @mbggenerated
     */
    int insertSelective(Article record);

    /**
     * @mbggenerated
     */
    List<Article> selectByExampleWithBLOBs(ArticleExample example);

    /**
     * @mbggenerated
     */
    List<Article> selectByExample(ArticleExample example);

    /**
     * @mbggenerated
     */
    Article selectByPrimaryKey(String id);

    /**
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Article record, @Param("example") ArticleExample example);

    /**
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") Article record, @Param("example") ArticleExample example);

    /**
     * @mbggenerated
     */
    int updateByExample(@Param("record") Article record, @Param("example") ArticleExample example);

    /**
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Article record);

    /**
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(Article record);

    /**
     * @mbggenerated
     */
    int updateByPrimaryKey(Article record);
}