package com.example.Demo1Gradle;

import com.example.Demo1Gradle.bean.AddCalculator;
import com.example.Demo1Gradle.bean.Calculator;
import com.example.Demo1Gradle.bean.SubCalculator;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "primary")
    Calculator xyz(){
        return new AddCalculator();
    }
    @Bean("backup")
    Calculator pqr(){
        return new SubCalculator();
    }
    @Bean(name = "anyway")
    CommandLineRunner abc(){
        return new SetupEnvironment();
    }
}
