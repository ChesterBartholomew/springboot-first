package com.jotsai.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


//@ResponseBody
//@Controller
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String handleHello() {
        return "Hello, Spring Boot 2!";
    }
}
