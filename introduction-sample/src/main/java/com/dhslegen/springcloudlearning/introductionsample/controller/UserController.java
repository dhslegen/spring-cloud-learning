package com.dhslegen.springcloudlearning.introductionsample.controller;

import com.dhslegen.springcloudlearning.introductionsample.dao.UserRepository;
import com.dhslegen.springcloudlearning.introductionsample.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaowenhao
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        return userRepository.findById(id).orElse(null);
    }

}
