package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Employee;
import in.sp.context.ConfigFile;

public class Main {

	public static void main(String[] args) {
//		String path = "/in/sp/context/applicationContext.xml";
//		ApplicationContext cxt = new ClassPathXmlApplicationContext(path);
		ApplicationContext cxt = new AnnotationConfigApplicationContext(ConfigFile.class);
		Employee p1 = (Employee) cxt.getBean("emp1");
		p1.interview();

	}

}
