package com.pro.restwebservice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestExceptionHandler {
	
	//Add an exception handler
		@ExceptionHandler
		public ResponseEntity<StudentErrorResponseEntity> handleException(StudentNotFoundException exc){
			
			StudentErrorResponseEntity error = new StudentErrorResponseEntity();
			error.setStatus(HttpStatus.NOT_FOUND.value());
			error.setMessage(exc.getMessage());
			error.setTimeStamp(System.currentTimeMillis());
			
			return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
		}
		
		//Add a generic exception handler
		@ExceptionHandler
		public ResponseEntity<StudentErrorResponseEntity> handleException(Exception exc){
			
			StudentErrorResponseEntity error = new StudentErrorResponseEntity();
			error.setStatus(HttpStatus.BAD_REQUEST.value());
			error.setMessage(exc.getMessage());
			error.setTimeStamp(System.currentTimeMillis());
			
			return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);	
		}
	
}
