package mvc.Controller;
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping


@Controller
public class home {
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("working");
		return "index";
	}

}
