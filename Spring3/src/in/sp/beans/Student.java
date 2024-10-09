package in.sp.beans;

public class Student {
	String name;
	String mail;
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
	
	public void show() {
		System.out.println(name + mail);
	}

}
