package action.Advertisement;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import service.AllServices;

public class CustomerlistAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		if(request.getSession().getAttribute("company")== null)
			return mapping.findForward("adlog");
		else
		{
			String inc=(String) request.getSession().getAttribute("company");
			String adid=String.valueOf(request.getParameter("adid"));
			
			List list=AllServices.getcustomerlist(adid);
			request.setAttribute("cuslist", list);
			
			List bestlist=AllServices.getbestcustomer(adid);
			request.setAttribute("bestlist", bestlist);
			
			return mapping.findForward("ok");
		}
	}

}
