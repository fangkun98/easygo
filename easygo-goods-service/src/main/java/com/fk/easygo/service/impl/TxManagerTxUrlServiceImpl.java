package com.fk.easygo.service.impl;

/**
 * @ClassName TxManagerTxUrlServiceImpl
 * @Description TODO
 * @Date 2020/4/24 15:45
 * @Created by FangKun
 */

import com.codingapi.tx.config.service.TxManagerTxUrlService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * 添加从注册中心获取url；注意通过注解放入容器。
 */
@Service
public class TxManagerTxUrlServiceImpl implements TxManagerTxUrlService {

    @Value("${tm.manager.url}")
    private String url;

    @Override
    public String getTxUrl() {
        return url;
    }
}
