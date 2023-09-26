package com.smallchange.service.impl;

import com.smallchange.entity.User;
import com.smallchange.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public boolean login(String username, String password) {
        return false;
    }

    @Override
    public boolean validatePassword(User user, String password) {
        if (user == null || user.getPassword() == null || password == null) {
            return false;
        }

        return user.getPassword().equals(password);
    }
}
