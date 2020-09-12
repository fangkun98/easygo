package com.fk.easygo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName User
 * @Description TODO
 * @Date 2020/4/16 0:27
 * @Created by FangKun
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users implements Serializable {

    private static final long serialVersionUID = 9132549307316803378L;
    private Long id;
    private String username;
    private String password;
    private String phone;
    private String email;
    private String created;
    private String updated;
    private String source_type;
    private String nick_name;
    private String name;
    private String status;
    private String head_pic;
    private String qq;
    private double account_balance;
    private String is_email_check;
    private String is_mobile_check;
    private String sex;
    private Integer user_level;
    private Integer points;
    private Integer experience_value;
    private String birthday;
    private String last_login_time;
    private Integer del;
}
