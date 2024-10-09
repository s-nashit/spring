package patnamvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
	
	@ModelAttribute
	public void hello(Model m) {
		m.addAttribute("head", "NSTI, Patna");
	}
	@RequestMapping("/home")
	public String home(Model m1) {
		System.out.println("running");
		m1.addAttribute("key1", "Nashit Humam");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "about";
	} 

}
