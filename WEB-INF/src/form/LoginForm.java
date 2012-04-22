package form;
import org.apache.struts.action.ActionForm;
import org.apache.struts.upload.FormFile;

public class LoginForm extends ActionForm{

	private static final long serialVersionUID = 4810867460814075230L;
	private String userId;
	private String firstName;
	private String password;
	private String lastName;
	private String state;
	private String city;
	private String zipCode;
	private String telephone;
	private String email;
	private String sex;
	private String birthday;
	private String preference;
	private String profilePic;
	
	private String year;
	private String month;
	private String day;
	
	private FormFile Picpath;
	private String mybeanvariable;
	
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPreference() {
		return preference;
	}
	public void setPreference(String preference) {
		this.preference = preference;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getProfilePic() {
		return profilePic;
	}
	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}
	
	public String getMybeanvariable() {
		return mybeanvariable;
	}
	public void setMybeanvariable(String mybeanvariable) {
		this.mybeanvariable = mybeanvariable;
	}
	public FormFile getPicpath() {
		return Picpath;
	}
	public void setPicpath(FormFile picpath) {
		Picpath = picpath;
	}
	
	
	
	
	
	
}
