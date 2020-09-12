package com.fk.easygo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName TypeTemplateServiceApp
 * @Description TODO
 * @Date 2020/4/4 15:46
 * @Created by FangKun
 */
@SpringBootApplication
@EnableEurekaClient
public class TypeTemplateServiceApp {
    public static void main(String[] args) {
        System.out.println("模板服务----》9007");
        SpringApplication.run(TypeTemplateServiceApp.class,args);
    }
}
