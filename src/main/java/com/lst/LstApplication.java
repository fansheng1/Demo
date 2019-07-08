package com.lst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;


@SpringBootApplication
public class LstApplication {
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(LstApplication.class);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(LstApplication.class, args);
	}


}
