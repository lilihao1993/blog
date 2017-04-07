package com.ldsh.blog.system.dto;

import com.ldsh.blog.system.model.Article;

/**
 * Created by Administrator on 2017/4/7.
 */
public class ClinetArticleDto extends Article {

    /**
     * 评论数
     */
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
