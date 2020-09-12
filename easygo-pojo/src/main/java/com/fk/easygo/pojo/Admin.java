package com.fk.easygo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName Admin
 * @Description TODO
 * @Date 2020/3/29 15:29
 * @Created by FangKun
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin implements Serializable {
    private static final long serialVersionUID = 139721125427798745L;
    private Integer id;
    private String username;
    private String password;
    private String status;
    private String photo;
    private String del;
}
