package com.bis.eps.config.db;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.FlywayException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * @param Flyway
 *            migrator Using this we can able add fresh migrations under
 *            src\\main\\resources\\migrations folder migration history will be
 *            maintain in schema_history table
 * 
 * @author: Srinivas Vemula
 * @date: 01-Aug-2017
 */
public class OPDataBaseInstallation {

	private ComboPooledDataSource comboPooledDataSource;

	public static void main(String args[]) throws Exception {
		OPDataBaseInstallation installer = new OPDataBaseInstallation();
		installer.configureDatabase();
	}

	private void configureDatabase() throws Exception {
		Flyway flyway = new Flyway();

		flyway.setDataSource(comboPooledDataSource());
		flyway.setTable("schema_history");
		flyway.setSqlMigrationSuffix(".sql");
		/**
		 * TODO Way to set migration folder location outside the classpath Using
		 * 'filesystem' keyword we can able set file path..
		 * 
		 */
		flyway.setLocations("com\\bis\\eps\\config\\db\\migrations");
		try {
			flyway.setValidateOnMigrate(false);
			flyway.migrate();
		} catch (FlywayException e) {
			flyway.repair();
			e.printStackTrace();

		}

	}

	@Bean
	public DataSource comboPooledDataSource() {
		@SuppressWarnings("resource")
		ApplicationContext ctx = new AnnotationConfigApplicationContext(PropertyPathConfiguration.class);
		DatabaseConnectionConfig dbconfig = ctx.getBean(DatabaseConnectionConfig.class);

		this.comboPooledDataSource = new ComboPooledDataSource();
		try {
			comboPooledDataSource.setDriverClass(dbconfig.getDriverClass());
		} catch (PropertyVetoException e) {
			throw new RuntimeException(e);
		}
		comboPooledDataSource.setJdbcUrl(dbconfig.getJdbcUrl());
		comboPooledDataSource.setUser(dbconfig.getUser());
		comboPooledDataSource.setPassword(dbconfig.getPassword());
		return comboPooledDataSource;
	}
}
