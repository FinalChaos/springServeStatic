package com.wiskin.webstatic.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan
public class MvcConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**"). addResourceLocations("classpath:/static/");
		//registry.addResourceHandler("/**"). addResourceLocations("classpath:/notDefault/");
		registry.addResourceHandler("/notDefault/**"). addResourceLocations("classpath:/notDefault/");
	}

}
