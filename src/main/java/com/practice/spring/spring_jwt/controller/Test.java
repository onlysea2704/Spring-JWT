package com.practice.spring.spring_jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/test")
public class Test {

    //    @Autowired
//    private UserRepository userRepository;
//
    @GetMapping("/test-api")
    public String testApi(){
        return "test api thành công";
    }
//
//    @GetMapping("/get-all-user")
//    public List<User> getAllUser(){
//        return  userRepository.findAll();
//    }
}
