package com.ldsh.blog.system.service;

import com.github.pagehelper.PageInfo;
import com.ldsh.blog.system.model.Category;

import java.util.List;

/**
 * 描述：类别service接口
 */
public interface ICategoryService {

    /**
     * 描述：保存类别
     *
     * @param category 类别对象
     * @return true: 保存成功  false :保存失败
     * @throws Exception
     */
    boolean save(Category category) throws Exception;

    /**
     * 描述：分页获取列表
     *
     * @return 类别分页 数据
     * @throws Exception
     */
    PageInfo<Category> getList(int pageNum, int pageSize) throws Exception;

    /**
     * 描述：删除类别
     *
     * @param id 类别唯一标识
     * @return true：删除成功  false：删除失败
     * @throws Exception
     */
    boolean remove(String id) throws Exception;

    /**
     * 描述：批量删除类别
     *
     * @param categoryIds 类别id集合
     * @return
     * @throws Exception
     */
    boolean batchRemove(List<String> categoryIds) throws Exception;

    /**
     * 描述：获取类别
     *
     * @param id 类别唯一标识
     * @return 类别对象
     * @throws Exception
     */
    Category getLabel(String id) throws Exception;

    /**
     * 描述：获取所有类别
     *
     * @return
     * @throws Exception
     */
    List<Category> getAll() throws Exception;
}
