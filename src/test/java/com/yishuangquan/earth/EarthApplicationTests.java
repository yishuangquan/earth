package com.yishuangquan.earth;

import com.yishuangquan.earth.service.AreaService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EarthApplicationTests {

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    AreaService areaService;
    @Value("${spring.redis.host}")
    private String url;
    @Test
    public void contextLoads() {
        stringRedisTemplate.opsForList().leftPush("ysq", "宜双全");
        stringRedisTemplate.opsForList().rightPush("url", url);
        redisTemplate.opsForValue().set("area", areaService.getById(1L));
    }

}
