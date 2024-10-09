package dammvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class formController {
	@RequestMapping("/register")
	public String register() {
		return "register";
	}
	
	@GetMapping(path="/success")
	public String hform(
			@RequestParam("uname") String name,
			Model m
			) {
		System.out.println(name);
		m.addAttribute("name", name);
		return "success";
		
	}

}
