package com.fk.easygo.dao;

import com.fk.easygo.pojo.Goods;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @ClassName GoodsDao
 * @Description TODO 是ES的dao层
 * @Date 2020/4/10 21:23
 * @Created by FangKun
 */

/**
 * ElasticsearchRepository 是 Spring Data ES 内置接口，一旦继承这个接口，那么就可以继承里面很多有用的方法，直接使用
 *  专门操作ES服务器索引库的方法
 */

@Repository
public interface GoodsDao extends ElasticsearchRepository<Goods,Long> {

    //这个Dao里面什么可以不用写，已经有很多常用的方法，可以使用 因为在父接口中集成过来
}
