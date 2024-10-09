package in.nsti.patna.boot1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class homeController {
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
//	@GetMapping("/about")
//	public String about() {
//		return "about";
//	}

}
