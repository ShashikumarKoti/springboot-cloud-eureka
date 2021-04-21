package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Users;

@Service
public class UserService {

	public List<Users> getUsers() {
			return Stream.of(new Users("shashi", "koti", "Hospet"),
					new Users("Shwetha", "Hagedal", "Dvg")).collect(Collectors.toList());
	}
	
	

}
