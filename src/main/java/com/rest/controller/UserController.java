package com.rest.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	User user;
	
	@GetMapping("{userId}")
	public User getDetails(String userId)
	{
		return user;
		//return new User("101", "Satyam", "Bhopal");
		
	}
	
	// Creation Methods
	@PostMapping
	public String createUserDetails(@RequestBody User user)
	{
		this.user=user;
		return "Successfully created";
	}
	
	//Updatation Methods

	//Updated Methods
	@PutMapping
	public String updateDetails(@RequestBody User user)
	{
		this.user=user;
		return "Update Details Successfully";
	}
	
	//Deleted Methods 
	@DeleteMapping("{userID}")
	public String deleteDetails(String userId)
	{
		this.user=null;
		return "Deleted Successfully";
	}
	
	
	
	

}
