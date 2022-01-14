package com.example.practice02_handle_response.controller;

import com.example.practice02_handle_response.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {
    @RequestMapping("/main")
    public String main(){
        return "main.html";
    }
    //response entity
    //responsebody
    @ResponseBody
    @GetMapping("/user")
    public User user(){
        var user=new User();
        user.setName("dss");
        user.setAddress("maii");
        return user;
    }
}
