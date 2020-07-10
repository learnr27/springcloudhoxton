package com.cbb.springcloudhoxton.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author chengbb
 * @date 2020.6.29
 */
@Configuration
@EnableTransactionManagement
@MapperScan("com.cbb.*.dao")
public class MybatisPlusConfig {

}
