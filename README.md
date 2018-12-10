## 引言

Spring Cloud 是基于 Spring Cloud Finchley 的一个分布式系统套件的整合。

## 技术选型

* 分布式系统主框架：Spring Cloud Finchley
* 服务治理注册与发现：Spring Cloud Netflix Eureka
* 服务容错保护限流降级：Spring Cloud Netflix Hystrix
* 分布式统一配置中心：Spring Cloud Config
* 网关路由代理调用：Spring Cloud Gateway
* 声明式服务调用：Spring Cloud OpenFeign

## 子项目介绍

* 服务治理：cloud-eureka ： <http://127.0.0.1:8970>
* 配置中心：cloud-config ： <http://127.0.0.1:8971/project/default>
* 网关路由：cloud-gateway ： <http://127.0.0.1:8980/js/a/login>
* 基础项目：cloud-module-base ： <http://127.0.0.1:8981/js>
* 测试模块1：
    - 模块1主项目：cloud-module-test1 ： <http://127.0.0.1:8982/>
    - 模块1客户端项目（提供其它模块调用）：cloud-module-test1-client
* 测试模块2：
    - 模块2主项目：cloud-module-test2 ： <http://127.0.0.1:8983/>
    - 模块2客户端项目（提供其它模块调用）：cloud-module-test2-client

## 快速运行
