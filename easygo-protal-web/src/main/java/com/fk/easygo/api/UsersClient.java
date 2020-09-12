package com.fk.easygo.api;

import com.fk.easygo.pojo.Users;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName UsersClient
 * @Description TODO
 * @Date 2020/4/16 23:06
 * @Created by FangKun
 */
@FeignClient(value = "easygo-users-service")
public interface UsersClient {

    /**
     * 用户注册
     * @param users
     * @return
     */
    @RequestMapping("/users_add")
    public Integer users_add(@RequestBody Users users);

}