package in.sp.beans;

public class Employee {
	String name;
	String mail;
	String phone;
	skill skill;
	
	
	
//	setters
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
	public in.sp.beans.skill getSkill() {
		return skill;
	}
	public void setSkill(in.sp.beans.skill skill) {
		this.skill = skill;
	}
	
//	public Employee(String name, String mail, String phone, skill skill) {
//		
//		this.name = name;
//		this.mail = mail;
//		this.phone = phone;
//		this.skill = skill;
//	}



	public void interview() {
		System.out.println(name + "has been called for interview on, " + phone + " -- " +mail);
		System.out.println(skill);
	} 
	

}
