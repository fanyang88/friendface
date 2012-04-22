package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import service.AllServices;
import form.LoginForm;

import java.sql.ResultSet;
import java.util.List;

public class IndexAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		if(request.getSession().getAttribute("username")== null)
			return mapping.findForward("log");
		else
		{
			String userid=(String) request.getSession().getAttribute("userID");
			//get data
			ResultSet rs=AllServices.getProfile(userid);
			
			//transfer form to jsp
			LoginForm loginForm=(LoginForm)form;
			
			loginForm.setCity(rs.getString("CITY"));
			loginForm.setState(rs.getString("STATE"));
			loginForm.setZipCode(rs.getString("ZIPCODE"));
			loginForm.setTelephone(rs.getString("TELEPHONE"));
			loginForm.setEmail(rs.getString("EMAIL"));
			loginForm.setPreference(rs.getString("PREFERENCE"));
			loginForm.setBirthday(rs.getString("BIRTHDAY"));
			loginForm.setSex(rs.getString("SEX"));
			loginForm.setProfilePic(rs.getString("PROFILEPIC"));
			
			request.setAttribute("loginForm",loginForm);
			request.getSession().setAttribute("registertip","");
			
			List adlist=AllServices.getadlist();
			request.setAttribute("adlist", adlist);
			
			return mapping.findForward("ok");
		}
	}

}