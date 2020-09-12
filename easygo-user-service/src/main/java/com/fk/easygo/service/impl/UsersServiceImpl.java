package com.fk.easygo.service.impl;

import com.fk.easygo.mapper.UsersMapper;
import com.fk.easygo.pojo.Users;
import com.fk.easygo.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Date 2020/4/16 0:35
 * @Created by FangKun
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Resource
    UsersMapper usersMapper;

    @Override
    public Integer registerUsers(Users users) {
        return usersMapper.registerUsers(users);
    }
}