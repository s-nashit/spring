package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.StudentC;
import in.sp.context.ConfigFile;

public class Main {
	public static void main(String[] args) {
		ApplicationContext cxt = new AnnotationConfigApplicationContext(ConfigFile.class);
		StudentC s = (StudentC) cxt.getBean("patna1");
		s.show();
	}

}
