package com.fk.easygo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Transient;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldIndex;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

/**
 * @ClassName Goods
 * @Description TODO
 * @Date 2020/4/10 20:34
 * @Created by FangKun
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
//文档对象是(索引库名，类型)
@Document(indexName = "goodsindex",type = "goods")
public class Goods implements Serializable {

    private static final long serialVersionUID = 7171775483780752996L;

    // 是否存储  是否索引  字段的配置 类型
//    @Field(store = true,index = false,type = FieldType.Long)
    @Field(store = true,index = FieldIndex.not_analyzed,type = FieldType.Long)
    private Long id;

    private String seller_id; //卖家ID

    // 是否存储 分词器 是否索引   搜索分词器   类型
//    @Field(store = true,analyzer = "ik_max_word",index = true,searchAnalyzer ="ik_max_word",type = FieldType.Text)
    @Field(store = true,analyzer = "ik_max_word",index = FieldIndex.analyzed,searchAnalyzer ="ik_max_word",type = FieldType.String)
    private String goods_name;  //商品的标题

    @Transient
    private Integer default_item_id; //默认上架商品ID
    @Transient
    private String audit_status; //当前状态
    @Transient
    private String is_marketable; //是否上架

    //@Field(store = true,index = false,type = FieldType.Integer)
    @Field(store = true,index = FieldIndex.not_analyzed,type = FieldType.Integer)
    private Integer brand_id;  //商品的品牌ID

    //@Field(store = true,analyzer = "ik_max_word",index = true,searchAnalyzer ="ik_max_word",type = FieldType.Text)
    @Field(store = true,analyzer = "ik_max_word",index = FieldIndex.analyzed,searchAnalyzer ="ik_max_word",type = FieldType.String)
    private String caption;  //商品的副标题

    @Transient
    private Integer category1_id;
    @Transient
    private Integer category2_id;
    @Transient
    private Integer category3_id;

    //@Field(store = true,index = false,type = FieldType.Text)
    @Field(store = true,index = FieldIndex.not_analyzed,type = FieldType.String)
    private String small_pic;  //商品的小图

    //@Field(store = true,index = false,type = FieldType.Double)
    @Field(store = true,index = FieldIndex.not_analyzed,type = FieldType.Double)
    private Double price;  //商品的价格

    @Transient
    private Integer type_template_id;
    @Transient
    private String is_enable_spec;
    @Transient
    private String is_delete;
}