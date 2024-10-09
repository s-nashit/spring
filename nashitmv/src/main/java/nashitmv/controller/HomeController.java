package nashitmv.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model m) {
		m.addAttribute("name", "Nashit");
		m.addAttribute("location", "Patna");
		System.out.println("jsp retruned");
		return "index";
	}
	
	@RequestMapping("/about")
	public ModelAndView about() {
		ModelAndView m1 = new ModelAndView();
//		List<String> skills = new ArrayList<String>();
//		m1.addObject("s1","HTML");
//		m1.addObject("s2", "Python");
//		m1.addObject("s3","Java");
//		m1.addObject("s4","JavaScript");
		m1.setViewName("about");
//		m1.addAttribute("s", skills);
		System.out.println("about retruned");
		return m1;
	}
	
	@RequestMapping(path="/form", method=RequestMethod.POST)
	public String formh(HttpServletRequest req) {
		String name = req.getParameter("uname");
		System.out.println(name);
		return "success";
	}

}
