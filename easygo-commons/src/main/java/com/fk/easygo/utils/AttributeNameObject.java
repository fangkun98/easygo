package com.fk.easygo.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName AttributeNameObject
 * @Description TODO 规格对象
 * @Date 2020/4/14 19:24
 * @Created by FangKun
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AttributeNameObject implements Serializable {


    private static final long serialVersionUID = 7404864604766441140L;
    private String attributeName;
    private List<String> attributeValue;

}