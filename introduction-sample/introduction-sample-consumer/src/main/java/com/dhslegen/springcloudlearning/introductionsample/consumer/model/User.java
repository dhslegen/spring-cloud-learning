package com.dhslegen.springcloudlearning.introductionsample.consumer.model;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author dhslegen
 */
@Data
public class User {
    private Long id;
    private String username;
    private String name;
    private Integer age;
    private BigDecimal balance;
}
