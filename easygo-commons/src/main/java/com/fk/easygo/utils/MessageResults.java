package com.fk.easygo.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName MessageResults
 * @Description TODO
 * @Date 2020/3/28 0:55
 * @Created by FangKun
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageResults {
    private Integer code;
    private String message;
}
