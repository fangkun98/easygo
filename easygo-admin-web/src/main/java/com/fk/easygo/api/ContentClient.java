package com.fk.easygo.api;

import com.fk.easygo.pojo.Content;
import com.fk.easygo.utils.PageUtils;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @ClassName ContentClient
 * @Description TODO
 * @Date 2020/3/31 9:09
 * @Created by FangKun
 */

@FeignClient(value = "easygo-ad-service")
public interface ContentClient {


    @RequestMapping("/content_getContentsByCategoryId")
    public List<Content> getContentsByCategoryId(@RequestParam Integer categoryId);


    @RequestMapping("/content_page")
    public PageUtils<Content> getContent_page(@RequestParam(defaultValue = "1",required = false) Integer pageIndex,
                                              @RequestParam(defaultValue = "5",required = false) Integer pageSize);


    @RequestMapping("/content_updateStatus")
    public Integer updateStatus(@RequestParam Integer id,@RequestParam Integer status);

    //添加广告
    @RequestMapping("/content_add")
    public Integer addContent(@RequestBody Content content);

    @RequestMapping("/content_delete")
    public int deleteContent(@RequestParam Integer id);

    @RequestMapping("content_update")
    public Integer updateContent(@RequestBody Content content);

    @RequestMapping("/content_getContentById")
    public Content getContentById(@RequestParam Integer id);

}
