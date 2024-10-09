package dammvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class dammvcContoller {
	@RequestMapping("/home")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "about";
	}
	
//	@RequestMapping("/register")
//	public String register(
//			@RequestParam("uname") String name,
//			@RequestParam("mail") String mail,
//			@RequestParam("phone") String phone,
//			Model m
//			) {
//		System.out.println(name);
//		System.out.println(mail);
//		System.out.println(phone);
//		m.addAttribute("name", name);
//				return "register";
//	}
	
//	@RequestMapping("/register")
//	public String register(HttpServletRequest req) {
//		
//		String name = req.getParameter("uname");
//		String mail = req.getParameter("mail");
//		String phone = req.getParameter("phone");
//		System.out.println(name);
//		System.out.println(mail);
//		System.out.println(phone);
//		
////		m1.addAttribute("Header", "Register Here");
//		return "register";
//	}
	
	
	
	@RequestMapping("success")
	public String success() {
		return "success";
	}

}
