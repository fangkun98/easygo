package com.fk.easygo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName LoginLog
 * @Description TODO
 * @Date 2020/3/29 18:25
 * @Created by FangKun
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginLog implements Serializable {
    private static final long serialVersionUID = 7495375559311381385L;
    private int id;
    private String ip;
    private String no;
    private String createtime;
    private String location;

    public LoginLog(String ip, String no, String location) {
        this.ip = ip;
        this.no = no;
        this.location = location;
    }
}
