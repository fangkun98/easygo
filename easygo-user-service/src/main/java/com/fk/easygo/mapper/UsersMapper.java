package com.fk.easygo.mapper;

import com.fk.easygo.pojo.Users;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @Date 2020/4/16 0:34
 * @Created by FangKun
 */
@Mapper
public interface UsersMapper {

    public Integer registerUsers(Users users);
}
