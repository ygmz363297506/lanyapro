package com.example.lanyapro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.example.lanyapro.mapper")
@ComponentScan("com.example")
@SpringBootApplication
public class LanyaproApplication {

    public static void main(String[] args) {
        SpringApplication.run(LanyaproApplication.class, args);
    }

}
