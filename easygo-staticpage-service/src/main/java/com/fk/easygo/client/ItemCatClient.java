package com.fk.easygo.client;

import com.fk.easygo.pojo.ItemCat;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName ItemCatClient
 * @Description TODO
 * @Date 2020/4/14 19:18
 * @Created by FangKun
 */
@FeignClient(value = "easygo-itemcat-service")
public interface ItemCatClient {

    /**
     * 根据ID查询一个分类对象
     * @param id
     * @return
     */
    @RequestMapping("/itemcat_getById")
    public ItemCat getItemCatById(@RequestParam Integer id);
}