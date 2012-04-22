package action.post;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.PostForm;
import service.AllServices;
import java.util.List;

public class MakeCommentAction extends Action{
	
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
			String pid=(String) request.getSession().getAttribute("PID");
			PostForm pForm=(PostForm)form;
	        String content=pForm.getCcontent();
			//insert into commenttable
	        AllServices.AddComment( userid,  username,  pid,  content);
			request.getSession().setAttribute("PID",pid);
			
			List cmlist=AllServices.getCommentList(pid);
			request.setAttribute("cmlist", cmlist);
			
			return mapping.findForward("ok");
		}
	}

}
