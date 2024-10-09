package in.nsti.patna.boot1;



public class user {
	String name;
	String city;
	String mail;
	String phone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
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
	public user(String name, String city, String mail, String phone) {
		super();
		this.name = name;
		this.city = city;
		this.mail = mail;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "user [name=" + name + ", city=" + city + ", mail=" + mail + ", phone=" + phone + "]";
	}
	
	

}
