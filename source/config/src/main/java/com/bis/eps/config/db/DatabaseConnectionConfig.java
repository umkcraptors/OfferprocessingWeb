/*
 * Copyright (c) 2016, Business Intelli Solutions India Pvt. Ltd., and/or its affiliates. All rights reserved.
 * Business Intelli Solutions India Pvt. Ltd. PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.bis.eps.config.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * This class is used to read the properties from properties file and configures
 * 
 * 
 * @author: Srinivas Vemula
 * @date: 01-Aug-2017
 */

@Configuration
@PropertySource("${propertyLocation:app.properties}")
public class DatabaseConnectionConfig {

	private ComboPooledDataSource comboPooledDataSource;
	
	@Autowired
	private Environment env;

	@Value("${jdbc.driverClass}")
	private String driverClass;

	@Value("${jdbc.url}")
	private String jdbcUrl;

	@Value("${jdbc.username}")
	private String user;

	@Value("${jdbc.password}")
	private String password;
	

/*    @Value("${elk.cluster}")
	private String cluster;

	@Value("${elk.node}")
	private String node;

	@Value("${elk.path}")
	private String path;

	@Value("${elk.host}")
	private String host;*/
	

	public ComboPooledDataSource getComboPooledDataSource() {
		return comboPooledDataSource;
	}

	public String getDriverClass() {
		return driverClass;
	}

	public String getJdbcUrl() {
		return jdbcUrl;
	}

	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}
	
	

	/*public String getCluster() {
		return cluster;
	}

	public String getNode() {
		return node;
	}

	public String getPath() {
		return path;
	}

	public String getHost() {
		return host;
	}*/

	public Environment getEnv() {
		return env;
	}

	public void setEnv(Environment env) {
		this.env = env;
	}
	
	
}
