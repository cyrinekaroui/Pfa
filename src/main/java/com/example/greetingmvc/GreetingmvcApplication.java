package com.example.greetingmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = {"com.example.greetingmvc.models"})
@SpringBootApplication
public class GreetingmvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetingmvcApplication.class, args);
	}

}
