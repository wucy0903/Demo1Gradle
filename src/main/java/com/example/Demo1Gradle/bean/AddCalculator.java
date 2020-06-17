package com.example.Demo1Gradle.bean;

public class AddCalculator  implements Calculator{
    @Override
    public int calculate(int a, int b) {
        return a+b;
    }
}
