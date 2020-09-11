package com.example.webspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class WebSpringApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(WebSpringApplication.class, args);
	}

}
