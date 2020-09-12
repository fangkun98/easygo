package com.fk.easygo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName Specification
 * @Description TODO
 * @Date 2020/4/2 21:37
 * @Created by FangKun
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Specification implements Serializable {
    private static final long serialVersionUID = -1152422425260868619L;

    private Integer id;
    private String spec_name;
    private Integer del;

    //扩展属性
    private Boolean flag=false;
}
