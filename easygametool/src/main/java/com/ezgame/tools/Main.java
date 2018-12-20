package com.ezgame.tools;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String... args){
        logger.info("这是个测试时间{}"+new Date());
        logger.info("tet");
        logger.info("tedt");
        logger.info("tet");
        logger.info("tetd");
        logger.info("tetd");
        logger.info("tetdd");
        logger.info("Fradme");
        System.out.println("toolds begin");
        logger.info("Current Tidme: {}", System.currentTimeMillis());
        logger.info("Current Tidme: " + System.currentTimeMillis());
        logger.info("Current Tidme: {}", System.currentTimeMillis());
        logger.trace("trace ldog");
        logger.warn("warn lodg");
        logger.debug("debug dlog");
        logger.info("info log");
        logger.error("error log");
        logger.error("error log");
        logger.error( System.getProperty("webApp.root"));
        logger.error( System.getProperty("InstanceName"));






    }
}
