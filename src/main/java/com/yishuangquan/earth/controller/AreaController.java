package com.yishuangquan.earth.controller;

import com.yishuangquan.earth.entity.Area;
import com.yishuangquan.earth.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AreaController {

    @Autowired
    AreaService areaService;
    @Value("${spring.redis.host}")
    String url;

    @RequestMapping("/area/{id}")
    public String getById(@PathVariable Long id, Model model){
        Area area = areaService.getById(id);
        model.addAttribute("area", area);
        return "area";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String ss(){
        return url;
    }
}
