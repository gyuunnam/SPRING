package com.example.practice03_object_mapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Practice03ObjectMappingApplicationTests {

    @Test
    void contextLoads() throws JsonProcessingException {
        System.out.println("----------------");
        //TEXT JSON => OBJECT
        //Object -> TEXT JSON

        //controller request json(text)-> object
        //response object -> json(text)
        var objectMapper=new ObjectMapper();
        //object->text 해당 경우 get메소드를 통해 객체 매핑
        var user=new User("steve",22);
        var text=objectMapper.writeValueAsString(user);
        System.out.println(text);
        //text->object
        var objectUser=objectMapper.readValue(text,User.class);
        System.out.println(objectUser);
    }

}
