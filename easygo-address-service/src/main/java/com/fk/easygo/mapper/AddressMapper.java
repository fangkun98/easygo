package com.fk.easygo.mapper;

import com.fk.easygo.pojo.Address;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName AddressMapper
 * @Description TODO
 * @Date 2020/4/22 9:30
 * @Created by FangKun
 */
@Mapper
public interface AddressMapper {
    List<Address> getMyAddress(String userName);

    public Address getMyDeafultAddress(String userName);

    public Address getAddressById(Long id);
}
