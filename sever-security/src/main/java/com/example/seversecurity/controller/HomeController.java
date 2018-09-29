package com.example.seversecurity.controller;

import com.example.seversecurity.entity.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


    @RequestMapping("/")
    public String index(Model model){
        Msg msg =  new Msg("测试标题","测试内容","额外信息，只对管理员显示");
        model.addAttribute("msg", msg);
        return "home";
    }

    @RequestMapping("/admin")
    public String admin(Model model){
        Msg msg =  new Msg("Admin页面","Admin页面","额外信息，只对管理员显示");
        model.addAttribute("msg", msg);
        return "admin";
    }

    @RequestMapping("/admin/foo")
    public String foo(Model model){
        Msg msg =  new Msg("AdminFoo页面","Admin页面","额外信息，只对管理员显示");
        model.addAttribute("msg", msg);
        return "admin";
    }


}
