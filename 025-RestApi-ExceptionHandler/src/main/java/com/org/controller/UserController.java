package com.org.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.org.error.UserNotFoundException;

@RestController
public class UserController {

	@GetMapping("/user/{userId}")
	public String getUser(@PathVariable("userId") Integer userId) {
		if(userId == 101)
			return "John";
		else if(userId == 201)
			return "Maxwell";
		else 
		    throw new UserNotFoundException("User Not Found");
	}
}
