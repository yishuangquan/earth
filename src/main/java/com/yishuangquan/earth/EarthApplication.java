package com.yishuangquan.earth;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
//@MapperScan("com.yishuangquan.earth.dao")
public class EarthApplication {


    public static void main(String[] args) {

        SpringApplication.run(EarthApplication.class, args);
    }
}
