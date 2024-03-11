package com.Spring.controller;

import com.AdventOfCode.AOCService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/api/aoc/")
@org.springframework.web.bind.annotation.RestController
public class AOCController {

    private final AOCService aocService = new AOCService();

    @GetMapping("/{year}/{day}")
    public String getAOCAnswers
            (@PathVariable(name = "year") int year,
             @PathVariable(name = "day") int day)
    {
        return aocService.getAnswers(year, day);
    }

    @GetMapping("/setInput/{year}/{day}")
    public void setInput
            (@PathVariable(name = "year") int year,
             @PathVariable(name = "day") int day)
    {
        //TODO: how to get very long strings?
    }
}
