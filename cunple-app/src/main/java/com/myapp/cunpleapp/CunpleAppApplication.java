package com.myapp.cunpleapp;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.myapp.cunpleapp.mapper")
@EnableDubboConfig
@DubboComponentScan("com.myapp.cunpleapp.service")
public class CunpleAppApplication {



    public static void main(String[] args) {
        SpringApplication.run(CunpleAppApplication.class, args);
    }

}
