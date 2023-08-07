package com.ct.user.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ct.user.service.payload.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	/* Global exception handler- handles globally occurring exceptions. can handle all exceptions wherever it may occurs*/
	
	@ExceptionHandler(ResourceNotFoundException.class)  // whenever u won't get resource from server this method will get called
	public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFoundException ex){
		
		String message= ex.getMessage();  //get the message or exception came in ex
		
		ApiResponse response= new ApiResponse(ex.getMessage(), true, HttpStatus.NOT_FOUND);
		return new ResponseEntity<ApiResponse> (response, HttpStatus.BAD_REQUEST);
		
		//if u use LOMBOK and add @Builder to ApiResponse class then use below code:
		//ApiResponse response= ApiResponse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND);
		//return ResponseEntity<ApiResponse> (response, HttpStatus.NOT_FOUND);
	}
}
