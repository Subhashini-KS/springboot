package com.whatsapp.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class WhatsappDemoController {

	@GetMapping("/signin")
	public String signinpage()
	{
		return " This is the Signin Page";
	}
	
	@GetMapping("/landingpage/{username}")
	public String landingpage(@PathVariable ("username") String username)
	{
		return "Landing Page of the user " + username;
	}
}
