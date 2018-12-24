package com.qi.dao;

import com.qi.pojo.Info;
import com.qi.pojo.User;

import java.util.List;

/**
 * @BelongsProject: ssm_springmvc
 * @BelongsPackage: com.qi.dao
 * @Author: 7
 * @CreateTime: 2018-12-18 15:29
 * @Description: zixun
 * @Version: 1.0
 */
public interface InfoDao {

    /**
     * 查询所有资讯
     **/
    List<Info> getInfo();

    List<User> checkLogin(User user);


}
