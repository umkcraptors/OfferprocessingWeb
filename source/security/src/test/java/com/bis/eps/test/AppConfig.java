package com.bis.eps.test;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.bis.eps.common.config.DatabaseConfig;
import com.bis.eps.common.config.NotifierConfig;

@Configuration
@ComponentScan(basePackages={"com.bis.eps"})
@Import({DatabaseConfig.class, NotifierConfig.class})
@EnableScheduling
@EnableAspectJAutoProxy
@EnableCaching
@EnableTransactionManagement
@EnableJpaRepositories(basePackages={"com.bis.eps.security.repository"})
public class AppConfig {

}
