package com.fk.easygo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName UserApp
 * @Description TODO
 * @Date 2020/4/16 0:32
 * @Created by FangKun
 */
@SpringBootApplication
@EnableEurekaClient
public class UsersServiceApp {
    public static void main(String[] args) {
        System.out.println("用户服务---->9012");
        SpringApplication.run(UsersServiceApp.class,args);
    }
}
