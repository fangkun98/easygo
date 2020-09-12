package com.fk.easygo.service.impl;

import com.fk.easygo.mapper.AddressMapper;
import com.fk.easygo.pojo.Address;
import com.fk.easygo.service.AddressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName AddressServiceImpl
 * @Description TODO
 * @Date 2020/4/21 23:28
 * @Created by FangKun
 */
@Service
public class AddressServiceImpl implements AddressService {

    @Resource
    AddressMapper addressMapper;

    @Override
    public List<Address> getMyAddress(String userName) {
        return addressMapper.getMyAddress(userName);
    }

    @Override
    public Address getMyDeafultAddress(String userName) {
        return addressMapper.getMyDeafultAddress(userName);
    }

    @Override
    public Address getAddressById(Long id) {
        return addressMapper.getAddressById(id);
    }
}