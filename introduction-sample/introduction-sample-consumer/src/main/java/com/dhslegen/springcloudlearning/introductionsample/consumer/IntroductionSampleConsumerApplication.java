package com.dhslegen.springcloudlearning.introductionsample.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author dhslegen
 */
@SpringBootApplication
public class IntroductionSampleConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntroductionSampleConsumerApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
