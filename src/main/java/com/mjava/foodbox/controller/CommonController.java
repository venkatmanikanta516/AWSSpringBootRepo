package com.mjava.foodbox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mjava.foodbox.model.User;
import com.mjava.foodbox.service.UserService;

@RestController
@RequestMapping("/api/v1/")
public class CommonController {

	@Autowired
	public   UserService userService;
	
	@PostMapping("/register")
	public void registerNewUser(@RequestBody User user)
	{
		userService.newUserRegister(user);
	}
}
