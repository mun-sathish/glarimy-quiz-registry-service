package com.glarimy.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class QuizRegistryService {

	public static void main(String[] args) {
		SpringApplication.run(QuizRegistryService.class, args);
	}

}
