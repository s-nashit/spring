package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Employee;

public class Main {

	public static void main(String[] args) {
		String path = "/in/sp/resources/applicationContext.xml";
		ApplicationContext cxt = new ClassPathXmlApplicationContext(path);
		
		Employee  e1 = (Employee) cxt.getBean("emp1");
		e1.display();

	}

}
