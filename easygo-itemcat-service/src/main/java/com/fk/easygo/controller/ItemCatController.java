package com.fk.easygo.controller;

import com.fk.easygo.pojo.ItemCat;
import com.fk.easygo.service.ItemCatService;
import com.fk.easygo.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName ItemCatController
 * @Description TODO
 * @Date 2020/4/7 20:33
 * @Created by FangKun
 */
@RestController
@Scope("prototype")
public class ItemCatController {
    @Autowired
    ItemCatService itemCatService;


//    @Autowired
////    RedisTemplate<String, Object> redisTemplate;


    @RequestMapping("/updateItemCat")
    public Integer updateItemCat(@RequestBody ItemCat itemCat){
        return itemCatService.updateItemCat(itemCat);
    }




    @RequestMapping("/addItemCat")
    public Integer addItemCat(@RequestBody ItemCat itemCat){
        return itemCatService.addItemCat(itemCat);
    }


    /**
     * 所有类目
     * @return
     */
    @RequestMapping("/itemcat_all")
    public List<ItemCat> getItemCats(){
        return itemCatService.getItemCats();
    }


    /**
     * 根据ID查询一个分类对象
     * @param id
     * @return
     */
    @RequestMapping("/itemcat_getById")
    public ItemCat getItemCatById(@RequestParam Integer id){
        return itemCatService.getItemCatById(id);
    }

    /**
     * 01-商品分类的接口
     * @param pageIndex
     * @param pageSize
     * @param parent_id
     * @return
     */

    @RequestMapping("/itemcat_page")
    public PageUtils<ItemCat> itemcat_page(@RequestParam(value = "pageIndex",defaultValue = "1") Integer pageIndex,
                                           @RequestParam(value = "pageSize",defaultValue = "5") Integer pageSize,
                                           @RequestParam(value = "parent_id",defaultValue = "0") Integer parent_id){
        Map<String,Object> map=new HashMap<>();
        map.put("pageStart",(pageIndex-1)*pageSize);
        map.put("pageSize",pageSize);
        map.put("parent_id",parent_id);

        Integer totalCount = itemCatService.getTotalCount(map);
        List<ItemCat> itemCats = itemCatService.getItemCatsByPage(map);
        return new PageUtils<>(pageIndex,pageSize,totalCount,itemCats);
    }
    /**
     * 下面这个添加缓存失败
     */

   /* @RequestMapping("/itemcat_page")
    public PageUtils<ItemCat> itemcat_page(@RequestParam(value = "pageIndex",defaultValue = "1") Integer pageIndex,
                                           @RequestParam(value = "pageSize",defaultValue = "5") Integer pageSize,
                                           @RequestParam(value = "parent_id",defaultValue = "0") Integer parent_id){
        Map<String,Object> map=new HashMap<>();
        map.put("pageStart",(pageIndex-1)*pageSize);
        map.put("pageSize",pageSize);
        map.put("parent_id",parent_id);

        Integer totalCount = itemCatService.getTotalCount(map);
        List<ItemCat> itemCats = itemCatService.getItemCatsByPage(map);


        //先从缓存中查询一边，是否有缓存数据
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<>(ArrayList.class));
        PageUtils<ItemCat> itemCatPageUtils = (PageUtils<ItemCat>) redisTemplate.opsForValue().get("itemcat_key");
        if(itemCatPageUtils==null){
            System.out.println("缓存中没有itemCat数据....查询数据库");
            itemCatPageUtils= new PageUtils<ItemCat>(pageIndex, pageSize, totalCount, itemCats);
            redisTemplate.opsForValue().set("itemcat_key", itemCatPageUtils);
            return itemCatPageUtils;
        }else {
            System.out.println("缓存中已有itemCat数据....查询数据库");
            return itemCatPageUtils;
        }
    }*/
}
