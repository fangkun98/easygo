package com.fk.easygo.client;

import com.fk.easygo.pojo.Goods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @ClassName GoodsClient
 * @Description TODO
 * @Date 2020/4/10 21:22
 * @Created by FangKun
 */
@FeignClient(value = "easygo-goods-service")
public interface GoodsClient {

    /*
     * 查询所有的上架的商品数据
     */
    @RequestMapping("/goods_getGoods")
    public List<Goods> getGoods(@RequestParam Integer is_marketable);
}