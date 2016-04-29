package com.simple.controller;

import com.simple.model.User;
import com.simple.service.IUserService;
import com.simple.util.PageResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author xiaobianchen
 * @version 1.0 2016/4/13
 * 分页查询
 */
@Controller
public class  UserController extends BaseController{

    @Resource
    private IUserService userService;

    /**
     * 显示首页
     */
    @RequestMapping(value="/pagination.action",method = RequestMethod.GET)
    public String pagination() {
        return "common/pagination";
    }

    /**
     * 分页查询用户信息
     * @param pageNumber
     * @param pageSize
     * @param username
     * @return
     */
    @RequestMapping(value = "/listPages.action",method = RequestMethod.POST)
    public @ResponseBody String list(Integer pageNumber,Integer pageSize,String username){
        try {
            PageResult<User> pageResult = userService.queryByPage(username, pageNumber,pageSize);
            return responseSuccess(pageResult);
        } catch (Exception e) {
            return responseFail(e.getMessage());
        }
    }
}
