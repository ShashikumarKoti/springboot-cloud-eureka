package com.skoti.learning.controller;

import java.util.ArrayList;
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
		return client.getUsersFromService();
	} 
	
	@GetMapping("/getAllPorts")
	public String getAllPorts() {
		return client.getPortsFromService();
	}
	
	public List<UserResponseNew> fallback_defaultUsers() {
		System.out.println("Outage problem occured...!!!");
		List<UserResponseNew> userList = new ArrayList<>();
		UserResponseNew defaultUsers = new UserResponseNew();
		defaultUsers.setFname("default_firstName");
		defaultUsers.setLname("default_lastName");
		defaultUsers.setCity("default_city");
		
		userList.add(defaultUsers);
		
		return userList;
	}
}
