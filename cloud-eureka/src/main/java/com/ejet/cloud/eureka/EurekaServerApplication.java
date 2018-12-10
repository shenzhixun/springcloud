package com.ejet.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Copyright (C), 2016-2018, 武汉康华数海有限公司
 * FileName: com.ejet.cloud.eureka.EurekaServerApplication
 * Author:   ShenYijie
 * CreateDate:     2018-12-08 21:10
 * Description: 启动类
 * History:
 * Version: 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
