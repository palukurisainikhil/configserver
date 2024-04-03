package com.example.reloadablepropertiesserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ReloadablePropertiesServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReloadablePropertiesServerApplication.class, args);
	}

}
