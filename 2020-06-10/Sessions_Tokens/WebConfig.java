package couponProject3.web;

import java.util.HashMap;
import java.util.Map;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import couponProject3.facades.AdminFacade;
import couponProject3.facades.CompanyFacade;
import couponProject3.facades.CustomerFacade;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



@Configuration
@EnableSwagger2
@Aspect
public class WebConfig implements WebMvcConfigurer{
		
	
	
    /**
     * A single session map to hold all tokens and live user facades.
     */
	@Bean
	public Map<String, Session> sessionMap() {
		return new HashMap<String, Session>();
	}
	
	/**
	 * To enable Swagger 2
	 */
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any()).build();
	}
}
