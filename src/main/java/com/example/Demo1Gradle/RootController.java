package com.example.Demo1Gradle;

import com.example.Demo1Gradle.bean.Calculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {
    private static final Logger LOGGER =
            LoggerFactory.getLogger(RootController.class.getSimpleName());
    @Autowired
    private ApplicationContext context;

    @GetMapping(value = "/")
    public String index(){
        return "Spring boot using bootJar from Intellij";
    }
    @GetMapping(value = "/calculate1")
    public String calculate1(@RequestParam(value = "a", required = false, defaultValue = "5") Integer a ,
                             @RequestParam(value = "b", required = false, defaultValue = "3") Integer b){
        Calculator calculator1 = context.getBean("primary",Calculator.class);
        LOGGER.info("context = " + context.toString());
        return String.format("answer=%d",calculator1.calculate(a,b));
    }
    @GetMapping(value = "/calculate2")
    public String calculate2(@RequestParam(value = "a", required = false, defaultValue = "5") Integer a ,
                             @RequestParam(value = "b", required = false, defaultValue = "3") Integer b){
        Calculator calculator1 = context.getBean("backup",Calculator.class);
        LOGGER.info("context = " + context.toString());
        return String.format("answer=%d",calculator1.calculate(a,b));
    }
}
