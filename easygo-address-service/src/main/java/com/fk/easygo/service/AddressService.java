package com.fk.easygo.service;
import com.fk.easygo.pojo.Address;

import java.util.List;
/**
 * @ClassName AddressService
 * @Description TODO
 * @Date 2020/4/22 9:32
 * @Created by FangKun
 */
public interface AddressService {

    List<Address> getMyAddress(String userName);

    public Address getMyDeafultAddress(String userName);

    public Address getAddressById(Long id);
}
