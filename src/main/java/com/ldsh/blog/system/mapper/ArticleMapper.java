package com.ldsh.blog.system.mapper;

import com.ldsh.blog.system.dto.ArticleDto;
import com.ldsh.blog.system.model.Article;
import com.ldsh.blog.system.model.ArticleExample;

import java.util.List;
import java.util.Map;

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

    /**
     * 描述：查询文章列表
     *
     * @param map 查询参数
     * @return
     */
    List<ArticleDto> selectArticles(Map<String, Object> map);

    /**
     * 描述：根据id获取文章dto
     *
     * @param id id
     * @return
     */
    ArticleDto selectArticleDtoById(@Param("id") String id);
}