package com.Spring.controller;

import com.Spring.services.AOCService;
import com.Spring.services.FileReadingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/api/aoc/")
@org.springframework.web.bind.annotation.RestController
public class AOCController {

    private final AOCService aocService;

    public AOCController(AOCService service) {
        this.aocService = service; //TODO: Research is this autowiring?
    }

    @GetMapping("/{year}/{day}")
    public String getAOCAnswers
            (@PathVariable(name = "year") int year,
             @PathVariable(name = "day") int day)
    {
        return aocService.getAnswer(year, day);
    }

    @GetMapping("/getCode/{year}/{day}")
    public String getCode
            (@PathVariable(name = "year") int year,
             @PathVariable(name = "day") int day)
    {
        return aocService.getCode(year, day);
    }

    @GetMapping("/setInput/{year}/{day}")
    public void setInput
            (@PathVariable(name = "year") int year,
             @PathVariable(name = "day") int day) {
        //TODO: how to get very long strings?


    }
}
