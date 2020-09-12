package com.fk.easygo.service.impl;

import com.codingapi.tx.annotation.ITxTransaction;
import com.fk.easygo.mapper.OrderMapper;
import com.fk.easygo.pojo.OrderInfo;
import com.fk.easygo.pojo.OrderItem;
import com.fk.easygo.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName OrderServiceImpl
 * @Description TODO
 * @Date 2020/4/22 13:36
 * @Created by FangKun
 */
@Service
public class OrderServiceImpl implements OrderService , ITxTransaction {

    @Resource
    OrderMapper orderMapper;

    /**
     * 事务操作：单机版事务
     * @param orderInfo
     * @return
     */
    @Transactional
    @Override
    public int addOrders(OrderInfo orderInfo) {
        orderMapper.addOrder(orderInfo.getOrder());
        List<OrderItem> orderItems = orderInfo.getOrderItems();
        //System.out.println(100/0);
        for (OrderItem orderItem : orderItems) {
            orderMapper.addOrderItem(orderItem);
        }
        return 1;
    }
}