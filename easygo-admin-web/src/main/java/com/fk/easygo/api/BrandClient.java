package com.fk.easygo.api;

import com.fk.easygo.pojo.Brand;
import com.fk.easygo.utils.PageUtils;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @ClassName BrandClient
 * @Description TODO
 * @Date 2020/3/27 14:28
 * @Created by FangKun
 */
@FeignClient(value = "easygo-brand-service")
public interface BrandClient {
    @RequestMapping("/brand_getBrands")
    public List<Brand> getBrands();

    @RequestMapping("/brand_add")
    public int addBrand(@RequestBody Brand brand);

    @RequestMapping("/brand_getById")
    public Brand getBrandById(@RequestParam Integer id);

    @RequestMapping("/brand_update")
    public int updateBrand(@RequestBody Brand brand);

    @RequestMapping("/brand_delete")
    public int deleteBrand(@RequestParam Integer id);

    @RequestMapping("/brand_deleteSome")
    public int deleteSome(@RequestParam String ids);

    @RequestMapping("/brand_deleteSome1")
    public int deleteSome1(@RequestParam Integer[] ids);

    @RequestMapping("/brand_page")
    public PageUtils getBrandsByPage(@RequestParam(defaultValue = "1",required = false) Integer pageIndex,
                                     @RequestParam(defaultValue = "5",required = false) Integer pageSize);

}
