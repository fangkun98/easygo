package com.fk.easygo.mapper;

import com.fk.easygo.pojo.Item;
import com.fk.easygo.pojo.OrderItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName ItemMapper
 * @Description TODO
 * @Date 2020/4/14 21:26
 * @Created by FangKun
 */
@Mapper
public interface ItemMapper {

    //查询商品的所有SKU对象
    public List<Item> getItemsByGoodsId(Long goodsId);

    //根据ID查询对象
    public Item getItemById(Long itemId);

    //更新库存
    public int updateItemNum(OrderItem orderItem);

}
