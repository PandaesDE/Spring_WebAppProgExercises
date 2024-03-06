package com.example.AdventOfCodeBackend.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/hallo")
    public String helloWorld() {
        return "hello world";
    }
}
