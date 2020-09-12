package com.fk.easygo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName TimeController
 * @Description TODO 测试
 * @Date 2020/4/25 18:18
 * @Created by FangKun
 */
@Controller
@Scope("prototype")
public class TimeController {

    @Autowired
    RedisTemplate<String, Object> redisTemplate;

    /**
     * 测试key的有效期
     * @return
     */
    @RequestMapping("/ttl")
    @ResponseBody
    public String testTimeTTL(){
        Long leftTime = redisTemplate.getExpire("message", TimeUnit.SECONDS);
        String s="message这个key的有效期："+leftTime+"秒!";
        System.out.println(s);
        return s;
    }
}