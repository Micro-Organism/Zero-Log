package com.zero.log;

import lombok.extern.slf4j.Slf4j;

/**
 * @author organism
 * @description 启动类
 * @createTime 2024/1/24 14:04
 */
@Slf4j
public class LogApplication {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        log.info("项目启动成功,耗时: " + (System.currentTimeMillis() - startTime) / 1000 + "s");
    }
}
