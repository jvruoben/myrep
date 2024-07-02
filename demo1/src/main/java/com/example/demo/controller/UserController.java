package com.example.demo.controller;


import com.example.demo.pojo.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/{id}")
    public void getById(@PathVariable Integer id){

    }

}
