package com.fk.easygo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName Brand
 * @Description TODO
 * @Date 2020/3/27 13:02
 * @Created by FangKun
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Brand implements Serializable {
    private static final long serialVersionUID = -6821320376527247068L;
    private Integer id;
    private String name;
    private String image;
    private String first_char;
    private Integer del;

    //扩展属性
    private Boolean flag=false; //默认是false
}
