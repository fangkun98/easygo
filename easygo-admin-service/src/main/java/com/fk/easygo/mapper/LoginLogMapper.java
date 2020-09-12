package com.fk.easygo.mapper;

import com.fk.easygo.pojo.LoginLog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName LoginLogMapper
 * @Description TODO 登录日志接口
 * @Date 2020/3/29 18:41
 * @Created by FangKun
 */
@Mapper
public interface LoginLogMapper {
    //新增
    public int addLoginLog(LoginLog log);
    //获取最近时刻登录信息
    public List<LoginLog> getMyLoginLogs(String username);
}
