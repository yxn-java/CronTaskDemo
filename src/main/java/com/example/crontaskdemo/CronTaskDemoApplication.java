package com.example.crontaskdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CronTaskDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CronTaskDemoApplication.class, args);
    }

}
