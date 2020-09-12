package com.fk.easygo.service;

import com.fk.easygo.pojo.OrderInfo;
import com.fk.easygo.pojo.OrderItem;

import java.util.List;

/**
 * @ClassName OrderService
 * @Description TODO
 * @Date 2020/4/24 19:20
 * @Created by FangKun
 */
public interface OrderService {

    /**
     * 事务发起方  orderInfo 要新增的订单
     *            orderItems 要更新的库存对象
     * @param orderInfo
     * @param orderItems
     * @return
     */
    public int xiadan(OrderInfo orderInfo, List<OrderItem> orderItems);

}
