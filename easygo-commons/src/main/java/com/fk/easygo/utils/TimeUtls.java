package com.fk.easygo.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName TimeUtls
 * @Description TODO
 * @Date 2020/4/22 17:21
 * @Created by FangKun
 */
public class TimeUtls {

    public static String getNow(){
        SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return f.format(new Date());
    }
}
