package com.app.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsApp1ApplicationTests {
	public static Logger logger = LoggerFactory.getLogger(JenkinsApp1ApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("test executed..");
		logger.info("test executed 2nd time..");
	assertEquals("hello","hello");
	}

}
