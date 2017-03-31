package com.ldsh.blog.system.service;

import com.github.pagehelper.PageInfo;
import com.ldsh.blog.system.dto.ArticleDto;
import com.ldsh.blog.system.model.Article;

import java.util.Map;

/**
 * Created by Administrator on 2017/3/22.
 */
public interface IArticleService {

    /**
     * 描述：分页查询文章列表
     *
     * @param map 查询参数
     * @return
     */
    PageInfo<ArticleDto> selectArticles(Map<String, Object> map);

    /**
     * 描述：修改文章状态
     *
     * @param article 文章对象
     * @return
     */
    boolean modify(Article article);

    /**
     * 描述：根据id删除文章
     *
     * @param id 文章id
     * @return
     */
    boolean deleteById(String id);

    /**
     * 描述：根据id查询文章
     *
     * @param id 文章id
     * @return
     */
    Article selectById(String id);

    /**
     * 描述：新增文章
     *
     * @param article 文章对象
     * @return
     */
    boolean add(Article article);

    /**
     * 描述：根据id获取文章dto
     *
     * @param id 文章id
     * @return
     */
    ArticleDto selectArticleDtoById(String id);
}
