package com.spring.jpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.jpa.Entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByUsername(String username);
    Customer findByEmail(String email);
}
