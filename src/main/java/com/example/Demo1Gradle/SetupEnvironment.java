package com.example.Demo1Gradle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class SetupEnvironment  implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(SetupEnvironment.class);
    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("should setup environment");
        LOGGER.info("check disk space");
        LOGGER.info("connect db");
        LOGGER.info("create mysql space...");

    }
}
