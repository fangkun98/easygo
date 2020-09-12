package com.fk.easygo.service.impl;

import com.fk.easygo.mapper.GoodsDescMapper;
import com.fk.easygo.pojo.GoodsDesc;
import com.fk.easygo.service.GoodsDescService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName GoodsDescServiceImpl
 * @Description TODO
 * @Date 2020/4/14 18:52
 * @Created by FangKun
 */
@Service
public class GoodsDescServiceImpl implements GoodsDescService {

    @Resource
    GoodsDescMapper goodsDescMapper;

    @Override
    public GoodsDesc getGoodsDescById(Long id) {
        return goodsDescMapper.getGoodsDescById(id);
    }
}