package com.qi.controller;

import com.github.pagehelper.Page;
import com.qi.pojo.Info;
import com.qi.pojo.User;
import com.qi.service.InfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @BelongsProject: ssm_springmvc
 * @BelongsPackage: com.qi.controller
 * @Author: 7
 * @CreateTime: 2018-12-18 15:51
 * @Description: info
 * @Version: 1.0
 */

/**
 * 1.如果一个controller里面大部分返回的都是页面的话，使用@Controller，这时返回的都是页面
 * 2.如果大部分返回的都是Json或字符串的话，就使用@RestController。如果它碰到Stirng，就返回String
 * int返回int（即基本数据类型还返回相应的数据类型），但是对象会返回json
 * 3.此时(使用@RestController)如果某方法仍要返回视图，则使用ModelAndView
 */
@RestController

public class InfoController {

    @Resource
    private InfoService infoService;

    @RequestMapping("/getPage")
    public Map queryInfoPage(int pageNum, int pageSize, Info info){
        Map map = new HashMap();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        map.put("info",info);
        Page page = infoService.queryInfo(map);
        map.put("page", page);
        map.put("totalPage", page.getPages());
        return map;
    }
    @RequestMapping("/index")
    public ModelAndView index() {
        return new ModelAndView("list");
    }

    public InfoService getInfoService() {
        return infoService;
    }

    public void setInfoService(InfoService infoService) {
        this.infoService = infoService;
    }
}
