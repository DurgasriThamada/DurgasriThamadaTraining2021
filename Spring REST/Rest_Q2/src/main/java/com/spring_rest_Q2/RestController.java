package com.spring_rest_Q2;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RestController {
	@RequestMapping("/user")
	public ModelAndView userform() {
		return new ModelAndView("userform");
	}
	@ResponseBody
	@RequestMapping("/validate")
	public String validate(@RequestParam Map<String, String> req) {
		if(req.get("username").compareTo("sowmya")==0 && req.get("pass").compareTo("abcd")==0)
			return "Valid User";
		return "Invalid User";
	}

}
