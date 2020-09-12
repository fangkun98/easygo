package com.fk.easygo.service;

import com.fk.easygo.pojo.LoginLog;

import java.util.List;

/**
 * @ClassName LoginLogService
 * @Description TODO
 * @Date 2020/3/29 18:48
 * @Created by FangKun
 */
public interface LoginLogService {
    //新增
    public int addLoginLog(LoginLog log);
    //获取最近时刻登录信息
    public List<LoginLog> getMyLoginLogs(String username);
}
