package com.ct.rating;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsRatingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsRatingServiceApplication.class, args);
	}

}
