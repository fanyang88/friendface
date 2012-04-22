
package form;

import org.apache.struts.action.ActionForm;

public class CircleForm extends ActionForm{
	
	private static final long serialVersionUID = 4810867460814075230L;
	private String cname;
	private String cid;
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	
	
	

}
