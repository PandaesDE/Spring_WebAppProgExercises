package com.Spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/aoc/{year}/{day}")
    public String helloWorld
            (@PathVariable(name = "year") int year,
             @PathVariable(name = "day") int day)
    {
        return "how to frontend here? " + year + day;
    }
}
