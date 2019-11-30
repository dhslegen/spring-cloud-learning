package com.dhslegen.springcloudlearning.introductionsample.dao;

import com.dhslegen.springcloudlearning.introductionsample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author zhaowenhao
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
