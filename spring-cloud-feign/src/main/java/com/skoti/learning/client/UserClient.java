package com.skoti.learning.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.skoti.learning.dto.UserResponseNew;

@FeignClient(name="USERSERVICE")
public interface UserClient {

	@GetMapping("/users")
	public List<UserResponseNew> getUsers();
	
	@GetMapping("/getPort")
	public String getPort();
	
}
