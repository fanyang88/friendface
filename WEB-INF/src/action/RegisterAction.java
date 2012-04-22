package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import service.AllServices;
import form.LoginForm;

public class RegisterAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		LoginForm loginform=(LoginForm)form;
		//check email first
		boolean flag=AllServices.isUserNotExist(loginform.getEmail());
		if(flag==true)
		{
			//insert
			String uid= ""+AllServices.AddUser(loginform.getFirstName(),loginform.getLastName(), loginform.getPassword(),loginform.getEmail()); 
			
			//set session
			request.getSession().setAttribute("username",loginform.getFirstName()+" "+loginform.getLastName());
			request.getSession().setAttribute("userID",uid);
			return mapping.findForward("ok");
		}
		
		else
		{
			String tip="sorry, the user already exist!";
			request.getSession().setAttribute("registertip",tip);
			return mapping.findForward("error");
		}
			
	
	}

}