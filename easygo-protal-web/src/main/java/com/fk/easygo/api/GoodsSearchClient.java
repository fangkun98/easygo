package com.fk.easygo.api;

import com.fk.easygo.pojo.Goods;
import com.fk.easygo.utils.PageUtils;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName GoodsSearchClient
 * @Description TODO
 * @Date 2020/4/11 15:21
 * @Created by FangKun
 */
@FeignClient(value = "easygo-search-service")
public interface GoodsSearchClient {

    /**
     * 01-搜索的接口
     * @param pageIndex
     * @param pageSize
     * @param keywords
     * @return
     */
    @RequestMapping("/goods_search")
    public PageUtils<Goods> goods_search(
            @RequestParam(value = "pageIndex",defaultValue = "1") Integer pageIndex,
            @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
            @RequestParam(value = "keywords",defaultValue = "") String keywords);
}
