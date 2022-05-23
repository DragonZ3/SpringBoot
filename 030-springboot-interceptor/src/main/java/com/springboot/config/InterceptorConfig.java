package com.springboot.config;

import com.springboot.interceptor.UserInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author Dragon
 * @Description //TODO $
 * @Date $ $
 * @Param $
 **/
@Configuration //定义这个注解，相当于之前的xml配置文件
//实现WebMvcConfigurer
public class InterceptorConfig implements WebMvcConfigurer {

    //要拦截的页面,这里把/user下面的所有请求都给拦截了(可以通过下面的excludePathPatterns把不需要拦截的去掉)
    String[] addPathPatterns = {
        "/user/**"
    };
    //不拦截的页面
    String[] excludePathPatterns = {
        "/user/login","/user/out","/user/error"
    };

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new UserInterceptor()).addPathPatterns(addPathPatterns)
                .excludePathPatterns(excludePathPatterns);
    }
}
