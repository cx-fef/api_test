package com.sanity.scan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SanityScanApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SanityScanApplication.class, args);
	}

	@Override
    	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        	return builder.sources(StartWebApplication.class);
    	}
}
