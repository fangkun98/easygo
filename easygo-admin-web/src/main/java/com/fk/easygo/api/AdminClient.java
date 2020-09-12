package com.fk.easygo.api;

import com.fk.easygo.pojo.Admin;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName AdminClient
 * @Description TODO
 * @Date 2020/3/29 16:52
 * @Created by FangKun
 */
@FeignClient(value = "easygo-admin-service")
public interface AdminClient {
    @RequestMapping("/admin_login")
    public Admin adminLogin(@RequestBody Admin admin);

}
