package com.consumer_api;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class DemoBackendConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoBackendConsumerApplication.class, args);
	}
}
