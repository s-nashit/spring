package in.nsti.patna.boot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Boot11Application {

	public static void main(String[] args) {
		ApplicationContext cxt=	SpringApplication.run(Boot11Application.class, args);
//		student s1 = new student();
//		s1.patna();
		student s1 = cxt.getBean(student.class);
		s1.patna();
		
		}

}
