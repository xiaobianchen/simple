package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author xiaobianchen
 * @version 1.0 2016/4/6
 * 数据汇总功能
 */
@Controller
public class DataController {

    @RequestMapping(value = "/data.action",method = RequestMethod.GET)
    public String revenueSummary(){
        return "data/list";
    }
}
