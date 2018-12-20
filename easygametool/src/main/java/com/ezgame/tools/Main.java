package com.ezgame.tools;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String... args){

        Properties prop = readproperties("config.properties");
        logger.error( prop.getProperty("post_host"));

        logger.trace("trace ldog");
        logger.warn("warn lodg");
        logger.debug("debug dlog");
        logger.info("info log");
        logger.error("error log");
        logger.error("error log");
        int count = 0;

    }

    public static Properties readproperties (String fname){
        Properties prop = new Properties();
        try {
            String path = Thread.currentThread().getContextClassLoader().getResource("").getPath();
            InputStream is = new FileInputStream(path + "/" + fname);
            try {
                prop.load(is);
                logger.trace("load config success" + fname);
            }catch (IOException e){
            }
        }
        catch (FileNotFoundException d){
        }
        return prop;
    }
}
