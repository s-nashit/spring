package in.sp.context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.StudentC;

@Configuration
public class ConfigFile {
	
	@Bean
	public StudentC patna1() {
		StudentC s1 = new StudentC();
		s1.setName("shrey");
		s1.setMail("s@gmail.com");
		s1.setAge("20");
		
		return s1;
		
	}

}
