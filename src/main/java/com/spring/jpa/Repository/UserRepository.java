package com.spring.jpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.jpa.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
