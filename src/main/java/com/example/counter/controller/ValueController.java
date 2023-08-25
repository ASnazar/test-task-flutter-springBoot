package com.example.counter.controller;

import com.example.counter.service.ValueService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/counter")
@AllArgsConstructor
public class ValueController {
    private ValueService valueService;

    @GetMapping("/value")
    public int getCounter() {
        return valueService.getCounter();
    }

    @PostMapping("/value/increment")
    public int incrementCounter() {
        return valueService.incrementCounter();
    }
}
