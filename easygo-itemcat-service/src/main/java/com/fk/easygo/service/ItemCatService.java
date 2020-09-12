package com.fk.easygo.service;

import com.fk.easygo.pojo.ItemCat;

import java.util.List;
import java.util.Map;

/**
 * @ClassName ItemCatService
 * @Description TODO
 * @Date 2020/4/7 20:31
 * @Created by FangKun
 */
public interface ItemCatService {

    // parent_id=0 表示一级分类
    public Integer getTotalCount(Map<String,Object> map);

    public List<ItemCat> getItemCatsByPage(Map<String,Object> map);

    public ItemCat getItemCatById(Integer id);

    //查询有效的分类数据
    public List<ItemCat> getItemCats();

    public Integer addItemCat(ItemCat itemCat);

    //修改
    public Integer updateItemCat(ItemCat itemCat);
}
