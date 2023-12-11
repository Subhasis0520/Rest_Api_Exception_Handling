package com.org.error;

public class UserNotFoundException extends RuntimeException{

	public UserNotFoundException() {
		super();
	}
	
	public UserNotFoundException(String msg) {
		super(msg);
	}
	
	private static final long serialVersionUID = 1L;

}
