package com.yang.cloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudConsumer1Application {

	public static void main(String[] args) {
		SpringApplication.run(CloudConsumer1Application.class, args);
	}

}
