package com.smallchange.controller;

import com.smallchange.entity.HistoryList;
import com.smallchange.entity.User;
import com.smallchange.mapper.HistoryListMapper;
import com.smallchange.mapper.UserMapper;
import com.smallchange.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping("login")
    public boolean login(@RequestBody User user) {
        return this.userService.login(user.getUsername(), user.getPassword());
    }

}
