package com.vd.springcloudeureka;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudeurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudeurekaApplication.class, args);
	}

}
