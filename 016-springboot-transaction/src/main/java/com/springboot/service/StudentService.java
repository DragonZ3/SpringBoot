package com.springboot.service;

import com.springboot.model.Student;

public interface StudentService {
    /**
     * @Author zhangLong
     * @Description 根据id修改student信息
     * @Date 16:31:28 2022/05/20
     * @Param
     * @return * @return: null
     **/
    int updateStudentById(Student student);
}
