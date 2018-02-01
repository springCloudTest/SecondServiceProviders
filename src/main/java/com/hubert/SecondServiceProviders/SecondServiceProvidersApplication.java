package com.hubert.SecondServiceProviders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SecondServiceProvidersApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondServiceProvidersApplication.class, args);
	}
}
