package com.ejet.cloud.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Copyright (C), 2016-2018, 武汉康华数海有限公司
 * FileName: EurekaClientApplication
 * Author:   ShenYijie
 * CreateDate:     2018-12-08 23:58
 * Description:
 * History:
 * Version: 1.0
 */
@SpringBootApplication
// @EnableEurekaClient
@EnableDiscoveryClient
public class EurekaClientApplication {

    /**
     * @param args
     */
    public static void main(String[] args) {
        //new SpringApplicationBuilder(EurekaClientApplication.class).web(WebApplicationType.SERVLET).run(args);
        SpringApplication.run(EurekaClientApplication.class, args);
    }


}
