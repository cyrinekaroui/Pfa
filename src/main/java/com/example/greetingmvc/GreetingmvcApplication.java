package com.example.greetingmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.example.greetingmvc.models"})
public class GreetingmvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetingmvcApplication.class, args);
	}

}
