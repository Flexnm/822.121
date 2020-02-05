package config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan({"beans", "db"})
//@ComponentScan("db")
@PropertySource("classpath:my.properties")
public class SpringConfig {

	@Autowired
	private Environment env;
	
	@Bean("dbt")
	public JdbcTemplate getJdbcTemplate() {
		DriverManagerDataSource dataSource = 
				new DriverManagerDataSource(env.getRequiredProperty("db.url"), 
						env.getRequiredProperty("db.username"), 
						env.getRequiredProperty("db.password"));
		dataSource.setDriverClassName(env.getProperty("db.driver"));
		
		return new JdbcTemplate(dataSource);		
	}
	
}











