package com.SpringJavaExercises.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/aoc/{id}")
    public String helloWorld(@PathVariable(name = "id") int id)
    {
        return "how to frontend here? " + id;
    }
}
