package com.fk.easygo.api;

import com.fk.easygo.pojo.LoginLog;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @ClassName LoginLogClient
 * @Description TODO
 * @Date 2020/3/29 22:48
 * @Created by FangKun
 */
@FeignClient(value = "easygo-admin-service")
public interface LoginLogClient {

    @RequestMapping("/loginLog_add")
    public int addLoginLog(@RequestBody LoginLog log);

    @RequestMapping("/loginLog_logs")
    public List<LoginLog> getMyLoginLogs(@RequestParam String username);
}
