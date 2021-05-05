package com.skoti.learning.client;

import java.util.List;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.skoti.learning.client.config.LoadBalancerConfig;
import com.skoti.learning.dto.UserResponseNew;

@FeignClient(name="USERSERVICE")
@LoadBalancerClient(name="USERSERVICE", configuration = LoadBalancerConfig.class)
public interface UserClient {

	@GetMapping("/users")
	public List<UserResponseNew> getUsersFromService();
	
	@GetMapping("/getPort")
	public String getPortsFromService();
	
}
