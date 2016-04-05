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

    @RequestMapping(value = "/admin.action",method = RequestMethod.GET)
    public String admin(){
        return "system/admin";
    }

    @RequestMapping(value = "/role.action",method = RequestMethod.GET)
    public String role(){
        return "system/role";
    }
}
