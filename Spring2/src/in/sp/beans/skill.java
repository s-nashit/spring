package in.sp.beans;

public class skill {
	String web;
	String cloud;
	String ai;
	
	
//public skill(String web, String cloud, String ai) {
//
//		this.web = web;
//		this.cloud = cloud;
//		this.ai = ai;
//	}


	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public String getCloud() {
		return cloud;
	}
	public void setCloud(String cloud) {
		this.cloud = cloud;
	}
	public String getAi() {
		return ai;
	}
	public void setAi(String ai) {
		this.ai = ai;
	}
	@Override
	public String toString() {
		return (web + "," + cloud + "," + ai);
	}
	
	
	

}
