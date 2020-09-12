package com.fk.easygo.service;

import com.fk.easygo.pojo.Brand;

import java.util.List;
import java.util.Map;

/**
 * @ClassName BrandService
 * @Description TODO
 * @Date 2020/3/27 13:40
 * @Created by FangKun
 */
public interface BrandService {
    public List<Brand> getBrands();

    public int addBrand(Brand brand);

    public int updateBrand(Brand brand);

    public Brand getBrandById(Integer id);

    public int deleteBrand(Integer id);

    public int deleteSome(String ids);

    public int deleteSome1( Integer[] ids);

    public int getTotalCount();

    public List<Brand> getPageBrands(Map<String,Object> map);

}
