package com.github.hellscythe26.slotty_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.github.hellscythe26.slotty_api.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}