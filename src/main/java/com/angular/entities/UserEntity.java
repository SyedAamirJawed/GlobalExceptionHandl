package com.angular.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class UserEntity {

	@Id
	private Integer userId;
	private String userName;
	private String userEmail;
}
