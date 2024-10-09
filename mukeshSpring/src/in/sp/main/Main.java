package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {
	public static void main(String[] args) {
		ApplicationContext cxt= new ClassPathXmlApplicationContext("/in/sp/resource/applicationContext.xml");
		Student std1 = (Student) cxt.getBean("S1");
		std1.display();
	}

}
