package in.sp.beans;

public class StudentC {
	String name;
	String mail;
	String age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	public void show() {
		System.out.println(age + " -- " + mail + " __ " + name);
	}	
	

}
