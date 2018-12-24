package com.qi.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qi.dao.InfoDao;
import com.qi.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Map;

/**
 * @BelongsProject: ssm_springmvc
 * @BelongsPackage: com.qi.service
 * @Author: 7
 * @CreateTime: 2018-12-18 15:46
 * @Description: 1
 * @Version: 1.0
 */
@Service("infoService")
public class InfoServiceImpl implements InfoService{

    @Autowired
    private InfoDao infoDao;
    @Override
    public Page queryInfo(Map<String, Object> cond) {
        Page page = new Page();
        page.setTotal(12);
        int pageSize = Integer.parseInt(String.valueOf(cond.get("pageSize")));
        int pageNum =Integer.parseInt(String.valueOf(cond.get("pageNum")));
        page.setPageNum(pageNum);
        page.setPageSize(pageSize);
        page= PageHelper.startPage(pageNum,pageSize);
        List list= infoDao.getInfo();
        return page;
    }

    @Override
    public List<User> getLoginUser(User user) {
        List<User> users = infoDao.checkLogin(user);
        return users;
    }

    public InfoDao getInfoDao() {
        return infoDao;
    }

    public void setInfoDao(InfoDao infoDao) {
        this.infoDao = infoDao;
    }
}
