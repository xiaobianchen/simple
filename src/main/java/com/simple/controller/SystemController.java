package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author xiaobianchen
 * @version 1.0 2016/4/5
 */
@Controller
public class SystemController {

    /**
     * 管理员管理
     */
    @RequestMapping(value = "/admin.action",method = RequestMethod.GET)
    public String admin(){
        return "system/admin";
    }

    /**
     * 角色管理
     */
    @RequestMapping(value = "/role.action",method = RequestMethod.GET)
    public String role(){
        return "system/role";
    }

    /**
     * 创建管理员
     */
    @RequestMapping(value = "/create.action",method = RequestMethod.GET)
    public String createAdmin(){
        return "system/create";
    }






}
