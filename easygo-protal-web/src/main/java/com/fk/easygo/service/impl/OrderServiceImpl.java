package com.fk.easygo.service.impl;

import com.codingapi.tx.annotation.TxTransaction;
import com.fk.easygo.api.ItemClient;
import com.fk.easygo.api.OrderClient;
import com.fk.easygo.pojo.OrderInfo;
import com.fk.easygo.pojo.OrderItem;
import com.fk.easygo.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName OrderServiceImpl
 * @Description TODO
 * @Date 2020/4/24 19:21
 * @Created by FangKun
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    OrderClient orderClient;

    @Resource
    ItemClient itemClient;

    /**
     * 事务的发起方
     * @param orderInfo
     * @param orderItems
     * @return
     */
    @TxTransaction(isStart = true)
    @Override
    public int xiadan(OrderInfo orderInfo, List<OrderItem> orderItems) {

        Integer count1 = orderClient.addOrders(orderInfo);
        System.out.println("调用订单服务,新增订单!"+count1);

        //模拟有异常
//        System.out.println(100/0);

        int count2 = itemClient.updateItemNum(orderItems);
        System.out.println("调用商品服务，修改库存！"+count2);

        return count1+count2;
    }
}