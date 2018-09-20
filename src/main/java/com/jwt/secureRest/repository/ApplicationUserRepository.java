package com.jwt.secureRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.secureRest.entity.ApplicationUser;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long>{
	
	ApplicationUser findByUsername(String userName);

}
