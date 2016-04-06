package com.simple.controller;

import com.simple.model.User;
import com.simple.service.IUserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author xiaobianchen
 * @version 1.0 2016/4/5
 * 系统设置
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
    public ModelAndView admin(){
        List<User> userList =  userService.listAll();

        logger.info("userList size:" + userList.size());
        ModelAndView model = new ModelAndView();
        model.addObject("userList", userList);
        model.setViewName("system/admin");

        return model;
    }

    /**
     * 编辑管理员信息
     */
    @RequestMapping(value = "/edit.action/{id}",method = RequestMethod.GET)
    public ModelAndView edit(@PathVariable("id") String id) {
        User user = userService.findByPrimaryKey(id);
        logger.info("user info:" + user);

        ModelAndView model = new ModelAndView();
        model.addObject("user",user);
        model.setViewName("system/create");
        return model;
    }

    /**
     * 删除管理员信息
     */
    @RequestMapping(value = "/doDelete.action",method = RequestMethod.POST)
    public @ResponseBody String delete(HttpServletRequest request){
        String id = request.getParameter("id");
        User user = userService.findByPrimaryKey(id);
        if (user != null) {
            userService.deleteUser(id);
            logger.info("delete " + user.getUsername() + " successfully!");
            return "success";
        }else {
            return "error";
        }
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

        return "redirect:/admin.action";
    }
}
