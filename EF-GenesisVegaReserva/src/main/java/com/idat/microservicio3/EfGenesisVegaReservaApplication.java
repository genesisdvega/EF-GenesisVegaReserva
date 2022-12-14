package com.idat.microservicio3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class EfGenesisVegaReservaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfGenesisVegaReservaApplication.class, args);
	}

}
