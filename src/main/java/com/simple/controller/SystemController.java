package com.simple.controller;

import com.simple.model.User;
import com.simple.service.IUserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author xiaobianchen
 * @version 1.0 2016/4/5
 */
@Controller
public class SystemController {

    private static final Logger logger = Logger.getLogger(SystemController.class);

    @Autowired
    private IUserService userService;

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


    /**
     * 保存管理员操作
     */
    @RequestMapping(value = "/saveUser.action",method = RequestMethod.POST)
    public String saveAdmin(@ModelAttribute("user") User user){
        logger.info("save admin successfully!");
        userService.insertUser(user);

        return "redirect:system/admin";
    }
}
