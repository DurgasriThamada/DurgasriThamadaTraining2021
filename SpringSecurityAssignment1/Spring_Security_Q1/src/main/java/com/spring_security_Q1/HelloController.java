package com.spring_security_Q1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/admin")
	public String home() {
		System.out.println("Hii");
		return "admin.jsp";
	}

}
