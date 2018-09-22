package com.example.server.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigTestController {

    @Value("${name}")
    private String name;

    @RequestMapping("/config")
    private String getConfig(){

        return name;
    }
}
