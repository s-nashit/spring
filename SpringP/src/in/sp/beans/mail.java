package in.sp.beans;

public class mail {
	String primary_mail;
	String sec_mail;
	String com_mail;
	public mail(String primary_mail, String sec_mail, String com_mail) {
		
		this.primary_mail = primary_mail;
		this.sec_mail = sec_mail;
		this.com_mail = com_mail;
	}
	@Override
	public String toString() {
		return "mail [primary_mail=" + primary_mail + ", sec_mail=" + sec_mail + ", com_mail=" + com_mail + "]";
	}
	
	
	

}
