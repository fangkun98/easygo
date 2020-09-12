package com.fk.easygo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName Content
 * @Description TODO 广告
 * @Date 2020/3/31 8:59
 * @Created by FangKun
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Content implements Serializable {

    private static final long serialVersionUID = -9178300371393810912L;
    private Integer id;
    private ContentCategory contentCategory; //外键字段
    private String title;
    private String url;
    private String pic;
    private String status="0"; //默认值，如果没有勾选 默认是0 如果勾选是1
    private Integer sort_order;
    private Integer del;

}
