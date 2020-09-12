package com.fk.easygo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * @ClassName SearchApp
 * @Description TODO
 * @Date 2020/4/10 20:32
 * @Created by FangKun
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients //开启Feign客户端
public class SearchApp {

    public static void main(String[] args) {
        System.out.println("搜索服务---->9009");
        SpringApplication.run(SearchApp.class,args);
    }
}
