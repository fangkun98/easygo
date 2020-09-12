package com.fk.easygo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName SpecificationOption
 * @Description TODO
 * @Date 2020/4/2 21:38
 * @Created by FangKun
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SpecificationOption implements Serializable {
    private static final long serialVersionUID = -2558488094393738297L;

    private Integer id;
    private String option_name;

    private Specification specification; //外键对象

    //private Integer spec_id;
    private Integer orders;
    private Integer del;

}
