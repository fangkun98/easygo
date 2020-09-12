package com.fk.easygo.service;

import com.fk.easygo.pojo.Goods;

import java.util.List;

/**
 * @ClassName GoodsService
 * @Description TODO
 * @Date 2020/4/10 21:12
 * @Created by FangKun
 */
public interface GoodsService {
    /*
     * 查询所有的上架的商品数据
     */
    public List<Goods> getGoods(Integer is_marketable);

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    public Goods getGoodsById(Long id);
}
