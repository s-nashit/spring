package in.nsti.patna.boot1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class homeController {
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute user u, Model m) {
		System.out.println(u);
		System.out.println(u.getName());
		m.addAttribute("name", u.getName());
		m.addAttribute("city", u.getCity());
		m.addAttribute("mail", u.getMail());
		return "register";
	}
	
	@GetMapping("/about")
	public String about() {
		return "about";
	}

}
