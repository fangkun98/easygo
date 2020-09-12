package com.fk.easygo.client;

import com.fk.easygo.pojo.Goods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName GoodsClient
 * @Description TODO
 * @Date 2020/4/14 0:33
 * @Created by FangKun
 */
@FeignClient(value = "easygo-goods-service")
public interface GoodsClient {

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    @RequestMapping("/goods_getGoodsById")
    public Goods getGoodsById(@RequestParam("id") Long id);
}
