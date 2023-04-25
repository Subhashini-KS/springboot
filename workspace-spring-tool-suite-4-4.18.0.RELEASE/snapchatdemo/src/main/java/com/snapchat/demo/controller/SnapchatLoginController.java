package com.snapchat.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SnapchatLoginController {

	@GetMapping("/login")
	public String getLogin(@RequestParam String username,@RequestParam String password)
	{
		if(username.equals("admin")&& password.equals("123xyz"))
		{
			return "Login Successful" ;
		}
		else
		{
			return "Login Failed! Please check your username and password " ;
		}
	}
	
}
