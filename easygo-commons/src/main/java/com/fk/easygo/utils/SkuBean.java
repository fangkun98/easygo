package com.fk.easygo.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Map;

/**
 * @ClassName SkuBean
 * @Description TODO
 * @Date 2020/4/14 21:44
 * @Created by FangKun
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SkuBean implements Serializable {

    private static final long serialVersionUID = -6632204805687705589L;
    private Long id;
    private String title;
    private Double price;
    private Map<String,Object> spec; //规格
}

