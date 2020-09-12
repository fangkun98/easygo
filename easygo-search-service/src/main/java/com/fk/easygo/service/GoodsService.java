package com.fk.easygo.service;

import com.fk.easygo.pojo.Goods;

import java.util.List;

/**
 * @ClassName GoodsService
 * @Description TODO
 * @Date 2020/4/11 13:39
 * @Created by FangKun
 */
public interface GoodsService {

    //新增文档
    public Goods saveDocument(Goods goods);

    //批量新增
    public Iterable<Goods> saveDocuments(List<Goods> list);

    //根据ID查询文档
    public Goods getDocumentById(Long id);

    //根据ID更新
    public void updateDocumentById(Goods goods);

    //根据ID删除
    public void deleteDocumentById(Long id);

    //全部删除
    public void deleteAllDocument();
}
