package com.vidrieriagaratea.service;

import com.vidrieriagaratea.exception.UserException;
import com.vidrieriagaratea.model.User;

public interface UserService {
	
	public User findUserById(Long id) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;
}
