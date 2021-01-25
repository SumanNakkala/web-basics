package com.suman.myapp.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.suman.myapp.UserValidationService;

@Controller
public class LoginController {
	
	@Autowired
	UserValidationService service ;
	
	@RequestMapping(name = "/login" , method = RequestMethod.POST)
	//@ResponseBody
	public String sayHello(@RequestParam String name,@RequestParam String  password, ModelMap map) {
		
		
		
		
		boolean validateUser = service.validateUser(name, password);
		
		if(validateUser)
		{
			map.put("name", name);
			
			return "welcome";
			
			
		}
		else {
			map.put("errorMessage", "Please enter valid username/password");
			
				return "login";
		}
		
		
		
		
	}
	
	@RequestMapping(name = "/login" , method = RequestMethod.GET)
	//@ResponseBody
	public String sayGETHello() {
		
		
		
		return "login";
		
		
	}
	
	
	

}
