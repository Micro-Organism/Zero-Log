package com.zero.log;

import com.zero.log.util.*;
import org.junit.jupiter.api.Test;

/**
 * @author organism
 * @description 日志管理测试类
 * @createTime 2023-08-24 16:54
 **/
public class LogApplicationTest {

    @Test
    public void testJava(){
        //Java内部日志管理
        JavaLoggingUtil.test();
    }

    @Test
    public void testCommon(){
//        commons日志管理
        CommonsLoggingUtil.getInstance().info("test info ...");
    }

    @Test
    public void testLog4j(){
        //log4j日志管理
        Log4jUtil.warn("test log4j warn ...");
    }

    @Test
    public void testLog4j2(){
        //log4j日志管理
        Log4j2Util.warn("test log4j warn ...");
    }

    @Test
    public void testSlf4j(){
        //slf4j日志管理
        Slf4jUtil.getInstance().info("test info ...");
    }

}
