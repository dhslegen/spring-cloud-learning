package com.dhslegen.springcloudlearning.eurekasample.microservicediscoveryeurekaserverha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceDiscoveryEurekaServerHaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceDiscoveryEurekaServerHaApplication.class, args);
    }

}
