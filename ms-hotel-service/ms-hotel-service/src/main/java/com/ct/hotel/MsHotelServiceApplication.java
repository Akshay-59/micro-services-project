package com.ct.hotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsHotelServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsHotelServiceApplication.class, args);
	}

}
