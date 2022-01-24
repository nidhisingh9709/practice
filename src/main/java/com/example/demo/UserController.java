package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

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
	Optional<User> getUser(@PathVariable("id") Integer id) {
		return userService.getUsers(id);
	}

	@PostMapping("/user") // create User
	@ResponseStatus(code=HttpStatus.CREATED)
	void createUser(@RequestBody @Valid User user) {
		System.out.println(user.getName());
		userService.saveUser(user);
	}

	@DeleteMapping("/user/{id}") // Delete User
	void deleteUser(@PathVariable("id") Integer id) {
		userService.deleteUser(id);

	}
}
