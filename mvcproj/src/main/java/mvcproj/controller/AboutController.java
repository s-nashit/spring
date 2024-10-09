package mvcproj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutController {
	@RequestMapping("/about")
	public String about(Model m) {
		
		m.addAttribute("name", "Mukesh Kumar Vishawas");
		m.addAttribute("location", "Patna");
		
		return "about";
	}

}
