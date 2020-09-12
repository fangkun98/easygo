package com.fk.easygo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName BranServiceApp
 * @Description TODO
 * @Date 2020/3/27 12:57
 * @Created by FangKun
 */
@SpringBootApplication
@EnableEurekaClient
public class BrandServiceApp {
    public static void main(String[] args) {
        System.out.println("品牌服务---->9000");
        SpringApplication.run(BrandServiceApp.class,args);
    }
}
