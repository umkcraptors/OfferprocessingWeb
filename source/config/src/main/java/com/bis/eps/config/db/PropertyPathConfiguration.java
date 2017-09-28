package com.bis.eps.config.db;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;


/** This is the class to supply PropertySourcesPlaceholderConfigurer Bean for to hold properties from properties file
 * 
 * @author: Srinivas Vemula
 * @date: 01-Aug-2017
 */
@Configuration
@ComponentScan(
basePackages = {"com.bis.eps.config.db"},
useDefaultFilters = false,
includeFilters = {
@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = DatabaseConnectionConfig.class)
})
public class PropertyPathConfiguration {

  @Bean
  public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
    return new PropertySourcesPlaceholderConfigurer();
  }
}