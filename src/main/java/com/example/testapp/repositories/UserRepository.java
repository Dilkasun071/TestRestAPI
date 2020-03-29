package com.example.testapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.testapp.model.UserDataDTO;;

public interface UserRepository extends JpaRepository<UserDataDTO, Integer>{

}
