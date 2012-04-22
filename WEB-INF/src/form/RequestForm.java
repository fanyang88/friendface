package form;

import org.apache.struts.action.ActionForm;

public class RequestForm extends ActionForm{
	
	private static final long serialVersionUID = 4810867460814075230L;
	private String rid;
	private String sendername;
	
	
	public String getSendername() {
		return sendername;
	}
	public void setSendername(String sendername) {
		this.sendername = sendername;
	}
	public String getRid() {
		return rid;
	}
	public void setRid(String id) {
		rid = id;
	}
  
	 
	 

}