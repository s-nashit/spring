package springmvc1.contoller;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import springmvc1.model.Student;

@Controller
public class fController {
	
	@RequestMapping("/register")
	public String form() {
		return "register";
	}
	
//	@RequestMapping(path="/success", method=RequestMethod.GET)
//	public String form(@RequestParam("name") String name, Model m1) {
//		m1.addAttribute("n", name);
//		System.out.println(name);
//		return "success";
//		
//	}
	@RequestMapping(path="/success", method=RequestMethod.GET)
	public String form(@ModelAttribute Student s1, Model m) {
		m.addAttribute("n", s1.getName());
		System.out.println(s1);
		return "success";
		
	}
	
//	@RequestMapping(path="/success", method=RequestMethod.GET)
//	public String hForm(@ModelAttribute User u1, Model m1) {
//		return "success";
//	}
//	
//	@RequestMapping(path="/success", method=RequestMethod.GET)
//	public String hForm(@RequestParam("name") String name, Model m1) {
//		System.out.println(name);
//		m1.addAttribute("n", name);
//		return "success";
//	}
	
//	@RequestMapping(path="/success", method= RequestMethod.GET)
//	public String hForm(@ModelAttribute User u, Model m) {
//		System.out.println(u);
////		String name = req.getParameter("name");
////		String mail = req.getParameter("mail");
////		String phone = req.getParameter("phone");
////		String age = req.getParameter("age");
////		System.out.println(name);
////		System.out.println(mail);
////		System.out.println(phone);
////		System.out.println(age);
////		m1.addAttribute("n", name);
//		return "success";
//	}

}
