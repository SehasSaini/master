package com.in28minutes.currencyconvertorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
 //import org.springframework.cloud.
@SpringBootApplication

@EnableFeignClients("com.in28minutes.microservices.currencyconversionservice")
public class CurrencyConvertorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConvertorServiceApplication.class, args);
	}

}
