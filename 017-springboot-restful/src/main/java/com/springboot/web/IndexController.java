package com.springboot.web;

import com.springboot.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
    //URL链接方式：http://localhost:8080/student017?id=1&age=22
    @RequestMapping("/student017")
    public @ResponseBody Object getStudent(Integer id,Integer age){
        Student student = new Student();
        student.setId(id);
        student.setAge(age);
        return student;
    }

    @RequestMapping(value = "/student017/{id}/{age}")
    public @ResponseBody Object resultFulStudent(@PathVariable("id") Integer id,
                                                 @PathVariable("age") Integer age  ){

        Student student = new Student();
        student.setId(id);
        student.setAge(age);
        return student;
    }
}
