package com.qin.springbooteasyexcel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.qin.springbooteasyexcel.dao")
@ComponentScan(basePackages = {"com.qin"})
public class SpringbootEasyexcelApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootEasyexcelApplication.class, args);
    }

}
