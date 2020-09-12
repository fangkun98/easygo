package com.fk.easygo.api;

import com.fk.easygo.pojo.ContentCategory;
import com.fk.easygo.utils.PageUtils;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @ClassName ContentCategoryClient
 * @Description TODO
 * @Date 2020/3/30 23:50
 * @Created by FangKun
 */
@FeignClient(value = "easygo-ad-service")
public interface ContentCategoryClient {
    @RequestMapping("/contentCategory_delete")
    public int deleteContentCategory(@RequestParam Integer id);

    @RequestMapping("/contentCategory_update")
    public int updateContentCategory(@RequestBody ContentCategory contentCategory);

    @RequestMapping("/contentCategory_getById")
    public ContentCategory getById(@RequestParam Integer id);

    @RequestMapping("/contentCategory_add")
    public int addContentCategory(@RequestBody ContentCategory contentCategory);

    @RequestMapping("/contentCategory_page")
    public PageUtils<ContentCategory> getcontentCategorys(@RequestParam(defaultValue = "1",required = false) Integer pageIndex, @RequestParam(defaultValue = "5",required = false) Integer pageSize,
                                                          @RequestParam(defaultValue = "",required = false) String name);

    //查询广告分类
    @RequestMapping("/contentCategory_list")
    public List<ContentCategory> getContentCategorys();

}
