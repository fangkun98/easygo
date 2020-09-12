package com.fk.easygo.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName OrderUrl
 * @Description TODO 扩展对象
 * @Date 2020/4/14 19:24
 * @Created by FangKun
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderUrl implements Serializable {


    private static final long serialVersionUID = 7297204640008748981L;
    private Integer order;
    private String url;
}