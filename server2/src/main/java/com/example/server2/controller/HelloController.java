package com.example.server2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    private String hello() {
        System.out.println("hello------------server2");
        return "hello";
    }
}
