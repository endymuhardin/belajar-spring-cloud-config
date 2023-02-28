package com.muhardin.endy.belajarspringcloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BelajarSpringCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(BelajarSpringCloudConfigApplication.class, args);
	}

}
