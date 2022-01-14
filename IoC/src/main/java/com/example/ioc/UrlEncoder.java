package com.example.ioc;

import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@Component
public class UrlEncoder implements IEncoder{
    public String encode(String msg){
        try{
            return URLEncoder.encode(msg,"UTF-8");
        }catch(UnsupportedEncodingException e){
            e.printStackTrace();
            return null;
        }
    }
}
