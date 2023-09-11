package com.desafio.dev;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.desafio.dev.model")
public class DevApplication {
	public static void main(String[] args) {
		SpringApplication.run(DevApplication.class, args);
	}
}
