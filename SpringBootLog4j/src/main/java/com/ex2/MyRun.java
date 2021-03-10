package com.ex2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class MyRun {

    private static final Logger logger = LogManager.getLogger(MyRun.class);
  
    public void run() {

        logger.info("Information message from MyRun");
        logger.warn("Warning message from MyRun");
        logger.error("This is a normal error from MyRun");
    }
}