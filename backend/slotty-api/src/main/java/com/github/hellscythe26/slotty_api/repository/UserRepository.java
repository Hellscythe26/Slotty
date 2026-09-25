package com.github.hellscythe26.slotty_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.github.hellscythe26.slotty_api.entity.User;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}