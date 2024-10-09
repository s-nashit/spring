package mvcproj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HomeController {
	@RequestMapping("/home")
	public String home() {
		System.out.println("rest response");
		return "index rest response";
	}
	
	@RequestMapping(path="proform", method=RequestMethod.POST)
	public String proform(HttpServletRequest req) {
		String name = req.getParameter("name");
		String mail = req.getParameter("mail");
		String age = req.getParameter("age");
		return name+" -- "+ mail + " -- " + age;
		
	}

}
