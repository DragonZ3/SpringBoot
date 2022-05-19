package com.springboot.controller;

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
    @RequestMapping(value = "/say006")
    public @ResponseBody
    String say(){
        return "hello-SpringBoot-multi-environment";
    }
}
