package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {
	public static void main(String[] main) {
//		String config_loc = "/in/sp/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/in/sp/resources/applicationContext.xml");
		
		Student std = (Student) context.getBean("stdID");
		std.display();
		
	}

}
