package com.law.and.order;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.*;

import com.law.and.order.converters.StringToEnumConverter;

@Configuration
@EnableWebMvc
@ComponentScan
@EnableAutoConfiguration
public class Configurations extends WebMvcConfigurerAdapter {
	
	 public void addFormatters(FormatterRegistry registry) {
	        registry.addConverter(new StringToEnumConverter());
	    }


	private static final String[] CLASSPATH_RESOURCE_LOCATIONS = {
			"classpath:/META-INF/resources/", "classpath:/resources/",
			"classpath:/static/", "classpath:/public/", "classpath:/drools/rules" };

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**")
				.addResourceLocations(CLASSPATH_RESOURCE_LOCATIONS);
	}
}
