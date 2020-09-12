package com.fk.easygo.mapper;

import com.fk.easygo.pojo.Brand;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @ClassName BrandMapper
 * @Description TODO
 * @Date 2020/3/27 13:07
 * @Created by FangKun
 */
@Mapper
public interface BrandMapper {
    public List<Brand> getBrands();

    public int addBrand(Brand brand);

    public int updateBrand(Brand brand);

    public Brand getBrandById(Integer id);

    public int deleteBrand(Integer id);

    public int deleteSome(@Param("ids") String ids);

    public int deleteSome1( Integer[] ids);

    public int getTotalCount(); //查询总条数

    public List<Brand> getPageBrands(Map<String,Object> map);//查询每页的数据


}
