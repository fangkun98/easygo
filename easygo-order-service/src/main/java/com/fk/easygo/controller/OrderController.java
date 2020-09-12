package com.fk.easygo.controller;

import com.fk.easygo.pojo.OrderInfo;
import com.fk.easygo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName OrderController
 * @Description TODO
 * @Date 2020/4/22 17:18
 * @Created by FangKun
 */
@RestController
@Scope("prototype")
public class OrderController {

    @Autowired
    OrderService orderService;

    /**
     * 01-新增订单
     * @param orderInfo
     * @return
     */
    @RequestMapping("/order_add")
    public Integer addOrders(@RequestBody OrderInfo orderInfo){
        System.out.println("服务端:"+orderInfo);
        return orderService.addOrders(orderInfo);
    }

}
