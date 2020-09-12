package com.fk.easygo.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName JsonObject
 * @Description TODO
 * @Date 2020/4/4 16:25
 * @Created by FangKun
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JsonObject implements Serializable {

    private static final long serialVersionUID = 5082605674447175837L;

    private Integer id;
    private String text;
}
