package com.fk.easygo.service;

import com.fk.easygo.pojo.Item;
import com.fk.easygo.pojo.OrderItem;

import java.util.List;

/**
 * @ClassName ItemService
 * @Description TODO
 * @Date 2020/4/14 21:29
 * @Created by FangKun
 */
public interface ItemService {

    //查询商品的所有SKU对象
    public List<Item> getItemsByGoodsId(Long goodsId);

    //根据ID查询对象
    public Item getItemById(Long itemId);

    //更新数据量
    public int updateItemNum(List<OrderItem> orderItems);
}
