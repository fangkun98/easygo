package com.fk.easygo.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName JsonBean
 * @Description TODO
 * @Date 2020/4/4 16:25
 * @Created by FangKun
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsonBean implements Serializable {

    private static final long serialVersionUID = -4966837857704664487L;
    private Integer id;
    private String text;
}
