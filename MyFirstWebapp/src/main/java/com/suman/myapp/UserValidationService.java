package com.suman.myapp;

public class UserValidationService {
	
	
	public boolean validateUser(String userName, String passsowrd) {
		
		
		if("phani".equalsIgnoreCase(userName) && "1234".equalsIgnoreCase(passsowrd))
			
		{
			return true;
		}
		
		return false;
		
		
	}

}
