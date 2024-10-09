package in.sp.context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Employee;
import in.sp.beans.skill;

@Configuration
public class ConfigFile {
	
	@Bean
	public skill s1() {
//		skill s = new skill("mean, djando", "ibm cloud", "tensor");
		skill s = new skill();
		s.setWeb("flask");
		s.setCloud("salesforce");
		s.setAi("ibm watson");
		return s;
	}
	
	@Bean
	public Employee emp1() {
//		Employee e = new Employee("amit","a@a.com","5678", s1());
		Employee e = new Employee();
		e.setName("ranjit");
		e.setMail("r@a.com");
		e.setPhone("77777");
		e.setSkill(s1());
		return e;
		
	}

}
