package com.bank.bankapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.bankapp.model.User;
import com.bank.bankapp.repository.UserRepository;
@Service
public class UserService {
	
    @Autowired
    private UserRepository userRepository;

   

    public User save1(User user) {
       
        return userRepository.save(user);
    }

    public User findByUsername1(String username) {
    	User user = userRepository.findByUsername(username);
        return user;
    }
}
