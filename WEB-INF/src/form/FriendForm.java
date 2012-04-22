package form;

import org.apache.struts.action.ActionForm;

public class FriendForm extends ActionForm{
	
	private static final long serialVersionUID = 4810867460814075230L;
	private String ffirstname;
	private String flastname;
	private String cname;
	
	public String getFfirstname() {
		return ffirstname;
	}
	public void setFfirstname(String ffirstname) {
		this.ffirstname = ffirstname;
	}
	public String getFlastname() {
		return flastname;
	}
	public void setFlastname(String flastname) {
		this.flastname = flastname;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	

}
