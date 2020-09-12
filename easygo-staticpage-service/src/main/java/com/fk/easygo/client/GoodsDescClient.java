package com.fk.easygo.client;

import com.fk.easygo.pojo.GoodsDesc;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName GoodsDescClient
 * @Description TODO
 * @Date 2020/4/14 18:54
 * @Created by FangKun
 */
@FeignClient(value = "easygo-goods-service")
public interface GoodsDescClient {

    @RequestMapping("goodsDesc_getById")
    public GoodsDesc getGoodsDescById(@RequestParam("id") Long id);
}