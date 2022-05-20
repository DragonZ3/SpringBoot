package com.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.springboot.mapper")
@EnableTransactionManagement //这个可选，springboot2.0之后可以不写
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
