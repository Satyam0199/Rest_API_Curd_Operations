package com.rest.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rest.model.User;
import com.rest.repository.UserRepository;
import com.rest.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	UserRepository userRepository;
	public UserServiceImpl(UserRepository userRepository) {
		//More Bussiness Logic
		this.userRepository = userRepository;
	}

	@Override
	public String createDetailsUser(User user) {
		//More Bussiness Logic
		userRepository.save(user);
		
		return "Created Success";
	}

	@Override
	public String updateDetailsUser(User user) {
		//More Bussiness Logic
		userRepository.save(user);
		return "Updated Success";
	}

	@Override
	public String deleteDetailsUser(String userId) {
		//More Bussiness Logic
		userRepository.deleteById(userId);
		return "Deleted Success";
	}

	@Override
	public User getDetailsUser(String userId) {
		//More Bussiness Logic
		return userRepository.findById(userId).get();
	}

	@Override
	public List<User> getAllUser() {
		//More Bussiness Logic
		return userRepository.findAll();
	}

}
