package com.fk.easygo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName TypeTemplate
 * @Description TODO
 * @Date 2020/4/4 15:29
 * @Created by FangKun
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TypeTemplate implements Serializable {
    private static final long serialVersionUID = -2847663212458687286L;

    private Integer id;
    private String name;
    private String spec_ids;
    private String brand_ids;
    private String custom_attribute_items;
    private Integer del;

}
