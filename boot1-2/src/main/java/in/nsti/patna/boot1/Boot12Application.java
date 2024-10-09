package in.nsti.patna.boot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="in.nsti.patna.boot1")
public class Boot12Application {

	public static void main(String[] args) {
		SpringApplication.run(Boot12Application.class, args);
	}

}
