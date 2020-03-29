package com.example.testapp.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.example.testapp.repositories.UserRepository;
import com.example.testapp.services.UserServices;
import com.example.testapp.model.UserDataDTO;

@Service
public class UserServiceImpl implements UserServices{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<UserDataDTO> findAllUsers() { 
		return userRepository.findAll();
	}

	@Override
	public String saveAllUsers(UserDataDTO userDataDto) {
		userRepository.save(userDataDto);
		return "Data Saved";
	}

	@Override
	public String updateUser(UserDataDTO newUserDataDto) {
		String msg = null;
		if(newUserDataDto.getId() != null ) {
			userRepository.save(newUserDataDto);
			msg = "updated";
		}else {
			msg = "error";
		}
		return msg;
	}

	@Override
	public Optional<UserDataDTO> findById(Integer id) {
		return userRepository.findById(id);
	}

}
