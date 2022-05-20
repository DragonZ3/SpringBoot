package com.springboot.service;

import com.springboot.model.Student;

public interface StudentService {

    /**
     * @Author zhangLong
     * @Description 根据id查询学生信息
     * @Date 15:39:32 2022/05/20
     * @Param
     * @return * @return: null
     **/
    Student getStudentById(Integer id);
}
