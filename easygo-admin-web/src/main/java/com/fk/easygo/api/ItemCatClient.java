package com.fk.easygo.api;

import com.fk.easygo.pojo.ItemCat;
import com.fk.easygo.utils.PageUtils;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName ItemCatClient
 * @Description TODO
 * @Date 2020/4/7 20:39
 * @Created by FangKun
 */
@FeignClient(value = "easygo-itemcat-service")
public interface ItemCatClient {
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
                                           @RequestParam(value = "parent_id",defaultValue = "0") Integer parent_id);

    /**
     * 根据ID查询一个分类对象
     * @param id
     * @return
     */
    @RequestMapping("/itemcat_getById")
    public ItemCat getItemCatById(@RequestParam Integer id);


    //新增
    @RequestMapping("/addItemCat")
    public Integer addItemCat(@RequestBody ItemCat itemCat);
    //修改
    @RequestMapping("/updateItemCat")
    public Integer updateItemCat(@RequestBody ItemCat itemCat);
}
