package com.spring.jpa.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.jpa.Entity.Customer;
import com.spring.jpa.Repository.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public String registerCustomer(Customer customer) {
        if (customerRepository.findByUsername(customer.getUsername()) != null) {
            return "Username is already taken";
        }

        if (customerRepository.findByEmail(customer.getEmail()) != null) {
            return "Email is already registered";
        }

        customerRepository.save(customer);
        return "Customer registered successfully";
    }

    public String loginCustomer(String username, String password) {
        Customer existingCustomer = customerRepository.findByUsername(username);

        if (existingCustomer == null) {
            return "Username not found";
        }

        if (!existingCustomer.getPassword().equals(password)) {
            return "Invalid credentials";
        }

        return "Login successful";
    }
}
