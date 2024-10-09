package in.sp.beans;

public class Student {
	String name;
	int age;
	in.sp.beans.mail mail;
	

public Student(String name, int age, mail mail) {
	
		this.name = name;
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
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
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
		System.out.println(name + " -- "+ age+ " -- "+ mail);
	}
	

}

