package com.simple.maper;

import com.simple.model.User;

import java.util.List;

/**
 * @author xiaobianchen
 * @version 1.0 2016/4/4
 */
public interface UserMapper {
    void insertUser(User user);

    void deleteUser(String id);

    List<User> listAll();

    User findByPrimaryKey(String id);

    void updateByPrimaryKey(User user);
}
