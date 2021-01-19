package com.suman.myapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	//login
	
	@RequestMapping(name = "/login")
	//@ResponseBody
	public String sayHello() {
		
		return "login";
		
		
	}

}
