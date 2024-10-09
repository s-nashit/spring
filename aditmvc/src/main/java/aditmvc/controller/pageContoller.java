package aditmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class pageContoller {
	
	@ModelAttribute
	public void mukesh(Model m) {
		m.addAttribute("Head", "Nashit MVC");
		
	}
	
	@RequestMapping("/home")
	public String home() {

		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "about";
	}
	
	@RequestMapping("/success")
	public String success() {
		return "success";
	}
	
	

}
