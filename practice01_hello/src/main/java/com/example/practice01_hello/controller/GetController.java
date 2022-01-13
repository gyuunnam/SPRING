package com.example.practice01_hello.controller;

import com.example.practice01_hello.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetController {
    @GetMapping("/hello")
    public String getHello(){
        return "get hello";
    }
    @RequestMapping(path="/hi",method = RequestMethod.GET) //get만 지정
    public String hi(){
        return "hi";
    }
    //http://localhost:8080/api/get/path-variable/{name}
    @GetMapping("/path-variable/{id}")
    public String pathVariable(@PathVariable(name="id") String pname){
        System.out.println("PathVariable: "+pname);
        return pname;
    }
    @GetMapping(path="query-param")
    public String quaryParam(@RequestParam Map<String,String> queryParam){
        StringBuilder sb=new StringBuilder();
        queryParam.entrySet().forEach(entry-> {
                    System.out.println(entry.getKey());
                    System.out.println(entry.getValue());
                    System.out.println("\n");
                    sb.append(entry.getKey()+" = "+entry.getValue()+"\n");
                });
        return sb.toString();
    }
    @GetMapping("query-param02")
    public String queryParam2(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String age
    ){
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);

        return name+"\t"+email+"\t"+age;
    }
    @GetMapping("query-param03")
    public String queryParam03(UserRequest ur){
        System.out.println(ur.getName());
        System.out.println(ur.getEmail());
        System.out.println(ur.getAge());

        return ur.toString();
    }
}
