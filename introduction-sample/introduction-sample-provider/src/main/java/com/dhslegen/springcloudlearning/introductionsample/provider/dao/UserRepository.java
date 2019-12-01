package com.dhslegen.springcloudlearning.introductionsample.provider.dao;

import com.dhslegen.springcloudlearning.introductionsample.provider.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author dhslegen
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
