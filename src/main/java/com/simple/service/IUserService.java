package com.simple.service;

import com.simple.model.User;

/**
 * @author xiaobianchen
 * @version 1.0 2016/4/4
 */
public interface IUserService extends IGenericService{

    User findByPrimaryKey(String id);

    void updateByPrimaryKey(User user);

    void deleteUser(String id);
}
