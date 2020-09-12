package com.fk.easygo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName SpecificationServiceApp
 * @Description TODO
 * @Date 2020/4/2 21:43
 * @Created by FangKun
 */
@SpringBootApplication
@EnableEurekaClient
public class SpecificationServiceApp {
    public static void main(String[] args) {
        System.out.println("规格服务---》9006");
        SpringApplication.run(SpecificationServiceApp.class,args);
    }
}
