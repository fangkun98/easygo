package com.fk.easygo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName ItemCat
 * @Description TODO
 * @Date 2020/4/7 19:34
 * @Created by FangKun
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemCat implements Serializable {

    private static final long serialVersionUID = 3592510036559411318L;
    private  Integer id;
    private Integer parent_id;
    private String name;
    private TypeTemplate typeTemplate; //外键对应  typeTemplate表  type_id
    private Integer del;
}
