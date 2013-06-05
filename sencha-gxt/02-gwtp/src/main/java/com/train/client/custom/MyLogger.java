package com.train.client.custom;


import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * User: Hu Jing Ling
 * Date: 2013-06-05
 */
public class MyLogger {

    public static Logger logger = Logger.getLogger(MyLogger.class.getName());

    public void log(Level level, String msg) {
        logger.log(level, msg);
    }

    public void log(Level level, String msg, Throwable e) {
        logger.log(level, msg, e);
    }

    public void info(String msg) {
        logger.info(msg);
    }

    public void warning(String msg) {
        logger.warning(msg);
    }

    public void severe(String msg) {
        logger.severe(msg);
    }

}
