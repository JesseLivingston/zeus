package com.team430.zeus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.net.UnknownHostException;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;


@Configuration
@ComponentScan(basePackages="com.team430.zeus")
@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter {

	@Bean
	public ViewResolver getViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}


	@Bean
	public MongoClient mongoClient() throws UnknownHostException {
		MongoClient mongoClient = new MongoClient("localhost", 27107);

		return mongoClient;
	}

	@Bean
	public Morphia morphia() {
		Morphia morphia = new Morphia();
		morphia.mapPackage("com.team430.zeus.models", true);
		return morphia;
	}

	@Bean
	public Datastore datastore() throws UnknownHostException {
		Datastore store = morphia().createDatastore(mongoClient(), "venus");

		return store;
	}

	
}
