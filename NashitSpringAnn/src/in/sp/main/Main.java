package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.User;
import in.sp.resources.ConfigFile;

public class Main {

	public static void main(String[] args) {
		ApplicationContext cxt = new 
				AnnotationConfigApplicationContext(ConfigFile.class);
		
		User u11 = (User) cxt.getBean("user1");
		u11.register();

	}

}
