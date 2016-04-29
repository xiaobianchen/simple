package com.simple.service.impl;

import com.github.pagehelper.PageHelper;
import com.simple.exception.LoginException;
import com.simple.exception.RegisterException;
import com.simple.maper.UserMapper;
import com.simple.model.User;
import com.simple.service.IUserService;
import com.simple.util.BeanUtil;
import com.simple.util.DBUtil;
import com.simple.util.PageResult;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.DefaultPasswordService;
import org.apache.shiro.authc.credential.PasswordService;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author xiaobianchen
 * @version 1.0 2016/4/4
 */
@Service("userService")
public class IUserServiceImpl implements IUserService {

    private static final Logger LOG = LoggerFactory.getLogger(IUserServiceImpl.class);
    private PasswordService  passwordService = new DefaultPasswordService();

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
    public PageResult<User> queryByPage(String username, Integer pageNo, Integer pageSize) {
        pageNo = pageNo==null?1:pageNo;
        pageSize = pageSize==null?10:pageSize;
        PageHelper.startPage(pageNo, pageSize);
        return BeanUtil.toPagedResult(userMapper.selectUserByUserName(username));
    }

    /**
     * 登录操作
      * @param username  用户名
     * @param password   密码
     * @throws LoginException  登录异常处理
     */
    @Override
    public void login(String username, String password) throws LoginException {
        //创建token
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);

        //获取当前用户
        Subject currentUser = SecurityUtils.getSubject();
        try {
            currentUser.login(token);
        } catch (AuthenticationException e) {
            LOG.error("login failure", e);
            throw new LoginException(e);
        }
    }

    /**
     * 用户注册
     * @param fieldMap
     * @throws RegisterException
     */
    @Override
    public void register(Map<String, String> fieldMap) throws RegisterException {
        String username = fieldMap.get("username");
        String password = fieldMap.get("password");

        String selectSQL = "SELECT COUNT(*) from user where username = ?";
        Long userCount = DBUtil.queryColumn(selectSQL, username);
        if (userCount > 0) {
            throw new RegisterException();
        }

        //加密密码
        password = passwordService.encryptPassword(password);

        //插入user表
        String insertSQL = "INSERT INTO user(username,password) values(?,?)";
        DBUtil.update(insertSQL, username, password);
    }
}
