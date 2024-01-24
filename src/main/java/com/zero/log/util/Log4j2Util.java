package com.zero.log.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author organism
 * @description log4j2 日志管理类
 * @createTime 2023-08-24 16:09
 **/
public class Log4j2Util {

    //日志记录器
    private static final Logger logger = LogManager.getLogger(Log4j2Util.class);

    /**
     * 输出debug级别的日志
     * @param msg Object 要输出的消息
     */
    public static void debug(Object msg) {
        logger.debug(msg);
    }

    /**
     * 输出info级别的日志
     * @param msg Object 要输出的消息
     */
    public static void info(Object msg) {
        logger.info(msg);
    }

    /**
     * 输出warn级别的日志
     * @param msg Object 要输出的消息
     */
    public static void warn(Object msg) {
        logger.warn(msg);
    }

    /**
     * 输出error级别的日志
     * @param msg Object 要输出的消息
     */
    public static void error(Object msg) {
        logger.error(msg);
    }

}
