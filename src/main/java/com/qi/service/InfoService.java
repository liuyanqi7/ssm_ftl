package com.qi.service;

import com.github.pagehelper.Page;

import java.util.Map;

/**
 * @BelongsProject: ssm_springmvc
 * @BelongsPackage: com.qi.service
 * @Author: 7
 * @CreateTime: 2018-12-18 15:43
 * @Description: 1
 * @Version: 1.0
 */
public interface InfoService {
        Page queryInfo(Map<String,Object> cond);
}
