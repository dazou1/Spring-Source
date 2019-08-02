package com.dazou.app;


import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * @Author dazou
 * @Date 2019-06-11 11:11
 */
@Configuration
@ComponentScan("com.dazou")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppConfig {


}
