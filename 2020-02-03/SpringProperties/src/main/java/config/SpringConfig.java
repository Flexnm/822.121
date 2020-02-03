package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;


@Configuration
@ComponentScan("beans")
@PropertySource({"classpath:application.properties", "classpath:web.properties"})
public class SpringConfig {
	
//	@Autowired
//	private Environment environment;
	
	

}
