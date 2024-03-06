package com.example.ghjvmpoc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/greeting")
public class Controller {

    @GetMapping
    public String hello() {
        return "Hello, World!";
    }
}
