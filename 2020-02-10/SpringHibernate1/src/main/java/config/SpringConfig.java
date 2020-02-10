package config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan({"beans", "db"})
@PropertySource("classpath:application.properties")
@EnableTransactionManagement
public class SpringConfig {

	@Autowired
	private Environment env;
	
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = 
				new DriverManagerDataSource(env.getRequiredProperty("db.url"), 
						env.getRequiredProperty("db.username"),
						env.getRequiredProperty("db.password"));
		dataSource.setDriverClassName(env.getRequiredProperty("db.driver"));
		return dataSource;
	}
	
	@Bean
	public LocalSessionFactoryBean getLocalSessionFactory() {
		LocalSessionFactoryBean factory = new LocalSessionFactoryBean();
		factory.setDataSource(getDataSource());
		factory.setPackagesToScan("beans"); // where to find @Entity
		Properties hibernateProperties = new Properties();
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
		factory.setHibernateProperties(hibernateProperties);
		return factory;
	}
	
	
	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(SessionFactory getLocalSessionFactory) {
		HibernateTransactionManager tmanager = new HibernateTransactionManager();
		tmanager.setSessionFactory(getLocalSessionFactory);
		return tmanager;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
