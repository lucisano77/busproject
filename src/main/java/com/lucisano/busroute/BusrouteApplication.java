package com.lucisano.busroute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.lucisano.busroute.BusDB.entity")
public class BusrouteApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusrouteApplication.class, args);
	}

}
