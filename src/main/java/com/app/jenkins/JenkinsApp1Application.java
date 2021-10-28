package com.app.jenkins;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsApp1Application {

	public static Logger logger = LoggerFactory.getLogger(JenkinsApp1Application.class);
	
	public void init() {
		logger.info("application initlaized..");
	}
	public static void main(String[] args) {
		logger.info("application started....");
		System.out.println("appplication started sop...");
		SpringApplication.run(JenkinsApp1Application.class, args);
	}
}
