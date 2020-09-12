package com.fk.easygo.controller;

import com.fk.easygo.pojo.Address;
import com.fk.easygo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName AddressController
 * @Description TODO
 * @Date 2020/4/21 23:29
 * @Created by FangKun
 */
@RestController
@Scope("prototype")
public class AddressController {

    @Autowired
    AddressService addressService;

    @RequestMapping("/address_getMyAddress")
    List<Address> getMyAddress(@RequestParam("userName") String userName){
        return addressService.getMyAddress(userName);
    }

    @RequestMapping("/address_getMyDeafultAddress")
    public Address getMyDeafultAddress(@RequestParam("userName")  String userName){
        return addressService.getMyDeafultAddress(userName);
    }

    @RequestMapping("/address_getAddressById")
    public Address getAddressById(@RequestParam("id")  Long id){
        return addressService.getAddressById(id);
    }

}
