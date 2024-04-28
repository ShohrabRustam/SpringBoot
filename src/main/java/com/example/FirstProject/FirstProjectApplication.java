package com.example.FirstProject;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
//		SpringApplication.run(FirstProjectApplication.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(FirstProjectApplication.class, args);
		Alian alienObj = context.getBean(Alian.class);
		alienObj.show();
//		System.out.println("Welcome to Spring Boot Project !!!");
	}

}
