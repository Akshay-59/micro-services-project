package com.ct.user.service.exception;

public class ResourceNotFoundException extends RuntimeException {

	/*extra properties that u want to add and manage */
	
	public ResourceNotFoundException() {

		super("Resource not found exception on server!!");
	}

	public ResourceNotFoundException(String message) {
		super(message);
	}

}
