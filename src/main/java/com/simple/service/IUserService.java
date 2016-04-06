package com.simple.service;

import com.simple.model.User;

import java.util.List;

/**
 * @author xiaobianchen
 * @version 1.0 2016/4/4
 */
public interface IUserService {

    void insertUser(User user);

    List<User> listAll();

    User findByPrimaryKey(String id);

    void updateByPrimaryKey(User user);

    void deleteUser(String id);
}
