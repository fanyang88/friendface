package action.SIP;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import service.AllServices;
import java.util.List;

public class SIPCommentListAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		if(request.getSession().getAttribute("username")== null)
			return mapping.findForward("log");
		else
		{
			String userid=(String) request.getSession().getAttribute("userID");
			//request part
			String sippid=String.valueOf(request.getParameter("sippid"));
			request.getSession().setAttribute("sippid",sippid);
			
			List sipcmlist=AllServices.getSIPCommentList(sippid);
			request.setAttribute("sipcmlist", sipcmlist);
			
			return mapping.findForward("ok");
		}
	}

}
