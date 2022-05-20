package com.springboot.service.impl;

import com.springboot.mapper.StudentMapper;
import com.springboot.model.Student;
import com.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author Dragon
 * @Description //TODO $
 * @Date $ $
 * @Param $
 **/
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Transactional//写了这个注解，那么下面报错之后，数据库修改则不会更新
    @Override
    public int updateStudentById(Student student) {

        int i = studentMapper.updateByPrimaryKeySelective(student);

        int res =10/0;
        return i;
    }
}
