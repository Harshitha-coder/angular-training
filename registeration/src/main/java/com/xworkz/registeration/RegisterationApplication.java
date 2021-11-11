package com.xworkz.registeration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class RegisterationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisterationApplication.class, args);
	}

}
