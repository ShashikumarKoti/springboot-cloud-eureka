package com.skoti.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skoti.learning.client.UserClient;
import com.skoti.learning.dto.UserResponseNew;

@RestController
public class UserController {

	
	@Autowired
	private UserClient client;
	
	@GetMapping("/findAllUser")
	public List<UserResponseNew> getAllUser() {
		return client.getUsers();
	} 
	
	@GetMapping("/getAllPorts")
	public String getAllPorts() {
		return client.getPort();
	}
}
