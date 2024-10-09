package in.sp.beans;

public class Employee {
	String name;
	String skills;
	String age;
	String mail;
	
	

	
public Employee(String name, String skills, String age, String mail) {
		
		this.name = name;
		this.skills = skills;
		this.age = age;
		this.mail = mail;
	}




//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getSkills() {
//		return skills;
//	}
//
//	public void setSkills(String skills) {
//		this.skills = skills;
//	}
//
//	public String getAge() {
//		return age;
//	}
//
//	public void setAge(String age) {
//		this.age = age;
//	}
//
//	public String getMail() {
//		return mail;
//	}
//
//	public void setMail(String mail) {
//		this.mail = mail;
//	}
	
	public void display() {
		System.out.println(name+" -- "+age+ " -- "+mail + " -- ");
		System.out.println(skills);
	}

}
