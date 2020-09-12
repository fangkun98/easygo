package com.fk.easygo.mapper;

import com.fk.easygo.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName AdminMapper
 * @Description TODO
 * @Date 2020/3/29 15:42
 * @Created by FangKun
 */
@Mapper
public interface AdminMapper {
    public Admin adminLogin(Admin admin);
}
