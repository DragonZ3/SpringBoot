package com.springboot.service.impl;

import com.springboot.service.StudentService;
import org.springframework.stereotype.Service;

/**
 * @Author Dragon
 * @Description //TODO $
 * @Date $ $
 * @Param $
 **/
@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public void sayHello() {
        System.out.println("hello,springboot");
    }
}
