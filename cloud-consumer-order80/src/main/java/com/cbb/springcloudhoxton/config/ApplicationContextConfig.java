package com.cbb.springcloudhoxton.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author chengbb
 * @date 2020.6.29
 */
@Configuration
public class ApplicationContextConfig {

    //使用@LoadBalanced注解赋予RestTemplate负载均衡的能力
    @Bean
    //@LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
