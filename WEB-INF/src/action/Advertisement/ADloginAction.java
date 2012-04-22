package action.Advertisement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import service.AllServices;
import form.ManagerForm;

public class ADloginAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		ManagerForm adloginform=(ManagerForm)form;
		
		//check
		String inc=AllServices.adlogin(adloginform.getMname(), adloginform.getPassword());
		if(!inc.equals(""))
		{
			request.getSession().setAttribute("company",inc);
			return mapping.findForward("ok");
		}
		
		else
		{
			return mapping.findForward("error");
		}
		
	}

}
