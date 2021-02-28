package com.coralogix.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CalculatorApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		System.out.println("Testing Spring boot");
		SpringApplication.run(CalculatorApplication.class, args);
	}

}
