package com.fk.easygo.client;

import com.fk.easygo.pojo.Brand;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName BrandClinet
 * @Description TODO
 * @Date 2020/4/14 19:18
 * @Created by FangKun
 */
@FeignClient(value = "easygo-brand-service")
public interface BrandClinet {

    @RequestMapping("/brand_getBrandById")
    public Brand getBrandById(@RequestParam Integer id);
}
