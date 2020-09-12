package com.fk.easygo.mapper;

import com.fk.easygo.pojo.Order;
import com.fk.easygo.pojo.OrderItem;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName OrderMapper
 * @Description TODO
 * @Date 2020/4/22 13:33
 * @Created by FangKun
 */
@Mapper
public interface OrderMapper {

    /**
     * 新增订单  订单表 tb_order
     */
    public Integer addOrder(Order order);

    /**
     *  新增订单详情  tb_order_item
     */
    public Integer addOrderItem(OrderItem orderItem);
}
