package com.app.jenkins;


import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JenkinsApp1Application {

	public static Logger logger = LoggerFactory.getLogger(JenkinsApp1Application.class);
	
	@PostConstruct
	public void init() {
		logger.info("application initlaized..");
	}
	public static void main(String[] args) {
		logger.info("application started....");
		System.out.println("appplication started sop...");
		SpringApplication.run(JenkinsApp1Application.class, args);
		logger.info("**application started....");
		System.out.println("**appplication started sop...");
	}
	
	@Bean
	public CommandLineRunner cr() {
		return (args)-> {
			logger.info("command line runner updated and executed...");
			System.out.println("hello world..");
		};
	}
}
