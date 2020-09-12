package com.fk.easygo.service.impl;

import com.fk.easygo.mapper.GoodsMapper;
import com.fk.easygo.pojo.Goods;
import com.fk.easygo.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName GoodServiceImpl
 * @Description TODO
 * @Date 2020/4/10 21:13
 * @Created by FangKun
 */
@Service
public class GoodServiceImpl implements GoodsService {

    @Resource
    GoodsMapper goodsMapper;

    @Override
    public List<Goods> getGoods(Integer is_marketable) {
        return goodsMapper.getGoods(is_marketable);
    }

    @Override
    public Goods getGoodsById(Long id) {
        return goodsMapper.getGoodsById(id);
    }
}