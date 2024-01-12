package com.fit.se.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fit.se.entity.User;
import com.fit.se.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	public Optional<User> getUserById(int id){
		return userRepository.findById(id);
	}
	
	public User addUser(User user) {
		return userRepository.save(user);
	}
	
	public User updateUser(int id,User user) {
		user.setId(id);
		return userRepository.save(user);
	}
	
	public void deleteUser(int id) {
		userRepository.deleteById(id);
	}
}
