package com.angular.service;

import java.util.List;

import com.angular.entities.UserEntity;

public interface UserService {

	public UserEntity saveUserData(UserEntity userEntity);
	public List<UserEntity> getAllUser();
	public UserEntity getSingleUser(Integer userId);
}
