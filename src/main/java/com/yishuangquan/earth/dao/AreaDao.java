package com.yishuangquan.earth.dao;

import com.yishuangquan.earth.entity.Area;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AreaDao {
    /**
     * 根据区域ID，查询区域
     * @param id
     * @return
     */
    public Area getById(@Param("id") Long id);
}
