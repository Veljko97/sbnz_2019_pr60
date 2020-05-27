package com.law.and.order;

import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.law.and.order.converters.StringToEnumConverter;

@Configuration
public class Configurations extends  WebMvcAutoConfiguration {
	
	 public void addFormatters(FormatterRegistry registry) {
	        registry.addConverter(new StringToEnumConverter());
	    }
	
}
