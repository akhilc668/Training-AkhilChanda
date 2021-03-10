package com.ex;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    private static final Logger logger = LogManager.getLogger(MyRunner.class);

    public void run(String... args) throws Exception {


        logger.info("Information message");
        logger.warn("Warning message");
        logger.error("This is a normal error");
    }
}