package com.fk.easygo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName StaticPageServiceApp
 * @Description TODO 页面静态化服务工程，不负责连接数据库 调用数据库中数据，生成静态页面
 * @Date 2020/4/14 0:34
 * @Created by FangKun
 */
@SpringBootApplication
@EnableEurekaClient //表示这个是一个Eureka客户端
@EnableFeignClients //开启Feign客户端
public class StaticPageServiceApp {

    public static void main(String[] args) {
        System.out.println("静态页面服务------>9011");
        SpringApplication.run(StaticPageServiceApp.class,args);
    }
}