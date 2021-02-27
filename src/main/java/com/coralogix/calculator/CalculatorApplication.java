package com.coralogix.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {
	public static void main(String[] args) {
		System.out.println("Testing Spring boot");
		SpringApplication.run(CalculatorApplication.class, args);
	}

}
