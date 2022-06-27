package com.oe.onlineeducation_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.oe.onlineeducation_demo.mapper")
public class OnlineEducationDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineEducationDemoApplication.class, args);
    }

}
