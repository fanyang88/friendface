package form;

import org.apache.struts.action.ActionForm;
import org.apache.struts.upload.FormFile;

public class SIPForm extends ActionForm{
	
	private static final long serialVersionUID = 4810867460814075230L;
	private String sharers[];
	private String sipname;
	private String description;
	private String sippic;
	private FormFile sippicpath;
	private String mybeanvariable;
	
	//
	private String sipptitle;
	private String sippostpic;
	private String sipcmcontent;
	private FormFile sippostpicpath;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String[] getSharers() {
		return sharers;
	}
	public void setSharers(String[] sharers) {
		this.sharers = sharers;
	}
	public String getSipname() {
		return sipname;
	}
	public void setSipname(String sipname) {
		this.sipname = sipname;
	}
	public String getMybeanvariable() {
		return mybeanvariable;
	}
	public void setMybeanvariable(String mybeanvariable) {
		this.mybeanvariable = mybeanvariable;
	}
	public FormFile getSippicpath() {
		return sippicpath;
	}
	public void setSippicpath(FormFile sippicpath) {
		this.sippicpath = sippicpath;
	}
	public String getSippic() {
		return sippic;
	}
	public void setSippic(String sippic) {
		this.sippic = sippic;
	}
	public String getSipcmcontent() {
		return sipcmcontent;
	}
	public void setSipcmcontent(String sipcmcontent) {
		this.sipcmcontent = sipcmcontent;
	}
	public String getSippostpic() {
		return sippostpic;
	}
	public void setSippostpic(String sippostpic) {
		this.sippostpic = sippostpic;
	}
	public FormFile getSippostpicpath() {
		return sippostpicpath;
	}
	public void setSippostpicpath(FormFile sippostpicpath) {
		this.sippostpicpath = sippostpicpath;
	}
	public String getSipptitle() {
		return sipptitle;
	}
	public void setSipptitle(String sipptitle) {
		this.sipptitle = sipptitle;
	}

	
	 

}
