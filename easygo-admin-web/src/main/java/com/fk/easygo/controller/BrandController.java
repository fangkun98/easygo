package com.fk.easygo.controller;

import com.fk.easygo.api.BrandClient;
import com.fk.easygo.pojo.Brand;
import com.fk.easygo.utils.MessageResults;
import com.fk.easygo.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName BrandController
 * @Description TODO
 * @Date 2020/3/27 14:26
 * @Created by FangKun
 */
@Controller
@Scope("prototype")
public class BrandController {

    @Autowired
    BrandClient brandClient;

    @RequestMapping("/brand_getBrands")
    public String getBrands(Model model){
        List<Brand> brands = brandClient.getBrands();
        model.addAttribute("brands",brands);
        return "brand";
    }

    @RequestMapping("/brand_add")
    @ResponseBody
    public MessageResults addBrand(Brand brand){
        MessageResults results=null;
        int count = brandClient.addBrand(brand);
        if(count>0){
            results=new MessageResults(200,"新增成功");
        }else {
            results=new MessageResults(500,"新增失败");
        }
        return results;

    }

    @RequestMapping("/brand_getById")
    @ResponseBody
    public Brand getBrandById( Integer id){
        return brandClient.getBrandById(id);
    }

    @RequestMapping("/brand_update")
    @ResponseBody
    public MessageResults updateBrand(Brand brand){
        MessageResults results=null;
        int count = brandClient.updateBrand(brand);
        if(count>0){
            results=new MessageResults(200,"修改成功");
        }else {
            results=new MessageResults(500,"修改失败");
        }
        return results;
    }

    @RequestMapping("/brand_delete")
    @ResponseBody
    public MessageResults deleteBrand(Integer id){
        MessageResults results=null;
        int count = brandClient.deleteBrand(id);
        if(count>0){
            results=new MessageResults(200,"删除成功");
        }else {
            results=new MessageResults(500,"删除失败");
        }
        return results;
    }

    @RequestMapping("/brand_deleteSome")
    @ResponseBody
    public MessageResults deleteSome(String ids){
        MessageResults results=null;
        int count = brandClient.deleteSome(ids);
        System.out.println("ids"+ids);
        if(count>0){
            results=new MessageResults(200,"批量删除成功");
        }else {
            results=new MessageResults(500,"批量删除失败");
        }
        return results;
    }

    @RequestMapping("/brand_deleteSome1")
    @ResponseBody
    public MessageResults deleteSome1(Integer[] ids){
        MessageResults results=null;
        int count = brandClient.deleteSome1(ids);
        System.out.println("ids"+ids);
        if(count>0){
            results=new MessageResults(200,"批量删除成功");
        }else {
            results=new MessageResults(500,"批量删除失败");
        }
        return results;
    }

    @RequestMapping("/brand_page")
    public String getBrandsByPage(@RequestParam(defaultValue = "1",required = false) Integer pageIndex,
                                  @RequestParam(defaultValue = "5",required = false) Integer pageSize,Model model){

        PageUtils<Brand> pageUtils = brandClient.getBrandsByPage(pageIndex, pageSize);

        model.addAttribute("pageUtils",pageUtils);
        return "brand";
    }


}
