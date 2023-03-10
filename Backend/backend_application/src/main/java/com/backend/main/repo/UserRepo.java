package com.backend.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.main.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
