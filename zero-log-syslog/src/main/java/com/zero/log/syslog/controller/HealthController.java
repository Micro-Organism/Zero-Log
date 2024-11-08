package com.zero.log.syslog.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
public class HealthController {

    @RequestMapping("/")
    public Map<String, Object> checkHealth() {
        log.info("Welcome to Service");
        Map<String, Object> map = new HashMap<>();
        map.put("code", 200);
        map.put("status", "success");
        map.put("message", "Welcome to Service");
        map.put("result", "服务正常运行中");
        return map;
    }

}