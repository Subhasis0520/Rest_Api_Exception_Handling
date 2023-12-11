package com.org.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

	
	@GetMapping("/hello")
	public ResponseEntity<String> greet() {
		int i = 10/0;
		return new ResponseEntity<String>("Welcome "+i,HttpStatus.OK);
	}
}
