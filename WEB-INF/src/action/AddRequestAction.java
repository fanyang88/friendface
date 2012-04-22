package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import service.AllServices;

public class AddRequestAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		if(request.getSession().getAttribute("username")== null)
			return mapping.findForward("log");
		else
		{
			String senderid=(String) request.getSession().getAttribute("userID");
			String receiverid=String.valueOf(request.getParameter("uid"));
			System.out.println(receiverid);
			String receivername=(String) request.getSession().getAttribute("username");

			//add request in table
			AllServices.AddRequest(senderid,receivername, receiverid);
			
			
			return mapping.findForward("ok");
		}
	}

}