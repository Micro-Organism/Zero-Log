package com.zero.log.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author organism
 * @description Commons Logging 日志管理类
 * @createTime 2023-08-24 13:33
 **/
public class CommonsLoggingUtil {

    private static CommonsLoggingUtil commonsLoggingUtil;

    protected final Log log = LogFactory.getLog(getClass());

    /***
     * 单例模型
     * @return 单例实例
     */
    public static CommonsLoggingUtil getInstance() {
        if (commonsLoggingUtil == null) {
            commonsLoggingUtil = new CommonsLoggingUtil();
        }
        return commonsLoggingUtil;
    }

    /***
     * 打印信息
     * @param msg
     */
    public void info(String msg) {
        log.info(msg);
    }

}
