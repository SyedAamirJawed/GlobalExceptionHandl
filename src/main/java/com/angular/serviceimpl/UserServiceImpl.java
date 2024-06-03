package com.angular.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angular.entities.UserEntity;
import com.angular.exception.UserNotFoundException;
import com.angular.repo.UserRepo;
import com.angular.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public UserEntity saveUserData(UserEntity userEntity) {
		UserEntity saveEntity = userRepo.save(userEntity);
		return saveEntity;
	}

	@Override
	public List<UserEntity> getAllUser() {
		List<UserEntity> allUser = userRepo.findAll();
		return allUser;
	}

	@Override
	public UserEntity getSingleUser(Integer userId) {
		boolean data = userRepo.findById(userId).isEmpty();
		if (userRepo.findById(userId).isEmpty()) {
			throw new UserNotFoundException("user not found with given id : "+userId);
		}
		return userRepo.findById(userId).get();
	}

}
