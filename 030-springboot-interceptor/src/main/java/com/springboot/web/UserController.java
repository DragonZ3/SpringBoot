package com.springboot.web;

import com.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author Dragon
 * @Description //TODO $
 * @Date $ $
 * @Param $
 **/
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/login")
    public @ResponseBody Object login(HttpServletRequest request){
        //将用户信息放入到session
        User user = new User();
        user.setId(1);
        user.setUserName("xyy");
        request.getSession().setAttribute("user",user);
        return "登录成功";
    }

    //未登录调转的页面
    @RequestMapping("/error")
    public @ResponseBody Object error(){
        return "请先登录";
    }
    //登录成功跳转的页面
    @RequestMapping("/center")
    public @ResponseBody Object center(){
        return "欢迎进入喜羊羊学堂";
    }
    //不登录也可以访问的页面，游客登录
    @RequestMapping("/out")
    public @ResponseBody Object out(){
        return "游客登录";
    }
}
