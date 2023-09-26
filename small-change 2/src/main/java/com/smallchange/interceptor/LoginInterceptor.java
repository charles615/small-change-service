package com.smallchange.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

public class LoginInterceptor implements HandlerInterceptor {


    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {

        Object obj = request.getSession().getAttribute("id");
        if (obj == null) {
            response.sendRedirect("/user/login");
            return false;
        }
        return true;
    }

}
