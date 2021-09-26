package com.example.demo.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloworldController {

    @RequestMapping("/getTime")
    public String getTime(){
        return new Date().toString();
    }
}
