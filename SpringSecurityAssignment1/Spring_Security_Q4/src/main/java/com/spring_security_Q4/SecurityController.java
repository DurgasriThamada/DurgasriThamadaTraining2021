package com.spring_security_Q4;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

	@RequestMapping(value="/hello")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/authenticate")
	public String authenticate(@ModelAttribute("user") User user) {
		if(user.getUsername().compareTo("sowmya")!=0) {
			return "ulogin";
		}
		else if(user.getUsername().compareTo("sowmya")==0 && user.getPassword().compareTo("abcd")!=0) {
			user.setAttempts(user.getAttempts()+1);
			return "plogin";
		}
		else
			return "hello";
			
	}
}