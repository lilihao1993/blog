package com.ldsh.blog.system.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ldsh.blog.system.mapper.CategoryMapper;
import com.ldsh.blog.system.model.Category;
import com.ldsh.blog.system.model.CategoryExample;
import com.ldsh.blog.system.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 描述：类别service实现类
 */
@Service
public class CategoryServiceImpl implements ICategoryService {

    /**
     * 描述：注入类别mapper
     */
    @Autowired
    private CategoryMapper categoryMapper;

    /**
     * 描述：新增/修改 类别
     *
     * @param category 类别对象
     * @return true：保存成功 false：保存失败
     * @throws Exception
     */
    @Override
    public boolean save(Category category) throws Exception {
        boolean flag = true;
        if (StringUtils.isEmpty(category.getId())) {
            flag = categoryMapper.insert(category) > 0 ? true : false;
        } else {
            flag = categoryMapper.updateByPrimaryKeySelective(category) > 0 ? true : false;
        }
        return flag;
    }

    /**
     * 描述：分页获取类别 列表
     *
     * @return 分页列表数据
     * @throws Exception
     */
    @Override
    public PageInfo<Category> getList(int pageNum, int pageSize) throws Exception {
        PageHelper.startPage(pageNum, pageSize);
        CategoryExample categoryExample = new CategoryExample();
        categoryExample.setOrderByClause("BC_ORDER_NUMBER");
        Page<Category> page = (Page<Category>) categoryMapper.selectByExample(categoryExample);
        return page.toPageInfo();
    }


    /**
     * 描述：删除类别
     *
     * @param id 类别唯一标识
     * @return true： 删除成功 false：删除失败
     * @throws Exception
     */
    @Override
    public boolean remove(String id) throws Exception {
        //1.获取类别
        Category category = categoryMapper.selectByPrimaryKey(id);

        //2.若存在则删除
        if (category != null) {
            return categoryMapper.deleteByPrimaryKey(id) > 0 ? true : false;
        }
        return true;
    }

    /**
     * 描述：获取类别
     *
     * @param id 类别唯一标识
     * @return 类别
     * @throws Exception
     */
    @Override
    public Category getLabel(String id) throws Exception {
        return categoryMapper.selectByPrimaryKey(id);
    }

    /**
     * 描述：获取所有类别
     *
     * @return
     * @throws Exception
     */
    @Override
    public List<Category> getAll() throws Exception {
        CategoryExample categoryExample = new CategoryExample();
        categoryExample.setOrderByClause("BC_ORDER_NUMBER");
        return categoryMapper.selectByExample(categoryExample);
    }

}
