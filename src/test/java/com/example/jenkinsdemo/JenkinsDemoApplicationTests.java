package com.example.jenkinsdemo;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JenkinsDemoApplicationTests {

    private static Logger logger= LoggerFactory.getLogger(JenkinsDemoApplication.class);
    @Test
    void contextLoads() {
        assertEquals(true,true);
    }

}
