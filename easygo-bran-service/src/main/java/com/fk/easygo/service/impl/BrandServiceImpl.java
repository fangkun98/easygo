package com.fk.easygo.service.impl;

import com.fk.easygo.mapper.BrandMapper;
import com.fk.easygo.pojo.Brand;
import com.fk.easygo.service.BrandService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @ClassName BrandServiceImpl
 * @Description TODO
 * @Date 2020/3/27 13:40
 * @Created by FangKun
 */
@Service
public class BrandServiceImpl implements BrandService {
    @Resource
    private BrandMapper brandMapper;

    @Override
    public List<Brand> getBrands() {
        return brandMapper.getBrands();
    }

    @Override
    public int addBrand(Brand brand) {
        return brandMapper.addBrand(brand);
    }

    @Override
    public int updateBrand(Brand brand) {
        return brandMapper.updateBrand(brand);
    }

    @Override
    public Brand getBrandById(Integer id) {
        return brandMapper.getBrandById(id);
    }

    @Override
    public int deleteBrand(Integer id) {
        return brandMapper.deleteBrand(id);
    }

    @Override
    public int deleteSome(String ids) {
        return brandMapper.deleteSome(ids);
    }

    @Override
    public int deleteSome1(Integer[] ids) {
        return brandMapper.deleteSome1(ids);
    }

    @Override
    public int getTotalCount() {
        return brandMapper.getTotalCount();
    }

    @Override
    public List<Brand> getPageBrands(Map<String, Object> map) {
        return brandMapper.getPageBrands(map);
    }


}
