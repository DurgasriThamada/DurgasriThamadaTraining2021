package mvc.quest1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
	@RequestMapping(value= "/hello")
	public ModelAndView helloWorld() {
		ModelAndView model= new ModelAndView("Quest1/Hello");
		mav.addObject("msg", "Hello World");
		return model;
	}

}
