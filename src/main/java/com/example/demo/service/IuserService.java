package com.example.demo.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.UserRepository;
import com.example.demo.entity.User;

@Service
public class IuserService {
	@Autowired // dependency injection
	UserRepository userRepository;

	@Transactional
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);

	}

	public Iterable<User> getUser() {
		return userRepository.findAll();
	}

	public Optional<User> getUsers(Integer id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}
	
    @Transactional
	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}
}
