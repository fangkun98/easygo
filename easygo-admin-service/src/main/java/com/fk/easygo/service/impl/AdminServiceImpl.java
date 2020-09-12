package com.fk.easygo.service.impl;

import com.fk.easygo.mapper.AdminMapper;
import com.fk.easygo.pojo.Admin;
import com.fk.easygo.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName AdminServiceImpl
 * @Description TODO
 * @Date 2020/3/29 15:59
 * @Created by FangKun
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminMapper adminMapper;

    @Override
    public Admin adminLogin (Admin admin) {
        return adminMapper.adminLogin(admin);
    }
}
