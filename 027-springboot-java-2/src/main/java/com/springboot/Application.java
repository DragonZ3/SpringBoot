package com.springboot;

import com.springboot.web.StudentController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @Author zhangLong
 * @Description 启动Springboot非Web的第二种方式
 * @Date 10:46:27 2022/05/23
 * @Param
 * @return * @return: null
 **/
@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    private StudentController studentController;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String s = studentController.sayHello("hello-Spring-Web");
        System.out.println(s);
    }
}
