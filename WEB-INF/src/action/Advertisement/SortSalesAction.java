package action.Advertisement;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.AdForm;
import service.AllServices;


public class SortSalesAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		if(request.getSession().getAttribute("company")== null)
			return mapping.findForward("adlog");
		else
		{
			String inc=(String) request.getSession().getAttribute("company");
			String flag=String.valueOf(request.getParameter("flag"));
			
			String totalrevenue=""+AllServices.gettotalrenvue(inc);
			AdForm adForm=(AdForm)form;
			adForm.setTotalrevenue(totalrevenue);
			List list=null;
			if(flag.equals("1"))   //sort by hits
			{
				 list=AllServices.salesListbyhits(inc);
			}
			else if(flag.equals("2")) //sort by revenue
			{
				 list=AllServices.salesListbyrevenue(inc);
			}
			
			else
			{
				 list=AllServices.salesList(inc);	
			}
			request.setAttribute("saleslist", list);
			return mapping.findForward("ok");
		}
	}

}