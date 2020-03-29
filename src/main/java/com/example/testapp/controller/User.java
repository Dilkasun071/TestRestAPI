package com.example.testapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.testapp.model.UserDataDTO;
import com.example.testapp.services.UserServices;

@RestController
@RequestMapping("/user")
public class User {
	
	@Autowired
	UserServices UserServices;
	
	@GetMapping("/all")
	public List<UserDataDTO> allUsers() {
		return UserServices.findAllUsers();
	}
	
	@PostMapping("/add")
	public String saveUsers(@RequestBody UserDataDTO userDataDTO) {
		return UserServices.saveAllUsers(userDataDTO);
	}
		
	@PutMapping("/update")
	public String updateUser(@RequestBody UserDataDTO newUserDataDTO) {
		return UserServices.updateUser(newUserDataDTO);
	}
	
	@GetMapping("/find/{id}")
	public Optional<UserDataDTO> findUser(@PathVariable Integer id) {
		return UserServices.findById(id);
	}
	
}
