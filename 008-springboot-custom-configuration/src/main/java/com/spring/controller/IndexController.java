package com.spring.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author Dragon
 * @Description //TODO $
 * @Date $ $
 * @Param $
 **/
@Controller
public class IndexController {
    /*使用自定义配置变量(在任何地方都可以拿到改配置的值，只需要用到改注解就好)*/
    //使用@Value注解就可以解析配置文件中的属性了，并把其属性的值赋给对应的变量
    @Value(value ="${student.name}")
    private String studentName;

    @Value("${webSet}")
    private String webSet;

    @RequestMapping(value = "/say")
    public @ResponseBody
    String say(){
        return "say:"+"Name="+studentName+",wbSet="+webSet;
    }
}
