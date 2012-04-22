package form;

import org.apache.struts.action.ActionForm;
import org.apache.struts.upload.FormFile;

public class PostForm extends ActionForm{
	
	private static final long serialVersionUID = 4810867460814075230L;
	private String ptitle;
	private String postpic;
	private String ccontent;
	
	private FormFile postpicpath;
	private String mybeanvariable;
	
	public String getCcontent() {
		return ccontent;
	}
	public void setCcontent(String ccontent) {
		this.ccontent = ccontent;
	}
	public String getMybeanvariable() {
		return mybeanvariable;
	}
	public void setMybeanvariable(String mybeanvariable) {
		this.mybeanvariable = mybeanvariable;
	}
	public String getPostpic() {
		return postpic;
	}
	public void setPostpic(String postpic) {
		this.postpic = postpic;
	}
	public FormFile getPostpicpath() {
		return postpicpath;
	}
	public void setPostpicpath(FormFile postpicpath) {
		this.postpicpath = postpicpath;
	}
	public String getPtitle() {
		return ptitle;
	}
	public void setPtitle(String ptitle) {
		this.ptitle = ptitle;
	}
	 

}