package com.simple.service.impl;

import com.github.pagehelper.PageHelper;
import com.simple.maper.UserMapper;
import com.simple.model.User;
import com.simple.service.IUserService;
import com.simple.util.BeanUtil;
import com.simple.util.PagedResult;
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
    @SuppressWarnings("unchecked")
    public void insert(Object obj) {
        userMapper.insert(obj);
    }

    @Override
    @SuppressWarnings("unchecked")
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

    @Override
    public PagedResult<User> queryByPage(String username, Integer pageNo, Integer pageSize) {
        pageNo = pageNo==null?1:pageNo;
        pageSize = pageSize==null?10:pageSize;
        PageHelper.startPage(pageNo, pageSize);
        return BeanUtil.toPagedResult(userMapper.selectUserByUserName(username));
    }
}
