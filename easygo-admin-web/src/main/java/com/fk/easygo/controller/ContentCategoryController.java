package com.fk.easygo.controller;

import com.fk.easygo.api.ContentCategoryClient;
import com.fk.easygo.pojo.ContentCategory;
import com.fk.easygo.utils.MessageResults;
import com.fk.easygo.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName ContentCategoryController
 * @Description TODO
 * @Date 2020/3/30 23:55
 * @Created by FangKun
 */
@Controller
@Scope("prototype")
public class ContentCategoryController {

    @Autowired
    ContentCategoryClient contentCategoryClient;


    @RequestMapping("/contentCategory_delete")
    @ResponseBody
    public MessageResults deleteContentCategory( Integer id){
        int count = contentCategoryClient.deleteContentCategory(id);
        MessageResults results = null;
        if (count > 0) {
            results = new MessageResults(200, "删除成功");
        } else {
            results = new MessageResults(500, "删除失败");
        }
        return results;
    }


    /**
     * 03-更新广告分类
     * @param category
     * @return
     */
    @RequestMapping("/contentCategory_update")
    @ResponseBody
    public MessageResults contentCategory_update(ContentCategory category){
        int count = contentCategoryClient.updateContentCategory(category);
        MessageResults results = null;
        if (count > 0) {
            results = new MessageResults(200, "更新成功");
        } else {
            results = new MessageResults(500, "更新失败");
        }
        return results;
    }

    @RequestMapping("/contentCategory_getById")
    @ResponseBody
    public ContentCategory contentCategory_getById(Integer id){
        System.out.println("查询ID是:"+id);
        return contentCategoryClient.getById(id);
    }

    /**
     * 02-新增广告分类
     * @param category
     * @return
     */
    @RequestMapping("/contentCategory_add")
    @ResponseBody
    public MessageResults contentCategory_add(ContentCategory category){
        int count = contentCategoryClient.addContentCategory(category);
        MessageResults results = null;
        if (count > 0) {
            results = new MessageResults(200, "新增成功");
        } else {
            results = new MessageResults(500, "新增失败");
        }
        return results;
    }

    /**
     * 01-广告分类列表
     * @param pageIndex
     * @param pageSize
     * @param name
     * @param model
     * @return
     */
    @RequestMapping("/contentCategory_page")
    public String getcontentCategorys(@RequestParam(defaultValue = "1",required = false) Integer pageIndex, @RequestParam(defaultValue = "5",required = false) Integer pageSize,
                                      @RequestParam(defaultValue = "",required = false) String name, Model model){
        System.out.println("pageIndex="+pageIndex);
        System.out.println("pageSize="+pageSize);
        System.out.println("name="+name);
        PageUtils<ContentCategory> pageUtils = contentCategoryClient.getcontentCategorys(pageIndex, pageSize, name);
        System.out.println(pageUtils);
        model.addAttribute("pageUtils",pageUtils);
        //回显搜素条件
        model.addAttribute("name",name);
        return "content_category";
    }

    /**
     * 下拉框数据
     * @return
     */
    @RequestMapping("/contentCategory_list")
    @ResponseBody
    public List<ContentCategory> getContentCategorys(){
        return contentCategoryClient.getContentCategorys();
    }


}
