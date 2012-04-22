package action.SIP;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.SIPForm;
import service.AllServices;
import java.util.List;

public class AddSIPPCommentAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		if(request.getSession().getAttribute("username")== null)
			return mapping.findForward("log");
		else
		{
			String userid=(String) request.getSession().getAttribute("userID");
			String username=(String) request.getSession().getAttribute("username");
			//request part
			String sippid=(String) request.getSession().getAttribute("sippid");
			SIPForm sipcForm=(SIPForm)form;
	        String content=sipcForm.getSipcmcontent();
	        
			//insert into commenttable
	        AllServices.AddSIPPComment(userid,username,content,sippid);
			request.getSession().setAttribute("sippid",sippid);
			
			List sipcmlist=AllServices.getSIPCommentList(sippid);
			request.setAttribute("sipcmlist", sipcmlist);
			
			return mapping.findForward("ok");
		}
	}

}

