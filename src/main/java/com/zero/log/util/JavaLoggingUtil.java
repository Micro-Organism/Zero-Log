package com.zero.log.util;

import java.util.logging.Logger;

/**
 * @author organism
 * @description Java内置日志管理
 * @createTime 2023-08-24 13:31
 **/
public class JavaLoggingUtil {

    public static void test(){
        Logger logger = Logger.getGlobal();
        logger.info("start process...");
        logger.warning("memory is running out...");
        logger.fine("ignored.");
        logger.severe("process will be terminated...");
    }
}
