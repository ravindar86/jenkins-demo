package com.example.jenkinsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsDemoApplication {

    @PostConstruct
    public void init(){
        System.out.println("App Started");
    }

    public static void main(String[] args) {
        System.out.println("App Executed");
        SpringApplication.run(JenkinsDemoApplication.class, args)
    }

}
