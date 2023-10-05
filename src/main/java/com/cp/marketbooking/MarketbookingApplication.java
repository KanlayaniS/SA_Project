package com.cp.marketbooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class MarketbookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarketbookingApplication.class, args);
	}
}