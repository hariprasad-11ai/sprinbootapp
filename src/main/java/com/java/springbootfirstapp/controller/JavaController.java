package com.java.springbootfirstapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
public class JavaController {

    @GetMapping("hello")
    public String hello() {
        return "hello3455";
    }
}
