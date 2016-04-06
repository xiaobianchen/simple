package com.simple.service.impl;

import com.simple.maper.UserMapper;
import com.simple.model.User;
import com.simple.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<User> listAll() {
        return userMapper.listAll();
    }

    @Override
    public User findByPrimaryKey(String id) {
        return userMapper.findByPrimaryKey(id);
    }

    @Override
    public void updateByPrimaryKey(User user) {
        userMapper.updateByPrimaryKey(user);
    }

    @Override
    public void deleteUser(String id) {
        userMapper.deleteUser(id);
    }
}
