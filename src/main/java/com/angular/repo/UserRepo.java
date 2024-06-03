package com.angular.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.angular.entities.UserEntity;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, Serializable>{
}
