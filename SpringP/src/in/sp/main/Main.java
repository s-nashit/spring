package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;
import in.sp.config.ConfigFile;

public class Main {
	public static void main(String[] args) {
//		ApplicationContext cxt= new ClassPathXmlApplicationContext("/in/sp/config/applicationContext.xml");
		ApplicationContext cxt= new AnnotationConfigApplicationContext(ConfigFile.class);
		Student std1 = (Student) cxt.getBean("S1");
		std1.display();
	}

}

