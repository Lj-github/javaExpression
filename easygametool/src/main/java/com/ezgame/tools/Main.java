package com.ezgame.tools;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String... args){
        logger.info("这是个测试时间{}"+new Date());

        logger.info("tet");
        logger.info("tet");
        logger.info("tet");
        logger.info("tet");
        logger.info("tet");
        logger.info("tet");
        logger.info("Frame");
        System.out.println("tools begin");
        logger.info("Current Time: {}", System.currentTimeMillis());
        logger.info("Current Time: " + System.currentTimeMillis());
        logger.info("Current Time: {}", System.currentTimeMillis());
        logger.trace("trace log");
        logger.warn("warn log");
        logger.debug("debug log");
        logger.info("info log");
        logger.error("error log");



    }
}
