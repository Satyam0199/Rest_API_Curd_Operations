package com.rest.service;

import java.util.List;

import com.rest.model.User;

public interface UserService {
	
	public String createDetailsUser(User user);
	
	public String updateDetailsUser(User user);
	
	public String deleteDetailsUser(String userId);
	
	public User getDetailsUser(String userId);
	
	public List<User> getAllUser();

	
}
