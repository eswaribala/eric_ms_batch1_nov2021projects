package com.eric.inventoryapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class InventoryapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryapiApplication.class, args);
	}

}
