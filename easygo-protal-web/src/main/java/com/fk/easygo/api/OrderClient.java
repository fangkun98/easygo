package com.fk.easygo.api;

import com.fk.easygo.pojo.OrderInfo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName OrderClient
 * @Description TODO
 * @Date 2020/4/22 17:20
 * @Created by FangKun
 */
@FeignClient(value = "easygo-order-service")
public interface OrderClient {

    /**
     * 01-新增订单
     * @param orderInfo
     * @return
     */
    @RequestMapping("/order_add")
    public Integer addOrders(@RequestBody OrderInfo orderInfo);
}
