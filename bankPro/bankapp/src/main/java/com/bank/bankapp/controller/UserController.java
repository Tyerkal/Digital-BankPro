package com.bank.bankapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.bankapp.model.User;
import com.bank.bankapp.service.UserService;

@RestController
public class UserController {
	
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
      User user1= userService.save1(user);
      System.out.println(user1);
    	return new ResponseEntity<User>(user1, HttpStatus.CREATED);
    }

    @GetMapping(value = "get/{username}")
    public ResponseEntity<User> getUser(@PathVariable String username) {
    	User user= userService.findByUsername1(username);
    	System.out.println(user);
    	
        return  ResponseEntity.ok(user);
    }

}
