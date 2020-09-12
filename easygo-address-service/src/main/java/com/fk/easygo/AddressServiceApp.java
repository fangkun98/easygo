package com.fk.easygo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName AddressServiceApp
 * @Description TODO
 * @Date 2020/4/22 9:27
 * @Created by FangKun
 */
@SpringBootApplication
@EnableEurekaClient
public class AddressServiceApp {

    public static void main(String[] args) {
        System.out.println("会员地址服务9013.....");
        SpringApplication.run(AddressServiceApp.class,args);
    }
}
