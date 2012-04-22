package form;
import org.apache.struts.action.ActionForm;

public class ManagerForm extends ActionForm{
	
	private static final long serialVersionUID = 4810867460814075230L;
	private String mname;
	private String password;
	private String company;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}



