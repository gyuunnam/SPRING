package com.example.practice01_hello.controller;

import com.example.practice01_hello.dto.PutRequestDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutController {
    @PutMapping("/put/{uid}")
    public PutRequestDTO put(@RequestBody PutRequestDTO dto, @PathVariable long uid){
        System.out.println(dto);
        return dto;
    }
}