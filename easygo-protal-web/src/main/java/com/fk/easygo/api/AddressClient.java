package com.fk.easygo.api;

import com.fk.easygo.pojo.Address;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @ClassName AddressClient
 * @Description TODO
 * @Date 2020/4/21 23:35
 * @Created by FangKun
 */
@FeignClient(value = "easygo-address-service")
public interface AddressClient {

    @RequestMapping("/address_getMyAddress")
    List<Address> getMyAddress(@RequestParam("userName") String userName);

    @RequestMapping("/address_getMyDeafultAddress")
    public Address getMyDeafultAddress(@RequestParam("userName")  String userName);

    @RequestMapping("/address_getAddressById")
    public Address getAddressById(@RequestParam("id")  Long id);
}