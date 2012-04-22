package action.Advertisement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import service.AllServices;
import form.ManagerForm;

public class ADRegisterAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		ManagerForm adresform=(ManagerForm)form;
		//check email first
		boolean flag=AllServices.isManagerNotExist(adresform.getMname(),adresform.getCompany());
		if(flag==true)
		{
			//insert
			AllServices.Addcompany(adresform.getMname(),adresform.getCompany(), adresform.getPassword()); 
			
			//set session
			request.getSession().setAttribute("company",adresform.getCompany());
			return mapping.findForward("ok");
		}
		
		else
		{
			return mapping.findForward("error");
		}
			
	
	}

}