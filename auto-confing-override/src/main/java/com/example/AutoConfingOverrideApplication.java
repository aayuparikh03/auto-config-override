package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class AutoConfingOverrideApplication {


	public static void main(String[] args) {
		SpringApplication.run(AutoConfingOverrideApplication.class, args);
	}

}
