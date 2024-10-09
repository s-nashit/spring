package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.User;

@Configuration
public class ConfigFile {
	@Bean
	public User user1() {
		User u1 = new User();
		u1.setUname("s_nashit");
		u1.setPass("p!@123");
		u1.setMail("s_nashit@hotmail.com");
		
		return u1;
		
	}

}
