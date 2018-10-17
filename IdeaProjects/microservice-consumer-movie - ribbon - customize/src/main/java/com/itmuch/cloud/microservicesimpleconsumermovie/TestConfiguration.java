package com.itmuch.cloud.microservicesimpleconsumermovie;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * 使用ribbonClient，为特定name的Ribbon client 的定义配置
 * 使用@RibbonClient的configuration属性，制定Ribbon 的配置类
 *
 */
@Configuration
@RibbonClient(name="microservice-provider-user",configuration = RibbonConfiguration.class)
public class TestConfiguration {
}
