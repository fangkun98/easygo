package com.fk.easygo.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName CommonController
 * @Description TODO
 * @Date 2020/4/17 0:09
 * @Created by FangKun
 */
@Controller
@Scope("prototype")
public class CommonController {

    /**
     * 通用的页面跳转方法
     * @param page
     * @return
     */
    @RequestMapping("/page_{page}")
    public String page(@PathVariable("page") String page) {
        return page;
    }
}