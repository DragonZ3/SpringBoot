package com.springboot;

import com.springboot.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
/**
 * @Author zhangLong
 * @Description SpringBoot工程非web第一种实现方式
 * @Date 10:32:30 2022/05/23
 * @Param
 * @return * @return: null
 **/
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        /**
         * Springboot程序启动之后，返回值是ConfigurableApplicationContext,它也是一个Spring容器
         * 相当于spring容器中的ClassPathXmlApplicationContext
         **/
        //获取springBoot容器
        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);

        //从容器中获取注入spring容器的bean对象
        StudentService impl = (StudentService) run.getBean("studentServiceImpl");//这里注意要类名小写

        impl.sayHello();
    }

}
