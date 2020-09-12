package com.fk.easygo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName ItemServiceApp
 * @Description TODO
 * @Date 2020/4/7 19:38
 * @Created by FangKun
 */
@SpringBootApplication
@EnableEurekaClient
public class ItemServiceApp {
    public static void main(String[] args) {
        System.out.println("品牌服务---->9008");
        SpringApplication.run(ItemServiceApp.class,args);
    }
}
