package com.example.ioc;

import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
@Component
public class Base64Encoder implements IEncoder{
    public String encode(String msg){return Base64.getEncoder().encodeToString(msg.getBytes());
    }
}
