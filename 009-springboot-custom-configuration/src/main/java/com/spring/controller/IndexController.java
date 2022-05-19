package com.spring.controller;

import com.spring.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private Student student;

    @RequestMapping("/student")
    public @ResponseBody String studentInfo(){
        return "学生的信息:"+"姓名："+student.getName()+",年龄："+student.getAge();
    }
}
