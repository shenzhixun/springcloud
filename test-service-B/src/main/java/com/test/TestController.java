package com.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (C), 2016-2018, 武汉康华数海有限公司
 * FileName: TestController
 * Author:   ShenYijie
 * CreateDate:     2018-12-08 23:59
 * Description:
 * History:
 * Version: 1.0
 */
@RestController
public class TestController {

    String msg = " Welcome . My is microservice provider user B";

    @RequestMapping("/test")
    public String home() {
        return "Hello World " + msg;
    }

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        System.out.println(name + msg);
        return name + msg;
    }

}
