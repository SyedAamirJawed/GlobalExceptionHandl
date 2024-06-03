package com.angular.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserExceptionController {
	
	
	@ExceptionHandler(value = UserNotFoundException.class)
	public ResponseEntity<Object> handleUserNotFoundException(UserNotFoundException ex){
		String message = ex.getMessage();
		ExceptionInfo exceptionInfo = new ExceptionInfo();
		exceptionInfo.setExcCode("EXC001");
		exceptionInfo.setExcMsg(message);
		return new ResponseEntity<>(exceptionInfo,HttpStatus.NOT_FOUND);
	}

}
