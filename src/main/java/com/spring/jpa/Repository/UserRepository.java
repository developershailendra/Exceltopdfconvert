package com.spring.jpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.jpa.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
   // List<User> getAllUsers();
   // User createUser(User user);
//    String deleteUser(Long id);
//    Optional<User> getUserById(Long id);
//    String updateUser(Long id, User user);
}