package com.smallchange.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Configure implements WebMvcConfigurer {



    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        HandlerInterceptor interceptor = new LoginInterceptor();
        List<String> patterns = new ArrayList<>();

        patterns.add("/user/signup");
        patterns.add("/user/login");


        registry.addInterceptor(interceptor)
                .addPathPatterns("/**").excludePathPatterns(patterns);
    }
}