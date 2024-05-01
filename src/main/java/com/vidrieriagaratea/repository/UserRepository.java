package com.vidrieriagaratea.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vidrieriagaratea.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	public User findByEmail(String email);
}
