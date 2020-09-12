package com.fk.easygo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


/**
 * @ClassName ProtalWebApp
 * @Description TODO
 * @Date 2020/3/31 10:43
 * @Created by FangKun
 */
@SpringBootApplication
@EnableEurekaClient //表示这个是一个Eureka客户端
@EnableFeignClients //开启Feign客户端
public class ProtalWebApp {
    public static void main(String[] args) {
        System.out.println("首页门户---->9005");
        SpringApplication.run(ProtalWebApp.class,args);
    }
}
