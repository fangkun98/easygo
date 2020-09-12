package com.fk.easygo.config;

/**
 * @ClassName ShiroTagThymeleafConfigurer
 * @Description TODO
 * @Date 2020/4/20 19:45
 * @Created by FangKun
 */

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * 集成Shiro标签，Thymeleaf中就可以使用Shiro标签完成权限控制
 */
@SpringBootConfiguration
public class ShiroTagThymeleafConfigurer{
    /**
     * 配置的是方言
     * @return
     */
    @Bean
    public ShiroDialect shiroDialect() {
        return new ShiroDialect();
    }
}
