package com.example.Demo1Gradle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo1Controller {
    @GetMapping(value = "/hello", name = "default sample controller")
    public String ping() {
        return "pong";
    }
}
