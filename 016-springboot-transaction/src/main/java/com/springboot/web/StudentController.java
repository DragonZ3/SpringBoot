package com.springboot.web;

import com.springboot.model.Student;
import com.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author Dragon
 * @Description 事务的联系
 * @Date $ $
 * @Param $
 **/
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    
    @RequestMapping(value = "/student016")
    public @ResponseBody
    Object updateStudentById(Integer id,String name){
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        int updateCount = studentService.updateStudentById(student);
        return "修改的学生编号为："+id+";姓名："+name;
    }
}
