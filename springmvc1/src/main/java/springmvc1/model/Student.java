package springmvc1.model;

public class Student {
	private String name;
	private String mail;
	private String phone;
	private String age;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
	return "Student [name=" + name + ", mail=" + mail + ", phone=" + phone + ", age=" + age + "]";
	}
	
	
	

}
