package com.dhslegen.springcloudlearning.introductionsample.provider.controller;

import com.dhslegen.springcloudlearning.introductionsample.provider.dao.UserRepository;
import com.dhslegen.springcloudlearning.introductionsample.provider.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dhslegen
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
