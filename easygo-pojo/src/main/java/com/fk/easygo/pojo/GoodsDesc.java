package com.fk.easygo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName GoodsDesc
 * @Description TODO
 * @Date 2020/4/14 18:27
 * @Created by FangKun
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodsDesc implements Serializable {

    private static final long serialVersionUID = 8607089815521207827L;

    private Long goods_id; //商品ID
    private String introduction; //商品详情介绍
    private String specification_items; //商品规格属性
    private String custom_attribute_items;//扩展属性
    private String package_list; //包装列表
    private String sale_service; //售后详情
    private String item_images; //商品图片集合

}
