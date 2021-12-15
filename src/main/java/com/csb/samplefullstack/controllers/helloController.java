package com.csb.samplefullstack.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")

public class helloController{

    @RequestMapping("/hello")
    public String hello()
    {
        return "hello panda";
    }
}