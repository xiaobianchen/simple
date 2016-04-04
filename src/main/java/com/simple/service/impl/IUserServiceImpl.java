package com.simple.service.impl;

import com.simple.maper.UserMapper;
import com.simple.model.User;
import com.simple.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xiaobianchen
 * @version 1.0 2016/4/4
 */
@Service("userService")
public class IUserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }
}
