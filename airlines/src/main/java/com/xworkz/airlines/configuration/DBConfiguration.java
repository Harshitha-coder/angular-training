package com.xworkz.airlines.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import lombok.extern.log4j.Log4j;

@Configuration
@ConfigurationProperties("spring.datasource")
@Log4j
public class DBConfiguration {

	@Profile("dev")
	@Bean
	public String devDBConnection() {
		log.info("devDBConnection");
		return "dev";
	}
	
	@Profile("prod")
	@Bean
	public String prodDBConnection() {
		log.info("prodDBConnection");
		return "prod";
	}
}
