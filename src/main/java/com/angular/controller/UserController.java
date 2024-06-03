package com.angular.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.angular.entities.UserEntity;
import com.angular.exception.UserNotFoundException;
import com.angular.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/save")
	public ResponseEntity<UserEntity> saveUser(@RequestBody UserEntity userData) {
		UserEntity saveUserData = userService.saveUserData(userData);
		return new ResponseEntity<UserEntity>(saveUserData, HttpStatus.CREATED);
	}

	@GetMapping("/user/{id}")
	public ResponseEntity<UserEntity> singleUserData(@PathVariable Integer id) {
		UserEntity singleUser = userService.getSingleUser(id);
		return new ResponseEntity<UserEntity>(singleUser, HttpStatus.OK);
	}

	@GetMapping("/user")
	public ResponseEntity<List<UserEntity>> allUser() {
		List<UserEntity> allUser = userService.getAllUser();
		return new ResponseEntity<>(allUser, HttpStatus.OK);
	}
	
	@GetMapping("/test")
	public ResponseEntity<String> test(){
		
		try {
			int a=10/0;
		} catch (Exception e) {
			throw new UserNotFoundException("can't / by zero");
		}
		return new ResponseEntity<String>("good",HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<UserEntity>> getAllData(){
		List<UserEntity> allUser = userService.getAllUser();
	   return new ResponseEntity<>(allUser,HttpStatus.OK);
		
	}
	

	
}
