package com.in28minutes.limitservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
@EnableConfigurationProperties(Configuration.class)
@SpringBootApplication
public class LimitserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LimitserviceApplication.class, args);
	}

}
