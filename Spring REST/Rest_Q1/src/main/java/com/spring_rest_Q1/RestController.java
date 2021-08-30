package com.spring_rest_Q1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {
	@ResponseBody
	@RequestMapping(value="/hello")
	public String hello() {
		return "Hello World!!";
	}

}
