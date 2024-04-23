package com.codebybelal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codebybelal.entities.User;
import com.codebybelal.payloads.UserDto;

public interface UserRepo extends JpaRepository<User, Integer> {

	void save(UserDto user);

}
