package com.ldsh.blog.system.mapper;

import com.ldsh.blog.system.dto.HomeResourceDto;
import com.ldsh.blog.system.dto.RootResourceTreeDto;
import com.ldsh.blog.system.model.Resource;
import com.ldsh.blog.system.model.ResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResourceMapper {
    /**
     * @mbggenerated
     */
    int countByExample(ResourceExample example);

    /**
     * @mbggenerated
     */
    int deleteByExample(ResourceExample example);

    /**
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * @mbggenerated
     */
    int insert(Resource record);

    /**
     * @mbggenerated
     */
    int insertSelective(Resource record);

    /**
     * @mbggenerated
     */
    List<Resource> selectByExample(ResourceExample example);

    /**
     * @mbggenerated
     */
    Resource selectByPrimaryKey(String id);

    /**
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Resource record, @Param("example") ResourceExample example);

    /**
     * @mbggenerated
     */
    int updateByExample(@Param("record") Resource record, @Param("example") ResourceExample example);

    /**
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Resource record);

    /**
     * @mbggenerated
     */
    int updateByPrimaryKey(Resource record);
    /**
     * 描述：查询主资源列表
     *
     * @return 资源dto
     */
    List<HomeResourceDto> selectHomeResources();

    /**
     * 描述：查询列表
     * @return
     */
    List<RootResourceTreeDto> selectRootResources();
}