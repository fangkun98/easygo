package com.fk.easygo.mapper;

import com.fk.easygo.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName GoodsMapper
 * @Description TODO
 * @Date 2020/4/10 21:10
 * @Created by FangKun
 */
@Mapper
public interface GoodsMapper {

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
