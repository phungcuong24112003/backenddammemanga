package com.dammetruyen.repository;

import com.dammetruyen.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User findByAccount(String account);
}
