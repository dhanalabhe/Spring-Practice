package com.maincrafts.contactform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import com.maincrafts.contactform.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}