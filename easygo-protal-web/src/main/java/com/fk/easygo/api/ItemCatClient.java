package com.fk.easygo.api;

import com.fk.easygo.pojo.ItemCat;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ClassName ItemCatClient
 * @Description TODO
 * @Date 2020/4/7 21:49
 * @Created by FangKun
 */
@FeignClient(value="easygo-itemcat-service")
public interface ItemCatClient {
    @RequestMapping("/itemcat_all")
    public List<ItemCat> getItemCats();
}
