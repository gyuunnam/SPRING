package com.example.practice01_hello.controller;

import com.example.practice01_hello.dto.PostRequestDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PostController {
    @PostMapping("/post")
    public void post(@RequestBody Map<String,Object> requestData ){
        requestData.forEach((key, value) -> {
            System.out.println("key:" + key);
            System.out.println("value:" + value);
        });
    }
    @PostMapping("/post2")
    public void post2(@RequestBody PostRequestDTO requestData){
        System.out.println(requestData);
    }
}
