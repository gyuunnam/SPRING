package com.example.ioc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Encoder {
    private IEncoder iEncoder;
    public Encoder(@Qualifier("base64Encoder") IEncoder iEncoder){this.iEncoder=iEncoder;}
    public String encode(String msg){return iEncoder.encode(msg);}
    public void setiEncoder(IEncoder iEncoder){
        this.iEncoder=iEncoder;
    }
}
