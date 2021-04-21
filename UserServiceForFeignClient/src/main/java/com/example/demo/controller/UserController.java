package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Users;
import com.example.demo.service.UserService;

@RestController
public class UserController {

	
	@Autowired
	private UserService userService;
	
	@Value("${server.port}")
	private int port;
	
	@GetMapping("/users")
	public List<Users> getUsers() {
		return userService.getUsers();
	}
	
	
	@GetMapping("/getPort")
	public String getPort() {
		return "Application running on port " + port;
	}
}
