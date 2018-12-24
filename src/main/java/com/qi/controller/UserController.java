package com.qi.controller;

import com.qi.pojo.User;
import com.qi.service.InfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @BelongsProject: ssm_springmvc
 * @BelongsPackage: com.qi.controller
 * @Author: 7
 * @CreateTime: 2018-12-24 15:32
 * @Description: 1
 * @Version: 1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private InfoService infoService;

    @RequestMapping("/login")
    public ModelAndView toLogin(){
        return new ModelAndView("login");
    }
    @RequestMapping("/userLogin")
    public String userLogin(User user, HttpSession session, Model model){
        List<User> loginUser = infoService.getLoginUser(user);
        if(loginUser.size()>0){
            return "redirect:userlist";
        } else {
            model.addAttribute("msg", "登录失败");
            return "login";
        }
    }

    @RequestMapping("/userlist")
    public String findAll(Model model) {
        return "list";
    }

    public InfoService getInfoService() {
        return infoService;
    }

    public void setInfoService(InfoService infoService) {
        this.infoService = infoService;
    }
}
