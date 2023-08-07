package com.ct.user.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsUserServiceApplication.class, args);
	}

}
