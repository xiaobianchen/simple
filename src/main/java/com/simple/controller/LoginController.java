package com.simple.controller;

import com.simple.exception.LoginException;
import com.simple.service.IUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * @author xiaobianchen
 * @version 1.0 2016/4/5
 *
 * 登录模块
 */
@Controller
public class LoginController {

    private static final Logger LOG = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private IUserService userService;

    /**
     * 主页
     */
    @RequestMapping(value = "/index.action",method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/login.action",method = RequestMethod.GET)
    public String login() throws  Exception{
        return "login/login";
    }

    @RequestMapping(value = "/login.action",method = RequestMethod.POST)
    public String login(HttpServletRequest request)throws Exception{

        // 获取表单数据
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //调用登录服务
        try {
            userService.login(username, password);
        } catch (LoginException e) {
            LOG.error("username/password is invalid", e);
            return "redirect:/login.action";
        }

        return "redirect:/index.action";
    }

    /**
     * 退出操作
     */
    @RequestMapping(value = "/loggout.action",method = RequestMethod.GET)
    public String loggout(){
        //获得当前用户
        Subject currentUser = SecurityUtils.getSubject();
        currentUser.logout();
        LOG.info("user logout successfully!");

        return "redirect:/login.action";
    }
}
