package com.example.Demo1Gradle;

import com.example.Demo1Gradle.bean.Calculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
    @Autowired
    @Qualifier("primary")
    private Calculator cal1;
    @Autowired
    @Qualifier("backup")
    private Calculator cal2;

    @GetMapping(value = "/")
    public String index(){
        return "Spring boot using bootJar from Intellij";
    }
    @GetMapping(value = "/calculate1")
    public String calculate1(@RequestParam(value = "a", required = false, defaultValue = "5") Integer a ,
                             @RequestParam(value = "b", required = false, defaultValue = "3") Integer b){
        LOGGER.info("context = " + context.toString());
        return String.format("answer=%d",cal1.calculate(a,b));
    }
    @GetMapping(value = "/calculate2")
    public String calculate2(@RequestParam(value = "a", required = false, defaultValue = "5") Integer a ,
                             @RequestParam(value = "b", required = false, defaultValue = "3") Integer b){
        LOGGER.info("context = " + context.toString());
        return String.format("answer=%d",cal2.calculate(a,b));
    }
}
