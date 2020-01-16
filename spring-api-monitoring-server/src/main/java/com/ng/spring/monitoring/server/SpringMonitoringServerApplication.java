package com.ng.spring.monitoring.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class SpringMonitoringServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMonitoringServerApplication.class, args);
	}

}
