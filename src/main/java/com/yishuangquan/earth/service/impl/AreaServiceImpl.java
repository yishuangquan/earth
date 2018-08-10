package com.yishuangquan.earth.service.impl;

import com.yishuangquan.earth.dao.AreaDao;
import com.yishuangquan.earth.entity.Area;
import com.yishuangquan.earth.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    AreaDao areaDao;

    public Area getById(Long id){
        return areaDao.getById(id);
    }

}
