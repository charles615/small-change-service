package com.smallchange.service;

import com.smallchange.entity.User;

public interface UserService {

    boolean  login(String username, String password);

    boolean validatePassword(User user, String password);
}
