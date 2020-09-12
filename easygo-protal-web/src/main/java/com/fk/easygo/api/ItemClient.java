package com.fk.easygo.api;

import com.fk.easygo.pojo.Item;
import com.fk.easygo.pojo.OrderItem;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @ClassName ItemClient
 * @Description TODO
 * @Date 2020/4/20 20:31
 * @Created by FangKun
 */
@FeignClient(value = "easygo-goods-service")
public interface ItemClient {

    @RequestMapping("/item_getbyId")
    public Item getItemById(@RequestParam("itemId") Long itemId);


    //更新库存
    @PostMapping("/item_updateItemNum")
    public Integer updateItemNum(@RequestBody List<OrderItem> orderItems);
}
