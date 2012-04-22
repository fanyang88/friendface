package action.discussion;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import service.AllServices;
import form.SubjectForm;
import java.util.*;

public class AddMessageAction extends Action{
	
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
			//get data
            SubjectForm subjectForm=(SubjectForm)form;
            String subid=subjectForm.getSubjectid();
            String mcontent=subjectForm.getMcontent();
           //String subid
            System.out.println(subid);
            System.out.println(mcontent);
            
            //insertion to subject table
            AllServices.AddMessage(userid,username,subid,mcontent);
            
            
            List mlist=AllServices.messageList(subid);
			request.setAttribute("mlist", mlist);
			
			List adlist=AllServices.getadlist();
			request.setAttribute("adlist", adlist);
			
			return mapping.findForward("ok");
		}
	}

}
