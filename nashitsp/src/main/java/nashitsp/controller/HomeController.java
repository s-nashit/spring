package nashitsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HomeController {
	@RequestMapping("/index")
	public String index() {
//		m.addAttribute("name", "Nashit");
//		m.addAttribute("location", "Patna");
//		System.out.println("rest");
		return "index";
	}
	
//	@RequestMapping("/about")
//	public String about(Model model) {
//		model.addAttribute("age", "30");
////		m.addAttribute("skill", "Java");
//		System.out.println("normal about request");
//		return "about";
//	}
	
	@RequestMapping(path = "submit", method = RequestMethod.GET)
	public String Form(HttpServletRequest req) {
		String name = req.getParameter("name");
		String mail = req.getParameter("mail");
		String loc = req.getParameter("loc");
		return name + " -- " +mail + "  -- "+ loc;
	}

}
