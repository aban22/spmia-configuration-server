package com.thoughtmechanix.core.spmiaconfigurationserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpmiaConfigurationServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpmiaConfigurationServerApplication.class, args);
	}

}
