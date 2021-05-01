package com.mjava.foodbox.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjava.foodbox.model.User;
import com.mjava.foodbox.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	public UserRepository userrepo;
	
	public void newUserRegister(User user)
	{
		userrepo. save(user);
	}
}
