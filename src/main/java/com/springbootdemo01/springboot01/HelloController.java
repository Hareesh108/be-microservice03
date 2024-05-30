package com.springbootdemo01.springboot01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/microservice02")
    public String hello(){
        return "Hello, My name is Hareesh";
    }
    
}
