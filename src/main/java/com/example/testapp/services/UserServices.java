package com.example.testapp.services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.example.testapp.model.UserDataDTO;

@Service
public interface UserServices {

	public List<UserDataDTO> findAllUsers();

	public String saveAllUsers(UserDataDTO userDataDto);
	
	public String updateUser(UserDataDTO newUserDataDto);

	public Optional<UserDataDTO> findById(Integer id);
}
