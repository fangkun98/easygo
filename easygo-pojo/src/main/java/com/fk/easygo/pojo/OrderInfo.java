package com.fk.easygo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName OrderInfo
 * @Description TODO 订单信息实体类
 * @Date 2020/4/22 13:29
 * @Created by FangKun
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderInfo implements Serializable {


    private static final long serialVersionUID = 6367814988210478447L;
    private Order order;
    private List<OrderItem> orderItems;
}
