package form;
import org.apache.struts.action.ActionForm;

public class SubjectForm extends ActionForm{
	
	private static final long serialVersionUID = 4810867460814075230L;
	private String receivers[];
	private String subtitle;
	
	private String mcontent;
	private String subjectid;
	
	public String[] getReceivers() {
		return receivers;
	}
	public void setReceivers(String[] receivers) {
		this.receivers = receivers;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public String getMcontent() {
		return mcontent;
	}
	public void setMcontent(String mcontent) {
		this.mcontent = mcontent;
	}
	public String getSubjectid() {
		return subjectid;
	}
	public void setSubjectid(String subjectid) {
		this.subjectid = subjectid;
	}
	
	 

}