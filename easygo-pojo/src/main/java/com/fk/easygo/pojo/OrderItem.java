package com.fk.easygo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName OrderItem
 * @Description TODO 订单详情实体类
 * @Date 2020/4/22 13:29
 * @Created by FangKun
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem implements Serializable {


    private static final long serialVersionUID = 7694724540350965956L;
    private Long id; //订单详情实体
    private Long item_id; //skuID
    private Long goods_id;
    private Long order_id; //订单ID
    private String title;
    private Double price;
    private Long num;
    private Double total_fee;
    private String pic_path;
    private String seller_id;
}

