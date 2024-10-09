package in.sp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;
import in.sp.beans.mail;

@Configuration
public class ConfigFile {
	
	@Bean
	public mail m1() {
		mail m = new mail("nashit@hotmail.com", "nashit@gmaoil.com", "nashit@edunet.org");
		return m;
	}

	@Bean
	public Student S1() {
		Student abc = new Student("rajdhani", 30, m1());
//		abc.setName("rabjeet");
//		abc.setAge(30);
//		abc.setMail("abc@abc,.com");
		return abc;
		
	}
}
