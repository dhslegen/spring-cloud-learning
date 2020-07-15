package com.dhslegen.springcloudlearning.eurekasample.microservicediscoveryeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceDiscoveryEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceDiscoveryEurekaServerApplication.class, args);
    }

}
