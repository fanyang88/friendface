package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import service.AllServices;
import form.LoginForm;

public class LoginAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		request.getSession().setAttribute("registertip","");
		LoginForm loginform=(LoginForm)form;
		
		//check
		String uid=AllServices.login(loginform.getFirstName(), loginform.getLastName(),loginform.getPassword());
		if(!uid.equals(""))
		{
			request.getSession().setAttribute("username",loginform.getFirstName()+" "+loginform.getLastName());
			request.getSession().setAttribute("userID",uid);
			return mapping.findForward("ok");
		}
		
		else
		{
			return mapping.findForward("error");
		}
		
	}

}