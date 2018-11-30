package com.hc.market.controller;

import com.hc.market.bean.User;
import com.hc.market.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class TestController {

    @Resource
    private TestService service;

    @RequestMapping("select")
    public String select(){
        List<User> users = service.select();
        for (User user : users) {
            System.out.println(user.toString());
        }
        System.out.println("111111111");
        System.out.println("测试更新");

        return "about";
    };





}
