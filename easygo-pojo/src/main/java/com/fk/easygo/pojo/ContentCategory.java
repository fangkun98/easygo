package com.fk.easygo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName ContentCategory
 * @Description TODO
 * @Date 2020/3/30 9:54
 * @Created by FangKun
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContentCategory implements Serializable {

    private static final long serialVersionUID = 4626221642621821231L;
    private Integer id;
    private  String name;
    private  Integer del;
}
