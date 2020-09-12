package com.fk.easygo.controller;

import com.fk.easygo.pojo.Brand;
import com.fk.easygo.service.BrandService;

import com.fk.easygo.utils.PageUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName BrandController
 * @Description TODO
 * @Date 2020/3/27 13:42
 * @Created by FangKun
 */
@RestController
@Scope("prototype")
public class BrandController {
    @Resource
    private BrandService brandService;

    @RequestMapping("/brand_getBrands")
    public List<Brand> getBrands(){
        return brandService.getBrands();
    }

    @RequestMapping("/brand_add")
    public int addBrand(@RequestBody  Brand brand){
       return brandService.addBrand(brand);
    }

    @RequestMapping("/brand_update")
    public int updateBrand(@RequestBody Brand brand){
        return brandService.updateBrand(brand);
    }

    @RequestMapping("/brand_getBrandById")
    public Brand getBrandById(@RequestParam Integer id){
        return brandService.getBrandById(id);
    }

    @RequestMapping("/brand_delete")
    public int deleteBrand(@RequestParam Integer id) {
        return brandService.deleteBrand(id);
    }

    @RequestMapping("/brand_deleteSome")
    public int deleteSome(@RequestParam String ids) {
        return brandService.deleteSome(ids);
    }

    @RequestMapping("/brand_deleteSome1")
    public int deleteSome1(@RequestParam Integer[] ids) {
        return brandService.deleteSome1(ids);
    }


    @RequestMapping("/brand_page")
    public PageUtils getBrandsByPage(@RequestParam(defaultValue = "1",required = false) Integer pageIndex, @RequestParam(defaultValue = "5",required = false) Integer pageSize){
        int totalCount = brandService.getTotalCount();
        HashMap<String, Object> map = new HashMap<>();
        map.put("pageStart",(pageIndex-1)*pageSize);
        map.put("pageSize",pageSize);
        List<Brand> brands = brandService.getPageBrands(map);
        //封装一个通用的分页工具栏
        PageUtils pageUtils = new PageUtils(pageIndex,pageSize,totalCount,brands);
        return pageUtils;
    }

}
