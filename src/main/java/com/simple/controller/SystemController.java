package com.simple.controller;

import com.simple.model.Role;
import com.simple.model.User;
import com.simple.service.IRoleService;
import com.simple.service.IUserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author xiaobianchen
 * @version 1.0 2016/4/5
 * 系统设置模块
 */
@Controller
public class SystemController {

    private static final Logger logger = Logger.getLogger(SystemController.class);

    @Autowired
    private IUserService userService;

    @Autowired
    private IRoleService roleService;

    /**
     * 列出管理员所有信息
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
    @SuppressWarnings("unchecked")
    public ModelAndView  role(){
        List<Role> roles = roleService.listAll();
        ModelAndView model = new ModelAndView();
        model.addObject("roles", roles);
        model.setViewName("system/role");
        return model;
    }

    /**
     * 创建角色
     */
    @RequestMapping(value ="/createRole.action",method = RequestMethod.GET)
    public String createRoles() {
        return "system/newRole";
    }

    /**
     * 保存管理角色
     */
    @RequestMapping(value="/createRole.action",method = RequestMethod.POST)
    @SuppressWarnings("unchecked")
    public String saveRole(@ModelAttribute("role") Role role) {
        if (role != null) {
            roleService.insert(role);
            logger.info("insert new role successfully!");
        }
        return "redirect:/role.action";
    }

    /**
     * 编辑角色
     */
    @RequestMapping(value = "/edit_roles/{roleName}",method = RequestMethod.GET)
    public String editRole(@PathVariable("roleName") String roleName,ModelMap  modelMap) {
        Role role = roleService.findByPrimaryKey(roleName);
        modelMap.addAttribute("role", role);
        modelMap.addAttribute("edit", true);
        return "system/newRole";
    }

    /**
     * 更新角色
     */
    @RequestMapping(value = "/edit_roles/{roleName}",method = RequestMethod.POST)
    public String updateRole(@ModelAttribute("role") Role role) {
        roleService.update(role);
        logger.info("update role successfully!");
        return "redirect:/role.action";
    }

    /**
     * 删除角色
     */
    @RequestMapping(value = "/doDeleteRole.action",method = RequestMethod.POST)
    public @ResponseBody String deleteRole(HttpServletRequest request) {
        String roleName = request.getParameter("roleName");
        boolean result = roleService.deleteByRoleName(roleName);
        if(result){
            logger.info("delete " + roleName + " successfully!");
            return "success";
        }else{
            return "error";
        }
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
        userService.insert(user);

        return "redirect:/admin.action";
    }
}
