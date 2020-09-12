package com.fk.easygo.controller;

import com.fk.easygo.pojo.Admin;
import com.fk.easygo.pojo.LoginLog;
import com.fk.easygo.service.AdminService;
import com.fk.easygo.service.LoginLogService;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName AdminController
 * @Description TODO
 * @Date 2020/3/29 16:01
 * @Created by FangKun
 */

@RestController
@Scope("prototype")
public class AdminController {
    @Resource
    private AdminService adminService;

    @Resource
    private LoginLogService loginLogService;

    @RequestMapping("/admin_login")
    public Admin adminLogin(@RequestBody  Admin admin){
        return adminService.adminLogin(admin);
    }

    @RequestMapping("/loginLog_add")
    public int addLoginLog(@RequestBody LoginLog log){
        return loginLogService.addLoginLog(log);
    }

    @RequestMapping("/loginLog_logs")
    public List<LoginLog> getMyLoginLogs(@RequestParam String username){
        return loginLogService.getMyLoginLogs(username);

    }
}
