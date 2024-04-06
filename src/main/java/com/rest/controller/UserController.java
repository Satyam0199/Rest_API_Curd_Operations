package com.rest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.User;
import com.rest.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}

	//Read Specific USer Details
	@GetMapping("{userId}")
	public User getDetails(@PathVariable("userId") String userId)
	{
		return userService.getDetailsUser(userId);	
	}
	
	
	//Read All USer Details from DB
	@GetMapping()
	public List<User> getAll()
	{
		return userService.getAllUser();
		
	}

	
	
	
	
	// Creation Methods
	@PostMapping
	public String createUserDetails(@RequestBody User user)
	{
		userService.createDetailsUser(user);
		return "Successfully created";
	}

	
	
	
	
	//Updated Methods
	@PutMapping
	public String updateDetails(@RequestBody User user)
	{
		userService.updateDetailsUser(user);
		return "Update Details Successfully";
	}
	
	
	
	
	
	
	//Deleted Methods 
	@DeleteMapping("{userId}")
	public String deleteDetails(@PathVariable("userId")String userId)
	{
		userService.deleteDetailsUser(userId);
		return "Deleted Successfully";
	}
	
	
	
	

}
