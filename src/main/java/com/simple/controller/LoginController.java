package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author xiaobianchen
 * @version 1.0 2016/4/5
 *
 * 登录模块
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/login.action",method = RequestMethod.POST)
    public String login(){
        return "index";
    }
}
