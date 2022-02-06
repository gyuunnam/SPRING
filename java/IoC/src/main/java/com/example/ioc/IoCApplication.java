package com.example.ioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class IoCApplication {

    public static void main(String[] args) {
        SpringApplication.run(IoCApplication.class, args);
        ApplicationContext context=ApplicationContextProvider.getContext();

        Base64Encoder base64Encoder=context.getBean(Base64Encoder.class);
        UrlEncoder urlEncoder=context.getBean(UrlEncoder.class);
        Encoder encoder=new Encoder(base64Encoder);

        String url="www.naver.com/books/";
        String result=encoder.encode(url);
        System.out.println(result);
        encoder.setiEncoder(urlEncoder);
        result=encoder.encode(url);
        System.out.println(result);
    }

}
@Configuration
class AppConfig{
    @Bean
    public Encoder encoder(Base64Encoder base64Encoder){
        return new Encoder(base64Encoder);
    }
    @Bean("UrlEncoder")
    public Encoder encoder(UrlEncoder urlEncoder){
        return new Encoder(urlEncoder);
    }


}