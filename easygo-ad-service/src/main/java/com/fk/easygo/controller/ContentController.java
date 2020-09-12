package com.fk.easygo.controller;

import com.fk.easygo.pojo.Content;
import com.fk.easygo.service.ContentService;
import com.fk.easygo.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName ContentController
 * @Description TODO
 * @Date 2020/3/31 9:08
 * @Created by FangKun
 */
@RestController
@Scope("prototype")
public class ContentController {

    @Autowired
    ContentService contentService;

    @RequestMapping("content_update")
    public Integer updateContent(@RequestBody Content content){
        return contentService.updateContent(content);
    }

    @RequestMapping("/content_getContentById")
    public Content getContentById(@RequestParam Integer id){
        return  contentService.getContentById(id);
    }


    @RequestMapping("/content_delete")
    public int deleteContent(@RequestParam Integer id){
        return contentService.deleteContent(id);
    }


    /**
     * 新增广告
     * @param content
     * @return
     */
    @RequestMapping("/content_add")
    public Integer addContent(@RequestBody Content content){
        return contentService.addContent(content);
    }



    /**
     * 修改广告启用禁用状态
     * @param id
     * @param status
     * @return
     */
    @RequestMapping("/content_updateStatus")
    public Integer updateStatus(@RequestParam Integer id,@RequestParam Integer status){
        Map<String,Object> map=new HashMap<>();
        map.put("id",id);
        map.put("status",status);
        return contentService.updateStatus(map);
    }

    /**
     * 查询指定广告
     * @param categoryId
     * @return
     */
    @RequestMapping("/content_getContentsByCategoryId")
    public List<Content> getContentsByCategoryId(@RequestParam Integer categoryId){
        return contentService.getContentsByCategoryId(categoryId);
    }

    @RequestMapping("/content_page")
    public PageUtils<Content> getContent_page(@RequestParam(defaultValue = "1",required = false) Integer pageIndex,
                                              @RequestParam(defaultValue = "5",required = false) Integer pageSize){
        Map<String,Object> map=new HashMap<>();
        map.put("pageStart",(pageIndex-1)*pageSize);
        map.put("pageSize",pageSize);
        Integer totalCount = contentService.getTotalCount();
        List<Content> contents = contentService.getContents(map);
        return new PageUtils<>(pageIndex,pageSize,totalCount,contents);
    }
}
