package com.zero.log.util;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * @author organism
 * @description Log4j 日志管理类
 * @createTime 2023-08-24 13:45
 **/
public class Log4jUtil {

    //日志记录器
    private static Logger LOGGER = LogManager.getLogger(Log4jUtil.class);

    /**
     * 输出debug级别的日志
     * @param msg Object 要输出的消息
     */
    public static void debug(Object msg) {
        Logger.getLogger("DEBUG").debug(msg);
    }

    /**
     * 输出info级别的日志
     * @param msg Object 要输出的消息
     */
    public static void info(Object msg) {
        Logger.getLogger("INFO").info(msg);
    }

    /**
     * 输出warn级别的日志
     * @param msg Object 要输出的消息
     */
    public static void warn(Object msg) {
        Logger.getLogger("WARN").warn(msg);
    }

    /**
     * 输出error级别的日志
     * @param msg Object 要输出的消息
     */
    public static void error(Object msg) {
        Logger.getLogger("ERROR").error(msg);
    }

}
