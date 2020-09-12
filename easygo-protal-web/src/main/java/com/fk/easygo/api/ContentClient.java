package com.fk.easygo.api;

import com.fk.easygo.pojo.Content;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @ClassName ProtalClient
 * @Description TODO
 * @Date 2020/3/31 10:49
 * @Created by FangKun
 */
@FeignClient(value = "easygo-ad-service")
public interface ContentClient {
    @RequestMapping("/content_getContentsByCategoryId")
    public List<Content> getContentsByCategoryId(@RequestParam Integer categoryId);
}
