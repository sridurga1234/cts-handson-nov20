package com.example.patym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PatymApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatymApplication.class, args);
	}

}
