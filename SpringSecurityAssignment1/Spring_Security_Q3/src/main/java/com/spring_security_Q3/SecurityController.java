package com.spring_security_Q3;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SecurityController {
	@GetMapping("/admin")
	public String admin() {
		return "Welcome Admin!!";
	}
	@GetMapping("/user")
	public String user() {
		return "Welcome User!!";
	}
	@GetMapping("/")
	public String home() {
		return "Welcome!!";
	}

}
