package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.User;
import com.example.demo.service.IuserService;

@RestController
public class UserController {

	@Autowired
	IuserService userService;

	@GetMapping("/user")
	Iterable<User> getUser() {
		return userService.getUser();
	}

	@GetMapping("/user/{id}")
	Iterable<User> getUser(@PathVariable("id") Integer id) {
		return userService.getUser();
	}

	@PostMapping("/user") // create User
	void createUser(@RequestBody User user) {
		System.out.println(user.getName());
		userService.saveUser(user);
	}

	@DeleteMapping("/user") // Delete User
	void deleteUser() {

	}
}
