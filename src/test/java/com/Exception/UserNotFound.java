package com.Exception;

public class UserNotFound extends Exception {
	
	@Override
	public String getMessage() {
		
		String s="invalid user";
		return s;
	}
	

}
