package com.example.demo.controller;


import com.mysql.cj.x.protobuf.MysqlxNotice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping("/hello")
    public String hello(){
        return "hello spring-boot";
    }
}
