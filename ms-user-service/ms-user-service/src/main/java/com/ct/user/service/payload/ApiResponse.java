package com.ct.user.service.payload;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

  //to use Builder pattern which creates the object of this class (ApiResponse class)
public class ApiResponse {

	private String message;
	private boolean success;
	private HttpStatus status;
	
	public ApiResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ApiResponse(String message, boolean success, HttpStatus status) {
		super();
		this.message = message;
		this.success = success;
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	
	
}
