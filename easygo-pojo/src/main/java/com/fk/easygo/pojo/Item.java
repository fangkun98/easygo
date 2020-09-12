package com.fk.easygo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName Item
 * @Description TODO SKU的实体类
 * @Date 2020/4/14 21:19
 * @Created by FangKun
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item implements Serializable {


    private static final long serialVersionUID = 1758619792695538840L;
    private Long id;
    private String title;
    private String sell_point;
    private Double price;
    private Long stock_count;
    private Long num;
    private String barcode;
    private String image;
    private Long categoryId;
    private String status;
    private String createTime;
    private String updateTime;
    private String item_sn;
    private Double cost_pirce;
    private Double market_price;
    private String is_default;
    private Long goods_id;
    private String seller_id;
    private String cart_thumbnail;
    private String category;
    private String brand;
    private String spec;
    private String seller;
}