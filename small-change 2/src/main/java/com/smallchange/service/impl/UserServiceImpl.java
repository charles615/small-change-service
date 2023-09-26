package com.smallchange.service.impl;

import com.smallchange.entity.User;
import com.smallchange.mapper.UserMapper;
import com.smallchange.service.IUserService;
import com.smallchange.service.exceptions.PasswordIsNotCorrectException;
import com.smallchange.service.exceptions.ServiceException;
import com.smallchange.service.exceptions.UsernameIsUsedException;
import com.smallchange.service.exceptions.UsernameNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.UUID;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getByUsername(String username) {return userMapper.findByUsername(username);}

    @Override
    public void signup(User user) {
        String username = user.getUsername();
        User account = userMapper.findByUsername(username);

        //check if the username is used when signing up.
        if (account != null) {
            throw new UsernameIsUsedException("Username is used!");
        }

        //账户密码MD5加密
        String password = user.getPassword();
        User newUser = new User();
        String salt = UUID.randomUUID().toString().toUpperCase();
        String md5Password = DigestUtils.md5DigestAsHex((password + salt).getBytes()).toUpperCase();
        newUser.setPassword(md5Password);
        newUser.setUsername(username);
        newUser.setSalt(salt);

        //检测数据是否被成功插入
        int result = userMapper.insert(newUser);
        if (result != 1) {
            throw new ServiceException("System server error.");
        }
    }

    @Override
    public User login(String username, String password) {
        User loginUser = userMapper.findByUsername(username);

        //检查是否存在用户
        if (loginUser == null) {
            throw new UsernameNotFoundException("Username not found!");
        }

        String passwordInDB = loginUser.getPassword();
        String salt = loginUser.getSalt();
        String InputMd5Password = DigestUtils.md5DigestAsHex((password + salt).getBytes()).toUpperCase();

        //检查密码是否正确
        if (!InputMd5Password.equals(passwordInDB)) {
            throw new PasswordIsNotCorrectException("Password is not correct.");
        }

        User user = new User();
        user.setId(loginUser.getId());
        user.setUsername(loginUser.getUsername());
        return user;
    }
















}
