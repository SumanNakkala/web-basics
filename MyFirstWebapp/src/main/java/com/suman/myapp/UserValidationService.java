package com.suman.myapp;

import org.springframework.stereotype.Service;

@Service
public class UserValidationService {
	
	
	public boolean validateUser(String userName, String passsowrd) {
		
		
		if("phani".equalsIgnoreCase(userName) && "1234".equalsIgnoreCase(passsowrd))
			
		{
			return true;
		}
		
		return false;
		
		
	}

}
