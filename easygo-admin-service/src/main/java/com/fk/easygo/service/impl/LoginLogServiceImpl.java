package com.fk.easygo.service.impl;

import com.fk.easygo.mapper.LoginLogMapper;
import com.fk.easygo.pojo.LoginLog;
import com.fk.easygo.service.LoginLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName LoginLogServiceImpl
 * @Description TODO
 * @Date 2020/3/29 18:48
 * @Created by FangKun
 */
@Service
public class LoginLogServiceImpl implements LoginLogService {
    @Resource
    private LoginLogMapper loginLogMapper;
    @Override
    public int addLoginLog(LoginLog log) {
        return loginLogMapper.addLoginLog(log);
    }

    @Override
    public List<LoginLog> getMyLoginLogs(String username) {
        return loginLogMapper.getMyLoginLogs(username);
    }
}
