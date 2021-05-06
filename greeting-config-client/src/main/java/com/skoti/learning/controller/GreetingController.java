package com.skoti.learning.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class GreetingController {

	@Value("${message: Default hello}")
	private String message;
	
	@GetMapping("/greet")
	public String greet() {
		return message;
	}
}
