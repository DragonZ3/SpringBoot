package com.springboot.service;

import com.springboot.model.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    /**
     * @Author zhangLong
     * @Description 根据id查询Student类的信息
     * @Date 14:36:53 2022/05/20
     * @Param
     * @return * @return: null
     **/
    Student queryStudentById(Integer id);
}
