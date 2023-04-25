package com.example.twitterdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwitterLoginController {

	
	@GetMapping("/login")
	public String login()
	{
		return "Login Successful!" ;
	}
	
}
