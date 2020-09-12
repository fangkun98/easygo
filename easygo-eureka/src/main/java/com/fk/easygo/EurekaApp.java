package com.fk.easygo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName EurekaApp
 * @Description TODO
 * @Date 2020/3/27 14:10
 * @Created by FangKun
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApp {
    public static void main(String[] args) {
        System.out.println("注册中心---->9001");
        SpringApplication.run(EurekaApp.class,args);
    }
}
