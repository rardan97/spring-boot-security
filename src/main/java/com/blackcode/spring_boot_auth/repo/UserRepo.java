package com.blackcode.spring_boot_auth.repo;

import com.blackcode.spring_boot_auth.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users, Integer> {
    Users findByUsername(String username);
}
