package com.aufine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableConfigurationProperties
/*@EnableEurekaClient*/
public class AufineWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(AufineWebApplication.class, args);
    }

}
