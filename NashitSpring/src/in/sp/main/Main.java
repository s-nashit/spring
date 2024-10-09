package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.user;

public class Main {

	public static void main(String[] args) {
	try {	
ApplicationContext cxt= new ClassPathXmlApplicationContext
("/in/sp/resources/applicationContext.xml");
		user u1 = (user) cxt.getBean("user1");
		u1.register();
		
		user u2 = (user) cxt.getBean("user2");
		u2.register();}
	catch(Exception e) {
		System.out.println(e);
	}
	}

}
