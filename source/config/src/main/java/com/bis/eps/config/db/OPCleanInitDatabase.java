package com.bis.eps.config.db;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.flywaydb.core.Flyway;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**@param
 *  Flyway Cleaner
 *  Using this we can able flush schema totally
 *  
 * @author: Srinivas Vemula
 * @date: 01-Aug-2017
 */
public class OPCleanInitDatabase {
	
	private ComboPooledDataSource comboPooledDataSource;

	public static void main(String args[]) throws Exception {
		OPCleanInitDatabase installer = new OPCleanInitDatabase();
		installer.configureDatabase();
	}


	private void configureDatabase() throws Exception {
		
		Flyway flyway = new Flyway();
		flyway.setDataSource(comboPooledDataSource());
		flyway.setTable("schema_history");
		flyway.setSqlMigrationSuffix(".sql");
		flyway.setSchemas("offerprocessing");
		//flyway.setInitVersion("1");
		flyway.setBaselineVersionAsString("1");
		flyway.clean();
		//flyway.init();
		flyway.migrate();
		
	}
	
	/*@param
	 * Bean intantiation for standalone simple spring application
	 * We can able to create bean with out using servletcontext(no need to run server at all)
	 */
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


