package com.springbootconfigurationpropertyexample;

import com.springbootconfigurationpropertyexample.model.KKHindiGyan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = {"classpath:kkhindigyan.properties"})
@EnableConfigurationProperties(value = {KKHindiGyan.class}) // instead of @Component
public class SpringbootConfigurationpropertyExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringbootConfigurationpropertyExampleApplication.class, args);
		KKHindiGyan kkHindiGyan = applicationContext.getBean(KKHindiGyan.class);
		System.out.println(kkHindiGyan);
	}
	
	
	
	/*
	 * @Bean
	 * 
	 * @ConfigurationProperties(prefix = "myapp") public KKHindiGyan kkHindiGyan() {
	 * return new KKHindiGyan(); }
	 */
}
