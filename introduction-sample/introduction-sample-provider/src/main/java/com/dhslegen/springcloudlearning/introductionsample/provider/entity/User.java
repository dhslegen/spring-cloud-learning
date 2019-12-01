package com.dhslegen.springcloudlearning.introductionsample.provider.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author zhaowenhao
 */
@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String username;

    @Column
    private String name;

    @Column
    private String age;

    @Column
    private BigDecimal balance;

}
