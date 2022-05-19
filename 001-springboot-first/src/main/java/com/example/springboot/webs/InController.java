package com.example.springboot.webs;

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
public class InController {
    @RequestMapping(value = "/springboot1/say")
    public @ResponseBody
    String say(){
        return "hello,SpringBoot";
    }
}
