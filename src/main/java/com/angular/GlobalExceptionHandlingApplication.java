package com.angular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GlobalExceptionHandlingApplication {

	public static void main(String[] args) {
		SpringApplication.run(GlobalExceptionHandlingApplication.class, args);
		System.out.println("Program Start");
	}

}
