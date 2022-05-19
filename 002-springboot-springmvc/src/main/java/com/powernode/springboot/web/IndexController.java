package com.powernode.springboot.web;

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

    @RequestMapping(value = "/springboot2/say")
    public @ResponseBody String say(){
        return "hello,SpringBoot";
    }
}
