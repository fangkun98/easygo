package com.fk.easygo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName Address
 * @Description TODO
 * @Date 2020/4/21 23:26
 * @Created by FangKun
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address implements Serializable {

    private static final long serialVersionUID = 7792973092057173760L;
    private Long id;
    private String username;
    private String province_id;
    private String city_id;
    private String town_id;
    private String mobile;
    private String address;
    private String contact;
    private String notes;
    private String is_default;
    private String create_date;
    private String alias;
}
