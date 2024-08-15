package com.example.alien_guy;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AlienGuyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AlienGuyApplication.class, args);
		Dev obj = context.getBean(Dev.class);
		obj.build();
	}

}
