package com.fk.easygo.service.impl;

import com.fk.easygo.dao.GoodsDao;
import com.fk.easygo.pojo.Goods;
import com.fk.easygo.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @ClassName GoodsServiceImpl
 * @Description TODO
 * @Date 2020/4/11 13:40
 * @Created by FangKun
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    GoodsDao goodsDao;

    @Override
    public Goods saveDocument(Goods goods) {
        return goodsDao.save(goods);
    }

    @Override
    public Iterable<Goods> saveDocuments(List<Goods> list) {
        return goodsDao.saveAll(list);
    }

    @Override
    public Goods getDocumentById(Long id) {
        Optional<Goods> optional = goodsDao.findById(id);
        return optional.get();
    }

    @Override
    public void updateDocumentById(Goods goods) {
        goodsDao.save(goods);//如果对象上有ID 那么就更新 如果没有ID 就新增
    }

    @Override
    public void deleteDocumentById(Long id) {
        goodsDao.deleteById(id);
    }

    @Override
    public void deleteAllDocument() {
        goodsDao.deleteAll();
    }
}