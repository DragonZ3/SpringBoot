package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author Dragon
 * @Description //TODO $
 * @Date $ $
 * @Param $
 **/
@Controller
public class IndexController {

    @RequestMapping("/say")
    @ResponseBody
    public ModelAndView say(){
        System.out.println("kjkkljlj");
        ModelAndView view = new ModelAndView();
//        view.addObject("message","使用ModelAndView创建JSP页面");
        view.addObject("message","SpringBoot");
        view.setViewName("say");
        System.out.println("成功");
        return view;
    }

    @RequestMapping("/say2")
    public @ResponseBody
    String say2(){
       return "hello";
    }
}
