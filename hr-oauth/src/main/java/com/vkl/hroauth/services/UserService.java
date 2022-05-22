package com.vkl.hroauth.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vkl.hroauth.entities.User;
import com.vkl.hroauth.feignclients.UserFeignClient;

@Service
public class UserService {
	
	@Autowired
	private UserFeignClient userFeignClient;
	
	public User FindByEmail(String email) {
		User user = userFeignClient.findByEmail(email).getBody();
		if(user ==null) {
			throw new IllegalArgumentException("Email not found");			
		}
		return user;
	}
	
}
