package com.example.Demo1Gradle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class CheckStatus implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(CheckStatus.class.getSimpleName());
    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("Check Eureka status");
        LOGGER.info("check my third party server status....");
    }
}
