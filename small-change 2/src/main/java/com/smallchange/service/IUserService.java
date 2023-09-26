package com.smallchange.service;

import com.smallchange.entity.User;

public interface IUserService {

    void signup(User user);

    User login(String username, String password);

    User getByUsername(String username);

}
