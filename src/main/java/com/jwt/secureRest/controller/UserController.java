package com.jwt.secureRest.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.secureRest.entity.ApplicationUser;
import com.jwt.secureRest.repository.ApplicationUserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
	
	private ApplicationUserRepository appRepo;
	private BCryptPasswordEncoder passwordEncoder;
	
	
	public UserController(ApplicationUserRepository appRepo, BCryptPasswordEncoder passwordEncoder) {
		super();
		this.appRepo = appRepo;
		this.passwordEncoder = passwordEncoder;
	}
	
	
	@PostMapping("/signup")
	public void signUp(@RequestBody ApplicationUser user){
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		appRepo.save(user);
	}
	
	
	

}
