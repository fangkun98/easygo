package com.fk.easygo.controller;

import com.fk.easygo.pojo.ContentCategory;
import com.fk.easygo.service.ContentCategoryService;
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
 * @ClassName ContentCategoryController
 * @Description TODO
 * @Date 2020/3/30 23:22
 * @Created by FangKun
 */
@RestController
@Scope("prototype")
public class ContentCategoryController {

    @Autowired
    ContentCategoryService contentCategoryService;

    @RequestMapping("/contentCategory_delete")
    public int deleteContentCategory(@RequestParam Integer id){
        return contentCategoryService.deleteContentCategory(id);
    }

    @RequestMapping("/contentCategory_update")
    public int updateContentCategory(@RequestBody ContentCategory contentCategory){
        return contentCategoryService.updateContentCategory(contentCategory);
    }

    @RequestMapping("/contentCategory_getById")
    public ContentCategory getById(@RequestParam Integer id){
        return  contentCategoryService.getById(id);
    }

    @RequestMapping("/contentCategory_add")
    public int addContentCategory(@RequestBody ContentCategory contentCategory){
        return contentCategoryService.addContentCategory(contentCategory);
    }

    /**
     * 分页接口
     * @param pageIndex
     * @param pageSize
     * @param name
     * @return
     */
    @RequestMapping("/contentCategory_page")
    public PageUtils<ContentCategory> getcontentCategorys(@RequestParam(defaultValue = "1",required = false) Integer pageIndex,
                                                          @RequestParam(defaultValue = "5",required = false) Integer pageSize,
                                                          @RequestParam(defaultValue = "",required = false) String name){
        Map<String,Object> map=new HashMap<>();
        map.put("name","%"+name+"%");
        map.put("pageStart",(pageIndex-1)*pageSize);
        map.put("pageSize",pageSize);

        System.out.println("参数集合:"+map);

        Integer totalCount = contentCategoryService.getTotalCount(map);
        List<ContentCategory> contentCategories = contentCategoryService.getContentCategoryPages(map);
        PageUtils<ContentCategory> pageUtils=new PageUtils<>(pageIndex,pageSize,totalCount,contentCategories);
        return pageUtils;
    }

    //查询广告分类
    @RequestMapping("/contentCategory_list")
    public List<ContentCategory> getContentCategorys(){
        return contentCategoryService.getContentCategorys();
    }

}
