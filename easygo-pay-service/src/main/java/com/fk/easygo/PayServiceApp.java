package com.fk.easygo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName PayServiceApp
 * @Description TODO
 * @Date 2020/4/22 23:51
 * @Created by FangKun
 */
@SpringBootApplication
@EnableEurekaClient
public class PayServiceApp {

    public static void main(String[] args) {
        System.out.println("支付服务--->9015");
        SpringApplication.run(PayServiceApp.class,args);
    }
}
