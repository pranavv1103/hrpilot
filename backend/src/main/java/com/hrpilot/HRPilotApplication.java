package com.hrpilot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class HRPilotApplication {

    public static void main(String[] args) {
        SpringApplication.run(HRPilotApplication.class, args);
    }
}
