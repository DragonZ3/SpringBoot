package com.springboot.web.impl;

import com.springboot.web.StudentController;
import org.springframework.stereotype.Service;

/**
 * @Author Dragon
 * @Description //TODO $
 * @Date $ $
 * @Param $
 **/
@Service
public class StudentControllerImpl implements StudentController {
    @Override
    public String sayHello(String msg) {
        return msg;
    }
}
