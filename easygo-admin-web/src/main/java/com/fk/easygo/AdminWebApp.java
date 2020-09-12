package com.fk.easygo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


/**
 * @ClassName AdminWebApp
 * @Description TODO
 * @Date 2020/3/27 14:21
 * @Created by FangKun
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class AdminWebApp {
    public static void main(String[] args) {
        System.out.println("运营商管理WEB ----->9002");
        SpringApplication.run(AdminWebApp.class,args);
    }
}
