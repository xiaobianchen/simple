package com.simple.service;

import com.simple.exception.LoginException;
import com.simple.exception.RegisterException;
import com.simple.model.User;
import com.simple.util.PageResult;

import java.util.Map;

/**
 * @author xiaobianchen
 * @version 1.0 2016/4/4
 */
public interface IUserService extends IGenericService {

    User findByPrimaryKey(String id);

    void updateByPrimaryKey(User user);

    void deleteUser(String id);

    PageResult<User> queryByPage(String username, Integer pageNo, Integer pageSize);

    void login(String username, String password) throws LoginException;

    void register(Map<String,String> fieldMap) throws RegisterException;

}
