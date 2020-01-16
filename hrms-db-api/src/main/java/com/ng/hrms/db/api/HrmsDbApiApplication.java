package com.ng.hrms.db.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HrmsDbApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrmsDbApiApplication.class, args);
	}

}
