package com.fk.easygo.controller;

import com.fk.easygo.pojo.Goods;
import com.fk.easygo.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName GoodsCotroller
 * @Description TODO
 * @Date 2020/4/10 21:13
 * @Created by FangKun
 */
@RestController
@Scope("prototype")
public class GoodsCotroller {

    @Autowired
    GoodsService goodsService;

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    @RequestMapping("/goods_getGoodsById")
    public Goods getGoodsById(@RequestParam("id") Long id){
        return goodsService.getGoodsById(id);
    }

    /*
     * 查询所有的上架的商品数据
     */
    @RequestMapping("/goods_getGoods")
    public List<Goods> getGoods(@RequestParam Integer is_marketable){
        return  goodsService.getGoods(is_marketable);
    }
}