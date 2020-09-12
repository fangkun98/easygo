package com.fk.easygo.controller;

import com.fk.easygo.api.GoodsSearchClient;
import com.fk.easygo.pojo.Goods;
import com.fk.easygo.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName GoodsSearchController
 * @Description TODO
 * @Date 2020/4/11 15:21
 * @Created by FangKun
 */
@Controller
@Scope("prototype")
public class GoodsSearchController {

    @Autowired
    GoodsSearchClient goodsSearchClient;

    /**
     * 01-搜索的接口
     * @param pageIndex
     * @param pageSize
     * @param keywords
     * @return
     */
    @RequestMapping("/goods_search")
    public String goods_search(
            @RequestParam(value = "pageIndex",defaultValue = "1") Integer pageIndex,
            @RequestParam(value = "pageSize",defaultValue = "20") Integer pageSize,
            @RequestParam(value = "keywords",defaultValue = "") String keywords, Model model){

        PageUtils<Goods> pageUtils = goodsSearchClient.goods_search(pageIndex, pageSize, keywords);
        model.addAttribute("pageUtils",pageUtils);
        System.out.println("搜索结果:"+pageUtils);
        //回显搜索条件
        model.addAttribute("keywords",keywords);
        //搜索列表页面
        return "categoryList";
    }
}
