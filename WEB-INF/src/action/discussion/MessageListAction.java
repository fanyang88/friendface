
package action.discussion;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.SubjectForm;
import service.AllServices;
import java.util.*;


public class MessageListAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		if(request.getSession().getAttribute("username")== null)
			return mapping.findForward("log");
		else
		{
			//String userid=(String) request.getSession().getAttribute("userID");
			//String username=(String) request.getSession().getAttribute("username");
			//get data
			String subid=String.valueOf(request.getParameter("subid"));
		    String title=String.valueOf(request.getParameter("subtitle"));
			
     		  System.out.println(subid+"  "+title);
		    
		   SubjectForm subform=(SubjectForm) form;
		   subform.setSubjectid(subid);
		   subform.setSubtitle(title);
		   subform.setMcontent("  ");
		   request.setAttribute("subjectForm", subform);
		    
			//subject list
			List mlist=AllServices.messageList(subid);
			request.setAttribute("mlist", mlist);
			
			List adlist=AllServices.getadlist();
			request.setAttribute("adlist", adlist);
			
			return mapping.findForward("ok");
		}
	}

}
