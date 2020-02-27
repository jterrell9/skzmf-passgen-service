package com.skizmflop.passgen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableEurekaClient
public class PassGenApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(PassGenApplicationRunner.class, args);
	}
	
	/**
	 * Bean declaration for injecting integers as dependencies.
	 * @return int
	 */
	@Bean public Integer getInt() {
		return new Integer(0);
	}
	
}
