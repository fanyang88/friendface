package form;


import org.apache.struts.action.ActionForm;
import org.apache.struts.upload.FormFile;

public class AdForm extends ActionForm{
	
	private static final long serialVersionUID = 4810867460814075230L;
    private String itemname;
    private String itempic;
    private String company;
    private String unitprice;
    private String keyword;
    private FormFile adpicpath;
    private String totalrevenue;
    private String mybeanvariable;
  
    
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public String getItempic() {
		return itempic;
	}
	public void setItempic(String itempic) {
		this.itempic = itempic;
	}
	public String getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(String unitprice) {
		this.unitprice = unitprice;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public FormFile getAdpicpath() {
		return adpicpath;
	}
	public void setAdpicpath(FormFile adpicpath) {
		this.adpicpath = adpicpath;
	}
	public String getMybeanvariable() {
		return mybeanvariable;
	}
	public void setMybeanvariable(String mybeanvariable) {
		this.mybeanvariable = mybeanvariable;
	}
	public String getTotalrevenue() {
		return totalrevenue;
	}
	public void setTotalrevenue(String totalrevenue) {
		this.totalrevenue = totalrevenue;
	}
	
    

}
