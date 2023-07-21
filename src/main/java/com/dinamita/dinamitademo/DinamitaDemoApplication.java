package com.dinamita.dinamitademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DinamitaDemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DinamitaDemoApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DinamitaDemoApplication.class);
	}

}
