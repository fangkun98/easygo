package com.fk.easygo.client;

import com.fk.easygo.pojo.Item;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @ClassName ItemClient
 * @Description TODO
 * @Date 2020/4/14 21:43
 * @Created by FangKun
 */
@FeignClient(value = "easygo-goods-service")
public interface ItemClient {

    //查询商品的所有SKU对象
    @RequestMapping("/items_getItemsByGoodsId")
    public List<Item> getItemsByGoodsId(@RequestParam("goodsId") Long goodsId);
}
