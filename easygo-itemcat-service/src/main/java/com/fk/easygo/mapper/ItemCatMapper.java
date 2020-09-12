package com.fk.easygo.mapper;

import com.fk.easygo.pojo.ItemCat;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @ClassName ItemCatMapper
 * @Description TODO
 * @Date 2020/4/7 19:39
 * @Created by FangKun
 */
@Mapper
public interface ItemCatMapper {

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
