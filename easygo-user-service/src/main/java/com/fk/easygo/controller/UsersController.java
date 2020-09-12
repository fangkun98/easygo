package com.fk.easygo.controller;

import com.fk.easygo.pojo.Users;
import com.fk.easygo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName UserController
 * @Description TODO
 * @Date 2020/4/16 0:36
 * @Created by FangKun
 */
@RestController
@Scope("prototype")
public class UsersController {

    @Resource
    UsersService usersService;

    /**
     * 用户注册
     * @param users
     * @return
     */
    @RequestMapping("/users_add")
    public Integer users_add(@RequestBody Users users){
        return usersService.registerUsers(users);
    }

}
