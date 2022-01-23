package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.UserRepository;
import com.example.demo.entity.User;

@Service
public class IuserService {
	@Autowired //dependency injection
    UserRepository userRepository;
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
		
	}

}
