package com.fk.easygo;

import com.fk.easygo.mapper.BrandMapper;
import com.fk.easygo.pojo.Brand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName TestMybatis
 * @Description TODO
 * @Date 2020/3/27 13:15
 * @Created by FangKun
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMybatis {
    @Resource
    private BrandMapper brandMapper;

    @Test
    public void testBrands(){
        List<Brand> brands = brandMapper.getBrands();
        for (Brand brand : brands) {
            System.out.println(brand);
        }
    }

    @Test
    public void testGetById(){
        Brand brandById = brandMapper.getBrandById(1);
        System.out.println(brandById);
    }
    @Test
    public void testAdd(){
        Brand brand = new Brand();
        brand.setName("测试品牌");
        brand.setFirst_char("C");
        brand.setImage("12312312.jpg");
        int count = brandMapper.addBrand(brand);
        System.out.println(count>0?"新增成功":"新增失败");
    }
    @Test
    public void testUpdate(){
        Brand brandById = brandMapper.getBrandById(1);
        System.out.println(brandById);
        brandById.setName("更新测试");
        int i = brandMapper.updateBrand(brandById);
        System.out.println(i>0?"更新成功":"更新失败");
    }

    @Test
    public void deleteSome(){
        String ids="1,2,3";
        int i = brandMapper.deleteSome(ids);
        System.out.println(i>0?"批量删除成功":"批量删除失败");
    }

    @Test
    public void deleteSome1(){
        Integer[] ids={4,5,6};
        int i = brandMapper.deleteSome1(ids);
        System.out.println(i>0?"批量删除成功":"批量删除失败");
    }

    @Test
    public void testgetTotalCount(){
        int totalCount = brandMapper.getTotalCount();
        System.out.println(totalCount);
    }
    @Test
    public void testPage(){
        int pageIndex=1;//当前页码
        int pageSize=5;//每页大小
        HashMap<String, Object> map = new HashMap<>();
        map.put("pageStart",(pageIndex-1)*pageSize);
        map.put("pageSize",pageSize);
        List<Brand> pageBrands = brandMapper.getPageBrands(map);
        for (Brand pageBrand : pageBrands) {
            System.out.println(pageBrand);
        }
    }
}
