package com.bank.bankapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.bankapp.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
	
	

}
