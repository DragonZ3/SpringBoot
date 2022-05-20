package com.springboot.web;

import com.springboot.model.Student;
import com.springboot.service.StudentService;
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
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/student04")
    public @ResponseBody
    Student getStudentById(Integer id){
        Student student = studentService.getStudentById(id);
        return student;
    }
}
