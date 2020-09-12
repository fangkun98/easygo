package com.fk.easygo.controller;

import com.fk.easygo.api.AdminClient;
import com.fk.easygo.api.LoginLogClient;
import com.fk.easygo.pojo.Admin;
import com.fk.easygo.pojo.LoginLog;
import com.fk.easygo.utils.MessageResults;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @ClassName AdminController
 * @Description TODO
 * @Date 2020/3/29 16:51
 * @Created by FangKun
 */
@Controller
@Scope("prototype")
public class AdminController {
    @Resource
    private AdminClient adminClient;

    @Resource
    private LoginLogClient loginLogClient;

    @RequestMapping("/admin_login")
    @ResponseBody
    public MessageResults adminLogin(Admin admin,String ip ,String city, HttpSession session){
        //获取用户登录ip和登陆的城市
        //1.获取IP之前 调用WebService，查询IP对应的城市
        //2.直接JS前端调用接口
        MessageResults results=null;
        Admin adminLogin = adminClient.adminLogin(admin);
        System.out.println(adminLogin);
        if(adminLogin != null){
            if("1".equals(adminLogin.getStatus())) {
                session.setAttribute("adminLogin", adminLogin);
                results = new MessageResults(200, "登录成功");

                //日志新增
                LoginLog loginLog=new LoginLog(ip,admin.getUsername(),city);
                int count = loginLogClient.addLoginLog(loginLog);

            }else {
                results = new MessageResults(303, "改用户已被冻结,请联系管理员");
            }
        }else {
            results=new MessageResults(500,"登录失败");
        }
        return results;

    }

    @RequestMapping("/admin_logout")
    public String admin_logout(HttpSession session){
        session.invalidate();
        return "login";
    }

    @RequestMapping("/admin_getLoginLogs")
    @ResponseBody
    public List<LoginLog> getLoginLogs(HttpSession session){
        Admin adminLogin = (Admin) session.getAttribute("adminLogin");
        List<LoginLog> myLoginLogs = loginLogClient.getMyLoginLogs(adminLogin.getUsername());
        return myLoginLogs;
    }


    //////////////////////////////////////////////////////////////////////
    /**
     * 修改信息
     * 修改头像
     * 修改密码
     */

    


}
