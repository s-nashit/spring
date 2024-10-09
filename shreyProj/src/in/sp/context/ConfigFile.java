package in.sp.context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.StudentC;

@Configuration
public class ConfigFile {
	@Bean
	public StudentC patna1() {
		StudentC s1 = new StudentC();
		s1.setName("nashit");
		s1.setMail("nashit");
		s1.setAge("nashit");
		return s1;
	}

}
