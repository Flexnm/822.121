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
@ComponentScan({"db", "beans"})
@PropertySource("classpath:application.properties")
@EnableTransactionManagement // will use the method: transactionManager()
public class SpringConfig {
	
	@Autowired
	private Environment env;
	
	@Bean //@Bean("ds") --> name the Spring bean      ctx.getBean("ds")
	public DataSource dataSource() {
		DriverManagerDataSource ds = 
				new DriverManagerDataSource(env.getRequiredProperty("db.url"), 
						env.getRequiredProperty("db.username"), 
						env.getRequiredProperty("db.password"));
		ds.setDriverClassName(env.getRequiredProperty("db.driver"));
		return ds;
	}
	
	@Bean
	public LocalSessionFactoryBean localSessionFactory() {
		LocalSessionFactoryBean lsfb = new LocalSessionFactoryBean();
		lsfb.setDataSource(dataSource());
		lsfb.setPackagesToScan("beans");
		Properties props = new Properties();
		props.setProperty("hibernate.hbm2ddl.auto", env.getRequiredProperty("db.ddl"));
		lsfb.setHibernateProperties(props);
		return lsfb;
	}
	
	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(SessionFactory localSessionFactory) {
		HibernateTransactionManager manager = 
				new HibernateTransactionManager(localSessionFactory);
		return manager;
	}
	

}













