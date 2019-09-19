package com.yang.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.EnableLoadTimeWeaving;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class CloudProvider1Application {

	public static void main(String[] args) {
		SpringApplication.run(CloudProvider1Application.class, args);
	}

}
