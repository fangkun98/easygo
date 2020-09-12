package com.fk.easygo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName AdServiceApp
 * @Description TODO
 * @Date 2020/3/30 22:01
 * @Created by FangKun
 */
@SpringBootApplication
@EnableEurekaClient
public class AdServiceApp {
    public static void main(String[] args) {
        System.out.println("广告服务---->9004");
        SpringApplication.run(AdServiceApp.class,args);

    }
}
