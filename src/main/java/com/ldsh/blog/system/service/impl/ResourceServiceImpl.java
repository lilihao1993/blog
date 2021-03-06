package com.ldsh.blog.system.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ldsh.blog.system.dto.HomeResourceDto;
import com.ldsh.blog.system.dto.RootResourceTreeDto;
import com.ldsh.blog.system.mapper.ResourceMapper;
import com.ldsh.blog.system.model.Resource;
import com.ldsh.blog.system.model.ResourceExample;
import com.ldsh.blog.system.service.IResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述：资源类service实现
 */
@Service
public class ResourceServiceImpl implements IResourceService {

    /**
     * 描述：资源mapper注入
     */
    @Autowired
    private ResourceMapper resourceMapper;

    /**
     * 描述：保存资源
     *
     * @param resource 资源实体类
     * @return true：保存成功 false：保存失败
     * @throws Exception
     */
    @Override
    public boolean save(Resource resource) throws Exception {
        return resourceMapper.insert(resource) > 0 ? true : false;
    }

    /**
     * 描述：分页获取资源列表
     *
     * @return 分页资源信息
     * @throws Exception
     */
    @Override
    public PageInfo<Resource> resourcePage(int pageNum, int pageSize) throws Exception {
        PageHelper.startPage(pageNum, pageSize);
        Page<Resource> page = (Page<Resource>) resourceMapper.selectByExample(new ResourceExample());
        return page.toPageInfo();
    }


    /**
     * 描述：获取资源列表
     *
     * @return 资源列表
     * @throws Exception
     */
    @Override
    public List<Resource> getResourceList() throws Exception {
        return resourceMapper.selectByExample(new ResourceExample());
    }

    /**
     * 描述：获取跟资源列表
     *
     * @return 资源列表
     * @throws Exception
     */
    @Override
    public List<Resource> getRootResourceList() throws Exception {
        ResourceExample resourceExample = new ResourceExample();
        resourceExample.createCriteria().andLevelEqualTo("0");
        return resourceMapper.selectByExample(resourceExample);
    }


    /**
     * 描述：根据id获取资源地址（注：只有底层资源才会获取地址）
     *
     * @param id 资源唯一标识
     * @return 资源对象
     * @throws Exception
     */
    @Override
    public Resource get(String id) throws Exception {
        return resourceMapper.selectByPrimaryKey(id);
    }

    /**
     * 描述：根据id删除资源
     *
     * @param id 资源唯一标识
     * @return
     * @throws Exception
     */
    @Override
    public boolean remove(String id) throws Exception {
        //1.删除顶级资源
        resourceMapper.deleteByPrimaryKey(id);
        //2.删除删除其子级资源
        ResourceExample resourceExample = new ResourceExample();
        resourceExample.createCriteria().andIdEqualTo(id);
        resourceMapper.deleteByExample(resourceExample);
        return true;
    }

    /**
     * 描述：修改资源
     *
     * @param resource 资源类
     * @return
     * @throws Exception
     */
    @Override
    public boolean modify(Resource resource) throws Exception {
        return resourceMapper.updateByPrimaryKeySelective(resource) > 0 ? true : false;
    }

    /**
     * 描述:获取主页资源列表
     *
     * @return 资源列表
     * @throws Exception
     */
    @Override
    public List<HomeResourceDto> getHomeResources() throws Exception {
        return resourceMapper.selectHomeResources();
    }

    /**
     * 描述：获取资源列表
     *
     * @return
     * @throws Exception
     */
    @Override
    public List<RootResourceTreeDto> getRootResources() throws Exception {
        return resourceMapper.selectRootResources();
    }


}
