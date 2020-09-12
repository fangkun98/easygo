package com.fk.easygo.controller;

import com.fk.easygo.pojo.GoodsDesc;
import com.fk.easygo.service.GoodsDescService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName GoodsDescController
 * @Description TODO
 * @Date 2020/4/14 18:52
 * @Created by FangKun
 */
@RestController
@Scope("prototype")
public class GoodsDescController {

    @Autowired
    GoodsDescService goodsDescService;

    @RequestMapping("goodsDesc_getById")
    public GoodsDesc getGoodsDescById(@RequestParam("id") Long id){
        return  goodsDescService.getGoodsDescById(id);
    }

}
