package com.learning.loggerexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class LoggerExampleApplication {

	private static final Logger logger = LoggerFactory.getLogger(LoggerExampleApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LoggerExampleApplication.class, args);
		logger.info("Application has started");
	}

}
