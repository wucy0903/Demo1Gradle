package com.example.Demo1Gradle.bean;

import org.springframework.stereotype.Component;

@Component(value = "primary")
public class AddCalculator  implements Calculator{
    @Override
    public int calculate(int a, int b) {
        return a+b;
    }
}
