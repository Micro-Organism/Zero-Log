package com.zero.log.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author organism
 * @description slf4j 日志管理类
 * @createTime 2023-08-24 15:02
 **/
public class Slf4jUtil {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private static Slf4jUtil slf4jUtil;

    public static Slf4jUtil getInstance() {
        if (slf4jUtil == null) {
            slf4jUtil = new Slf4jUtil();
        }
        return slf4jUtil;
    }

    public void info(String msg) {
        logger.info(msg);
    }

}
