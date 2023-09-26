package com.smallchange.controller;

import com.smallchange.common.JsonResult;
import com.smallchange.entity.User;
import com.smallchange.mapper.UserMapper;
import com.smallchange.service.IUserService;
import com.smallchange.service.exceptions.*;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {
    @Autowired
    private IUserService userService;


    protected final Integer getIdFromSession(HttpSession session) {
        return Integer.valueOf(session.getAttribute("id").toString());
    }

    protected final String getUsernameFromSession(HttpSession session) {
        return session.getAttribute("username").toString();
    }


    @GetMapping("/hello")
    public String hello() {
        return "1111";
    }



    @PostMapping("/login")
    public boolean login2(String username, String password, HttpSession session) {

        try {
            User data = userService.login(username, password);

            session.setAttribute("id", data.getId());
            session.setAttribute("username", data.getUsername());
        } catch (PasswordIsNotCorrectException e) {
            return false;
        }
        return true;
    }



//    @RequestMapping("/signup")
//    public JsonResult<Void> signup(User user) {
//        JsonResult<Void> result = new JsonResult<>();
//
//        try {
//            userService.signup(user);
//            result.setState(200);
//        } catch (UsernameIsUsedException e) {
//            result.setState(2001);
//        }
//        return result;
//    }
//
//
//    @GetMapping("/login")
//    public JsonResult<User> login(String username, String password, HttpSession session) {
//
//        JsonResult<User> result = new JsonResult<>();
//        try {
//            User data = userService.login(username, password);
//            result.setState(200);
//            session.setAttribute("id", data.getId());
//            session.setAttribute("username", data.getUsername());
//        } catch (PasswordIsNotCorrectException e) {
//            result.setState(3001);
//        } catch(UsernameNotFoundException e) {
//            result.setState(3002);
//        }
//        return result;
//    }


}
