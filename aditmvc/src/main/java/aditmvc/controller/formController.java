package aditmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import aditmvc.model.User;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class formController {
	@RequestMapping("register")
	public String form(Model m1) {
		m1.addAttribute("Header", "Registration Form");
		return "register";
	}
	@RequestMapping(path="/success", method=RequestMethod.GET)
	public String hForm(@ModelAttribute User u, Model model) {
		System.out.println(u);
//		User u = new User();
//		u.setName(name);
//		m1.addAttribute("name", u.getName());
		model.addAttribute("user", u);
		return "success";
	}
	
//	@RequestMapping(path="/success", method=RequestMethod.GET)
//	public String hForm(@RequestParam("uname") String name, Model m1) {
//		User u = new User();
//		u.setName(name);
//		m1.addAttribute("name", u.getName());
//		return "success";
//	}
	
//	@RequestMapping(path="/success", method=RequestMethod.GET)
//	public String hForm(
//			@RequestParam("uname") String name,
//			Model m1
//			) {
//		System.out.println(name);
//		m1.addAttribute("name", name);
//		return "success";
//	}
	
//	@RequestMapping(path="/success", method=RequestMethod.GET)
//	public String hForm(HttpServletRequest req, Model m1) {
//		String name = req.getParameter("uname");
//		String mail = req.getParameter("mail");
//		String phone = req.getParameter("phone");
//		System.out.println(name);
//		System.out.println(mail);
//		System.out.println(phone);
//		m1.addAttribute("name",name);
//		m1.addAttribute("mail",mail);
//		m1.addAttribute("phone",phone);
//		return "success";
//	}

}
