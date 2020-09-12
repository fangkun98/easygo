package com.fk.easygo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName CartBean
 * @Description TODO
 * @Date 2020/4/20 20:32
 * @Created by FangKun
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartBean implements Serializable {

    private static final long serialVersionUID = -4964947456845241780L;
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