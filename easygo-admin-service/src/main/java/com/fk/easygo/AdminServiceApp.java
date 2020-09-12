package com.fk.easygo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName AdminServiceApp
 * @Description TODO
 * @Date 2020/3/29 15:33
 * @Created by FangKun
 */
@SpringBootApplication
@EnableEurekaClient
public class AdminServiceApp {
    public static void main(String[] args) {
        System.out.println("管理员服务--->9003");
        SpringApplication.run(AdminServiceApp.class,args);

    }
}
