package com.example.jenkinsdemo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JenkinsDemoApplicationTests {

    private static final Logger logger= LoggerFactory.getLogger(JenkinsDemoApplication.class);
    @Test
    void contextLoads() {
        logger.info("Test Case executing...");
        assertEquals(true,true);
        logger.info("Test Case finished executing...");
    }

}
