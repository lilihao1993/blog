package com.ldsh.blog.system.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ldsh.blog.system.dto.ArticleDto;
import com.ldsh.blog.system.dto.ClinetArticleDto;
import com.ldsh.blog.system.mapper.ArticleMapper;
import com.ldsh.blog.system.model.Article;
import com.ldsh.blog.system.model.ArticleExample;
import com.ldsh.blog.system.model.Category;
import com.ldsh.blog.system.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;

/**
 * Created by Administrator on 2017/3/22.
 */

@Service
public class ArticleServiceImpl implements IArticleService {

    /**
     * 注入
     */
    @Autowired
    private ArticleMapper articleMapper;


    /**
     * 描述：admin 分页查询文章列表
     *
     * @param map 查询参数
     * @return
     */
    @Override
    public PageInfo<ArticleDto> selectArticles(Map<String, Object> map) {
        PageHelper.startPage((int) map.get("pageNum"), (int) map.get("pageSize"));
        Page<ArticleDto> articleInfo = (Page<ArticleDto>) articleMapper.adminSelectArticles(map);
        return articleInfo.toPageInfo();
    }

    /**
     * 描述 client 分页查询文章列表
     *
     * @param map 用户id
     * @return
     */
    @Override
    public PageInfo<ClinetArticleDto> selectArticlesByUserId(Map<String, Object> map) {
        PageHelper.startPage((int) map.get("pageNum"), (int) map.get("pageSize"));
        Page<ClinetArticleDto> articleInfo = (Page<ClinetArticleDto>) articleMapper.clientSelectArticles(map);
        return articleInfo.toPageInfo();
    }

    /**
     * 描述：修改文章状态
     *
     * @param article 文章对象
     * @return
     */
    @Override
    public boolean modify(Article article) {
        article.setOperateTime(new Date());
        return articleMapper.updateByPrimaryKeySelective(article) > 0 ? true : false;
    }

    /**
     * 描述：根据id删除文章
     *
     * @param id 文章id
     * @return
     */
    @Override
    public boolean deleteById(String id) {
        return articleMapper.deleteByPrimaryKey(id) > 0 ? true : false;
    }

    /**
     * 描述：根据id查询文章
     *
     * @param id 文章id
     * @return
     */
    @Override
    public Article selectById(String id) {
        return articleMapper.selectByPrimaryKey(id);
    }

    /**
     * 描述：新增文章
     *
     * @param article 文章对象
     * @return
     */
    @Override
    public boolean add(Article article) {
        //1.为文章添加默认值
        //(1)默认可见
        article.setStatus("1");
        //(2)默认为非热门
        article.setHot("0");
        //(3)设置创建时间与操作时间
        article.setCreateTime(new Date());
        article.setOperateTime(article.getCreateTime());
        return articleMapper.insert(article) > 0 ? true : false;
    }

    /**
     * 描述：根据id获取文章DTO
     *
     * @param id 文章id
     * @return
     */
    @Override
    public ArticleDto selectArticleDtoById(String id) {
        return articleMapper.selectArticleDtoById(id);
    }
}
